import java.util.Scanner;


public class Introduction {
    public static void main(String[] args) {
        System.out.println("As you wander through the abandoned colony of Dione\nyou come across an automated food terminal...");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press T to access terminal or X to abort mission");
        System.out.print("> ");
        String choice = scanner.nextLine().toUpperCase();  //SMALL INTRODUCTION FOR IMMERSION


        boolean isRunning = true;
        while (isRunning) {
            switch (choice) {    //ENTERING TERMINAL
                case "T":
                    System.out.println("\nDETECTING HUMAN INTELLIGENCE...");
                    try {
                        for (int i = 3; i > 0; i--) {
                            System.out.println(i + "...");
                            Thread.sleep(1000);
                        }
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        System.out.println("DETECTION INTERRUPTED");
                        return;
                    }
                    boolean inTerminal=true;
                    while(inTerminal) {
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
                                System.out.println("FEATURE COMING SOON");

                            case "2":
                                System.out.println("RESCUE TEAM NEVER RETURNED TO EARTH...");
                                inTerminal = false;
                                isRunning = false;
                                break;

                            default:
                                System.out.println("INVALID COMMAND TRY AGAIN");
                                break;
                        }
                    }
                    break;

                        case "X":
                            isRunning = false;
                            System.out.println("ABORTING MISSION. SOME SECRETS SHOULD REMAIN HIDDEN...");
                            break;

                        default:
                            System.out.println("INVALID COMMAND. Please press T to access terminal or X to abort.");
                            break;

                    }
                    scanner.close();
            }
        }
    }