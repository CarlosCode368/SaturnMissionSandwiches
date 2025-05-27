import java.util.Scanner;

public class Meat {
    public void open(Scanner scanner, int breadMinerals) {
        boolean isMeatRunning = true;

        //Determine meat cost based on bread size

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
                    String extraChoice = scanner.nextLine().toLowerCase();
                    if (extraChoice.equals("y")) {
                        System.out.println("Extra meat added for " + extraMeatCost + " minerals.");
                    } else {
                        System.out.println("No extra meat added.");
                    }
                } else {
                    System.out.println("You chose NO MEAT.");
                }
                isMeatRunning = false;
            }
        }
    }
}

