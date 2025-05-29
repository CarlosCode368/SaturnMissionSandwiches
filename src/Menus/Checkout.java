package Menus;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
        for (Item item : items) {
            if (item.name.equals(itemName) && item.costPerItem == costPerItem) {
                item.quantity += quantity;
                return;
            }
        }
        items.add(new Item(itemName, quantity, costPerItem));
    }


    public void open(Scanner scanner) {
        open(scanner, 0);
    }


    public void open(Scanner scanner, int breadMinerals) {

        if (items.isEmpty()) {
            System.out.println("There's nothing on the Checkout Capsule.");
            return;
        }

        System.out.println(" ****CHECKOUT CAPSULE****");
        int totalMinerals = 0;
        for (Item item : items) {
            int cost = item.totalCost();
            System.out.printf("%s x%d - %d minerals\n", item.name, item.quantity, cost);
            totalMinerals += cost;
        }
        System.out.println("-----------------------");
        System.out.println("Total minerals: " + totalMinerals);

        System.out.println("Press Enter to return to main menu...");

        while (true) {
            System.out.println("\nConfirm your order?");
            System.out.println("[1] Confirm and Get Receipt");
            System.out.println("[2] Cancel Order");
            System.out.print("Enter your choice: ");
            String input = scanner.nextLine().trim();

            if (input.equals("1")) {
                System.out.println("\n*** ORDER CONFIRMED ***");
                System.out.println("Generating receipt...");

                LocalDateTime now = LocalDateTime.now();
                String dateTime = now.format(DateTimeFormatter.ofPattern("MMdd-HHmmss"));
                String fileName = "2594" + dateTime + ".txt";

                File directory = new File("Receipts");
                if (!directory.exists()) {
                    directory.mkdir();
                }

                File receiptFile = new File(directory, fileName);

                try (FileWriter writer = new FileWriter(receiptFile)) {
                    writer.write("****** ORDER RECEIPT ******\n");
                    for (Item item : items) {
                        writer.write(String.format("%s x%d = %d minerals\n",
                                item.name, item.quantity, item.totalCost()));
                    }
                    writer.write("-----------------------------\n");
                    writer.write("TOTAL: " + totalMinerals + " minerals\n");
                    writer.write("*****************************\n");
                    System.out.println("Receipt saved to: " + receiptFile.getPath());
                } catch (IOException e) {
                    System.out.println("Error saving receipt: " + e.getMessage());
                }

                items.clear();
                break;

            } else if (input.equals("2")) {
                System.out.println("\nOrder incinerated...");
                items.clear();
                break;

            } else {
                System.out.println("Invalid choice. Please enter 1 or 2.");
            }
        }

        System.out.println("\nPress Enter to return to main menu...");
        scanner.nextLine();
    }
}