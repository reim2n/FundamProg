package practice4;

import ee.itcollege.ics0004.Practice5;

public class Exercise1 extends Practice5 {

    // Print out numbers on one line from 10 to 1

    public static void main(String[] args) {

        // for loop

        // think about where to start the loop

        // which way to decrease the integer in every cycle

        for (int i = 10; i > 0; i--){

            System.out.print(i + " ");

        }

        System.out.println();

        Practice5.drawTable(5);
    }
}