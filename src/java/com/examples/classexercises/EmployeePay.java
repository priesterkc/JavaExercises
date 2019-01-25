package com.examples.classexercises;

import java.util.Scanner;

public class EmployeePay {

    public static void main (String[] args)
    {
        //make Scanners for each input
        Scanner scanEmp = new Scanner(System.in);
        Scanner scanPay = new Scanner(System.in);
        Scanner scanHr = new Scanner(System.in);

        //make variables for each input
        String empNum;
        float payRate;
        int hrsWorked;
        double salary = 0;

        //prompt for input
        System.out.println("Enter employee number: ");
        empNum = scanEmp.next();
        System.out.println("Enter hourly pay rate: ");
        payRate = scanPay.nextFloat();
        System.out.println("Enter number of hours worked: ");
        hrsWorked = scanHr.nextInt();

        //calculate salary
        if (hrsWorked > 60 || payRate > 25)
        {
            System.out.println("You have exceeded the maximum hours or pay rate. Your salary will not be calculated.");
        }
        else if (hrsWorked > 35)
        {
            float normal = 35 * payRate;
            double overtime = (hrsWorked - 35) * (1.5 * payRate);
            salary = normal + overtime;
        }
        else {
            salary = hrsWorked * payRate;
        }
        
        //output weekly salary
        System.out.printf("This week's salary for Employee %s is $%.02f", empNum, salary);
    }
}
