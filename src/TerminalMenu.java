import java.util.Scanner;

public class TerminalMenu {
    public void open(Scanner scanner, int breadMinerals) {
        Checkout checkout=new Checkout();

        boolean inTerminal = true;
        while (inTerminal) {
            System.out.println("""
                    *****WELCOME TO SATURN MISSION SANDWICHES*****
                                       est.2525
                     ********************************************
                     1. Get a Sandwich
                     2. Get Chips
                     3. Get Cookies
                     4. Get Drinks
                     x. Leave terminal           
                    """);
            System.out.print("> ");
            String terminalChoice = scanner.nextLine();

            switch (terminalChoice) {
                case "1":
                    new Bread().open(scanner, checkout);
                    break;
                case"2":

                    new Chips().open(scanner, checkout);
                    break;
                case"3":

                    new Cookies().open(scanner, checkout);
                    break;
                case"4":

                    new Drinks().open(scanner, checkout);
                    break;

                case "x":
                    System.out.println("RESCUE TEAM NEVER RETURNED TO EARTH...");
                    inTerminal = false;
                    break;

                default:
                    System.out.println("INVALID COMMAND TRY AGAIN");
                    break;
            }
        }
    }
}