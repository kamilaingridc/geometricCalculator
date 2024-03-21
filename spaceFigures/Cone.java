package spaceFigures;

public class Cone {

    double radius;
    double height;

    public Cone(double radius, double height){
        this.radius = radius;
        this.height = height;
    }
    public double calculateVolume(){
        float a = (float) 1 /3;
        return a * Math.PI * Math.pow(radius, 2) * height;
    }

    public double calculateSurfaceArea(){
        double a = Math.sqrt((Math.pow(height, 2)) + (Math.pow(radius, 2)));
        return Math.PI * radius * a;
    }
}
