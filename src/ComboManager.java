import java.util.Scanner;

public class ComboManager {
    public void open(Scanner scanner,int breadMinerals){
        System.out.println("-One small step for combos, one giant leap for deliciousness-\nCombo includes one small drink and chips for only 300 minerals (no cookie included)");
        System.out.println("""
                Who said you cannot drink comfortably in space?\nQuench your thirst with the help of our awesome vacuum proofed thermos!
                Choose your small drink:
                1.Reactor Juice
                2.Centrifuged Soda
                3.Secret Formula Soda
                4.Alien Acid Soda
                5.H2O (Not water)
                """);
        System.out.print("> ");
    }
}
