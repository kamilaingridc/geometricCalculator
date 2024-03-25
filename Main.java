import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String bold = "\033[1;0;40m";
        String reset = "\033[0m";


        System.out.println(bold + "\n" +
                "                                     ▒█▀▀█ ▒█▀▀▀ ▒█▀▀▀█ ▒█▀▄▀█ ▒█▀▀▀ ▀▀█▀▀ ▒█▀▀█ ▀█▀ ▒█▀▀█ 　 ▒█▀▀█ ░█▀▀█ ▒█    ▒█▀▀█ ▒█  █ ▒█    ░█▀▀█ ▀▀█▀▀ ▒█▀▀▀█ ▒█▀▀█ \n" +
                "                                     ▒█ ▄▄ ▒█▀▀▀ ▒█   █ ▒█ █ █ ▒█▀▀▀  ░█   ▒█▄▄▀ ▒█  ▒█ 　    ▒█    ▒█▄▄█ ▒█    ▒█    ▒█  █ ▒█    ▒█▄▄█  ░█   ▒█   █ ▒█▄▄▀ \n" +
                "                                     ▒█▄▄█ ▒█▄▄▄ ▒█▄▄▄█ ▒█   █ ▒█▄▄▄  ░█   ▒█  █ ▄█▄ ▒█▄▄█ 　 ▒█▄▄█ ▒█  █ ▒█▄▄█ ▒█▄▄█  ▀▄▄▀ ▒█▄▄█ ▒█░▒█  ░█   ▒█▄▄▄█ ▒█  █ \n" +
                "\n");
        System.out.println(reset);

        System.out.println("\n" +
                "                                                                                 ▒█▀▄▀█ ▒█▀▀ ▒█▀▀▄ ▒█  █ \n" +
                "                                                               ----------------- ▒█ █ █ ▒█▀▀ ▒█  █ ▒█  █ -----------------\n" +
                "                                                                                 ▒█   █ ▀▀▀▀ ▀▀  ▀   ▀▀▀ ");

        System.out.println("What's your name?");
        String name = scanner.next();
        System.out.println(" ");

        if (!checkLetters(name)) {
            System.out.println("Numbers are not allowed in this field.");
            return;
        }

        while(true) {
            try {
                System.out.println("Hello, " + name + "! Choose an option: " + "[1] Calculate plane figures | [2] Calculate spatial figures | [3] Exit");
                int choice = scanner.nextInt();
                System.out.println(" ");

                switch (choice) {
                    case 1:

                        menuPlane.menuPlane(name);
                        break;

                    case 2:

                        menuSpace.meuSpace(name);
                        break;

                    case 3:

                        System.out.println("Goodbye, " + name + "! :)");
                        return;

                    default:
                        System.out.println(name + ", invalid choice. Try again.");
                        break;

                }
            } catch (InputMismatchException e){
                System.out.println("Only number accepted. try again.");
                System.out.println(" ");
                scanner.next();
            }
        }
    }

    public static boolean checkLetters(String name){
        return name.matches("[a-zA-Z]+");
    }
}