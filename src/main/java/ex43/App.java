/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  *  Copyright 2021 Jose Gonzalez
 *
 */

package ex43;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String dir = "C:\\Users\\Jose\\IdeaProjects\\PracticeExercisesPart3\\src\\main\\java\\ex43";

        String siteName = WebsiteGenerator.scanInput("Site name: ");
        String author = WebsiteGenerator.scanInput("Author: ");
        boolean jsFile = WebsiteGenerator.yesNoInput("Do you want a folder for JavaScript? ");
        boolean cssFile = WebsiteGenerator.yesNoInput("Do you want a folder for CSS? ");

        WebsiteGenerator.createSkeletonDirectory(dir, siteName, author, jsFile, cssFile);
    }
}
