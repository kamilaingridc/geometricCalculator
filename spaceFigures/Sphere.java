package spaceFigures;

import java.util.function.ToDoubleBiFunction;

public class Sphere {

    double radius;

    public Sphere(double radius){
        this.radius = radius;
    }
    public double calculateVolume(){
        double a = (double) 4 /3;
        return a * Math.PI * (Math.pow(radius, 3));
    }

    public double calculateSurfaceArea(){
        return 4 * Math.PI * (Math.pow(radius, 2));
    }
}
