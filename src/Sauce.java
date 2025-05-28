import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sauce {

    public void open(Scanner scanner, int breadMinerals) {
        boolean isSauceRunning = true;
        List<String> selectedSauces = new ArrayList<>();

        System.out.println("""
                ***SAUCES: THE FINAL FRONTIER OF DELICIOUSNESS***
                Choose your Sauces:
                
                1. Void
                2. Space Ranch
                3. Thousand Moons
                4. Engineered Sauce
                5. Tardigrade
                6. MRE Sauce
                C. Complete Sandwich
                x. Cancel Order
                (Sauces are FREE with your sandwich!)
                """);

        while (isSauceRunning) {
            System.out.print("> ");
            String choice = scanner.nextLine().toLowerCase();

            switch (choice) {
                case "1" -> {
                    if (selectedSauces.contains("Hydroponic Lettuce")) {
                        System.out.println("You already added Hydroponic Lettuce!");
                    } else {
                        System.out.println("Added Hydroponic Lettuce");
                        selectedSauces.add("Hydroponic Lettuce");
                    }
                }
                case "2" -> {
                    if (selectedSauces.contains("Moon Farm Onions")) {
                        System.out.println("You already added Moon Farm Onions!");
                    } else {
                        System.out.println("Added Moon Farm Onions");
                        selectedSauces.add("Moon Farm Onions");
                    }
                }
                case "3" -> {
                    if (selectedSauces.contains("Fake Tomatoes")) {
                        System.out.println("You already added Fake Tomatoes!");
                    } else {
                        System.out.println("Added Fake Tomatoes");
                        selectedSauces.add("Fake Tomatoes");
                    }
                }
                case "4" -> {
                    if (selectedSauces.contains("Spicy Experiment")) {
                        System.out.println("You already added Spicy Experiment!");
                    } else {
                        System.out.println("Added Spicy Experiment");
                        selectedSauces.add("Spicy Experiment");
                    }
                }
                case "5" -> {
                    if (selectedSauces.contains("Orbital Cucumbers")) {
                        System.out.println("You already added Orbital Cucumbers!");
                    } else {
                        System.out.println("Added Orbital Cucumbers ");
                        selectedSauces.add("Orbital Cucumbers");
                    }
                }
                case "6" -> {
                    if (selectedSauces.contains("Military Graded Pickles")) {
                        System.out.println("You already added Military Graded Pickles!");
                    } else {
                        System.out.println("Added Military Graded Pickles");
                        selectedSauces.add("Military Graded Pickles");
                    }
                }
                case "c" -> {
                    System.out.println("Sauce selection complete!");
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
        while(true){
        System.out.println("You selected the following sauces: " + selectedSauces);
        System.out.println("Would you like to toast your sandwich? (Y/N)");
        System.out.print("> ");
        toastChoice = scanner.nextLine().trim().toLowerCase();

            if (toastChoice.equals("y") || toastChoice.equals("n")) {
                break;
            }else {
                System.out.println("Invalid Command. Please enter 'Y' or 'N'");
            }
            }
        boolean isToasted=toastChoice.equals("y");

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
        boolean isComboed = comboChoice.equals("Y");
        if (isComboed) {
            new ComboManager().open(scanner, breadMinerals);

        } else {
            new CryoManager().open(scanner, breadMinerals);

        }
        isSauceRunning = false;
    }
}
