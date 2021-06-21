/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  *  Copyright 2021 Jose Gonzalez
 *
 */

package ex46;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordFrequencyFinderTest {
    @Test
    @DisplayName("checking asterisk function with 0 as value")
    void asteriskFunction0IntValue(){
        int num = 0;
        assertEquals("",WordFrequencyFinder.asteriskCount(num));
    }
    @Test
    @DisplayName("checking asterisk function with 5 as value")
    void asteriskFunction5IntValue(){
        int num = 5;
        assertEquals("*****",WordFrequencyFinder.asteriskCount(num));
    }



}