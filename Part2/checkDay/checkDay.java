package Part2.checkDay;

import java.util.Scanner;

class CheckDay {

    public static boolean checkInput(int day, int month, int year) {

        int dayOfMonth;

        if (year >= 2500 && year <= 2565) {
            if (month > 0 && month <= 12) {
                if (month == 4 || month == 6 || month == 9 || month == 11) {
                    dayOfMonth = 30;
                } else if (month == 2) {
                    dayOfMonth = 28;
                } else {
                    dayOfMonth = 31;
                }
                if (day > 0 && day <= dayOfMonth) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanIn = new Scanner(System.in);

        int day, month, year;

        while (true) {
            System.out.print("Enter day: ");
            day = scanIn.nextInt();
            System.out.print("Enter month: ");
            month = scanIn.nextInt();
            System.out.print("Enter yesr: ");
            year = scanIn.nextInt();

            if(checkInput(day, month, year)){
                System.out.println("Correct!");
                break;
            } else {
                System.out.println("Wrong value(s)");
            }
        }
        scanIn.close();
    }
}