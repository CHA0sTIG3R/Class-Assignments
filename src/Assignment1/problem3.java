package Assignment1;

import java.util.Scanner;

/**
 * A program that prompts the user to enter the vertices of a triangle 
 * (x1, y1), (x2, y2), (x3, y3) and displays its area. 
 * <p>The formula for computing the area of a triangle is:
 * s = (side1 + side2 + side3) / 2 
 * <p>area = √(s(s-side1)(s-side2)(s-side3))
 * <p>
 *  Created on 09/03/2021
 * @author Hamzat Olowu
 */
public class problem3 {
    
    public static void main(String[] args) {
        
        // Prompt the user for input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the points in the order of x1, y1, x2, y2, x3, y3: ");

        // create the instance of Triangle class
        Triangle my_triangle = new Triangle();
        // call distPoint() with user inpusts as parameters
        my_triangle.distPoints(input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble());
        // Print out the value returned from the area()
        System.out.println(my_triangle.area(my_triangle.s1, my_triangle.s2, my_triangle.s3));

    }

}

/**
 * @author Hamzat Olowu
 * 
 */
class Triangle{
    double s1, s2, s3;

    /**
     * Uses the {@code distance()} from {@linkplain problem1} to calculate the sides of the triangle
     * and assigns them to the class variables {@code s1}, {@code s2} and {@code s3}
     * 
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     * @param x3
     * @param y3
     */
    public void distPoints(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.s1 = problem1.distance(x1, y1, x2, y2);
        this.s2 = problem1.distance(x2, y2, x3, y3);
        this.s3 = problem1.distance(x3, y3, x1, y1);
    }
    
    /**
     * Returns the perimeter of a triangle
     * 
     * @param s1
     * @param s2
     * @param s3
     * @return {@code s1} + {@code s2} + {@code s3}
     */
    public double perimeter(double s1, double s2, double s3) {
        return s1+s2+s3;
    }

    /**
     * Returns the area of a triangle
     * 
     * @param s1
     * @param s2
     * @param s3
     * @return √({@code s}*({@code s}- {@code s1})*({@code s}-{@code s2})*({@code s}-{@code s3}))
     */
    public double area(double s1, double s2, double s3) {
        double s = (s1 + s2 + s3)/2;
        return Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
    }
}