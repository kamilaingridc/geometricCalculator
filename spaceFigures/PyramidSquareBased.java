package spaceFigures;

public class PyramidSquareBased {

    double baseArea;
    double height;
    double baseEdge;
    double apothem;

    public PyramidSquareBased(double baseArea, double height, double baseEdge, double apothem){
        this.baseArea = baseArea;
        this.height = height;
        this.baseEdge = baseEdge;
        this.apothem = apothem;
    }
    public double calculateVolume(){
        return (baseArea * height) / 3;
    }

    public double calculateSurfaceArea(){
        return (2 * baseEdge * apothem) + Math.pow(baseEdge, 2);
    }
}
