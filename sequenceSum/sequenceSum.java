package sequenceSum;

class SequenceSum {
    static public void main(String[] args) {

        int sum = 0;

        // Sequence 1
        // for loop
        System.out.println("Sequence 1" + "\n" + "for loop");

        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println("\n" + "Sum = " + sum);
        sum = 0;

        // while loop
        System.out.println("\n" + "while loop");

        int i = 11;
        while (i > 1) {
            i--;
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println("\n" + "Sum = " + sum);
        sum = 0;

        // Sequence 2
        // for loop
        System.out.println("\n" + "Sequence 2" + "\n" + "for loop");

        for (i = 1; i <= 20; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
                sum += i;
            }
        }
        System.out.println("\n" + "Sum = " + sum);
        sum = 0;

        // while loop
        System.out.println("\n" + "while loop");

        i = -1;
        while (i < 20) {
            i++;
            if (i % 2 == 1) {
                System.out.print(i + " ");
                sum += i;
            }
        }
        System.out.println("\n" + "Sum = " + sum);
        sum = 0;

        // Sequence 3
        // for loop
        System.out.println("\n" + "Sequence 3" + "\n" + "for loop");
        int j;
        for (i = 0, j = 1; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.print(j + " ");
                sum += j;
            } else {
                System.out.print(-j + " ");
                sum += -j;
            }
            j += 2;
        }
        System.out.println("\nSum = " + sum);
        sum = 0;


        // while loop
        System.out.println("\n" + "while loop");
        i = -1;
        j = 1;

        while (i < 9) {
            i++;
            if (i % 2 == 0) {
                System.out.print(j + " ");
                sum += j;
            } else {
                System.out.print(-j + " ");
                sum += -j;
            }
            j += 2;
        }
        System.out.println("\nSum = " + sum);
        sum = 0;
    }
}
