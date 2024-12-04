package factorial;

import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner scanIn = new Scanner(System.in);
        System.out.print("Enter a Fibonanci number: ");
        int n = scanIn.nextInt();
        scanIn.close();

        int fact = 1;
        for(int i = 1; i <= n; i++){
            System.out.println(i + "! = " + fact);
            fact += fact * i;
        }
    }
}
