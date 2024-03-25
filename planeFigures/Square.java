package planeFigures;

public class Square {

    double side;

    public Square(double side){
        this.side = side;

        int tamanho = 5;
        for (int i = 0; i < tamanho; i++) {
            System.out.print("* ");
        }
        System.out.println();
        for (int i = 0; i < tamanho - 2; i++) {
            System.out.print("* ");
            for (int j = 0; j < tamanho - 2; j++) {
                System.out.print("  ");
            }
            System.out.println("*");
        }
        for (int i = 0; i < tamanho; i++) {
            System.out.print("* ");
        }
        System.out.println(" ");

    }
    public double calculateArea(){
        return Math.pow(side, 2);
    }
    public double calculatePerimeter(){
        return side * 4;
    }
}