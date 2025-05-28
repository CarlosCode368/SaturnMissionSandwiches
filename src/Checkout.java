import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Checkout {

    private static class Item {
        String name;
        int quantity;
        int costPerItem;

        Item(String name, int quantity, int costPerItem) {
            this.name = name;
            this.quantity = quantity;
            this.costPerItem = costPerItem;
        }

        int totalCost() {
            return quantity * costPerItem;
        }
    }

    private final List<Item> items = new ArrayList<>();

    // ADD ITEM
    public void addItem(String itemName, int quantity, int costPerItem) {
        items.add(new Item(itemName, quantity, costPerItem));
    }


    public void open(Scanner scanner) {
        open(scanner, 0);
    }


    public void open(Scanner scanner, int breadMinerals) {

        if (items.isEmpty()) {
            System.out.println("Your checkout is empty.");
            return;
        }

        System.out.println("=== Checkout Summary ===");
        int totalMinerals = 0;
        for (Item item : items) {
            int cost = item.totalCost();
            System.out.printf("%s x%d - %d minerals\n", item.name, item.quantity, cost);
            totalMinerals += cost;
        }
        System.out.println("-----------------------");
        System.out.println("Total minerals required: " + totalMinerals);

        System.out.println("Press Enter to return to main menu...");
        scanner.nextLine();
    }
}