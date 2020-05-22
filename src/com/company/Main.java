package com.company;
import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        try {
            System.out.println("Use default path (y/n):");
            Scanner defpath = new Scanner(System.in);
            String s = defpath.nextLine();
            File myfile;
            if(s == "y"){
                 myfile = new File("/Users/kgu/Creative Cloud Files/Leon/Java/Passwort/src/com/company/test.txt");
            }else{
                Scanner in = new Scanner(System.in);
                String filename = in.nextLine();
                myfile = new File(filename);
            }
            Scanner myReader = new Scanner(myfile);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
