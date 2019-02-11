package pruebas;

import java.util.Scanner;

public class PrimoRiesgo {

    public static void main(String[] args) {
        byte primos[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79};
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String palabra;
        int i = 1, sum, j, longitud, raizInt, contador;
        double raiz;
        boolean sw;
        while (i <= n) {
            palabra = in.next();
            sum = 0;
            longitud = palabra.length();
            j = 0;
            while (j < longitud) {
                sum += (int) palabra.charAt(j);
                j++;
            }
            contador = sum - 1;
            while (contador >= 1) {
                raiz = Math.sqrt(contador);
                raizInt = (int) raiz;
                if (raiz != raizInt) {
                    j = 0;
                    sw = false;
                    while (primos[j] <= raizInt && !sw) {
                        if (contador % primos[j] == 0) {
                            sw = true;
                        }
                        j++;
                    }
                    if (!sw) {
                        break;
                    }
                }
                contador--;
            }
            System.out.println("" + contador);
            i++;
        }
    }
}
