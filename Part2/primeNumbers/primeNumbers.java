package Part2.primeNumbers;

import java.util.Scanner;

class primeNumbers {

   public static void main(String[] args) {
      Scanner scanIn = new Scanner(System.in);
      System.out.print("Enter input number: ");
      int num1 = scanIn.nextInt();
      scanIn.close();

      System.out.println("Prime number is ");
      
      for (int i = 2; i <= num1; ++i) {
         boolean prime = true;

         for (int j = 2; j < i; ++j) {
            if (i % j == 0) {
               prime = false;
            }
         } 
         if (prime) {
            System.out.print(i + " ");
         }
      }
   }
}
