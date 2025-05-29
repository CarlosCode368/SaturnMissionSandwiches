package Items;

import Items.Meat;
import Menus.Checkout;

import java.util.Scanner;


public class Bread {
    public void open(Scanner scanner, Checkout checkout) {
        boolean isBreadRunning = true;

        while (isBreadRunning) {
            System.out.println("""
                    Please choose the size of bread
                    for your sandwich
                            1. 4 inch--550 minerals
                            2. 8 inch--700 minerals
                            3. 12 inch--850 minerals
                            x. Return to Main Terminal
                    """
            );
            System.out.print("> ");

            String sizeChoice = scanner.nextLine().toLowerCase();
            int breadMinerals =0;

            switch (sizeChoice) {
                case "1":
                    breadMinerals=550;
                    System.out.println("You chose 4 inch bread");
                    chooseBreadType(scanner,breadMinerals,checkout,"4 inch");
                    isBreadRunning = false;
                    break;
                case "2":
                    breadMinerals=700;
                    System.out.println("You chose 8 inch bread");
                    chooseBreadType(scanner,breadMinerals, checkout,"8 inch");
                    isBreadRunning = false;
                    break;
                case "3":
                    breadMinerals=850;
                    System.out.println("You chose 12 inch bread");
                    chooseBreadType(scanner,breadMinerals,checkout,"12 inch");
                    isBreadRunning = false;
                    break;
                case "x":
                    System.out.println("Returning to Main Terminal");
                    isBreadRunning = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again. ");
            }
        }
    }

    private void chooseBreadType(Scanner scanner, int breadMinerals,Checkout checkout,String breadSize) {
        boolean choosingType = true;

        while (choosingType) {
            System.out.println("""
                    Choose your type of bread:
                    1. White Matter
                    2. Comet Flakes
                    3. Warp
                    4. Cosmonaut Wheat
                    x. Return to Main Terminal
                    """);
            System.out.print("> ");
            String breadChoice = scanner.nextLine().toLowerCase();
            String breadName="";

            switch (breadChoice) {
                case "1" -> breadName = "White Matter";
                case "2" -> breadName = "Comet Flakes";
                case "3" -> breadName = "Warp";
                case "4" -> breadName = "Cosmonaut Wheat";
                case "x" -> {
                    System.out.println("Order Cancelled, returning to Main Terminal");
                    choosingType = false;
                    return;
                }
                default -> {
                    System.out.println("Invalid choice. Please try again.");
                    continue;
                }
            }

            System.out.println("You chose " + breadName);

            String sandwichName = breadName + " - " + breadSize;
            checkout.addItem("Sandwich (" + sandwichName + ")", 1, breadMinerals);
            new Meat().open(scanner, checkout, sandwichName, breadMinerals);

            choosingType = false;
        }
    }
            }



