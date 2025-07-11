package com.java.workshop.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Mark {
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>();
        marks.add(89);
        marks.add(99);
        marks.add(85);
        marks.add(79);
        marks.add(95);
        System.out.println("marks:" + marks);
        marks.sort(Comparator.naturalOrder());
        System.out.println("Sorted marks:"+ marks);
        marks.sort(Comparator.reverseOrder());
         System.out.println("Reverse Sorted marks:"+ marks);
         System.out.println("Highest marks:"+marks.get(0));

    }

}
