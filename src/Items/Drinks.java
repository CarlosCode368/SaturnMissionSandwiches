package Items;

import Menus.Checkout;
import Menus.TerminalMenu;

import java.util.Scanner;


public class Drinks {
    public void open(Scanner scanner, Checkout checkout) {
        boolean isDrinkRunning = true;

        while (isDrinkRunning) {
            System.out.println("""
                    Choose the size of your drink:
                    1.Atom--200 minerals
                    2.Regular--250 minerals 
                    3.Supernova--300 minerals
                    x.Return to Main Terminal
                    """);
            System.out.print("> ");

            String sizeChoice = scanner.nextLine().toLowerCase();
            int drinkMinerals = 0;

            switch (sizeChoice) {
                case "1":
                    drinkMinerals = 200;
                    System.out.println("You chose Atom size");
                    chooseDrinkType(scanner, drinkMinerals, checkout, "Atom");
                    isDrinkRunning = false;
                    break;
                case "2":
                    drinkMinerals = 250;
                    System.out.println("You chose Regular size");
                    chooseDrinkType(scanner, drinkMinerals, checkout, "Regular");
                    isDrinkRunning = false;
                    break;
                case "3":
                    drinkMinerals = 300;
                    System.out.println("You chose Supernova Size");
                    chooseDrinkType(scanner, drinkMinerals, checkout, "Supernova");
                    isDrinkRunning = false;
                    break;
                case "x":
                    System.out.println("Returning to Main Terminal");
                    isDrinkRunning = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again. ");
            }
        }
    }

    private void chooseDrinkType(Scanner scanner, int drinkMinerals, Checkout checkout, String drinkSize) {
        boolean choosingType = true;

        while (choosingType) {
            System.out.println("""
                    Who said you cannot drink comfortably in space?
                    Quench your thirst with the help of our awesome vacuum proofed thermos!
                    Choose the flavor of your drink:
                    1.Reactor Juice
                    2.Centrifuged Soda
                    3.Secret Formula Soda
                    4.Alien Acid Soda
                    5.H2O (Not water)
                    
                    
                    e.Continue Ordering (cookies, sandwich, etc.)
                    
                    c.Proceed to check out
                    x.Go Back
                    """);
            System.out.print("> ");
            String drinkChoice = scanner.nextLine().toLowerCase();
            String drinkName = "";

            switch (drinkChoice) {
                case "1" -> drinkName = "Reactor Juice";
                case "2" -> drinkName = "Centrifuged Soda";
                case "3" -> drinkName = "Secret Formula Soda";
                case "4" -> drinkName = "Cosmonaut Wheat";
                case "5" -> drinkName = "H2O (Not water)";
                case "e" -> {
                    System.out.println("Continuing to Terminal Menu...");
                    new TerminalMenu().open(scanner, checkout);
                    return;
                }
                case "c" -> {
                    System.out.println("Getting your Menus.Checkout capsule...");
                    checkout.open(scanner);
                    return;
                }
                case "x" -> {
                    System.out.println("Order Cancelled, returning to Main Terminal");
                    return;
                }
                default -> {
                    System.out.println("Invalid command. Please try again.");
                    continue;

                }
            }
            checkout.addItem("Drink (" + drinkName + " - " + drinkSize + ")", 1, drinkMinerals);

            while (true) {
                System.out.println("Add another drink? (Y/N)");
                System.out.print("> ");
                String anotherDrink = scanner.nextLine().toLowerCase();

                if (anotherDrink.equals("y")) {
                    new Drinks().open(scanner, checkout);
                } else if (anotherDrink.equals("n")) {
                    System.out.println("Returning to Main Terminal...");
                    new TerminalMenu().open(scanner, checkout);
                    break;
                } else {
                    System.out.println("Invalid command,Please enter 'Y' or 'N'");
                }
            }
        }
    }
}


