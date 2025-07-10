package com.java.workshop;
import java.io.FileInputStream;
import java.io.FileOutputStream;



public class filecopyusingbinary {
    public static void main(String[] args) {
        try {FileInputStream inputStream  = new FileInputStream("input.jpeg");
        FileOutputStream outputstream = new FileOutputStream("output.jpeg");

        byte[] chunk = new byte[1024];
        int byteread;

        while((byteread= inputStream.read(chunk)) != -1) {
            outputstream.write(chunk,0,byteread);
        }
            
        } catch (Exception e) {
            System.out.println("Error in reading or writing file");
        }
    }


}
