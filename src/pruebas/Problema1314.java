/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author MONTES
 */
public class Problema1314 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            int number = Integer.parseInt(bufferedReader.readLine());
            for (int i = 1; i <= number; i++) {
                String in = bufferedReader.readLine();
                String[] parts = in.split("-");
                int a = Integer.parseInt(parts[0]);
                int b = Integer.parseInt(parts[1]);
                if ((a % 2 == 0 && a + 1 == b) || (a % 2 != 0 && a - 1 == b)) {
                    System.out.println("SI");
                } else {
                    System.out.println("NO");
                }
            }
        } catch (NumberFormatException ex) {
            System.out.println("Not a number !");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
