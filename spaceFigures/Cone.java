package spaceFigures;

public class Cone {
    public double calculateVolume(double radius, double height){
        float a = (float) 1 /3;
        return a * Math.PI * Math.pow(radius, 2) * height;
    }

    public double calculateSurfaceArea(double radius, double height){
        double a = Math.sqrt((Math.pow(height, 2)) + (Math.pow(radius, 2)));
        return Math.PI * radius * a;
    }
}
