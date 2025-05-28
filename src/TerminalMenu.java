import java.util.Scanner;

public class TerminalMenu {
    public void open(Scanner scanner, int breadMinerals) {

        boolean inTerminal = true;
        while (inTerminal) {
            System.out.println("""
                    *****WELCOME TO SATURN MISSION SANDWICHES*****
                                       est.2525
                     ********************************************
                     1. Make an Order
                     2. Leave terminal           
                    """);
            System.out.print("> ");
            String terminalChoice = scanner.nextLine();

            switch (terminalChoice) {
                case "1":
                    Bread breadMenu = new Bread();
                    breadMenu.open(scanner);
                    break;

                case "2":
                    System.out.println("RESCUE TEAM NEVER RETURNED TO EARTH...");
                    inTerminal = false;

                default:
                    System.out.println("INVALID COMMAND TRY AGAIN");
                    break;
            }
        }
    }
}