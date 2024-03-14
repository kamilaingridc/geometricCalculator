package planeFigures;

public class RegularHexagon {
    public double calculateArea(double side){
        double a = (Math.sqrt(3) / 4);
        return 6 * side * a;
    }
    public double calculatePerimeter(double side){
        return side * 6;
    }
}
