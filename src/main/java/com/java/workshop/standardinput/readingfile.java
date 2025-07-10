package com.java.workshop.standardinput;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class readingfile {
    public static void main(String[] args) {
        try {BufferedReader reader = new BufferedReader(new FileReader("README.md"));
        String line;
        while((line = reader.readLine()) !=null){
            System.out.println(line);
        }
            
        } catch (IOException e) {
            System.err.println("An error occured while reading the file:" + e.getMessage());
        }
    }

}
