package Items;

import Managers.ComboManager;
import Managers.CryoManager;
import Menus.Checkout;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Sauce{
    public void open(Scanner scanner, Checkout checkout, String breadName, String meatName, int breadMinerals, int meatCost, int extraMeatCost, int cheeseCost, int extraCheeseCost) {
        boolean isSauceRunning = true;
        List<String> selectedSauces = new ArrayList<>();

        System.out.println("""
                ***SAUCES: THE FINAL FRONTIER OF DELICIOUSNESS***
                Choose your Sauces:
                
                1. Void
                2. Space Ranch
                3. Thousand Moons
                4. Engineered Items.Items.Sauce
                5. Tardigrade
                6. MRE Items.Items.Sauce
                C. Complete Sandwich
                x. Cancel Order
                (Sauces are FREE with your sandwich!)
                """);

        while (isSauceRunning) {
            System.out.print("> ");
            String choice = scanner.nextLine().toLowerCase();

            switch (choice) {
                case "1" -> {
                    if (selectedSauces.contains("Void")) {
                        System.out.println("You already added Void Items.Items.Sauce!");
                    } else {
                        System.out.println("Added Void Items.Items.Sauce");
                        selectedSauces.add("Void");
                    }
                }
                case "2" -> {
                    if (selectedSauces.contains("Space Ranch")) {
                        System.out.println("You already added Space Ranch Items.Items.Sauce!");
                    } else {
                        System.out.println("Added Space Ranch");
                        selectedSauces.add("Space Ranch");
                    }
                }
                case "3" -> {
                    if (selectedSauces.contains("Thousand Moons")) {
                        System.out.println("You already added Thousand Moons Items.Items.Sauce!");
                    } else {
                        System.out.println("Added Thousand Moons Items.Items.Sauce");
                        selectedSauces.add("Thousand Moons");
                    }
                }
                case "4" -> {
                    if (selectedSauces.contains("Engineered Items.Items.Sauce")) {
                        System.out.println("You already added Engineered Items.Items.Sauce!");
                    } else {
                        System.out.println("Added Engineered Items.Items.Sauce");
                        selectedSauces.add("Engineered Items.Items.Sauce");
                    }
                }
                case "5" -> {
                    if (selectedSauces.contains("Tardigrade")) {
                        System.out.println("You already added Tardigrade Items.Items.Sauce!");
                    } else {
                        System.out.println("Added Tardigrade Items.Items.Sauce ");
                        selectedSauces.add("Tardigrade");
                    }
                }
                case "6" -> {
                    if (selectedSauces.contains("MRE Items.Items.Sauce")) {
                        System.out.println("You already added MRE Items.Items.Sauce!");
                    } else {
                        System.out.println("Added MRE Items.Items.Sauce");
                        selectedSauces.add("MRE Items.Items.Sauce");
                    }
                }
                case "c" -> {
                    System.out.println("Items.Items.Sauce selection complete!");
                    isSauceRunning = false;
                }
                case "x" -> {
                    System.out.println("Order cancelled. Returning to Main Terminal.");
                    isSauceRunning = false;
                }
                default -> System.out.println("Invalid input. Please try again.");
            }
        }
        String toastChoice;
        while (true) {
            System.out.println("You selected the following sauces: " + selectedSauces);
            System.out.println("Would you like to toast your sandwich? (Y/N)");
            System.out.print("> ");
            toastChoice = scanner.nextLine().trim().toLowerCase();

            if (toastChoice.equals("y") || toastChoice.equals("n")) {
                break;
            } else {
                System.out.println("Invalid Command. Please enter 'Y' or 'N'");
            }
        }
        boolean isToasted = toastChoice.equals("y");

        if (isToasted) {
            System.out.println("Toasting...");
            try {
                for (int i = 3; i > 0; i--) {
                    System.out.println(i + "...");
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                System.out.println("FIRE HAZARD DETECTED! REVERTING TO NON-TOASTED MODE.");
                Thread.currentThread().interrupt();
            }
            System.out.println("SANDWICH SUCCESSFULLY TOASTED. NO FIRE HAZARD DETECTED");
        } else {
            System.out.println("...Is the sandwich moving?...");
        }
        String comboChoice;

        while (true) {
            System.out.println("Would you like your sandwich in a combo? A SPACE COMBO!? (Y/N)");
            System.out.print("> ");
            comboChoice = scanner.nextLine().trim().toLowerCase();

            if (comboChoice.equals("y") || comboChoice.equals("n")) {
                break;
            } else {
                System.out.println("Invalid Command. Please enter 'Y' or 'N'");
            }
        }
        boolean isComboed = comboChoice.equals("y");

        if (isComboed) {
            new ComboManager().open(scanner, checkout, breadName, meatName, breadMinerals, meatCost, extraMeatCost, cheeseCost, extraCheeseCost);

        } else {
            new CryoManager().open(scanner, checkout, breadMinerals);

        }
    }
}