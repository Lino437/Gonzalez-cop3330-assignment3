/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  *  Copyright 2021 Jose Gonzalez
 *
 */

package ex44;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        String fileName = "exercise44_input.json";
        ArrayList<String> data = ProductSearch.readJSON(fileName);

        System.out.println(data);
    }
}
