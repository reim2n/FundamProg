package ee.itcollege.ics0004.practice4;

import ee.itcollege.ics0004.practice2.TextIO;

public class Exercise4 {

    /*

        Use loops to print out a table like that:

        1 0 0 0 0 0 0
        0 1 0 0 0 0 0
        0 0 1 0 0 0 0
        0 0 0 1 0 0 0
        0 0 0 0 1 0 0
        0 0 0 0 0 1 0
        0 0 0 0 0 0 1

        Let the size of the table be easily changeable - you could even ask user to input the size.

     */


    public static void main(String[] args) {

        System.out.println("Please insert the size of the table: ");

        int tableSize = TextIO.getlnInt();


        for (int col = 0; col < tableSize; col++) {

            for (int row = 0; row < tableSize; row++) {

                if(col == row)
                    System.out.print(1 + " ");
                else
                    System.out.print(0 + " ");

            }

            System.out.println();
        }
    }
}