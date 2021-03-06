import knapsack.Item;
import knapsack.Knapsack;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Item> items = new LinkedList<>();
        items.add(new Item(5, 140));
        items.add(new Item(2, 12));
        items.add(new Item(3, 80));
        items.add(new Item(1, 90));
        items.add(new Item(6, 60));
        items.add(new Item(5, 15));
        items.add(new Item(5, 30));
        items.add(new Item(3, 25));
        items.add(new Item(2, 62));
        items.add(new Item(2, 173));
        items.add(new Item(6, 84));
        items.add(new Item(9, 94));
        items.add(new Item(9, 147));
        items.add(new Item(10, 110));
        items.add(new Item(2, 176));
        items.add(new Item(8, 109));
        items.add(new Item(5, 51));
        items.add(new Item(1, 87));
        items.add(new Item(6, 64));
        items.add(new Item(9, 106));
        items.add(new Item(5, 91));
        items.add(new Item(3, 123));
        items.add(new Item(4, 91));
        items.add(new Item(5, 100));
        items.add(new Item(8, 26));
        items.add(new Item(4, 68));
        items.add(new Item(2, 65));
        items.add(new Item(7, 121));
        items.add(new Item(8, 90));
        items.add(new Item(4, 54));
        items.add(new Item(9, 28));
        items.add(new Item(6, 56));
        items.add(new Item(10, 96));
        items.add(new Item(4, 41));
        items.add(new Item(8, 37));
        items.add(new Item(2, 159));
        items.add(new Item(6, 131));
        items.add(new Item(5, 151));
        items.add(new Item(8, 153));
        items.add(new Item(10, 79));
        items.add(new Item(7, 138));
        items.add(new Item(7, 100));
        items.add(new Item(2, 52));
        items.add(new Item(6, 39));
        items.add(new Item(1, 136));
        items.add(new Item(1, 103));
        items.add(new Item(7, 146));
        items.add(new Item(8, 74));
        items.add(new Item(7, 181));
        items.add(new Item(4, 138));
        items.add(new Item(3, 42));
        items.add(new Item(8, 167));
        items.add(new Item(10, 110));
        items.add(new Item(5, 120));
        items.add(new Item(3, 145));
        items.add(new Item(2, 76));
        items.add(new Item(2, 89));
        items.add(new Item(5, 153));
        items.add(new Item(9, 176));
        items.add(new Item(2, 111));
        items.add(new Item(9, 65));
        items.add(new Item(7, 161));
        items.add(new Item(10, 136));
        items.add(new Item(9, 90));
        items.add(new Item(6, 136));
        items.add(new Item(10, 142));
        items.add(new Item(6, 71));
        items.add(new Item(6, 114));
        items.add(new Item(5, 85));
        items.add(new Item(9, 153));
        items.add(new Item(9, 107));
        items.add(new Item(3, 148));
        items.add(new Item(3, 25));
        items.add(new Item(5, 128));
        items.add(new Item(2, 107));
        items.add(new Item(2, 99));
        items.add(new Item(2, 71));
        items.add(new Item(6, 139));
        items.add(new Item(10, 101));
        items.add(new Item(5, 130));
        items.add(new Item(8, 142));
        items.add(new Item(11, 112));
        items.add(new Item(2, 85));
        items.add(new Item(7, 100));
        items.add(new Item(7, 114));
        items.add(new Item(2, 166));
        items.add(new Item(9, 124));
        items.add(new Item(9, 132));
        items.add(new Item(7, 33));
        items.add(new Item(5, 134));
        items.add(new Item(4, 74));
        items.add(new Item(4, 166));
        items.add(new Item(10, 63));
        items.add(new Item(10, 193));
        items.add(new Item(4, 190));
        items.add(new Item(2, 100));
        items.add(new Item(10, 105));
        items.add(new Item(5, 71));
        items.add(new Item(3, 31));
        items.add(new Item(2, 118));
        items.add(new Item(4, 94));
        items.add(new Item(4, 172));
        items.add(new Item(11, 105));
        items.add(new Item(6, 105));
        items.add(new Item(10, 111));
        items.add(new Item(9, 119));
        items.add(new Item(7, 118));
        items.add(new Item(10, 50));
        items.add(new Item(10, 108));
        items.add(new Item(6, 70));
        items.add(new Item(10, 128));
        items.add(new Item(9, 52));
        items.add(new Item(5, 64));
        items.add(new Item(10, 70));
        items.add(new Item(9, 124));
        items.add(new Item(9, 25));
        items.add(new Item(7, 84));
        items.add(new Item(3, 95));
        items.add(new Item(9, 110));
        items.add(new Item(5, 184));
        items.add(new Item(11, 102));
        items.add(new Item(11, 70));
        items.add(new Item(3, 145));
        items.add(new Item(6, 110));
        items.add(new Item(3, 44));
        items.add(new Item(7, 108));
        items.add(new Item(8, 91));
        items.add(new Item(7, 91));
        items.add(new Item(3, 97));
        items.add(new Item(4, 82));
        items.add(new Item(5, 113));
        items.add(new Item(9, 93));
        items.add(new Item(6, 153));
        items.add(new Item(4, 130));
        items.add(new Item(5, 149));
        items.add(new Item(5, 100));
        items.add(new Item(9, 185));
        items.add(new Item(11, 127));
        items.add(new Item(5, 52));
        items.add(new Item(3, 158));
        items.add(new Item(3, 68));
        items.add(new Item(1, 102));
        items.add(new Item(6, 74));
        items.add(new Item(1, 86));
        items.add(new Item(2, 25));
        items.add(new Item(8, 127));
        items.add(new Item(11, 99));
        items.add(new Item(11, 66));
        items.add(new Item(9, 62));
        items.add(new Item(9, 59));
        items.add(new Item(8, 23));
        items.add(new Item(9, 142));
        items.add(new Item(4, 65));
        items.add(new Item(8, 88));
        items.add(new Item(6, 51));
        items.add(new Item(4, 141));
        items.add(new Item(7, 79));
        items.add(new Item(11, 119));
        items.add(new Item(6, 88));
        items.add(new Item(2, 47));
        items.add(new Item(2, 108));
        items.add(new Item(6, 128));
        items.add(new Item(8, 133));
        items.add(new Item(10, 194));
        items.add(new Item(7, 133));
        items.add(new Item(4, 84));
        items.add(new Item(8, 139));
        items.add(new Item(5, 74));
        items.add(new Item(3, 107));
        items.add(new Item(2, 59));
        items.add(new Item(5, 105));
        items.add(new Item(1, 27));
        items.add(new Item(11, 111));
        items.add(new Item(3, 100));
        items.add(new Item(5, 51));
        items.add(new Item(9, 87));
        items.add(new Item(2, 79));
        items.add(new Item(8, 100));
        items.add(new Item(6, 118));
        Knapsack<Item> solution = Knapsack.solve(items, 80);
        System.out.println(solution.getTotalPrice());
        LinkedList<Item> itemsSorted = solution.getItems();
        itemsSorted.sort((o1, o2) -> {
            if (o1.getWeight() == o2.getWeight()) {
                return o1.getPrice() - o2.getPrice();
            }
            return o1.getWeight() - o2.getWeight();
        });
        for (Item item:itemsSorted){
            System.out.println(item.getWeight()+","+item.getPrice());
        }
    }
}
