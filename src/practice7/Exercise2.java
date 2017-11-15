package practice7;

import practice2.TextIO;

import java.util.ArrayList;

public class Exercise2 {
    /*
        Write a program that keeps asking user for a name and result on one line
    (i.e "John 57.4") until an empty line is inserted.
    After that the names and results must be printed.
    Use the Athlete class for holding the data.
     */

    public static void main(String[] args) {


        ArrayList<Athlete> athleteList = new ArrayList<>();

        while (true) {

            System.out.println("Please enter a name and the result.");

            String input = TextIO.getlnString();

            if (input.equals(""))
                break;
            else {

                String[] information = input.split(" ");

                athleteList.add(new Athlete(information[0],
                        Double.parseDouble(information[1])));
            }
        }

        System.out.println(athleteList);

        for (Athlete athlete : athleteList) {

//            System.out.println(athlete);

            System.out.println(athlete.getName() + " " + athlete.getResult());

        }
    }
}
