package maxNumber;

import java.util.Scanner;

class MaxNumber {
    static public void main(String[] args) {
        Scanner scanIn = new Scanner(System.in);
        System.out.print("Input value A: ");
        int a = scanIn.nextInt();
        System.out.print("Input value B: ");
        int b = scanIn.nextInt();
        System.out.print("Input value C: ");
        int c = scanIn.nextInt();

        int max;

        scanIn.close();

        if(a >= b && a >= c) {
            max = a;
        } else if (b >= a && b >= c) {
            max = b;
        } else {
            max = c;
        }
        System.out.println("Max value is " + max);
    }
}
