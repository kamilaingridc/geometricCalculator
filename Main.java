import java.util.Scanner;
import planeFigures.*;
import spaceFigures.*;

// https://fsymbols.com/generators/

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // System.out.println("GEOMETRIC CALCULATOR +-/*");

        String boldRedBlack = "\033[1;0;40m";
        String reset = "\033[0m";
        System.out.println(boldRedBlack + "\n" +
                "                                     ▒█▀▀█ ▒█▀▀▀ ▒█▀▀▀█ ▒█▀▄▀█ ▒█▀▀▀ ▀▀█▀▀ ▒█▀▀█ ▀█▀ ▒█▀▀█ 　 ▒█▀▀█ ░█▀▀█ ▒█░░░ ▒█▀▀█ ▒█░▒█ ▒█░░░ ░█▀▀█ ▀▀█▀▀ ▒█▀▀▀█ ▒█▀▀█ \n" +
                "                                     ▒█░▄▄ ▒█▀▀▀ ▒█░░▒█ ▒█▒█▒█ ▒█▀▀▀ ░▒█░░ ▒█▄▄▀ ▒█░ ▒█░░░ 　 ▒█░░░ ▒█▄▄█ ▒█░░░ ▒█░░░ ▒█░▒█ ▒█░░░ ▒█▄▄█ ░▒█░░ ▒█░░▒█ ▒█▄▄▀ \n" +
                "                                     ▒█▄▄█ ▒█▄▄▄ ▒█▄▄▄█ ▒█░░▒█ ▒█▄▄▄ ░▒█░░ ▒█░▒█ ▄█▄ ▒█▄▄█ 　 ▒█▄▄█ ▒█░▒█ ▒█▄▄█ ▒█▄▄█ ░▀▄▄▀ ▒█▄▄█ ▒█░▒█ ░▒█░░ ▒█▄▄▄█ ▒█░▒█ \n" +
                "\n");
        System.out.println(reset);
        System.out.println("What's your name?");
        String name = scanner.next();

//        if (!checkLetters(name)) {
//            System.out.println("Numbers are not allowed in this field. Try again.");
//            return;
//        }

        System.out.println(name + ", choose:\n" + "[1] Calculate plane figures | [2] Calculate spatial figures | [3] Exit");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                try {
                    System.out.println(name + ", which figure would you like to calculate:");
                    System.out.println("[1] Square | [2] Rectangle | [3] Equilateral Triangle\n" + "[4] Circle | [5] Regular Hexagon");
                    int figure = scanner.nextInt();

                    switch (figure) {
                        case 1:
                            System.out.println(name + ", do you want area or perimeter?");
                            System.out.println("[1] Area | [2] Perimeter");
                            int type = scanner.nextInt();

                            switch (type) {
                                case 1:

                                    System.out.println("Type the value:");
                                    double number = scanner.nextDouble();
                                    Square area = new Square(number);
                                    System.out.printf("Area of the square is %.2f %n", area.calculateArea());
                                    break;

                                case 2:

                                    System.out.println("Type the value:");
                                    double value = scanner.nextDouble();
                                    Square perimeter = new Square(value);
                                    System.out.printf("Perimeter of the square is %.2f %n", perimeter.calculatePerimeter());
                                    break;
                            }
                            break;

                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                        default:
                            System.out.println("Invalid choice. Try again.");
                            break;
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println("Invalid Choice. Try again.");
                }
                break;
            case 2:
                try {
                    System.out.println(name + ", which figure would you like to calculate:");
                    System.out.println("[1] Cube | [2] Parallelepiped | [3] Cylinder | [4] Cone\n" +
                            "[5] Square-Based Pyramid | [6] Pyramid | [7] Sphere");
                    int figure = scanner.nextInt();
                    switch (figure) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                        case 6:
                            break;
                        case 7:
                            break;
                        default:
                            System.out.println("Invalid choice. Try again.");
                            break;
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println("Invalid Choice. Try again.");
                }
                break;
            case 3:
                System.out.println(name + ", goodbye :)");
                break;
            default:
                System.out.println(name + ", invalid choice. Try again.");
                break;
        }

//        public static boolean checkLetters (String name){
//            return name.matches("[a-zA-Z]+");
//        }
    }
}
