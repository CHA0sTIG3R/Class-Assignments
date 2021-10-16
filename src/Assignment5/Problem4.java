package Assignment5;

import java.util.Scanner;

/**
 * Write a test program that prompts the user to enter a two-dimensional array
 * and displays the location of the largest element in the array.
 * 
 * @author Hamzat Olowu
 * <ul><li>Created On 10/15/2021
 */
public class Problem4 {
    public static void main(String[] args) {
        // declare variables
        int row, col;
        double[][] arrlst; Location loc;
        Scanner input = new Scanner(System.in); // instantiate input stream

        // input prompt and input assignment 
        System.out.println("Enter a 2D array");
        System.out.print("Enter number of rows: ");
        row = input.nextInt();
        System.out.print("Enter number of cols: ");
        col = input.nextInt();

        // initialize 2D array
        arrlst = new double[row][col];

        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                // use user input to populate the array
                System.out.print("Enter a number: ");
                arrlst[i][j] = input.nextDouble();        
            }
        }
        input.close(); // close input stream 
        loc = Location.locateLargest(arrlst); // locate and assign return value

        // print out the largest value.
        System.out.println(
            "The largest element is "+loc.maxValue
            +" and it is located at ("+loc.row+","+loc.column+")");

    }
}
