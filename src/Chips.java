import java.util.*;

public class Chips {
    private final List<String> chips = Arrays.asList("Rocket Chips", "Volcanic Breathe", "Mothership Debris", "Crunchy Crystals");
    private final int chipPrice = 150;

    public void open(Scanner scanner, Checkout checkout) {
        boolean isChipsRunning = true;

        while (isChipsRunning) {
            System.out.println("""
                    ***PLANET-MADE FRESH CHIPS! THE CORPORATE TOUCH***
                    Choose your chips:
                    (150 minerals per bag of chips)
                    1. Rocket Chips
                    2. Volcanic Breathe
                    3. Mothership Debris
                    4. Crunchy Crystals

                    e. Continue Ordering (drinks, sandwich, etc.)
                    c. Proceed to checkout
                    x. Go Back
                    """);
            System.out.print("> ");
            String input = scanner.nextLine().trim().toLowerCase();

            switch (input) {
                case "1", "2", "3", "4" -> {
                    int index = Integer.parseInt(input) - 1;
                    String selectedChip = chips.get(index);

                    System.out.println("How many " + selectedChip + "(s) would you like to buy?");
                    System.out.print("> ");
                    int quantity;
                    try {
                        quantity = Integer.parseInt(scanner.nextLine().trim());
                    } catch (NumberFormatException e) {
                        System.out.println("That's not a valid number.");
                        continue;
                    }

                    int totalCost = quantity * chipPrice;
                    System.out.println("You acquired " + quantity + " " + selectedChip + "(s) for " + totalCost + " minerals!");
                    System.out.println("Items moved to your Checkout.");

                    checkout.addItem(selectedChip, quantity, chipPrice);
                }

                case "e" -> {
                    System.out.println("Continuing ordering...");
                    isChipsRunning = false;
                }

                case "c" -> {
                    System.out.println("Proceeding to checkout...");
                    checkout.open(scanner);
                    isChipsRunning = false;
                }

                case "x" -> {
                    System.out.println("Going back...");
                    isChipsRunning = false;
                }

                default -> System.out.println("Invalid option. Please choose 1-4, e, c, or x.");
            }
        }
    }
}