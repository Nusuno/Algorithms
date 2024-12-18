package Test01.Test01;

import java.util.Scanner;

public class matrix {
    
    public static void main(String[] args) {
        int a[][] = new int[3][3];
        Scanner scanIn = new Scanner(System.in);

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.print("Enter Matrix index of [" + i + "]" + "[" + j + "] " + ": ");
                a[i][j] = scanIn.nextInt();
            }
        }
        System.out.println(".");
        System.out.println("Matrix A is");
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.print("\n");
        }

        int b[][] = new int[3][3];
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.print("Enter Matrix index of [" + i + "]" + "[" + j + "] " + ": ");
                b[i][j] = scanIn.nextInt();
            }
        }
        System.out.println(".");
        System.out.println("Matrix B is");
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.println(".");
        System.out.println("Matrix A + Matrix B:");
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.print(a[i][j] + b[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.println(".");
        System.out.println("Matrix A - Matrix B:");
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.print(a[i][j] - b[i][j] + " ");
            }
            System.out.print("\n");
        }

        scanIn.close();
    }
}
