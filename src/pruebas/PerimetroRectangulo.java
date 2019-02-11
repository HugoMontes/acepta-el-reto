package pruebas;

import java.util.Scanner;

public class PerimetroRectangulo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p;
        int alto = in.nextInt();
        int ancho = in.nextInt();
        if (alto >= 0 && ancho >= 0) {
            do {
                p = alto * 2 + ancho * 2;
                System.out.println("" + p);
                alto = in.nextInt();
                ancho = in.nextInt();
            } while (alto >= 0 && ancho >= 0);
        }
    }
}
