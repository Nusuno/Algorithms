package grade;

import java.util.Scanner;

class Grade{
    static public void main(String[] args) {
        Scanner scanIn = new Scanner(System.in);
        System.out.print("Input your score: ");
        float score = scanIn.nextFloat();
        String grade = " ";
        scanIn.close();

/**
 * เกณฑ์ของการให้คะแนนคือ 
 * A+ A A- B+ B C+ C D+ D E และ F
 * 
 * 
 * A+   90-100
 * A    85-89
 * A-   80-84
 * B+   75-79
 * B    70-74
 * C+   65-69
 * C    60-64
 * D+   55-59
 * D    50-54
 * E    40-49
 * F    0-39
 * 
 */

        if(score >= 0 && score <= 100) {
            if(score >=0 && score <= 39) {
                grade = "F";
            } else if (score >= 40 && score <= 49) {
                grade = "E";
            } else if (score >= 50 && score <= 54) {
                grade = "D";
            } else if (score >= 55 && score <= 59) {
                grade = "D+";
            } else if (score >= 60 && score <= 64) {
                grade = "C";
            } else if (score >= 65 && score <= 69) {
                grade = "C+";
            } else if (score >= 70 && score <= 74) {
                grade = "B";
            } else if (score >= 75 && score <= 79) {
                grade = "B+";
            } else if (score >= 80 && score <= 84) {
                grade = "A-";
            } else if (score >= 85 && score <= 89) {
                grade = "A";
            } else if (score >= 90 && score <= 100) {
                grade = "A+";
            } System.out.println("Your grade is " + grade);
        } else {
            System.out.println("Please enter a score between 0-100.");
        }
        
    }
}
