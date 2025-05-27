import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Toppings {

    public void open(Scanner scanner, int breadMinerals) {
        boolean isToppingsRunning = true;
        List<String> selectedToppings = new ArrayList<>();

        System.out.println("""
                ***NATIONS AND COLONIES WORKING TOGETHER TO PROVIDE FOOD FOR ALL HUMANS IN THE GALAXY***
                ***TRY OUR NEW MUSHROOM GUYS!!! DISCOVERED ON AN ABANDONED SPACE COLONY, BECOME A PIONEER OF TASTE!!!***
                Choose your toppings:
                Type 'done' when you're finished:
                1. Hydroponic Lettuce
                2. Moon Farm Onions
                3. Fake Tomatoes
                4. Spicy Experiment
                5. Orbital Cucumbers
                6. Military Graded Pickles
                7. G-U-A-C-A Mole
                8. Mushroom Guys (WARNING: SLIGHT PROBABILITY OF BRAIN PARASITES IF CONSUMED)
                x. Cancel Order
                (Toppings are FREE with your sandwich!)
                """);

        while (isToppingsRunning) {
            System.out.print("> ");
            String choice = scanner.nextLine().toLowerCase();

            switch (choice) {
                case "1" -> {
                    if (selectedToppings.contains("Hydroponic Lettuce")) {
                        System.out.println("You already added Hydroponic Lettuce!");
                    } else {
                        System.out.println("Added Hydroponic Lettuce");
                        selectedToppings.add("Hydroponic Lettuce");
                    }
                }
                    case "2" -> {
                        if (selectedToppings.contains("Moon Farm Onions")) {
                            System.out.println("You already added Moon Farm Onions!");
                        } else {
                            System.out.println("Added Moon Farm Onions");
                            selectedToppings.add("Moon Farm Onions");
                        }
                    }
                        case "3" -> {
                            if (selectedToppings.contains("Fake Tomatoes")) {
                                System.out.println("You already added Fake Tomatoes!");
                            } else {
                                System.out.println("Added Fake Tomatoes");
                                selectedToppings.add("Fake Tomatoes");
                            }
                        }
                            case "4" -> {
                                if (selectedToppings.contains("Spicy Experiment")) {
                                    System.out.println("You already added Spicy Experiment!");
                                } else {
                                    System.out.println("Added Spicy Experiment");
                                    selectedToppings.add("Spicy Experiment");
                                }
                            }
                                case "5" -> {
                                    if (selectedToppings.contains("Orbital Cucumbers")) {
                                        System.out.println("You already added Orbital Cucumbers!");
                                    } else {
                                        System.out.println("Added Orbital Cucumbers ");
                                        selectedToppings.add("Orbital Cucumbers");
                                    }
                                }
                                    case "6" -> {
                                        if (selectedToppings.contains("Military Graded Pickles")) {
                                            System.out.println("You already added Military Graded Pickles!");
                                        } else {
                                            System.out.println("Added Military Graded Pickles");
                                            selectedToppings.add("Military Graded Pickles");
                                        }
                                    }
                                        case "7" -> {
                                            if (selectedToppings.contains("G-U-A-C-A Mole")) {
                                                System.out.println("You already added G-U-A-C-A Mole!");
                                            } else {
                                                System.out.println("Added G-U-A-C-A Mole");
                                                selectedToppings.add("G-U-A-C-A Mole");
                                            }
                                        }
                                            case "8" -> {
                                                if (selectedToppings.contains("Mushroom Guys")) {
                                                    System.out.println("You already Mushroom Guys");
                                                } else {
                                                    System.out.println("Added Parasitic Spore");
                                                    selectedToppings.add("Mushroom Guys");
                                                }
                                            }
                                            case "done" -> {
                                                System.out.println("Toppings selection complete!");
                                                isToppingsRunning = false;
                                            }
                                            case "x" -> {
                                                System.out.println("Order cancelled. Returning to Main Terminal.");
                                                isToppingsRunning = false;
                                            }
                                            default -> System.out.println("Invalid input. Please try again.");
                                        }
                                    }

                                    // You can use selectedToppings later for summary/checkout
                                    // Example:
                                    System.out.println("You selected the following toppings: " + selectedToppings);
                                }
                            }





