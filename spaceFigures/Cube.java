package spaceFigures;

public class Cube {

    double side;

    public Cube (double side){
        this.side = side;
    }
    public double calculateVolume(){
        return Math.pow(side, 3);
    }

    public double calculateSurfaceArea(){
        return Math.pow(side, 2) * 6;
    }
}
