/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chelsea Gallimore
 */

import java.util.Scanner;

public class MonthYearTest {
  // use a main method
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.print("Enter a month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter a year: ");
        // declare an integer for year
        int year = sc.nextInt();
        // call a method to run
        MonthDays m1 = new MonthDays(month, year);
        // get the sum of number of days and year
        System.out.println(m1.getMonthName() + " " + year + " has " + m1.getNumberOfDays() + " days");
    }
}
