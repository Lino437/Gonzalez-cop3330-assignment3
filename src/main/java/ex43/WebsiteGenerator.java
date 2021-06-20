/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  *  Copyright 2021 Jose Gonzalez
 *
 */
/*

Programming languages can create files and folders too.

Create a program that generates a website skeleton with the following specifications:

Prompt for the name of the site.
Prompt for the author of the site.
Ask if the user wants a folder for JavaScript files.
Ask if the user wants a folder for CSS files.
Generate an index.html file that contains the name of the site inside the <title> tag and the author in a <meta> tag.
Example Output
Site name: awesomeco
Author: Max Power
Do you want a folder for JavaScript? y
Do you want a folder for CSS? y
Created ./website/awesomeco
Created ./website/awesomeco/index.html
Created ./website/awesomeco/js/
Created ./website/awesomeco/css/
The user should then find these files and directories created in the working directory of your program.

 */

package ex43;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WebsiteGenerator {
    final static Scanner in = new Scanner(System.in);

    //creating skeleton
    public static void createSkeletonDirectory(String dir, String siteName, String author, boolean jsFile, boolean cssFile){
        String path = GenerateAllFolders.generateFoldersReturnPath(dir, siteName, jsFile, cssFile);
        String fileName = "index.html";
        generateFile(path,fileName);
        String[] html = htmlText(author,siteName);
        writeToFile(path,fileName, html);
    }

    private static String[] htmlText (String author, String siteName){
        return new String[]{
                "<title>" + siteName + "</title>",
                "<meta>" + author + "</meta>",
        };
    }

    //prompt the user
    public static String scanInput(String prompt){
        System.out.println(prompt);
        return in.nextLine();
    }

    //prompt user yes or no
    public static boolean yesNoInput(String prompt){
        System.out.println(prompt);
        String yesNo = in.nextLine();
        return yesNo.equals("y") || yesNo.equals("Y");
    }

    //generate files
    private static void generateFile(String dir, String fileName) {
        try {
            File myObj = new File(dir + "\\" + fileName);
            if (myObj.createNewFile()) {
                System.out.println("Created: " + myObj.getName() + " file");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while generating the file.");
            e.printStackTrace();
        }
    }

    //write to html file
    private static void writeToFile(String path, String fileName, String[] text){
        try {
            FileWriter myWriter = new FileWriter(path + "\\" +fileName);
            for (String s : text) {
                myWriter.write(s + "\n");
            }
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }

}
