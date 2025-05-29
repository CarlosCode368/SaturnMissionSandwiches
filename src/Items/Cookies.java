package Items;

import Menus.Checkout;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Cookies {
    private final List<String> cookies = Arrays.asList("Atomic Macadamia", "Chocolate Meteors", "Peanut Nymphs");
    private final int cookiePrice = 130;

    public void open(Scanner scanner, Checkout checkout) {
        boolean isCookiesRunning = true;

        while (isCookiesRunning) {
            System.out.println("""
                ***Craving for something sweet?...sometimes savory?
                Choose your cookies
                (130 minerals per cookie)
                1.Atomic Macadamia
                2.Chocolate Meteors
                3.Peanut Nymphs
                
                e.Continue Ordering (drinks, sandwich, etc.)
                
                c.Proceed to check out
                x.Go Back
                    """);
            System.out.print("> ");
            String input=scanner.nextLine().trim().toLowerCase();

            switch (input) {
                case "1", "2", "3"->{
                    int index = Integer.parseInt(input) - 1;
                    String selectedCookies = cookies.get(index);

                    System.out.println("How many " + selectedCookies + "(s) would you like to buy?");
                    System.out.print("> ");
                    int quantity;
                    try {
                        quantity = Integer.parseInt(scanner.nextLine().trim());
                    } catch (NumberFormatException e) {
                        System.out.println("That's not a valid number.");
                        continue;
                    }

                    int totalCost = quantity * cookiePrice;
                    System.out.println("You acquired " + quantity + " " + selectedCookies + "(s) for " + totalCost + " minerals!");
                    System.out.println("Items moved to your Menus.Checkout.");

                    checkout.addItem(selectedCookies, quantity, cookiePrice);
                }

                case "e" -> {
                    System.out.println("Continuing ordering...");
                    isCookiesRunning = false;
                }

                case "c" -> {
                    System.out.println("Proceeding to checkout...");
                    checkout.open(scanner);
                    isCookiesRunning = false;
                }

                case "x" -> {
                    System.out.println("Going back...");
                    isCookiesRunning = false;
                }

                default -> System.out.println("Invalid option. Please choose 1-4, e, c, or x.");
            }
        }
    }
}