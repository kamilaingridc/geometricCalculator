package spaceFigures;

public class Parallelepiped {
    public double calculateVolume(double length, double height, double width){
        return length * height * width;
    }

    public double calculateSurfaceArea(double length, double height, double width){
        return 2 * ((length * height) + (height * width) + length * width);
    }
}
