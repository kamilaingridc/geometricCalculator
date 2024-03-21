package spaceFigures;

public class Parallelepiped {

    double length;
    double height;
    double width;

    public Parallelepiped(double length, double height, double width){
        this.length = length;
        this.height = height;
        this.width = width;
    }

    public double calculateVolume(){
        return length * height * width;
    }

    public double calculateSurfaceArea(){
        return 2 * ((length * height) + (height * width) + length * width);
    }
}
