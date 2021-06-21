/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  *  Copyright 2021 Jose Gonzalez
 *
 */
/*
There will be times when you'll need to read in one file, modify it, and then write a modified version of that file to a new file.

Given an input file named `exercise45_input.txt`, read the file and look for all occurrences of the word utilize.
Replace each occurrence with use. Write the modified file to a new file.

Example Output
Given the input file of

One should never utilize the word "utilize" in writing. Use "use" instead.
For example, "She uses an IDE to write her Java programs" instead of "She
utilizes an IDE to write her Java programs".
The program should generate

One should never use the word "use" in writing. Use "use" instead.
For example, "She uses an IDE to write her Java programs" instead of "She
uses an IDE to write her Java programs".
Constraints
Prompt for the name of the output file.
Write the output to a new file.

 */

package ex45;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class WordFinder {
    static final Scanner in = new Scanner(System.in);

    //prompt for name of output file
    public static String promptFileName() {
        System.out.println("What is the name of the output file? ");
        return in.nextLine();
    }

    //get filepath
    public static String getFilePath(String fileName) {
        Path path = Paths.get(fileName);
        path = path.toAbsolutePath();
        return path.toString();
    }

    //read file and extract all data from file
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

    //substitute select word for another one
    public static ArrayList<String> substituteWords(ArrayList<String> text) {
        ArrayList<String> wordsSubs = new ArrayList<>();
        for (String s : text) {
            s = s.replaceAll("\\butilizes\\b", "uses");
            s = s.replaceAll("\\butilize\\b", "use");

            wordsSubs.add(s);
        }
        return wordsSubs;
    }

    //print new statement to other file
    public static void printingResultsToFile(ArrayList<String> names, String filePath) {
        try {
            FileWriter myWriter = new FileWriter(filePath);
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
