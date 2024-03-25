import java.util.Scanner;
import planeFigures.*;

public class menuPlane{

    public static void menuPlane(String name) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(name + ", which figure would you like to calculate:");
        System.out.println("[1] Square | [2] Rectangle | [3] Equilateral Triangle\n" + "[4] Circle | [5] Regular Hexagon");
        int figure = scanner.nextInt();
        System.out.println(" ");

        switch (figure) {
            // square
            case 1:
                System.out.println(name + ", do you want area or perimeter?");
                System.out.println("[1] Area | [2] Perimeter");
                int type_square = scanner.nextInt();

                switch (type_square) {
                    case 1:

                        System.out.println("Type the side:");
                        double number = scanner.nextDouble();
                        System.out.println(" ");
                        if (number > 0) {
                            Square area = new Square(number);
                            System.out.printf("Area of the square is %.2f %n", area.calculateArea());
                            System.out.println(" ");
                        }else{
                            System.out.println("Only > 0 numbers.");
                        }
                        break;

                    case 2:

                        System.out.println("Type the side:");
                        double value = scanner.nextDouble();
                        if (value > 0) {
                            Square perimeter = new Square(value);
                            System.out.printf("Perimeter of the square is %.2f %n", perimeter.calculatePerimeter());
                            System.out.println(" ");
                        }else{
                            System.out.println("Only > 0 numbers.");
                        }
                        break;
                }
                break;
            // rectangle
            case 2:
                System.out.println(name + ", do you want area or perimeter?");
                System.out.println("[1] Area | [2] Perimeter");
                int type_rectangle = scanner.nextInt();
                System.out.println(" ");

                switch (type_rectangle) {
                    case 1:

                        System.out.println("Type the first value:");
                        double number = scanner.nextDouble();
                        System.out.println("Type the second value:");
                        double number2 = scanner.nextDouble();
                        Rectangle area = new Rectangle(number, number2);
                        System.out.printf("Area of the rectangle is %.2f %n", area.calculateArea());
                        System.out.println(" ");
                        break;

                    case 2:

                        System.out.println("Type the first value:");
                        double value = scanner.nextDouble();
                        System.out.println("Type the second value:");
                        double value2 = scanner.nextDouble();
                        Rectangle perimeter = new Rectangle(value, value2);
                        System.out.printf("Perimeter of the rectangle is %.2f %n", perimeter.calculatePerimeter());
                        System.out.println(" ");
                        break;
                }
                break;
            // Equilateral Triangle
            case 3:
                System.out.println(name + ", do you want area or perimeter?");
                System.out.println("[1] Area | [2] Perimeter");
                int type_EquilateralTriangle = scanner.nextInt();
                System.out.println(" ");

                switch (type_EquilateralTriangle) {
                    case 1:

                        System.out.println("Type the side:");
                        double n = scanner.nextDouble();
                        EquilateralTriangle area1 = new EquilateralTriangle(n);
                        System.out.printf("Area of the Equilateral Triangle is %.2f %n", area1.calculateArea());
                        break;

                    case 2:

                        System.out.println("Type the side:");
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

                        System.out.println("Type the radius:");
                        double n2 = scanner.nextDouble();
                        Circle area2 = new Circle(n2);
                        System.out.printf("Area of the circle is %.2f %n", area2.calculateArea());
                        break;

                    case 2:

                        System.out.println("Type the radius:");
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

                        System.out.println("Type the side:");
                        double n4 = scanner.nextDouble();
                        RegularHexagon area3 = new RegularHexagon(n4);
                        System.out.printf("Area of the regular hexagon is %.2f %n", area3.calculateArea());
                        break;

                    case 2:

                        System.out.println("Type the side:");
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
    }
}
