package com.java.workshop.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StudentListMergeExample {
    public static void main(String[] args) {
        
    
    List<Integer> csRollNos = Arrays.asList(1003,1007,1010,1015);
    List<Integer> csaRollNos = Arrays.asList(1002,1008,1011,1014);
    List<Integer> allRollNos = Stream.concat(csRollNos.stream(),csaRollNos.stream())
    .sorted().toList();
    System.out.println(allRollNos);
    
    


}
}