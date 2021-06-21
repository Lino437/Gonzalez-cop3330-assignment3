/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  *  Copyright 2021 Jose Gonzalez
 *
 */

package ex46;

import java.util.ArrayList;
import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        HashMap<String, Integer> mapList;
        String path = "C:\\Users\\Jose\\IdeaProjects\\PracticeExercisesPart3\\src\\main\\java\\ex46\\exercise46_input.txt";

        ArrayList<String> wordList = WordFrequencyFinder.readFileStoreInArray(path);

        mapList = WordFrequencyFinder.frequencyOfWords(wordList);

        mapList = WordFrequencyFinder.sortByValue(mapList);

        WordFrequencyFinder.printValuesTerminal(mapList);
    }

}
