package practice2;

public class Exercise4 {

    //Write a program that asks user for his name and returns the number of characters there is in the name.

    public static void main(String[] args) {

        System.out.println("What's your name?");

        String name = TextIO.getlnString();

        int nameLength = name.length();

        System.out.println("Your name is " + name + " and your name length is " + nameLength);
    }
}