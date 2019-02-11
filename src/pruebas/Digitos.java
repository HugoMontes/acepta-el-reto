package pruebas;

import java.util.Scanner;

public class Digitos {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum, n, d;
        n = in.nextInt();
        while (n >= 0) {
            if (n == 0) {
                System.out.println("0 = 0");
            } else {
                sum = 0;
                String cad = " = ";
                while (n != 0) {
                    d = n % 10;
                    sum += d;
                    n = n / 10;
                    cad = " + " + d + cad;
                }
                System.out.println(cad.substring(3) + sum);
            }
            n = in.nextInt();
        }
    }
}
