import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("GEOMETRIC CALCULATOR +-/*");
        Scanner scanner = new Scanner(System.in);
        System.out.println("[1] Calculate plane figures | [2] Calculate spatial figures | [3] Exit");
        Integer choice = scanner.nextInt();
        switch (choice) {
            case 1:

            case 2:

            case 3:
                System.out.println("Leaving...");
                break;
            default:
                System.out.println("Invalid choice. Try again: ");
                Main.main();
        }
        System.out.println(choice);
       // switch ()
    }
}
