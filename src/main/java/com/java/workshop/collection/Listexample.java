package com.java.workshop.collection;

import java.util.ArrayList;
import java.util.List;

public class Listexample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Cooker");
        names.add("Alagii");
        names.add("Lawyer");
        names.add("Gundu");
        names.add("letter");
        names.add("pusari");
        names.add("Muttapuffs"); 
        names.add("Naikutty");  
        System.out.println("Nmaes List: " + names);
        for (String name: names)
        {
            System.out.println("Names: " + name);
        }  
        for (int i =0;i< names.size(); i++)
        {
            System.out.println("Nmae at index"+ i +":"+names.get(i));
        }

    }

}
