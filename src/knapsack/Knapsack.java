package knapsack;

import java.util.LinkedList;
import java.util.List;

public class Knapsack {
    public static LinkedList<Item> solve(List<Item> allItems,int maxWeight) {
        if(maxWeight<0){
            throw new IllegalArgumentException("MaxWeight must be bigger then 0");
        }
        if(allItems.size()==0){
            throw new IllegalArgumentException("There must be at least 1 item");
        }
        LinkedList<Item> knapsack = new LinkedList<>();
        int[][] maxPrice = new int[allItems.size()][maxWeight+1];
        int itemIndex=0;
        for(Item item:allItems) {
            for (int currentWeight = 0; currentWeight <= maxWeight; currentWeight++) {
                if (item.getWeight() <= currentWeight) {
                    if (itemIndex == 0) {
                        maxPrice[itemIndex][currentWeight] = item.getPrice();
                    } else {
                        int weightWithItem = currentWeight - item.getWeight();
                        int priceWithItem;
                        if (weightWithItem < 0) {
                            priceWithItem = -1;
                        } else {
                            priceWithItem = maxPrice[itemIndex - 1][weightWithItem] + item.getPrice();
                        }
                        int priceWithoutItem = maxPrice[itemIndex - 1][currentWeight];
                        maxPrice[itemIndex][currentWeight] = Math.max(priceWithItem, priceWithoutItem);
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
                knapsack.add(allItems.get(itemIndex));
                currentCollum-=allItems.get(itemIndex).getWeight();
            }
        }
        return knapsack;
    }

}
