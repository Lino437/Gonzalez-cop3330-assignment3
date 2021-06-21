/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  *  Copyright 2021 Jose Gonzalez
 *
 */

package ex45;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        String fileInputName = "exercise45_input.txt";
        String fileOutputName = WordFinder.promptFileName();
        String fileInputPath = WordFinder.getFilePath(fileInputName);
        String fileOutputPath = WordFinder.getFilePath(fileOutputName);

        ArrayList<String> fileData = WordFinder.readFileStoreInArray(fileInputPath);
        ArrayList<String> updatedData = WordFinder.substituteWords(fileData);

        WordFinder.printingResultsToFile(updatedData, fileOutputPath);
    }
}
