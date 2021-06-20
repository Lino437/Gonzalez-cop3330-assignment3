/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  *  Copyright 2021 Jose Gonzalez
 *
 */

package ex43;

import java.io.File;

public class GenerateAllFolders {
    //generate all folders
    public static String generateFoldersReturnPath(String dir, String name, boolean jsFile, boolean cssFile) {
        dir = dir + "\\" + "website";
        generateFolder(dir);
        dir = dir + "\\" + name;
        generateFolder(dir);
        if(jsFile){
            generateFolder(dir + "\\js");
        }
        if(cssFile){
            generateFolder(dir + "\\css");
        }
        return dir;
    }

    //generate folder
    private static void generateFolder(String dir) {
        //Instantiate the File class
        File f1 = new File(dir);
        //Creating a folder using mkdir() method
        boolean bool = f1.mkdir();
        if(bool){
            System.out.println("Created " + f1.getName() + " folder");
        }else{
            System.out.println("Error Found! generating file");
        }
    }

}
