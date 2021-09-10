package Assignment1;

import java.util.Scanner;

/**
 * A program that prompts the user to enter a temperature between -58°F and 41°F
 *  and a wind speed greater than or equal to 2 mph and displays the wind-chill temperature.
 *  <p>Use Math.pow(a, b) to compute ab.
 *  <p>Formula for Wind-Chill Temperature is: tWC = 35.74 + 0.6215 t – 35.75 w0.16 + 0.4275 t w0.16
 * <p>Created on 08/27/2021
 * @author Hamzat Olowu
 */
public class problem2 {
    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        // declare needed variables
        double t, v;

        // Prompt the user for input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature between -58°F and 41°F: ");
        // assign the input value to variable
        t = input.nextDouble();
        System.out.println("Enter the wind Speed >= 2mph: ");
        // assign the input value to variable
        v = input.nextDouble();
        
        // check to see if the inputs meet the requirements
        // temperature between -58°F and 41°F and
        // wind Speed >= 2mph
        if ((t >= -58 && t <= 41) && (v >= 2) ){
            // if it meets the requirement, 
            // then call the twc() and print out the returned value
            System.out.println("The wind chill index is: " + twc(t, v));
        }
        else {
            // if it doesn't, 
            // then print a message to show input is wrong 
            System.out.println("Input is Wrong temperature has to be between -58°F and 41°F and wind Speed has to be greater than or equal to 2mph.");
        }
    }

    /**
     * Returns the value of the result using the formula:
     * <p> twc= 35.74 + 0.6215 t – 35.75 w0.16 + 0.4275 t w0.16
     * 
     * @param t
     * @param v
     * @return the wind chill index
     */
    public static Double twc(double t, double v) {
        return 35.74 + 0.6215 * t - 35.75 * Math.pow(v, 0.16) + 0.4275 * t * Math.pow(v, 0.16);
    }
}
