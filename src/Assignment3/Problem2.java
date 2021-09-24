package Assignment3;

import java.util.Scanner;

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

        Triangle tri = new Triangle(s1, s2, s3);

        if (!tri.isValid(s1, s2, s3)){
            System.out.println("Invalid Input");
        }
        else{
            System.out.println(tri.area(s1, s2, s3));
        }
    }
}
