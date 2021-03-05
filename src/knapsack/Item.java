package knapsack;

public class Item {
    private final int weight;
    private final int price;

    public Item(int weight, int price) {
        if(weight<0){
            throw new IllegalArgumentException("Weight must be bigger then 0");
        }
        this.weight = weight;
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "{" +
                "weight=" + weight +
                ", price=" + price +
                '}';
    }
}
