import java.util.Scanner;

public class CryoManager {
    public void open(Scanner scanner,int breadMinerals){
        System.out.println("""
                ***Preserve your food for the long travel***
                 ***Freeze your food FREE OF CHARGE********
                 1. Start Cryopreservation process.
                 2. Cancel
                """);
        boolean cryoRunning=true;

        while(cryoRunning) {
            System.out.print("> ");
            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1"-> {
                    System.out.println("INITIALIZING CRYOPRESERVATION");
                    try {
                        for (int i = 3; i > 0; i--) {
                            System.out.println(i + "...");
                            Thread.sleep(1000);
                        }
                    } catch (InterruptedException e) {
                        System.out.println("CRYOPRESERVATION INTERRUPTED. SERVICE SUSPENDED DUE TO SAFETY HAZARD");
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("CRYPPRESERVATION COMPLETE. 73% EFFICIENT");
                    cryoRunning = false;
                }
                    case "2" -> {
                        System.out.println("Cryopreservation Cancelled");
                        cryoRunning = false;
                    }
                    default -> System.out.println("Invalid Command. Please enter 1 or 2");
                }
            }
            System.out.println("""
                            1.Proceed to checkout
                            2.Continue Ordering
                            """);
            while(true){
                System.out.print("> ");
                String nextChoice=scanner.nextLine().trim();
                switch(nextChoice){
                    case "1" -> {
                        new Checkout().open(scanner);
                        return;
                    }
                    case "2" -> {
                        new TerminalMenu().open(scanner, breadMinerals);
                        return;
                    }
                    default -> System.out.println("Invalid Command. Please enter 1 or 2");
                }
            }
        }
    }