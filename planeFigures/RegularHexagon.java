package planeFigures;

public class RegularHexagon {

    double side;
    public RegularHexagon(double side) {
        this.side = side;

        int tamanho = 5;
        int largura = 2 * tamanho + 1;
        for (int i = 0; i < largura; i++) {
            int espacosAntes = Math.abs(tamanho - i);
            for (int j = 0; j < espacosAntes; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < largura - 2 * espacosAntes; j++) {
                if (i == 0 || i == largura - 1) {
                    System.out.print("* ");
                } else {
                    if (j == 0 || j == largura - 2 * espacosAntes - 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }

            System.out.println();
        }

        System.out.println(" ");

    }

    public double calculateArea(){
        double a = (Math.sqrt(3) / 4);
        return 6 * side * a;
    }
    public double calculatePerimeter(){
        return side * 6;
    }
}
