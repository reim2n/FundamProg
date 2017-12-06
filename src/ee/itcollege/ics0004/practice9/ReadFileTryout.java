package ee.itcollege.ics0004.practice9;

import java.io.*;

public class ReadFileTryout {

    /*
        Create a plaintext file with some content into the projects
        root folder and write a program that reads the file.
     */


    public static void main(String[] args) {

        readFile("readme2.txt");

    }

    private static void readFile(String fileName) {

        String line;

        try {

            BufferedReader mReader = new BufferedReader(new FileReader(new File(fileName)));

            while((line = mReader.readLine()) != null){

            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Sorry! The File wasn't found!");
        }

        System.out.println("Hello!");

    }
}