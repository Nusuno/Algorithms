package salary;

import java.util.Scanner;

class Salary {
    public static void main(String[] args) {
        Scanner scanIn = new Scanner(System.in);
        System.out.print("Input your salary: ");
        float salary = scanIn.nextFloat();
        scanIn.close();
        float x = 0;
        if (salary <= 15000) {
            x += salary * 0.05;
            System.out.println(x);
        } else {
            x += 15000 * 0.05;
            System.out.println(x);
        } 
    }
}