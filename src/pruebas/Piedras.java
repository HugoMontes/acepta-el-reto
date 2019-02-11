package pruebas;

import java.util.Scanner;

public class Piedras {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n != 0) {
            int sum = 0, i = 1;
            while (sum + i <= n) {
                sum += i;
                i++;
            }
            System.out.println((i - 1) + " " + (n - sum));
            n = in.nextInt();
        }
    }
}
