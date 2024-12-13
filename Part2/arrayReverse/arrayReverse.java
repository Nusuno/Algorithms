package Part2.arrayReverse;

import java.util.Scanner;

class arrayReverse {
    public static void main(String[] agrs){
        Scanner scanIn = new Scanner(System.in);
        System.out.print("Enter an array size: ");
        int size = scanIn.nextInt();

        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            System.out.print("Enter integer " + (i + 1) + ": ");
            array[i] = scanIn.nextInt();
        }
        System.out.println("In order: ");
        for(int i = 0; i < size; i++){
            System.out.print(array[i] + " ");
        }

        System.out.println("\n" + "Reverse order: ");
        for(int i = size - 1; i >= 0; i--){
            System.out.print(array[i] + " ");
        } scanIn.close();
    }
}
