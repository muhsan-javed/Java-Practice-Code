package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MT_111_File_Handling_in_Java {
    public static void main(String[] args) {

        // Code to Create a new
        /*
        File myFile = new File("mt11file.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create this file");
            e.printStackTrace();
        }

        // Code to write to a file
        try{
            FileWriter myFileWriter = new FileWriter("mt11file.txt");
            myFileWriter.write("This is our file from this java course\n now by");
            myFileWriter.close();
        } catch (IOException e) {
            System.out.println("");
            e.printStackTrace();
        }


        // Reading a file
        File myFile = new File("file.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(myFile);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        // Delete a File
        File myFile = new File("file.txt");
        if (myFile.delete()){
            System.out.println("I have deleted: "+myFile.getName());
        }else {
            System.out.println("Some problem occurred while deleteing the file");
        }

        */
    }
}
