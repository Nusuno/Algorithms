package banknotes;

import java.util.Scanner;

public class banknotes {
    public static void main(String[] args){
        Scanner scanIn = new Scanner(System.in);
        System.out.print("Enter amount of money: ");
        int n = scanIn.nextInt();
        scanIn.close();
        System.out.println(n + " Baht can be separated into");

        if(n % 100 == 0) {
            int a = n / 1000;
            a %= 1000;
            n -= a * 1000;
    
            int b = n / 500;
            b %= 500;
            n -= b * 500;
    
            int c = n / 100;
            c %= 100;
            n -= c * 100;
            
            System.out.println("1000-Baht " + a + " bills");
            System.out.println("500-Baht " + b + " bills");
            System.out.println("100-Baht " + c + " bills");
        } else {
            System.out.println("Please enter amount of money more than 100 Bah");
        }
    }
}
