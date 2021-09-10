package Assignment1;

import java.util.Scanner;

/**
 * A program that prompts the user to enter values for a, b and c 
 * and displays the result based on the discriminant. 
 * <p>If the discriminant is positive, display two roots. 
 * <p>If the discriminant is zero, display one root. 
 * <p>Otherwise, display “The equation has no real roots.”
 * <p>Created on 09/05/2021
 * @author Hamzat Olowu
 */
public class problem5 {

    public static void main(String[] args) {
        // variable declaration
        double a,b,c;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for a: ");
        a = input.nextFloat(); // assign input to a variable
        System.out.print("Enter a number for b: ");
        b = input.nextFloat(); // assign input to a variable
        System.out.print("Enter a number for c: ");
        c = input.nextFloat(); // assign input to a variable

        // print out value from disc()
        System.out.println(disc(a, b, c));
    }

    /**
     * Returns one value if {@code d == 0} , 2 values if {@code d} is positive and a string if {@code d} is negative
     * 
     * @param a
     * @param b
     * @param c
     * @return the roots according to the discriminant
     */
    public static String disc(double a, double b, double c) {
        // assign the discriminant to variable d
        double d = Math.pow(b, 2) - 4*a*c;

        if (d == 0){
            // return below string if true
            return "One Root: "+(-b/2*a);
        }
        else if (d < 0){
            // else return this if above is not true and this is true
            return "No Real Roots";
        }
        
        // return this value after going through both if statement above
        // and they were false
        return "Two Roots: " + ((-b+Math.sqrt(d))/2*a) + " and " + ((-b-Math.sqrt(d))/2*a);
    }
}