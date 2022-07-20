/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chelsea Gallimore
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Homework5 {

    /**
     * 
     * @param mph - speed in miles per hour
     * @param minutes - total number of hours
     * @return - the  distance traveled
     */
    public static int distance(int mph, int minutes) {
        return mph * minutes;
    }

    /**
     * 
     * @param fileName - the vehicle name
     * @param speed - the speed of the vehicles
     * @param time - the hours it traveled
     */
    public static void saveAsFile(String fileName, int speed, int time) {
        fileName = fileName + ".txt";
        
        // check speed in not negative and time not less than 1
        if (speed < 0 || time < 1) return;
        
        // write to the file using for loop
        try {
            PrintWriter fileWriter = new PrintWriter(new File(fileName));
            int dist;
            fileWriter.write(String.format("%4s%30s\r\n",
                    "Hour", "Distance Traveled"));
            fileWriter.write("----------------------------------\r\n");
            for (int hr = 1; hr <= time; hr++) {
                dist = distance(speed, hr);
                fileWriter.write(String.format("%4d%20d\r\n",
                        hr, dist));
            }
            fileWriter.flush();
            fileWriter.close(); // close the file
        } catch (FileNotFoundException e) {

        }

    }

 public static void main(String[] args) {

        // the name of the input file to read the data from
        String inputFileName = "/Users/sandradawkins/Desktop/vehicles.txt/";
        
        try {
            Scanner fileReader = new Scanner(new File(inputFileName));
            // skip the file line which is the column header
            fileReader.nextLine();
            
            // read line by line
            while (fileReader.hasNextLine()) {
                // split line by comma delimeter
                String[] data = fileReader.nextLine().split(",");
                
                String fileName = data[0];
                int speed = Integer.parseInt(data[1]);
                int time = Integer.parseInt(data[2]);
                saveAsFile(fileName, speed, time);
            }
            fileReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: could not find input file: " + inputFileName);
        }

    }
}
