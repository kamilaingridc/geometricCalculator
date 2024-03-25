package spaceFigures;

public class Cone {

    double radius;
    double height;

    public Cone(double radius, double height){
        this.radius = radius;
        this.height = height;

        int altura = 10;
        int raio = 5;
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < raio * 2; i++) {
            System.out.print("*");
        }
        System.out.println(" ");

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
