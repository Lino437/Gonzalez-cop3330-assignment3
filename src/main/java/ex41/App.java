/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  *  Copyright 2021 Jose Gonzalez
 *
 */

package ex41;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<String> names = NameSorter.readFileStoreInArray("D:\\exercise41_input.txt");

        NameSorter.sortingArray(names);

        NameSorter.printingResultsToFile(names);
    }

}
