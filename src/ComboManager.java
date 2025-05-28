import java.util.Scanner;

public class ComboManager {
    public void open(Scanner scanner, int breadMinerals) {
        System.out.println("-One small step for combos, one giant leap for deliciousness-\nCombo includes one small drink and chips for only 300 minerals (no cookie included)");
        System.out.println("""
                Who said you cannot drink comfortably in space?
                Quench your thirst with the help of our awesome vacuum proofed thermos!
                Choose your small drink:
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
            }else{
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
                1.Rocket Chips
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
            }else{
                System.out.println("Invalid command. Please enter a number between 1 and 4.");
            }
        }
        String selectedChips = switch (chipsChoice) {
            case "1" -> "Rocket Chips";
            case "2" -> "Volcanic Breathe";
            case "3" -> "Mothership Debris";
            case "4" -> "Crunchy Crystals";
            default -> "";
        };
        System.out.println("You chose " + selectedChips);
        System.out.println("""
            Chips added. Combo complete!
            1.Cryogenic preservation (FREE SERVICE)
            2.Proceed to Checkout
            3.Continue Ordering
            """);
            }
        }


