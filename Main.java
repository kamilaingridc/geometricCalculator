import java.util.Scanner;
import planeFigures.*;
import spaceFigures.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
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
                            }
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
                            "[5] Square-Based Pyramid | [6] Sphere");
                    int figure = scanner.nextInt();
                    switch (figure) {
                        case 1:

                            System.out.println(name + ", do you want to calculate volume or surface area?");
                            System.out.println("[1] Volume | [2] Surface Area");
                            int type_cube = scanner.nextInt();

                            switch (type_cube) {
                                case 1:

                                    System.out.println("Type the value:");
                                    double n = scanner.nextDouble();
                                    Cube v = new Cube(n);
                                    System.out.printf("Volume of the cube is %.2f %n", v.calculateVolume());
                                    break;

                                case 2:

                                    System.out.println("Type the value:");
                                    double n1 = scanner.nextDouble();
                                    Cube s = new Cube(n1);
                                    System.out.printf("Surface area of the circle is %.2f %n", s.calculateSurfaceArea());

                                    break;
                            }
                            break;

                        case 2:

                            System.out.println(name + ", do you want to calculate volume or surface area?");
                            System.out.println("[1] Volume | [2] Surface Area");
                            int type_Parallelepiped = scanner.nextInt();

                            switch (type_Parallelepiped) {
                                case 1:

                                    System.out.println("Type the first value:");
                                    double n2 = scanner.nextDouble();
                                    System.out.println("Type the second value:");
                                    double n3 = scanner.nextDouble();
                                    System.out.println("Type the third value:");
                                    double n4 = scanner.nextDouble();

                                    Parallelepiped v2 = new Parallelepiped(n2, n3, n4);
                                    System.out.printf("Volume of the parallelepiped is %.2f %n", v2.calculateVolume());
                                    break;

                                case 2:

                                    System.out.println("Type the first value:");
                                    double n5 = scanner.nextDouble();
                                    System.out.println("Type the second value:");
                                    double n6 = scanner.nextDouble();
                                    System.out.println("Type the third value:");
                                    double n7 = scanner.nextDouble();

                                    Parallelepiped s1 = new Parallelepiped(n5, n6, n7);
                                    System.out.printf("Surface area of the circle is %.2f %n", s1.calculateSurfaceArea());

                                    break;
                            }
                            break;

                        case 3:

                            System.out.println(name + ", do you want to calculate volume or surface area?");
                            System.out.println("[1] Volume | [2] Surface Area");
                            int type_cylinder = scanner.nextInt();

                            switch (type_cylinder) {
                                case 1:

                                    System.out.println("Type the first value:");
                                    double n8 = scanner.nextDouble();
                                    System.out.println("Type the second value:");
                                    double n9 = scanner.nextDouble();

                                    Cylinder v4 = new Cylinder(n8, n9);
                                    System.out.printf("Volume of the cylinder is %.2f %n", v4.calculateVolume());
                                    break;

                                case 2:

                                    System.out.println("Type the first value:");
                                    double n10 = scanner.nextDouble();
                                    System.out.println("Type the second value:");
                                    double n11 = scanner.nextDouble();

                                    Cylinder s3 = new Cylinder(n10, n11);
                                    System.out.printf("Surface area of the cylinder is %.2f %n", s3.calculateSurfaceArea());

                                    break;
                            }
                            break;

                        case 4:

                            System.out.println(name + ", do you want to calculate volume or surface area?");
                            System.out.println("[1] Volume | [2] Surface Area");
                            int type_cone = scanner.nextInt();

                            switch (type_cone) {
                                case 1:

                                    System.out.println("Type the first value:");
                                    double a = scanner.nextDouble();
                                    System.out.println("Type the second value:");
                                    double a1 = scanner.nextDouble();

                                    Cone a2 = new Cone(a, a1);
                                    System.out.printf("Volume of the cone is %.2f %n", a2.calculateVolume());
                                    break;

                                case 2:

                                    System.out.println("Type the first value:");
                                    double a3 = scanner.nextDouble();
                                    System.out.println("Type the second value:");
                                    double a4 = scanner.nextDouble();

                                    Cylinder a5 = new Cylinder(a3, a4);
                                    System.out.printf("Surface area of the cone is %.2f %n", a5.calculateSurfaceArea());

                                    break;
                            }

                            break;

                        case 5:

                            System.out.println(name + ", do you want to calculate volume or surface area?");
                            System.out.println("[1] Volume | [2] Surface Area");
                            int type_psb = scanner.nextInt();

                            switch (type_psb) {
                                case 1:

                                    System.out.println("Type the area base value:");
                                    double b = scanner.nextDouble();
                                    System.out.println("Type the height value:");
                                    double b1 = scanner.nextDouble();

                                    PyramidSquareBased b3 = new PyramidSquareBased(b, b1, 0, 0);
                                    System.out.printf("Volume of the pyramid square based is %.2f %n", b3.calculateVolume());
                                    break;

                                case 2:

                                    System.out.println("Type the base edge value:");
                                    double b4 = scanner.nextDouble();
                                    System.out.println("Type the apothem value:");
                                    double b5 = scanner.nextDouble();

                                    PyramidSquareBased b6 = new PyramidSquareBased(0, 0, b4, b5);
                                    System.out.printf("Surface area of the pyramid square based is %.2f %n", b6.calculateSurfaceArea());

                                    break;
                            }

                            break;

                        case 6:

                            System.out.println(name + ", do you want to calculate volume or surface area?");
                            System.out.println("[1] Volume | [2] Surface Area");
                            int type_sphere = scanner.nextInt();

                            switch (type_sphere) {
                                case 1:

                                    System.out.println("Type the radius value:");
                                    double c = scanner.nextDouble();

                                    Sphere c1 = new Sphere(c);
                                    System.out.printf("Volume of the sphere is %.2f %n", c1.calculateVolume());
                                    break;

                                case 2:

                                    System.out.println("Type the radius value:");
                                    double c2 = scanner.nextDouble();

                                    Sphere c3 = new Sphere(c2);
                                    System.out.printf("Surface area of the sphere is %.2f %n", c3.calculateSurfaceArea());

                                    break;
                            }
                                break;

                                default:
                                    System.out.println("Invalid choice. Try again.");
                                    break;
                            }

                    } catch(IllegalArgumentException e){
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