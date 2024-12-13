package Part2.arrayGrade;

import java.util.Random;

class ArrayGrade {

    public static void main(String[] agrs) {
        Random r = new Random();
        int score[] = new int[10];

        for(int i = 0; i < score.length; i++){
            
            score[i] = 40 + r.nextInt(60); 
            /**
             * r.nextInt(60) คือการสุ่มตั้งแต่ 0-59 แต่พอ + 40 เข้าไป
             * ทำให้เลื่อนจาก 0-59 ไป 40 ตัว เป็น 0 + 40 = 40 59 + 40 = 99 เลยเป็นการสุ่มตั้งแต่ 40 - 99
             */
            System.out.println("Score of student " + (i + 1) + " is " + score[i]);
        }

        System.out.println("\n" + "Calculation Grade..");
        for(int i = 0; i < score.length; i++){
            String grade;
            if(score[i] >= 90){
                grade = "A";
            } else if (score[i] >= 80){
                grade = "B+";
            } else if (score[i] >= 70){
                grade = "B";
            } else if (score[i] >= 60){
                grade = "C";
            } else if (score[i] >= 50){
                grade = "D+";
            } else if (score[i] >= 45){
                grade = "D";
            } else {
                grade = "F";
            }
            System.out.println("Grade of student " + (i +1) + " is " + grade);
        }
    }
}
