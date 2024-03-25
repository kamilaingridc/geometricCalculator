package planeFigures;

public class EquilateralTriangle {

    double side;

    public EquilateralTriangle(double side) {
        this.side = side;

        int altura = 5;
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println(" ");

    }

    public double calculateArea(){
        double a = (Math.sqrt(3) / 4);
        return side * a;
    }

    public double calculatePerimeter(){
        return side * 3;
    }
}
