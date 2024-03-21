package planeFigures;

public class RegularHexagon {

    double side;
    public RegularHexagon(double side) {
        this.side = side;
    }

    public double calculateArea(){
        double a = (Math.sqrt(3) / 4);
        return 6 * side * a;
    }
    public double calculatePerimeter(){
        return side * 6;
    }
}
