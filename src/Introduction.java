import java.util.Scanner;

    public class Introduction {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Checkout checkout = new Checkout();
            int breadMinerals = 0;

            System.out.println("As you wander through the abandoned colony of Dione\nyou come across an automated food terminal...");
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
                        new TerminalMenu().open(scanner, checkout);
                        isRunning = false;
                        break;

                    case "X":
                        isRunning = false;
                        System.out.println("ABORTING MISSION. SOME SECRETS SHOULD REMAIN HIDDEN...");
                        break;

                    default:
                        System.out.println("INVALID COMMAND. Please press T to access terminal or X to abort.");
                        break;
                }
                }
                scanner.close();
            }
        }

