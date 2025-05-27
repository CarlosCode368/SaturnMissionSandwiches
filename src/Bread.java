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


String sizeChoice=scanner.nextLine();
            switch (sizeChoice) {
                case "1":
                    System.out.println("You chose 4 inch bread");
                    break;
                case"2":
                    System.out.println("You chose 8 inch bread");
                    break;
                case"3":
                    System.out.println("You chose 12 inch bread");
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
}


