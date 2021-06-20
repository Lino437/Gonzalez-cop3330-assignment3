/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Jose Gonzalez
 */

/*
Alphabetizing the contents of a file, or sorting its contents, is a great way to get comfortable manipulating a file in your program.

Create a program that reads in the following list of names from a file called `exercise41_input.txt` and sorts the list alphabetically:

Ling, Mai
Johnson, Jim
Zarnecki, Sabrina
Jones, Chris
Jones, Aaron
Swift, Geoffrey
Xiong, Fong
Then print the sorted list to a file called `exercise41_output.txt` that looks like the following example output.

Example Output
Total of 7 names
-----------------
Johnson, Jim
Jones, Aaron
Jones, Chris
Ling, Mai
Swift, Geoffrey
Xiong, Fong
Zarnecki, Sabrina
Constraint
Don't hard-code the number of names.

 */

package ex41;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class NameSorter {

    public static void main(String[] args) {
        ArrayList<String> names = readFileStoreInArray("D:\\exercise41_input.txt");

        sortingArray(names);

        printingResultsToFile(names);
    }

    //read from file and store information in an ArrayList
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

    //  sort the array of strings alphabetically
    private static void sortingArray(ArrayList<String> names) {
        Collections.sort(names);

    }

    //print the results on the new file
    private static void printingResultsToFile(ArrayList<String> names) {
        try {
            FileWriter myWriter = new FileWriter("D:\\exercise41_output.txt");
            myWriter.write("Total of " + names.size() + " names\n");
            myWriter.write("----------------\n");
            for (int i = 0; i <= names.size() - 1; i++) {
                myWriter.write(names.get(i) + "\n");
            }
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }


}
