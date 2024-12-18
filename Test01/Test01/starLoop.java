package Test01.Test01;

import java.util.Scanner;

public class starLoop {
    public static void main(String[] args) {
        Scanner scanIn = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = scanIn.nextInt();
        scanIn.close();

        //2.1
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*" + " ");
            }
           System.out.println();
        }
        System.out.println(".");

        //2.3
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == i || j == n + 1 - i)
                    System.out.print("*" + " ");
                    else
                    System.out.print(" " + " ");
            }
           System.out.println();
        }
    }
}
