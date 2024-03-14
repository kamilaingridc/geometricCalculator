package planeFigures;

public class Square {

    double side;

    public Square(double side){
        this.side = side;
    }
    public double calculateArea(){
        return Math.pow(side, 2);
    }
    public double calculatePerimeter(){
        return side * 4;
    }
}
