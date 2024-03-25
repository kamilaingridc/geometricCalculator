import spaceFigures.*;
import java.util.Scanner;

public class menuSpace {
    public static void meuSpace(String name) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(name + ", which figure would you like to calculate:");
        System.out.println("[1] Cube | [2] Parallelepiped | [3] Cylinder | [4] Cone\n" + "[5] Square-Based Pyramid | [6] Sphere");
        int figure = scanner.nextInt();

        switch (figure) {
            case 1:

                System.out.println(name + ", do you want to calculate volume or surface area?");
                System.out.println("[1] Volume | [2] Surface Area");
                int type_cube = scanner.nextInt();

                switch (type_cube) {
                    case 1:

                        System.out.println("Type the side:");
                        double n = scanner.nextDouble();
                        Cube v = new Cube(n);
                        System.out.printf("Volume of the cube is %.2f %n", v.calculateVolume());
                        break;

                    case 2:

                        System.out.println("Type the side:");
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
    }
}