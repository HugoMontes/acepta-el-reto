package pruebas;

import java.util.Scanner;

public class Abdicacion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n != 0) {
            String antecesores[] = new String[n];
            for (int i = 0; i < n; i++) {
                antecesores[i] = in.next();
            }
            int m = in.nextInt();
            String sucesores[] = new String[m];
            for (int i = 0; i < m; i++) {
                sucesores[i] = in.next();
                int cont = 0;
                for (int j = 0; j < antecesores.length; j++) {
                    if (sucesores[i].equals(antecesores[j])) {
                        cont++;
                    }
                }
                for (int j = 0; j < sucesores.length; j++) {
                    if (sucesores[i].equals(sucesores[j])) {
                        cont++;
                    }
                }
                System.out.println(cont);
            }
            n = in.nextInt();
            System.out.println();
        }
    }
}
