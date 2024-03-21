import java.util.Scanner;
import planeFigures.*;
import spaceFigures.*;

// https://fsymbols.com/generators/

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        // System.out.println("GEOMETRIC CALCULATOR +-/*");

        String boldRedBlack = "\033[1;0;40m";
        String reset = "\033[0m";
        System.out.println(boldRedBlack + "\n" +
                "                                     ▒█▀▀█ ▒█▀▀▀ ▒█▀▀▀█ ▒█▀▄▀█ ▒█▀▀▀ ▀▀█▀▀ ▒█▀▀█ ▀█▀ ▒█▀▀█ 　 ▒█▀▀█ ░█▀▀█ ▒█    ▒█▀▀█ ▒█  █ ▒█    ░█▀▀█ ▀▀█▀▀ ▒█▀▀▀█ ▒█▀▀█ \n" +
                "                                     ▒█ ▄▄ ▒█▀▀▀ ▒█   █ ▒█ █ █ ▒█▀▀▀  ░█   ▒█▄▄▀ ▒█  ▒█ 　    ▒█    ▒█▄▄█ ▒█    ▒█    ▒█  █ ▒█    ▒█▄▄█  ░█   ▒█   █ ▒█▄▄▀ \n" +
                "                                     ▒█▄▄█ ▒█▄▄▄ ▒█▄▄▄█ ▒█   █ ▒█▄▄▄  ░█   ▒█  █ ▄█▄ ▒█▄▄█ 　 ▒█▄▄█ ▒█  █ ▒█▄▄█ ▒█▄▄█  ▀▄▄▀ ▒█▄▄█ ▒█░▒█  ░█   ▒█▄▄▄█ ▒█  █ \n" +
                "\n");
        System.out.println(reset);
        Thread.sleep(2000);
        System.out.println("\n" +
                "                                                                                 ▒█▀▄▀█ ▒█▀▀ ▒█▀▀▄ ▒█  █ \n" +
                "                                                               ----------------- ▒█ █ █ ▒█▀▀ ▒█  █ ▒█  █ -----------------\n" +
                "                                                                                 ▒█   █ ▀▀▀▀ ▀▀  ▀   ▀▀▀ ");
        Thread.sleep(1000);
        System.out.println("What's your name?");
        String name = scanner.next();

        if (!checkLetters(name)) {
            System.out.println("Numbers are not allowed in this field. Try again.");
            return;
        }

        System.out.println("Hello, " + name + "! Choose an option:" + "[1] Calculate plane figures | [2] Calculate spatial figures | [3] Exit");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                try {
                    System.out.println(name + ", which figure would you like to calculate:");
                    System.out.println("[1] Square | [2] Rectangle | [3] Equilateral Triangle\n" + "[4] Circle | [5] Regular Hexagon");
                    int figure = scanner.nextInt();

                    switch (figure) {
                    // square
                        case 1:
                            System.out.println(name + ", do you want area or perimeter?");
                            System.out.println("[1] Area | [2] Perimeter");
                            int type_square = scanner.nextInt();

                            switch (type_square) {
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
                        // rectangle
                        case 2:
                            System.out.println(name + ", do you want area or perimeter?");
                            System.out.println("[1] Area | [2] Perimeter");
                            int type_rectangle = scanner.nextInt();

                            switch (type_rectangle) {
                                case 1:

                                    System.out.println("Type the first value:");
                                    double number = scanner.nextDouble();
                                    System.out.println("Type the second value:");
                                    double number2 = scanner.nextDouble();
                                    Rectangle area = new Rectangle(number, number2);
                                    System.out.printf("Area of the rectangle is %.2f %n", area.calculateArea());
                                    break;

                                case 2:

                                    System.out.println("Type the first value:");
                                    double value = scanner.nextDouble();
                                    System.out.println("Type the second value:");
                                    double value2 = scanner.nextDouble();
                                    Rectangle perimeter = new Rectangle(value, value2);
                                    System.out.printf("Perimeter of the rectangle is %.2f %n", perimeter.calculatePerimeter());
                                    break;
                                }
                            break;
                        // Equilateral Triangle
                        case 3:
                            System.out.println(name + ", do you want area or perimeter?");
                            System.out.println("[1] Area | [2] Perimeter");
                            int type_EquilateralTriangle = scanner.nextInt();

                            switch (type_EquilateralTriangle) {
                                case 1:

                                    System.out.println("Type the value:");
                                    double n = scanner.nextDouble();
                                    EquilateralTriangle area1 = new EquilateralTriangle(n);
                                    System.out.printf("Area of the Equilateral Triangle is %.2f %n", area1.calculateArea());
                                    break;

                                case 2:

                                    System.out.println("Type the value:");
                                    double n1 = scanner.nextDouble();
                                    EquilateralTriangle perimeter1 = new EquilateralTriangle(n1);
                                    System.out.printf("Perimeter of the Equilateral Triangle is %.2f %n", perimeter1.calculatePerimeter());
                                    break;
                            }
                            break;

                        // Circle
                        case 4:

                            System.out.println(name + ", do you want area or perimeter?");
                            System.out.println("[1] Area | [2] Perimeter");
                            int type_Circle = scanner.nextInt();

                            switch (type_Circle) {
                                case 1:

                                    System.out.println("Type the value:");
                                    double n2 = scanner.nextDouble();
                                    Circle area2 = new Circle(n2);
                                    System.out.printf("Area of the circle is %.2f %n", area2.calculateArea());
                                    break;

                                case 2:

                                    System.out.println("Type the value:");
                                    double n3 = scanner.nextDouble();
                                    Circle perimeter2 = new Circle(n3);
                                    System.out.printf("Perimeter of the circle is %.2f %n", perimeter2.calculatePerimeter());

                            break;

                        // Regular Hexagon
                        case 5:

                            System.out.println(name + ", do you want area or perimeter?");
                            System.out.println("[1] Area | [2] Perimeter");
                            int type_RegularHexagon = scanner.nextInt();

                            switch (type_RegularHexagon) {
                                case 1:

                                    System.out.println("Type the value:");
                                    double n4 = scanner.nextDouble();
                                    RegularHexagon area3 = new RegularHexagon(n4);
                                    System.out.printf("Area of the regular hexagon is %.2f %n", area3.calculateArea());
                                    break;

                                case 2:

                                    System.out.println("Type the value:");
                                    double n5 = scanner.nextDouble();
                                    RegularHexagon perimeter3 = new RegularHexagon(n5);
                                    System.out.printf("Perimeter of the regular hexagon is %.2f %n", perimeter3.calculatePerimeter());
                                    break;
                            }

                            break;
                        }

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
    }
        public static boolean checkLetters (String name){
            return name.matches("[a-zA-Z]+");
    }
}