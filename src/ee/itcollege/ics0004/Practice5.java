package ee.itcollege.ics0004;

import ee.itcollege.ics0004.practice2.TextIO;

public class Practice5 {

    public static void main(String[] args) {

//        drawTable(9);  Exercise1
//
//        drawTable(19); Exercise1

        // Write a method that creates a String consisting of x amount of given character.


//        System.out.println(xCharacters('c', 6) + " "
//                + xCharacters('e', 10));   // Exercise 2


        // Write a method that asks user for input (by using TextIO), and returns the input only when user inserts a
        // value between given minimum and maximum, otherwise asks to reinsert the number.


        System.out.println(getNumber("Please insert a number: ",5, 15)); //Exercise 3/4

        System.out.println(getNumber("Palun sisestage number",100, 9999)); //Exercise 3/4

    }

    private static int getNumber(String message, int min, int max) {

        while (true) {

            System.out.println(message);

            int number = TextIO.getlnInt();

            if (number < min)
                System.out.println("Sorry, your number was less than minimum");
            else if (number > max)
                System.out.println("Sorry, your number was more than maximum");
            else
                return number;
        }
    }

    private static String xCharacters(char inputCharacter, int multiplier) {

        String string = "";

        for (int start = 0; start < multiplier; start++) {

            string += inputCharacter;
        }

        return string;
    }

    protected static void drawTable(int tableSize) {

        drawLine(tableSize);

        System.out.println();

        for (int col = 0; col < tableSize; col++) {

            System.out.print("| ");

            for (int row = 0; row < tableSize; row++) {

                // col 7 ; row 0
                // col 6 ; row 1
                // col 5 ; row 2

                if (col == row || col + row == tableSize - 1)
                    System.out.print("x ");
                else
                    System.out.print(0 + " ");

            }

            System.out.print("| ");

            System.out.println();
        }

        drawLine(tableSize);

        System.out.println();
    }

    private static void drawLine(int tableSize) {

        int lineStart = 0;

        while (lineStart <= tableSize + 1) {

            System.out.print("/ ");
            lineStart++;
        }
    }
}
