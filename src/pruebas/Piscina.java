package pruebas;

import java.util.Scanner;

public class Piscina {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean sw = true;
        int d, i, vjs;
        int ty, cy = 0, vy = 0, py = 0;
        int tv, cv = 0, vv = 0, pv = 0;
        while (sw) {
            for (i = 1; i <= 6; i++) {
                d = in.nextInt();
                if (i == 1) {
                    if (d == 0) {
                        sw = false;
                        break;
                    }
                    cy = d;
                } else if (i == 2) {
                    vy = d;
                } else if (i == 3) {
                    py = d;
                } else if (i == 4) {
                    if (d == 0) {
                        sw = false;
                        break;
                    }
                    cv = d;
                } else if (i == 5) {
                    vv = d;
                } else {
                    pv = d;
                }
            }
            if (sw) {
                vjs = 0;
                ty = tv = 0;
                while (ty < cy && tv < cv) {
                    ty = ty - py + vy;
                    tv = tv - pv + vv;
                    vjs++;
                }
                if (ty >= cy && tv >= cv) {
                    System.out.println("EMPATE " + vjs);
                } else if (tv >= cv) {
                    System.out.println("VECINO " + vjs);
                } else {
                    System.out.println("YO " + vjs);
                }                
            }
        }
    }
}
