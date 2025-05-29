package Managers;

import Menus.Checkout;
import Menus.TerminalMenu;

import java.util.Scanner;

public class ComboManager {
    public void open(Scanner scanner, Checkout checkout, String breadName, String meatName, int breadMinerals, int meatCost, int extraMeatCost, int cheeseCost, int extraCheeseCost) {

        System.out.println("-One small step for combos, one giant leap for deliciousness-\nCombo includes one Atom Drink and chips for only 300 minerals (no cookie included)");
        System.out.println("""
                Who said you cannot drink comfortably in space?
                Quench your thirst with the help of our awesome vacuum proofed thermos!
                Choose your Atom Drink:
                1.Reactor Juice
                2.Centrifuged Soda
                3.Secret Formula Soda
                4.Alien Acid Soda
                5.H2O (Not water)
                """);

        String drinkChoice;
        while (true) {
            System.out.print("> ");
            drinkChoice = scanner.nextLine().trim();

            if (drinkChoice.matches("[1-5]")) {
                break;
            } else {
                System.out.println("Invalid command. Please enter a number between 1 and 5.");
            }
        }
        String selectedDrink = switch (drinkChoice) {
            case "1" -> "Reactor Juice";
            case "2" -> "Centrifuged Soda";
            case "3" -> "Secret Formula Soda";
            case "4" -> "Alien Acid Soda";
            case "5" -> "H2O (Not water)";
            default -> "";
        };
        System.out.println("You chose " + selectedDrink);
        System.out.println("""
                ***PLANET-MADE FRESH CHIPS! THE CORPORATE TOUCH***
                Choose your chips:
                1.Rocket Items.Items.Chips
                2.Volcanic Breathe
                3.Mothership Debris
                4.Crunchy Crystals
                """);

        String chipsChoice;
        while (true) {
            System.out.print("> ");
            chipsChoice = scanner.nextLine().trim();

            if (chipsChoice.matches("[1-4]")) {
                break;
            } else {
                System.out.println("Invalid command. Please enter a number between 1 and 4.");
            }
        }
        String selectedChips = switch (chipsChoice) {
            case "1" -> "Rocket Items.Items.Chips";
            case "2" -> "Volcanic Breathe";
            case "3" -> "Mothership Debris";
            case "4" -> "Crunchy Crystals";
            default -> "";
        };
        System.out.println("You chose " + selectedChips);
        int totalSandwichCost = breadMinerals + meatCost + extraMeatCost + cheeseCost + extraCheeseCost;
        int totalComboCost = totalSandwichCost + 300;

        String comboName = "Combo: " + selectedDrink + " + " + selectedChips;

        checkout.addItem(comboName, 1, totalComboCost);

        System.out.println("Combo added to checkout for " + totalComboCost + " minerals.");
        System.out.println("""
                Items.Items.Chips added. Combo complete!
                1.Cryogenic preservation (FREE SERVICE)
                2.Proceed to Checkout
                3.Continue Ordering
                4.Cancel Order
                """);

        while (true) {
            System.out.print("> ");
            String finalChoice = scanner.nextLine().trim();


            switch (finalChoice) {
                case "1" -> {
                    new CryoManager().open(scanner,checkout,breadMinerals);
                    return;
                }
                case "2" -> {
                    System.out.println("Proceeding to checkout...");
                    checkout.open(scanner,breadMinerals);
                    return;
                }
                case "3" -> {
                    System.out.println("Sandwich saved in checkout...");
                    new TerminalMenu().open(scanner, checkout);
                    return;
                }
                case "4" -> {
                    System.out.println("Order Cancelled,Returning to Main Terminal");
                    new TerminalMenu().open(scanner, checkout);
                    return;
                }
            }
        }
    }
}



