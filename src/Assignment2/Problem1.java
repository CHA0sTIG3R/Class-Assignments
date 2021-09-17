package Assignment2;

import java.util.*;
/**
 * Write a program that prompts the user to enter a year 
 * and the first three letters of the month (with the first letter in uppercase)
 * and displays the number of days in the month. 
 * You should take into account if the year is a leap year or not.
 * @author Hamzat Olowu
 * <ul><li>Created On 09/15/2021
 */
public class Problem1 {
    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        int yr; String mon;

        
        Scanner input = new Scanner(System.in); // user input resource declaration
        System.out.println("Enter a year: ");
        yr = input.nextInt(); // assign year to yr variabl
        System.out.println("Enter the first 3 letters of a month (with the first in uppercase): ");
        mon = input.next(); // and month to mon variable

        if (mon.equals("Sep") || mon.equals("Apr") || mon.equals("Jun") || mon.equals("Nov")){
            // prints 30, if mon is same as any of conditions
            System.out.println("30");
        }
        else if (mon.equals("Feb") && isLeapYear(yr)){
            // prints 29, if both conditions are satisfied
            System.out.println("29");
        }
        else if (mon.equals("Feb") && !isLeapYear(yr)){
            // prints 28, if isLeapYear() is false 
            System.out.println("28");
        }
        else{
            // This is the default value if the other conditions are not met.
            System.out.println("31");
        }
    }

    /**
     * Checks if a year is leap year or not
     * @param yr
     * @return {@code true} if {@code yr} is a leap year 
     * <li>and {@code false} otherwise
     */
    public static boolean isLeapYear(int yr) {
        if (yr % 100 == 0){
            if (yr % 400 != 0){
                return false;
            }
            else{
                return true;
            }
        }
        else if (yr % 4 == 0){
            return true;
        }
        else{
            return false;
        }
    }
    

}
