package spaceFigures;

import java.util.function.ToDoubleBiFunction;

public class Sphere {
    public double calculateVolume(double radius){
        double a = (double) 4 /3;
        return a * Math.PI * (Math.pow(radius, 3));
    }

    public double calculateSurfaceArea(double radius){
        return 4 * Math.PI * (Math.pow(radius, 2));
    }
}
