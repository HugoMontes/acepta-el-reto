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
public class CuantosDiasFaltan {

    private static long meses[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        long number = in.nextLong();
        for (long i = 1; i <= number; i++) {
            byte dia = in.nextByte();
            byte mes = in.nextByte();
            long result = meses[mes - 1] - dia + suma(mes);
            System.out.println(result);
        }
    }

    public static long suma(byte mes) {
        long sum = 0;
        for (int i = mes; i <= 11; i++) {
            sum += meses[i];
        }
        return sum;
    }
}
