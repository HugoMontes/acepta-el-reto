package pruebas;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] v = "1893".split("");
        Arrays.sort(v);
        String num = "";
        for (String d : v) {
            num += d;
        }
        System.out.println(num);
        /*
         //Array de String
         String[] nombres = {"Pepe", "Juan", "Alex",
         "Julian", "Francisco", "Luis"};
 
         //Ordena el array
         Arrays.sort(nombres);
        
         //Mostramos el array ya ordenado
         for (String i : nombres) {
         System.out.print(i + ", ");
         }
         */
    }
}
