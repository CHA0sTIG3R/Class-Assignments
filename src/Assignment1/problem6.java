package Assignment1;

import java.util.Scanner;

/**
 * A program that reads three edges for a triangle and 
 * computes the perimeter if the input is valid. 
 * <p>Otherwise, display that the input is invalid. 
 * <p>The input is valid if the sum of every pair of two edges is 
 * greater than the remaining edge.
 * <p>Created on 09/07/2021
 * @author Hamzat Olowu
 */
public class problem6 {
    
    public static void main(String[] args) {
        // variable declaration
        double s1, s2, s3;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for Side1: ");
        s1 = input.nextDouble(); // assign input to a variable
        System.out.println("Enter a number for Side2: ");
        s2 = input.nextDouble(); // assign input to a variable
        System.out.println("Enter a number for Side3: ");
        s3 = input.nextDouble(); // assign input to a variable
        
        // create the instance of Triangle class
        Triangle tri = new Triangle();

        // check if a + b > c
        if ((s1 + s2 > s3) && (s2 + s3 > s1) && (s3 + s1 > s2)){
            // prints perimeter() from Triangle if true
            System.out.println(tri.perimeter(s1, s2, s3));
        }
        else{
            // print Invalid input otherwise
            System.out.println("Invalid Input ");
        }
    }
}
