package com.java.workshop;

import java.time.LocalTime;

public class RegistrationTimeLeft {
    public static void main(String[] args) {
        LocalTime CurrentTime = LocalTime.now();
        LocalTime registrationEndTime = LocalTime.of(18, 59, 59);
        int hoursleft = registrationEndTime.getHour()-CurrentTime.getHour();
        int minutesleft = registrationEndTime.getMinute()-CurrentTime.getMinute();
        int secondsleft = registrationEndTime.getSecond()-CurrentTime.getSecond();
        System.out.println("you have"+hoursleft + " Hour, " + minutesleft + "Minute," + secondsleft +" Second ");
    }

}


 
