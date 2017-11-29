package ee.itcollege.ics0004.practice7;

import ee.itcollege.ics0004.practice2.TextIO;

import java.util.ArrayList;
import java.util.Comparator;

public class Exercise2  {
    /*
        Write a program that keeps asking user for a name and result on one line
    (i.e "John 57.4") until an empty line is inserted.
    After that the names and results must be printed.
    Use the Athlete class for holding the data.
     */

    /*
        Modify Human/Athlete classes so that Athlete is the subclass of Human,
    and all code written before would still work.
    Also, the Athlete with the best result in last exercise should greet().
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

        //Change the Athlete program form the last practice -
        // so that the names and results are printed sorted by result (descending).

        athleteList.sort(new Comparator<Athlete>() {
            @Override
            public int compare(Athlete o1, Athlete o2) {
                return o2.getResult().compareTo(o1.getResult());
            }
        });


        athleteList.get(0).greet();


        for (Athlete athlete : athleteList) {

            System.out.println(athlete.getName() + " " + athlete.getResult());

        }
    }
}