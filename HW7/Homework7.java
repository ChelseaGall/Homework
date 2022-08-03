/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chelsea Gallimore
 */
/* Name of the the class has to be "Main" only if the class is public. */



public class Homework7 {
    public static void main (String[] args)
    {
        int present_speed, i; 
        car c = new car(2003, "maruti ");
        for (i=0; i<5; i++)
        {
            present_speed=c.accelarate();
            System.out.println("present speed " +present_speed);
        }
        c.getdetails();
        for(i=0; i<5; i++)
        {
            present_speed = c.breaking();
            System.out.println("present speed " +present_speed);
        }
            c.getdetails();
        }
    }

class car
{
int yearmodel;
String make; 
int speed;

car(int y, String m)
{
this.yearmodel = y;
this.make = m;
this.speed = 0; 
}
void getdetails()
{
    System.out.println("Year model of the car " + this.yearmodel);
    System.out.println("make of the car" + this.make);
    System.out.println("Present speed of the car " + this.speed);
}
int accelarate ()
{
    speed = speed + 5;
    return speed;
}
int breaking ()
{
speed = speed -5; 
if (speed <0)
{
    System.out.println("The car is not running, so no break can be applied ");    
}
return speed; 
}
}