package planeFigures;

public class Rectangle {

    double base;
    double height;

    public Rectangle(double base, double height){
        this.base = base;
        this.height = height;

        int largura = 7;
        int altura = 5;

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println(" ");

    }
    public double calculateArea(){
        return base * height;
    }
    public double calculatePerimeter(){
        return (2 * base) + (2 * height);
    }
}
