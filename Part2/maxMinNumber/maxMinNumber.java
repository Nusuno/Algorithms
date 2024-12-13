package Part2.maxMinNumber;

import java.util.Scanner;

class MaxMinNumber {

    public static int myMax(int num1, int num2, int num3) {
        return Math.max(num1, Math.max(num2, num3));
    }

    public static int myMin(int num1, int num2, int num3) {
        return Math.min(num1, Math.min(num2, num3));
    }


    public static void main(String[] args){
        Scanner scanIn = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanIn.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanIn.nextInt();
        System.out.print("Enter last number: ");
        int num3 = scanIn.nextInt();

        scanIn.close();

        int maxNumber = myMax(num1, num2, num3);
        int minNumber = myMin(num1, num2, num3);
        int totalMaxMin = maxNumber + minNumber;
        System.out.println("Max value = " + maxNumber);
        System.out.println("Min value = " + minNumber);
        System.out.print("Total Max plus Min is " + totalMaxMin);

    }

}
