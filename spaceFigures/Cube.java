package spaceFigures;

public class Cube {
    public double calculateVolume(double side){
        return Math.pow(side, 3);
    }

    public double calculateSurfaceArea(double side){
        return Math.pow(side, 2) * 6;
    }
}
