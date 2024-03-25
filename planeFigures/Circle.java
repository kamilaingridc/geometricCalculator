package planeFigures;

public class Circle {
    double radius;

    public Circle(double radius){
        this.radius = radius;

        int raio = 5;
        int centroX = raio;
        int centroY = raio;

        for (int y = 0; y <= 2 * raio; y++) {
            for (int x = 0; x <= 2 * raio; x++) {
                int distanciaDoCentro = (x - centroX) * (x - centroX) + (y - centroY) * (y - centroY);
                if (distanciaDoCentro <= raio * raio) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println(" ");

    }

    public double calculateArea(){
        return Math.PI * (Math.pow(this.radius, 2));
    }

    public double calculatePerimeter(){
        return 2 * Math.PI * radius;
    }
}
