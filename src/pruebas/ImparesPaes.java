/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.util.Scanner;

/**
 *
 * @author MONTES
 */
public class ImparesPaes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int Juan = 0, Maria = 0, x, n, i;
        Scanner in = new Scanner(System.in);
        while ((n = in.nextInt()) > 0) {
            Juan = 0;
            Maria = 0;
            for (i = 0; i < n; i++) {
                x = in.nextInt();
                System.out.println("MARIA: "+x);
                if ((x & 1) == 1) {
                    Maria++;
                }
            }
            for (i = 0; i < n; i++) {
                x = in.nextInt();
                System.out.println("JUAN: "+x);
                if ((x & 1) == 0) {
                    Juan++;
                }
            }
        }
        if (Juan > Maria) {
            System.out.println(Juan - Maria);
        } else {
            System.out.println(Maria - Juan);
        }
    }
    
}
