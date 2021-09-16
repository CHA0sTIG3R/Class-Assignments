package Assignment2;

import java.util.*;

public class Problem1 {
    
    public static void main(String[] args) {
        int yr; String mon;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year: ");
        yr = input.nextInt();
        System.out.println("Enter the first 3 letters of a month (with the first in uppercase): ");
        mon = input.next();

        if (mon.equals("Sep") || mon.equals("Apr") || mon.equals("Jun") || mon.equals("Nov")){
            System.out.println("30");
        }
        else if (mon.equals("Feb") && isLeapYear(yr)){
            System.out.println("29");
        }
        else if (mon.equals("Feb") && !isLeapYear(yr)){
            System.out.println("28");
        }
        else{
            System.out.println("31");
        }
    }

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
