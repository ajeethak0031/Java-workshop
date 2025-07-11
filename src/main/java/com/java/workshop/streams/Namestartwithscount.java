package com.java.workshop.streams;


import java.util.ArrayList;
import java.util.List;

public class Namestartwithscount {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Cooker");
        names.add("Alagii");
        names.add("Lawyer");
        names.add("Shahana");
        names.add("letter");
        names.add("pusari");
        names.add("Muttapuffs"); 
        names.add("Suba"); 
        long nameCount = names.stream()
        .filter (name -> name.startsWith("S")).count();
        System.out.println(nameCount);
        
    }

}

