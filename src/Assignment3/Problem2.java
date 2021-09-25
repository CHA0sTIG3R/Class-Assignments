package Assignment3;

import java.util.Scanner;

/**
 * Write a program that reads three sides for a triangle and computes the area is the input is valid. 
 * The formula for computing the area of a triangle from its side in given in {@linkplain Assignment1.problem3}.
 * @author Hamzat Olowu
 * <ul><li>Created On 09/24/2021
 */
public class Problem2 {
    public static void main(String[] args) {
        double s1, s2, s3; 

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number for Side1: ");
        s1 = input.nextDouble(); // assign input to a variable
        System.out.print("Enter a number for Side2: ");
        s2 = input.nextDouble(); // assign input to a variable
        System.out.print("Enter a number for Side3: ");
        s3 = input.nextDouble(); // assign input to a variable

        Triangle tri = new Triangle(s1, s2, s3); // intantiate Triangle class

        // check if input is valid
        if (!tri.isValid(s1, s2, s3)){
            System.out.println("Invalid Input");
        }
        else{
            System.out.println(tri.area(s1, s2, s3));
        }
    }
}
