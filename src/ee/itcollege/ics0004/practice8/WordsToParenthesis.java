package ee.itcollege.ics0004.practice8;

import ee.itcollege.ics0004.practice2.TextIO;

public class WordsToParenthesis {

    /*
            Write a program that lets user input a line and returns the line with all words in parentheses.
        "all words in parentheses" -> "(all) (words) (in) (parentheses)"
        String has a method split(), which will be handy here.
     */

    public static void main(String[] args) {


        System.out.println("Please enter a sentence:");

        String input = TextIO.getlnString();

        String[] inputArray = input.split(" ");

        for (String word : inputArray) {

            System.out.print("(" + word +") ");
        }
    }
}