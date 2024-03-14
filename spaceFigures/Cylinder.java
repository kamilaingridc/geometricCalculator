package spaceFigures;

public class Cylinder {
    public double calculateVolume(double height, double radius){
        return Math.PI * height * Math.pow(radius, 2);
    }

    public double calculateSurfaceArea(double height, double radius){
        return (2 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius, 2));
    }
}
