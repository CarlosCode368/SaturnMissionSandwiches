import java.util.Scanner;


public class Drinks {
    public void open(Scanner scanner, Checkout checkout) {
        boolean isDrinksRunning = true;

        while (isDrinksRunning) {
            System.out.println("""
                Who said you cannot drink comfortably in space?
                Quench your thirst with the help of our awesome vacuum proofed thermos!
                Choose your drinks:
                1.Reactor Juice
                2.Centrifuged Soda
                3.Secret Formula Soda
                4.Alien Acid Soda
                5.H2O (Not water)
                
                
                e.Continue Ordering (drinks, sandwich, etc.)
                
                c.Proceed to check out
                x.Go Back
                    """);
        }
    }
}