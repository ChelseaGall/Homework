import java.sql.Time;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chelsea Gallimore
 */
public class NewHomework4 
{
    // method that creates, adds and prints the array
    static void basicArray()
    {
        int nums[] = new int[50];
        for(int i=0; i<50; i++)
        nums[i] = i+1;
        for(int i=0; i<50; i++)
        nums[i] += 10;
        System.out.println("nums[] array:");
        for(int i=0; i<50; i++)
        System.out.print(nums[i]+" ");
    }

    // print string array
    static void printElements(String arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            // make sure elements are strings
            if(arr[i].getClass().getSimpleName().equalsIgnoreCase("String"))
            System.out.print(arr[i]+", ");
        }
        System.out.println();
    }

    // print 2D int arrays
    static void printElements(int arr[][])
    {
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[0].length; j++)
            System.out.printf("%4d ", arr[i][j]);
            System.out.println();
        }
    }

    // print time array
    static void printElements(Time arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            // make sure each element is time object
            if(arr[i].getClass().getSimpleName().equalsIgnoreCase("Time"))
            System.out.println(arr[i]);
        }
    }

    // tester code
    public static void main(String[] args)
    {
        String sarr[] = {"first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth"};
        printElements(sarr);
        Time tarr[] = {new Time(12345), new Time(887564), new Time(9784124)};
        printElements(tarr);
        int values[][] = new int[10][20];
        System.out.println("Number of rows: "+values.length);
        System.out.println("Number of cols: "+values[0].length);
        printElements(values);
    }
}