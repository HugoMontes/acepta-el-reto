package pruebas;

import java.util.Arrays;
import java.util.Scanner;

public class Kaprekar {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 1;
        int valNum;
        while (i <= n) {
            String num = in.next();
            if (num.equals("6174")) {
                System.out.println("0");
            } else {
                num = Kaprekar.ordenaAsc(num);
                int numAsc = Integer.parseInt(num);
                int numDes = Integer.parseInt(Kaprekar.ordenaDes(num));
                if (numDes - numAsc != 0) {
                    byte j = 1;
                    while (j <= 7) {
                        valNum = numDes - numAsc;
                        //System.out.println(numDes + "-" + numAsc + "=" + valNum);
                        num = String.valueOf(valNum);
                        if (num.equals("6174")) {
                            break;
                        }
                        num = Kaprekar.ordenaAsc(num);
                        numAsc = Integer.parseInt(num);
                        numDes = Integer.parseInt(Kaprekar.ordenaDes(num));
                        switch (num.length()) {
                            case 4:
                                break;
                            case 3:
                                numDes *= 10;
                                break;
                            case 2:
                                numDes *= 100;
                                break;
                            case 1:
                                numDes *= 1000;
                                break;
                        }
                        j++;
                    }
                    System.out.println(String.valueOf(j));
                } else {
                    System.out.println("8");
                }
            }
            i++;
        }
    }

    private static String ordenaDes(String num) {
        return new StringBuilder(num).reverse().toString();
    }

    private static String ordenaAsc(String num) {
        String[] v = num.split("");
        Arrays.sort(v);
        num = "";
        for (String d : v) {
            num += d;
        }
        return num;
    }
}
