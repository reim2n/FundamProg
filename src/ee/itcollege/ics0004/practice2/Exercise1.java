package ee.itcollege.ics0004.practice2;

public class Exercise1 {

    public static void main(String[] args) {

        System.out.println("What's your name?");

        String name = ee.itcollege.ics0004.practice2.TextIO.getlnString();

        System.out.println("What's your shoe size?");

        int shoeSize = ee.itcollege.ics0004.practice2.TextIO.getlnInt();

        System.out.println("Your name is " + name + " and your shoe size is " + shoeSize);
    }
}
