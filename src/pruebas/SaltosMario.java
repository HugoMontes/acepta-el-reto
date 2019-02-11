package pruebas;

import java.util.Scanner;

public class SaltosMario {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            int nm = in.nextInt();
            int arriba = 0, abajo = 0, p_act = 0;
            for (int j = 1; j <= nm; j++) {
                int altura = in.nextInt();
                if (j == 1) {
                    p_act = altura;
                } else if (p_act > altura) {
                    abajo++;
                    p_act = altura;
                } else if (p_act < altura) {
                    arriba++;
                    p_act = altura;
                }
            }
            System.out.println(arriba + " " + abajo);
        }
    }
}
