package XOR;

import java.util.Scanner;

class XOR {
    public static void main(String[] args) {
        Scanner scanIn = new Scanner(System.in);
        int p = scanIn.nextInt();
        int q = scanIn.nextInt();
        scanIn.close();

        if(p == 0 && q == 0) {
            System.out.println("XOR = " + 0);
        } else if (p == 0 && q == 1) {
            System.out.println("XOR = " + 1);
        } else if ( p == 1 && q == 0) {
            System.out.println("XOR = " + 1);
        } else if (p == 1 && q == 1) {
            System.out.println("XOR = " + 0);
        } else {
            System.out.println("Error");
        }
    }
}

