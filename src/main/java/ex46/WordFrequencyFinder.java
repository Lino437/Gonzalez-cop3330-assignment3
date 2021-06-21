/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  *  Copyright 2021 Jose Gonzalez
 *
 */
/*
Knowing how often a word appears in a sentence or block of text is helpful for creating word clouds and other types of word analysis.
 And it’s more useful when running it against lots of text.

Create a program that reads in a file named `exercise46_input.txt` and counts the frequency of words in the file.
 Then construct a histogram displaying the words and the frequency, and display the histogram to the screen.

Example Output
Given the text file `exercise46_input.txt` with this content

badger badger badger
badger mushroom
mushroom snake badger badger
badger
the program would produce the following output:

badger:   *******
mushroom: **
snake:    *
Constraint
Ensure that the most used word is at the top of the report and the least used words are at the bottom.

 */

package ex46;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class WordFrequencyFinder {

    //read file and store in array
    public static ArrayList<String> readFileStoreInArray(String filepath) {
        ArrayList<String> arr = new ArrayList<>();

        try {
            File myObj = new File(filepath);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.next();
                arr.add(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return arr;
    }

    public static String asteriskCount(int number) {
        return "*".repeat(Math.max(0, number));
    }

    //count times that each word repeats and prints results to the terminal;
    public static HashMap<String, Integer> frequencyOfWords(ArrayList<String> data) {
        Set<String> distinct = new HashSet<>(data);
        HashMap<String, Integer> list = new HashMap<>();

        for (String s : distinct) {
            Integer num = Collections.frequency(data, s);
            list.put(s, num);
        }
        return list;
    }
    //sort the values
    public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm)
    {
        List<Map.Entry<String, Integer> > list =
                new LinkedList<>(hm.entrySet());

        list.sort(Map.Entry.comparingByValue());

        HashMap<String, Integer> temp = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
    //print values to the terminal
    public static void printValuesTerminal(HashMap<String, Integer> data){
        for (Map.Entry<String, Integer> en : data.entrySet()) {
            System.out.println(en.getKey() + ": " + asteriskCount(en.getValue()));
        }
    }
}

