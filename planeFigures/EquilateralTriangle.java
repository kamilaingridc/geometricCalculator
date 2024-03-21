package planeFigures;

public class EquilateralTriangle {

    double side;

    public EquilateralTriangle(double side) {
        this.side = side;
    }

    public double calculateArea(){
        double a = (Math.sqrt(3) / 4);
        return side * a;
    }

    public double calculatePerimeter(){
        return side * 3;
    }
}
