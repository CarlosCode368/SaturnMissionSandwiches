import java.util.Scanner;


public class MainMenu {
    public static void main(String[] args) {
        System.out.println("As you wander through the abandoned colony of Dione\nyou come across an automated food terminal...");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press T to access terminal or X to abort mission");
        String action = "> ";
        String choice = scanner.nextLine().toUpperCase();
    }
}
