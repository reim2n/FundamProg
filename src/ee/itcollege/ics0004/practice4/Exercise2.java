package ee.itcollege.ics0004.practice4;

public class Exercise2 {

    // Print out even numbers on one line from 0 to 10 (0,2,4 etc)

    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {

            if (0 == i % 2)
                System.out.print(i + " ");
        }
    }
}