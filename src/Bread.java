import java.util.Scanner;


public class Bread {
    public void open(Scanner scanner) {
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
            switch (sizeChoice) {
                case "1":
                    System.out.println("You chose 4 inch bread");
                    chooseBreadType(scanner);  //user will be sent to the chooseBreadType boolean
                    break;
                case "2":
                    System.out.println("You chose 8 inch bread");
                    chooseBreadType(scanner);
                    break;
                case "3":
                    System.out.println("You chose 12 inch bread");
                    chooseBreadType(scanner);
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

    private void chooseBreadType(Scanner scanner) {
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

            switch (breadChoice) {
                case "1":
                    System.out.println("You chose White Matter");
                    new Meat().open(scanner);
                    choosingType=false;
                break;
                case "2":
                    System.out.println("You chose Comet Flakes");
                    new Meat().open(scanner);
                    choosingType=false;
                break;
                case "3":
                    System.out.println("You chose Warp");
                    new Meat().open(scanner);
                    choosingType=false;
                break;
                case "4":
                    System.out.println("You chose Cosmonaut Wheat");
                    new Meat().open(scanner);
                    choosingType=false;
                break;
                case "x":
                    System.out.println("Order Cancelled, returning to Main Terminal");
                    choosingType=false;
                break;

                default:
                    System.out.println("Invalid choice. Please try again. ");
            }
        }
    }
}


