/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  *  Copyright 2021 Jose Gonzalez
 *
 */

package ex46;

import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class WordFrequencyFinderTest {
    @Test
    @DisplayName("checking asterisk function with 0 as value")
    void asteriskFunction0IntValue() {
        int num = 0;
        assertEquals("", WordFrequencyFinder.asteriskCount(num));
    }

    @Test
    @DisplayName("checking asterisk function with 5 as value")
    void asteriskFunction5IntValue() {
        int num = 5;
        assertEquals("*****", WordFrequencyFinder.asteriskCount(num));
    }

    @Test
    @DisplayName("read values from file store and store in array")
    void readingFromFile() {
        String path = "C:\\Users\\Jose\\IdeaProjects\\PracticeExercisesPart3\\src\\main\\java\\ex46\\exercise46_input.txt";
        ArrayList<String> fileValues = new ArrayList<>();
        fileValues.add("badger");
        fileValues.add("badger");
        fileValues.add("badger");
        fileValues.add("badger");
        fileValues.add("mushroom");
        fileValues.add("mushroom");
        fileValues.add("snake");
        fileValues.add("badger");
        fileValues.add("badger");
        fileValues.add("badger");

        assertEquals(fileValues, WordFrequencyFinder.readFileStoreInArray(path));
    }

    @Test
    @DisplayName("frequency of the word stored in HashMap")
    void countFrequencyOfEachWord() {
        String path = "C:\\Users\\Jose\\IdeaProjects\\PracticeExercisesPart3\\src\\main\\java\\ex46\\exercise46_input.txt";
        ArrayList<String> data = WordFrequencyFinder.readFileStoreInArray(path);

        HashMap<String, Integer> map = new HashMap<>();

        map.put("snake", 1);
        map.put("mushroom", 2);
        map.put("badger", 7);

        assertEquals(map, WordFrequencyFinder.frequencyOfWords(data));
    }

    @Test
    @DisplayName("sorting HashMap values form smaller to largest Integer")
    void sortByValue() {
        String path = "C:\\Users\\Jose\\IdeaProjects\\PracticeExercisesPart3\\src\\main\\java\\ex46\\exercise46_input.txt";
        ArrayList<String> data = WordFrequencyFinder.readFileStoreInArray(path);

        HashMap<String, Integer> map = WordFrequencyFinder.frequencyOfWords(data);

        assertEquals(map, WordFrequencyFinder.sortByValue(map));
    }


}