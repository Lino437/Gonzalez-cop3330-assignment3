/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  *  Copyright 2021 Jose Gonzalez
 *
 */

package ex45;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class WordFinderTest {
    @Test
    @DisplayName("Testing filepath")
    void thisIsATestForFilePath(){
        assertEquals("C:\\Users\\Jose\\IdeaProjects\\PracticeExercisesPart3\\Text.txt",WordFinder.getFilePath("Text.txt"));
    }
    @Test
    @DisplayName("Testing filepath #2")
    void thisIsATestForAnotherFilePath2(){
        assertEquals("C:\\Users\\Jose\\IdeaProjects\\PracticeExercisesPart3\\exercise45_input.txt",WordFinder.getFilePath("exercise45_input.txt"));
    }
    @Test
    @DisplayName("Testing for null filepath")
    void thisIsATestForANullFilepath(){
        assertEquals("C:\\Users\\Jose\\IdeaProjects\\PracticeExercisesPart3",WordFinder.getFilePath(""));
    }
    @Test
    @DisplayName("Substitute Words and returning another String Array")
    void substituteWordsUtilize(){
        ArrayList<String> expected= new ArrayList<>();
        ArrayList<String> input = new ArrayList<>();

        expected.add("One should never use the word \"use\" in writing. Use \"use\" instead.");
        expected.add("For example, \"She uses an IDE to write her Java programs\" instead of \"She");
        expected.add("uses an IDE to write her Java programs\".");

        input.add("One should never utilize the word \"utilize\" in writing. Use \"use\" instead.");
        input.add("For example, \"She uses an IDE to write her Java programs\" instead of \"She");
        input.add("utilizes an IDE to write her Java programs\".");

        assertEquals(expected, WordFinder.substituteWords(input));
    }



}