package knapsack;

import java.util.LinkedList;
import java.util.List;

public class Knapsack<T extends Item> {
    private final LinkedList<T> items;
    private final int maxWeight;

    private Knapsack(LinkedList<T> items, int maxWeight) {
        this.items = items;
        this.maxWeight = maxWeight;
    }


    public LinkedList<T> getItems(){
        return new LinkedList<>(items);
    }

    public int getMaxWeight(){
        return maxWeight;
    }

    public int getTotalPrice(){
        int sum=0;
        for (Item item:items){
            sum+=item.getPrice();
        }
        return sum;
    }

    public int getTotalWeight(){
        int weight=0;
        for (Item item:items){
            weight+=item.getWeight();
        }
        return weight;
    }

    public static <T extends Item> Knapsack<T> solve(List<T> allItems, int maxWeight) {
        if(maxWeight<0){
            throw new IllegalArgumentException("MaxWeight must be bigger then 0");
        }
        if(allItems.size()==0){
            throw new IllegalArgumentException("There must be at least 1 item");
        }
        LinkedList<T> correctItems = new LinkedList<>();
        int[][] maxPrice = new int[allItems.size()][maxWeight+1];
        int itemIndex=0;
        for(Item item:allItems) {
            for (int currentWeight = 0; currentWeight <= maxWeight; currentWeight++) {
                if (item.getWeight() <= currentWeight) {
                    if (itemIndex == 0) {
                        maxPrice[itemIndex][currentWeight] = item.getPrice();
                    } else {
                        int weightWithItem = currentWeight - item.getWeight();
                        int priceWithoutItem = maxPrice[itemIndex - 1][currentWeight];
                        if (weightWithItem < 0) {
                            maxPrice[itemIndex][currentWeight]=priceWithoutItem;
                        } else {
                            int priceWithItem = maxPrice[itemIndex - 1][weightWithItem] + item.getPrice();
                            maxPrice[itemIndex][currentWeight] = Math.max(priceWithItem, priceWithoutItem);
                        }
                    }
                } else {
                    if (itemIndex != 0) {
                        maxPrice[itemIndex][currentWeight] = maxPrice[itemIndex - 1][currentWeight];
                    }
                }
            }
            itemIndex++;
        }
        int currentCollum=maxWeight;
        for(itemIndex--;itemIndex>=0;itemIndex--){
            int currentValue=maxPrice[itemIndex][currentCollum];
            int previousValue;
            if(itemIndex!=0){
                previousValue=maxPrice[itemIndex-1][currentCollum];
            }else{
                previousValue=0;
            }
            if(previousValue!=currentValue){
                correctItems.add(allItems.get(itemIndex));
                currentCollum-=allItems.get(itemIndex).getWeight();
            }
        }
        return new Knapsack<>(correctItems,maxWeight);
    }

}
