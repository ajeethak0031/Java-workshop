package com.java.workshop.temperaturedata.beans;

import java.time.LocalDate;

public record Organisation (String name,
    String completeAddress,
    String website,
    String  email,
    String  contactNumber,
    long registrationNumber,
    LocalDate registrationDate){

    }

    


