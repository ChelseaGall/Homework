/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chelsea Gallimore
 */
public class MonthDays extends Month{
    public static void main(String[] args){
    }
    int year;
    // use int to declare month and year
    public MonthDays(int month,int year){
        super(month);
        this.year = year;
    }

    public int getNumberOfDays(){

        boolean leap;

        if(year%100==0){
            leap = year % 400 == 0;
        }else{
            leap = year % 4 == 0;
        }
// declare if true
        int monthNumber = getMonthNumber();

        if(monthNumber==2){
            if(leap){
                return 29;
            }else{
                return 28;
            }
        //see if the numbers of days are divisble and declare if true or not
        }else if(monthNumber >= 8 ){
            if(monthNumber%2==0){
                return 31;
            }else{
                return 30;
            }
        }else{
            if(monthNumber%2==0){
                return 30;
            }else{
                return 31;
            }
        }
    }

}
