package com.java.workshop.temperaturedata.beans;

import java.time.LocalDate;

public class temperatureapplication {
    public static void main(String[] args) {
        Organisation vet = new Organisation("Vetias",
                                             "Thindal",
                                              "www.vetias.com",
                                               "vetias@gmail.com",
                                                 "9486519952",
                                               24221332,
                                  LocalDate.of(2023,01,12));
                                  System.out.println(vet);

    }

}
