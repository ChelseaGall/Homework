/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chelsea Gallimore
 */
class MonthException extends Exception{
    @Override
    public String toString(){
        return "No such month number exits, Setting monthNumber to 1";
    }

    @Override
    public String getMessage() {
        return "No such month name exits, Setting monthNumber to 1";
    }
}

public class Month {
     public static void main(String[] args){}
    public int monthNumber;

    // No argument constructor
    public Month(){
        this.monthNumber = 1;
    }

    // Int argument constructor
    public Month (int monthNumber){
        try{
            if(monthNumber < 1 || monthNumber > 12 ){
                throw new MonthException();
            }else{
                this.monthNumber = monthNumber;
            }
        }catch(Exception e){
            System.out.println(e.toString());
            this.monthNumber = 1;
        }
    }

    // String argument constructor
    public Month(String monthName){
        try{
            if(nameToNumber(monthName)  > 0 || nameToNumber(monthName) < 13){
                this.monthNumber = nameToNumber(monthName);
            }else{
                throw new MonthException();
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }

    // Moth number getter
    public int getMonthNumber() {
        return this.monthNumber;
    }

    // Month name getter
    public String getMonthName(){
        return numberToName(monthNumber);
    }

    // Month number setter
    public void setMonthNumber(int monthNumber) {
        if(monthNumber < 1 || monthNumber > 12){
            this.monthNumber = 1;
        }else{
            this.monthNumber = monthNumber;
        }
    }

    // To string method
    public String toString(int monthNumber) {
        return numberToName(monthNumber);
    }

    // equal function
    public boolean equal(Month m){
        return this.monthNumber == m.monthNumber;
    }

    // Private function to convert month number to name
    private String numberToName(int monthNumber){
        return switch (monthNumber) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Wrong";
        };
    }

    // Private function to convert month name to number
    private int nameToNumber(String monthName){
        return switch(monthName){
            case "January" -> 1;
            case "February" -> 2;
            case "March" -> 3;
            case "April" -> 4;
            case "May" -> 5;
            case "June" -> 6;
            case "July" -> 7;
            case "August" -> 8;
            case "September" -> 9;
            case "October" -> 10;
            case "November" -> 11;
            case "December" ->12;
            default -> 0;
        };
    }
}
