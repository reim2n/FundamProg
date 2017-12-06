package ee.itcollege.ics0004.practice8;

import ee.itcollege.ics0004.practice2.TextIO;

public class WordsWithMinuses {

    /*
            Write a method that has an input of a String
            and returns the string with uppercase letters separated by minus-signs:
        "hello" -> "H-E-L-L-O"
     */

    public static void main(String[] args) {


        System.out.println("Please enter a word:");

        String input = TextIO.getlnString();

        String[] inputArray = input.split("");

        for (int i = 0; i < inputArray.length; i++) {

            if (i == inputArray.length - 1)
                System.out.print(inputArray[i].toUpperCase());
            else
                System.out.print(inputArray[i].toUpperCase() + "-");
        }
    }
}