package practice2;

public class Exercise3 {

    //Write a program, that lets user insert the number of people and size of groups. Afterwards, it tells user how many full groups could be created and how many people was left over.

    public static void main(String[] args) {

        System.out.println("Enter number of people");

        int firstNumber = TextIO.getlnInt();

        System.out.println("Enter size of groups");

        int secondNumber = TextIO.getlnInt();

        int fullGroups = firstNumber / secondNumber;

        int leftover = firstNumber % secondNumber;

        System.out.format("You'll get %d groups and %d person(s) are left", fullGroups, leftover);
    }
}
