package ex41;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NameSorterTest {
    @Test
    @DisplayName("Reading from the file the predefined text")
    public void sortingArrayOfStringsWithPredefinedValues(){
        List<String> List = Arrays.asList(
                "Ling, Mai",
                "Johnson, Jim",
                "Zarnecki, Sabrina",
                "Jones, Chris",
                "Jones, Aaron",
                "Swift, Geoffrey",
                "Xiong, Fong");

        assertEquals(List, NameSorter.readFileStoreInArray("D:\\exercise41_input.txt"));
    }
}