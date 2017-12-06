package ee.itcollege.ics0004.practice4;

public class Exercise3 {

    // Print out numbers that are divisible by 3 from 30 to 0 on one line (30, 27, 24, 21 etc)

    public static void main(String[] args) {

        for (int i = 30; i >= 0; i--) {

            if (0 == i % 3)
                System.out.print(i + " ");
        }
    }
}