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
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // LEER UN ENTERO
        String input = null;
        int number = 0;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            input = bufferedReader.readLine();
            number = Integer.parseInt(input);
        } catch (NumberFormatException ex) {
            System.out.println("Not a number !");
        } catch (IOException e) {
            e.printStackTrace();
        }
        /*
        int M[][] = {{50, 5, 27, 400, 7}, {0, 67, 90, 6, 97}, {30, 14, 23, 251, 490}};
        for (int[] fila : M) {
            for (int elem : fila) {
                System.out.print(elem + "\t");
            }
            System.out.println("");
        }
         */
    }

}
