package Part2.matrixAndTranspose;

import java.util.Scanner;

public class matrixAndTranspose {
    
    public static void main(String[] args) {
        int a[][] = new int[3][3];
        Scanner scanIn = new Scanner(System.in);
        for(int i = 0; i <= 2; i++) {
            for(int j = 0; j <= 2; j++) {
                System.out.print("Enter Matrix index of [" + i + "]" + "[" + j + "] " + ": ");
               a[i][j] = scanIn.nextInt();
            }
        }

        System.out.println("\n" + "Normal Matrix is");
        for(int i = 0; i <= 2; i++) {
            for(int j = 0; j <= 2; j++) {
                System.out.print(a[i][j] + " ");
            } System.out.print("\n");
        }

        System.out.println("Matrix Transpose is");
        for(int i = 0; i <= 2; i++) {
            for(int j = 0; j <= 2; j++) {
                System.out.print(a[j][i] + " ");
            } System.out.print("\n");
        }
    }

}
