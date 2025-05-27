import java.util.Scanner;

public class Meat {
    public void open(Scanner scanner,int breadMinerals){
        boolean isMeatRunning=true;

    //Determine meat cost based on breadMinerals
    int meatCost=100;

    if(breadMinerals==550){
        meatCost = 100;
    }else if(breadMinerals==700){
        meatCost = 150;
    }else if(breadMinerals==850){
        meatCost=225;
    }

            while(isMeatRunning){
                System.out.println("""
                        ***FROM ALL THE CORNERS OF THE GALAXY, THE PLACE WHERE MEAT GATHERS***
                        Choose your meat:
                        1. TITAN STEAK
                        2. LAB SALAMI
                        3. TWIN MOON'S HAM
                        4. ROAST ALIEN BEEF
                        5. SPACE CHICKEN
                        6. PRESERVED BACON
                        7. NO MEAT
                        
                        ANY MEAT WILL COST YOU AN ADDITIONAL %d MINERALS
                        """.formatted(meatCost));
                System.out.print("> ");

                String meatChoice=scanner.nextLine();
            }
        }
}
