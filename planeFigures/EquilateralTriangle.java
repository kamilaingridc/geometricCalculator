package planeFigures;

public class EquilateralTriangle {
    public double calculateArea(double side){
        double a = (Math.sqrt(3) / 4);
        return side * a;
    }

    public double calculatePerimeter(double side){
        return side * 3;
    }
}

