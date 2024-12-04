package fibonanci;

import java.util.Scanner;

class Fibonanci {
    public static void main(String[] args) {
        Scanner scanIn = new Scanner(System.in);
        System.out.print("Enter a Fibonanci number: ");
        int n = scanIn.nextInt();
        scanIn.close();

        int f0 = 0;
        int f1 = 1;

        if (n >= 0) {
            System.out.println("f0 = " + f0);
        }
        if (n >= 1) {
            System.out.println("f1 = " + f1);
        }
        for (int i = 2; i <= n; i++) {
            int fn = f0 + f1;
            System.out.println("f" + i + " = " + fn);
            f0 = f1;
            f1 = fn;
        }
        System.out.println("Value of Fibonanci is " + f1);
    }
}
