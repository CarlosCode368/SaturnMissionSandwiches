package Items;

import Menus.Checkout;

import java.util.Scanner;

public class Cheese{
    public void open(Scanner scanner, Checkout checkout, String breadName, String meatName,
                     int breadMinerals, int meatCost, int extraMeatCost, int cheeseCost, int extraCheeseCost){

        // Set cheese costs based on bread size
        switch (breadMinerals) {
            case 550 -> {
                cheeseCost = 75;
                extraCheeseCost = 30;
            }
            case 700 -> {
                cheeseCost = 150;
                extraCheeseCost = 60;
            }
            case 850 -> {
                cheeseCost = 225;
                extraCheeseCost = 90;
            }
            default -> {
                cheeseCost = 75;
                extraCheeseCost = 30;
            }
        }

        boolean isCheeseRunning = true;

        while (isCheeseRunning) {
            System.out.println("""
                     ***GALACTIC NEWS: NEXT EXPEDITION TO DISCOVER A CHEESE MOON
                     WILL BE LAUNCHING ON 2596***
                     Choose your cheese:
                       1.Stored Items.Items.Cheese
                       2.Artificial Items.Items.Cheese
                       3.Milky Way Items.Items.Cheese
                       4.European Items.Items.Cheese (Jupiter)
                       5.NO CHEESE
                       x.CANCEL ORDER
                    Any type of cheese will cost %d minerals.
                    """.formatted(cheeseCost));
            System.out.print("> ");
            String cheeseChoice = scanner.nextLine().toLowerCase();

            if (cheeseChoice.equals("x")) {
                System.out.println("Order Cancelled, returning to Main Terminal");
                break;
            }
            if (cheeseChoice.matches("[1-5]")) {
                if (!cheeseChoice.equals("5")) {
                    String selectedCheese = switch (cheeseChoice) {
                        case "1" -> "Stored Items.Items.Cheese";
                        case "2" -> "Artificial Items.Items.Cheese";
                        case "3" -> "Milky Way Items.Items.Cheese";
                        case "4" -> "European Items.Items.Cheese (Jupiter)";
                        default -> "";
                    };
                    System.out.println("You chose " + selectedCheese);


                    System.out.println("Would you like EXTRA cheese for an additional " + extraCheeseCost + " minerals? (y/n)");
                    System.out.print("> ");
                    String extraCheeseChoice;

                    while (true) {
                        extraCheeseChoice = scanner.nextLine().toLowerCase();
                        if (extraCheeseChoice.equals("y") || extraCheeseChoice.equals("n")) {
                            break;
                        } else {
                            System.out.println("Invalid Command. Please enter 'Y' or 'N'");
                            System.out.print("> ");
                        }
                    }
                    if (extraCheeseChoice.equals("y")){
                        System.out.println("Extra cheese added for " + extraCheeseCost + " minerals.");
                } else {
                    System.out.println("No extra cheese added.");
                }
            } else {
                System.out.println("You chose NO CHEESE.");
            }
                StringBuilder sandwichDetails = new StringBuilder(" (" + breadName + " - " + meatName);
                if (extraMeatCost > 0) sandwichDetails.append(", Extra Items.Items.Meat");
                if (cheeseCost > 0) sandwichDetails.append(", Items.Items.Cheese");
                if (extraCheeseCost > 0) sandwichDetails.append(", Extra Items.Items.Cheese");
                sandwichDetails.append(")");

                new Toppings().open(scanner, checkout, breadName, meatName, breadMinerals, meatCost, extraMeatCost, cheeseCost, extraCheeseCost);
            isCheeseRunning = false;

            }else{
                System.out.println("Invalid command.Please try again.");
            }
        }
    }
}