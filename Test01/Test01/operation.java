package Test01.Test01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class operation {
    public static void main(String[] args) throws IOException{
        Scanner scanIn = new Scanner(System.in);
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader Keyboard = new BufferedReader(input);
        System.out.print("Enter Number x : ");
        int x = scanIn.nextInt();

        System.out.print("Enter Operation (+ - * / % ^) : ");
        String o = Keyboard.readLine();
        
        System.out.print("Enter Number y : ");
        int y = scanIn.nextInt();
        scanIn.close();

        int sum;
        // System.out.println(o);
        if(o == "+"){
            sum = x + y;
            System.out.print(sum);
        } else if (o == "-"){
            sum = x - y;
            System.out.print(sum);
        } else if (o == "*"){
            sum = x * y;
            System.out.print(sum);
        } else if (o == "/"){
            sum = x / y;
            System.out.print(sum);
        } else if (o == "%"){
            sum = x % y;
            System.out.print(sum);
        } else if (o == "^"){
            sum = x ^ y;
            System.out.print(sum);
        } else {
            System.out.println("Plase Enter Operation. Try Again.");
        }
        
    }
}
