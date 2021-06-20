/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  *  Copyright 2021 Jose Gonzalez
 *
 */

package ex42;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ParsingDataFileTest {
    @Test
    @DisplayName("Testing separator function")
    public void testingSeparatorFunction(){
        ArrayList<String> actual = new ArrayList<>();
        actual.add("Ling,Mai,55900");
        actual.add("Johnson,Jim,56500");
        actual.add("Jones,Aaron,46000");

        ArrayList<String> expected = new ArrayList<>();
        expected.add("Ling");
        expected.add("Mai");
        expected.add("55900");
        expected.add("Johnson");
        expected.add("Jim");
        expected.add("56500");
        expected.add("Jones");
        expected.add("Aaron");
        expected.add("46000");

        assertEquals(expected ,ParsingDataFile.separateComma(actual));
    }
    @Test
    @DisplayName("Testing separator function with empty Strings")
    public void testingSeparatorFunctionWithEmptyString(){
        ArrayList<String> actual = new ArrayList<>();
        actual.add(",");
        actual.add(",");
        actual.add(",");

        ArrayList<String> expected = new ArrayList<>();
        expected.add("");
        expected.add("");
        expected.add("");

        assertEquals(expected,ParsingDataFile.separateComma(actual));
    }
    @Test
    @DisplayName("Testing separator function with empty Strings and commas")
    public void testingSeparatorFunctionWithEmptyStringAndCommas(){
        ArrayList<String> actual = new ArrayList<>();
        actual.add(" , ");
        actual.add(" , ");
        actual.add(" , ");

        ArrayList<String> expected = new ArrayList<>();
        expected.add(" ");
        expected.add(" ");
        expected.add(" ");
        expected.add(" ");
        expected.add(" ");
        expected.add(" ");

        assertEquals(expected,ParsingDataFile.separateComma(actual));
    }
    @Test
    @DisplayName("reading from the file and storing successfully to an array")
    public void readingToFileAndStoringInfoInArrayList(){
        ArrayList<String> expected = new ArrayList<>();
        expected.add("Ling,Mai,55900");
        expected.add("Johnson,Jim,56500");
        expected.add("Jones,Aaron,46000");
        expected.add("Jones,Chris,34500");
        expected.add("Swift,Geoffrey,14200");
        expected.add("Xiong,Fong,65000");
        expected.add("Zarnecki,Sabrina,51500");

        assertEquals(expected,ParsingDataFile.readFileStoreInArray("D:\\exercise42_input.txt"));
    }

}