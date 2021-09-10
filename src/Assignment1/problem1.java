package Assignment1;

import java.util.Scanner;

/**
 * A program that prompts the user to enter two points (x1, y1) and (x2, y2) 
 * and displays the distance between them.
 * <p>The formula for computing the distance is √((x2-x1)^2 + (y2-y1)^2). 
 * <p>Created on 08/27/2021
 * @author Hamzat Olowu 
 *
 */
public class problem1 {
    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        
        // Prompt user for input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the points in the order of x1, y1, x2, y2: ");

        // Call the distance() and print out the returned value
        Double mydist = distance(input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble());
        System.out.println("The Distance between the 2 sets of points is: "+ mydist);
    }

    /**
     * Returns the distance between 2 points
     * 
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     * @return the distance between points ({@code x1}, {@code y1}) and ({@code x2}, {@code y2})
     */
    public static double distance(double x1, double y1, double x2, double y2) { 
        return Math.sqrt((Math.pow((x2 - x1), 2))+(Math.pow((y2 - y1), 2)));
    }
}
