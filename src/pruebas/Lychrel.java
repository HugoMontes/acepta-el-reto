package pruebas;

import java.util.Scanner;

public class Lychrel {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String c_inicial, cad_sum = "", inv_sum;
        int j, i, suma;
        int lim = 1000000000;
        for (i = 1; i <= n; i++) {
            int n_inicial = in.nextInt();
            j = 1;
            suma = 0;
            while (suma <= lim) {
                c_inicial = String.valueOf(n_inicial);
                int n_invertida = Integer.parseInt(new StringBuilder(c_inicial).reverse().toString());
                suma = n_inicial + n_invertida;
                cad_sum = String.valueOf(suma);
                inv_sum = new StringBuilder(cad_sum).reverse().toString();
                if (cad_sum.equals(inv_sum)) {
                    break;
                }
                n_inicial = suma;
                j++;
            }

            if (suma >= lim) {
                System.out.println("Lychrel?");
            } else {
                System.out.println(j + " " + cad_sum);
            }
        }
    }
}
