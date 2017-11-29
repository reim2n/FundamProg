package ee.itcollege.ics0004.practice2;

public class Exercise2 {

    //Write a program, that lets user insert two numbers and returns the product of those numbers.

    public static void main(String[] args) {

        System.out.println("Enter first number");

        int firstNumber = TextIO.getlnInt();

        System.out.println("Enter second number");

        int secondNumber = TextIO.getlnInt();

        System.out.println("The product is: " + firstNumber * secondNumber);
    }
}

