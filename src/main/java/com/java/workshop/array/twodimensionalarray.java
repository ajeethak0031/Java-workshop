package com.java.workshop.array;
import java.util.Arrays;



public class twodimensionalarray {
    public static void main(String[] args) {
        String employeedetails[][]=new String[5][2];
        employeedetails[0][0]="101";
        employeedetails[0][1]="10000";
        employeedetails[1][0]="102";
        employeedetails[1][1]="10000";
        employeedetails[2][0]="103";
        employeedetails[2][1]="10000";
        employeedetails[3][0]="105";
        employeedetails[3][1]="10000";
        employeedetails[4][0]="106";
        employeedetails[4][1]="10000";
        for(String[]employee:employeedetails)
        {
            System.out.println(Arrays.toString(employee));

        }
    }
}
