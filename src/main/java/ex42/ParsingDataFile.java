/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 first_name last_name
 */
/*
Sometimes data comes in as a structured format that you have to break down and turn into records so you can process them.
 CSV, or comma-separated values, is a common standard for doing this.

Construct a program that reads in the following data file (you will need to create this data file yourself; name it `exercise42_input.txt`):

Ling,Mai,55900
Johnson,Jim,56500
Jones,Aaron,46000
Jones,Chris,34500
Swift,Geoffrey,14200
Xiong,Fong,65000
Zarnecki,Sabrina,51500
Process the records and display the results formatted as a table, evenly spaced, as shown in the example output.

Example Output
Last      First     Salary
--------------------------
Ling      Mai       55900
Johnson   Jim       56500
Jones     Aaron     46000
Jones     Chris     34500
Swift     Geoffrey  14200
Xiong     Fong      65000
Zarnecki  Sabrina   51500
Constraints
Write your own code to parse the data. Don't use a CSV parser.

 */

package ex42;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class ParsingDataFile {
    //get data from file & store data in an arraylist
    public static ArrayList<String> readFileStoreInArray(String filepath) {
        ArrayList<String> arr = new ArrayList<>();

        try {
            File myObj = new File(filepath);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                arr.add(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return arr;
    }

    //separating strings and storing into a new arraylist
    public static ArrayList<String> separateComma(ArrayList<String> arr) {
        ArrayList<String> arrOutput = new ArrayList<>(arr.size() * 3);
        for (String s : arr) {
            String[] values = s.split(",");
            Collections.addAll(arrOutput, values);
        }
        return arrOutput;
    }

    public static String padRight(String s, int n) {
        return String.format("%-" + n + "s", s);
    }

    //printing formatted table to the terminal
    public static void printResults(ArrayList<String> myList) {
        int length = myList.size() / 3;
        System.out.printf("%10s %10s %10s\n"
                , padRight("Last", 10)
                , padRight("First", 10)
                , padRight("Salary", 10));
        System.out.println("----------------------------");
        for (int i = 0; i < length; i++) {
            int j = i * 3;
            System.out.format("%10s %10s %10s\n"
                    , padRight(myList.get(j), 10)
                    , padRight(myList.get(j + 1), 10)
                    , padRight(myList.get(j + 2), 10));
        }
    }
}

