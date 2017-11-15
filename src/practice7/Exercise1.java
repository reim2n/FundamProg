package practice7;

import practice2.TextIO;

import java.util.ArrayList;

public class Exercise1 {

    /*
        Write a program that keeps asking user for names and ages until user inserts an empty line for the name.
        After that, every name inserted should greet the user with something like "Hello, I am John and I am 15 years old."
        Persons who are younger than 3 years should greet with "Boo boo".
        Use the Human class to hold the data in an ArrayList. Implement the greetAsString() method to make this work.

     */

    public static void main(String[] args) {


        ArrayList<Human> humansList = new ArrayList<>();

        while (true) {

            System.out.println("Please enter a name, press enter to exit.");

            String input = TextIO.getlnString();

            if (input.equals(""))
                break;
            else {

                System.out.println("Please enter the age");

                int age = TextIO.getlnInt();

                humansList.add(new Human(input, age));
            }
        }

        System.out.println(humansList);

        for (Human human : humansList) {

            human.greet();

        }
    }
}
