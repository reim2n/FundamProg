package ee.itcollege.ics0004;

import practice2.TextIO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Practice6 {

    public static void main(String[] args) {


//        System.out.println(Arrays.toString(args));  //exercise3

//        reverseNumberOrder(); //exercise2

//        getRandomName(); //exercise1

        findTheNumberOfAsInAName();

    }

    /**
     * Write a method that lets user input names as long as user inputs an empty line.
     * After that all names are printed out with a number showing how many times the name contains letter 'a':
     */
    private static void findTheNumberOfAsInAName() {

        ArrayList<String> names = new ArrayList<>();

        while (true) {

            System.out.println("Please enter a name, press enter to exit.");

            String input = TextIO.getlnString();

            if (input.equals(""))
                break;
            else
                names.add(input);
        }

        System.out.println(names);

        for (String name : names) {
            int letterCount = 0;

            for (int index = 0; index < name.length(); index++) {

                if (name.charAt(index) == 'a' || name.charAt(index) == 'A')
                    letterCount++;
            }

            System.out.println(letterCount + " " + name);
        }
    }

    /**
     * Write a program that lets user insert 10 numbers and then prints those numbers in opposite order.
     */

    private static void reverseNumberOrder() {


        int[] numbers = new int[3];

        for (int index = 0; index < numbers.length; index++) {

            System.out.println("Please enter a number: ");

            numbers[index] = TextIO.getlnInt();
        }

        System.out.println(Arrays.toString(numbers));

        for (int index = numbers.length - 1; index >= 0; index--) {

            System.out.print(numbers[index] + "|");

        }
    }

    /**
     * Write a program that lets user insert 10 names,
     * then randomly prints out one of those names.
     * Improve the program by asking user for the number of users first.
     */
    private static void getRandomName() {

        //TODO Ask the size of the array

        String[] names = new String[10];

        for (int index = 0; index < names.length; index++) {

            System.out.println("Please enter a name: ");

            names[index] = TextIO.getlnString();

        }

        System.out.println(Arrays.toString(names));

        System.out.println(names[new Random().nextInt(names.length)]);

    }
}