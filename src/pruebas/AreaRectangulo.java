package pruebas;

import java.util.Scanner;

public class AreaRectangulo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        short ax, ay, bx, by;
        int base,altura;
        ax = in.nextShort();
        ay = in.nextShort();
        bx = in.nextShort();
        by = in.nextShort();
        if (bx >= ax && by >= ay) {
            do {
                base = bx - ax;
                altura = by - ay;
                System.out.println(base * altura);
                ax = in.nextShort();
                ay = in.nextShort();
                bx = in.nextShort();
                by = in.nextShort();
            } while (bx >= ax && by >= ay);
        }
    }
}
