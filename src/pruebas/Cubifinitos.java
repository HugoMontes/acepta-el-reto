package pruebas;

import java.util.Scanner;

public class Cubifinitos {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum, ant, d;
        if (n != 0) {
            do {
                System.out.print("" + n);
                while (n != 1) {
                    sum = 0;
                    ant = n;
                    while (n != 0) {
                        d = n % 10;
                        n = n / 10;
                        sum += d * d * d;
                    }
                    System.out.print(" - " + sum);
                    n = sum;
                    if (ant == sum) {
                        break;
                    }
                }
                if (n == 1) {
                    System.out.println(" -> cubifinito.");
                } else {
                    System.out.println(" -> no cubifinito.");
                }
                n = in.nextInt();
            } while (n != 0);
        }
    }
}
