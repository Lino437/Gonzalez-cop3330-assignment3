/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  *  Copyright 2021 Jose Gonzalez
 *
 */

package ex42;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        ArrayList<String> data = ParsingDataFile.readFileStoreInArray("D:\\exercise42_input.txt");

        data = ParsingDataFile.separateComma(data);

        ParsingDataFile.printResults(data);
    }

}
