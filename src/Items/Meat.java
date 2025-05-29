package Items;

import Menus.Checkout;

import java.util.Scanner;

public class Meat {
    public void open(Scanner scanner, Checkout checkout, String sandwichName, int breadMinerals) {
        boolean isMeatRunning = true;

        // Determine meat cost based on bread size
        int meatCost, extraMeatCost;
        switch (breadMinerals) {
            case 550 -> {
                meatCost = 100;
                extraMeatCost = 50;
            }
            case 700 -> {
                meatCost = 200;
                extraMeatCost = 50;
            }
            case 850 -> {
                meatCost = 300;
                extraMeatCost = 50;
            }
            default -> {
                meatCost = 100;
                extraMeatCost = 50;
            }
        }

        while (isMeatRunning) {
            System.out.println("""
                    ***FROM ALL THE CORNERS OF THE GALAXY, THE PLACE WHERE MEAT GATHERS***
                    Choose your meat:
                    1. Titan Steak
                    2. Lab Salami
                    3. Twin Moon's Ham
                    4. Roast Alien Beef
                    5. Space Chicken
                    6. Preserved Bacon
                    7. NO MEAT
                    x. CANCEL ORDER
                    
                    ANY MEAT WILL COST YOU AN ADDITIONAL %d MINERALS
                    """.formatted(meatCost));
            System.out.print("> ");
            String meatChoice = scanner.nextLine().toLowerCase();

            if (meatChoice.equals("x")) {
                System.out.println("Order Cancelled, returning to Main Terminal");
                break;
            }
                String meatType="No Items.Items.Meat";

            if (meatChoice.matches("[1-7]")) {
                if (!meatChoice.equals("7")) {
                    String selectedMeat = switch (meatChoice) {
                        case "1" -> "Titan Steak";
                        case "2" -> "Lab Salami";
                        case "3" -> "Twin Moon's Ham";
                        case "4" -> "Roast Alien Beef";
                        case "5" -> "Space Chicken";
                        case "6" -> "Preserved Bacon";
                        default -> "";
                    };
                    System.out.println("You chose " + selectedMeat);

                    System.out.println("Would you like EXTRA meat for an additional " + extraMeatCost + " minerals? (y/n)");
                    System.out.print("> ");
                    String extraMeatChoice;

                    while (true) {
                        System.out.println("You selected the following sauces: " + selectedMeat);
                        extraMeatChoice = scanner.nextLine().toLowerCase();

                        if (extraMeatChoice.equals("y") || extraMeatChoice.equals("n")) {
                            break;
                        } else {
                            System.out.println("Invalid Command. Please enter 'Y' or 'N'");
                            System.out.print("> ");
                        }
                    }

                    int totalMeatCost = meatCost;
                    if (extraMeatChoice.equals("y")) {
                        System.out.println("Extra meat added for " + extraMeatCost + " minerals.");
                        totalMeatCost += extraMeatCost;
                    } else {
                        System.out.println("No extra meat added.");
                    }

                } else {
                    System.out.println("You chose NO MEAT.");
                }
                new Cheese().open(scanner, checkout, sandwichName, meatType, breadMinerals, meatCost, extraMeatCost, 0, 0);
                isMeatRunning = false;
            }else{
                System.out.println("Invalid command. Please choose between 1-7 or 'x' to cancel.");
            }
        }
    }
}
