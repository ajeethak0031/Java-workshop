package com.vetias.java.workshop.basic.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestWordCount {
    @Test
    public void WordCountTest(){
    WordCount wordcount = new WordCount();
    int count = wordcount.count("Hello World");
    Assertions.assertEquals(2,count);


    }
@Test
public void testAnotherString(){
WordCount wordcount = new WordCount();
int count = wordcount.count("Ajeetha kannu");
Assertions.assertEquals(2,count);
}

    
}