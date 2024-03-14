package spaceFigures;

public class PyramidSquareBased {
    public double calculateVolume(double baseArea, double height){
        return (baseArea * height) / 3;
    }

    public double calculateSurfaceArea(double baseEdge, double apothem){
        return (2 * baseEdge * apothem) + Math.pow(baseEdge, 2);
    }
}
