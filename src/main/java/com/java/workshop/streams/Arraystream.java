package com.java.workshop.streams;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Arraystream {
    public static void main(String[] args) {
        int[]marks = {90,95,97,94,98};
        long numberofSubjectPassed = Arrays.stream(marks)
        .filter(mark -> mark > 40).count();
        System.out.println(numberofSubjectPassed);

        IntStream markstream = Arrays.stream(marks);
        numberofSubjectPassed = markstream
        .filter(mark -> mark >40).count();
    }

}
