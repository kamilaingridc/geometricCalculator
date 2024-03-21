package spaceFigures;

public class Cylinder {
    double height;
    double radius;

    public Cylinder(double height, double radius){
        this.height = height;
        this.radius = radius;
    }

    public double calculateVolume(){
        return Math.PI * height * Math.pow(radius, 2);
    }

    public double calculateSurfaceArea(){
        return (2 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius, 2));
    }
}
