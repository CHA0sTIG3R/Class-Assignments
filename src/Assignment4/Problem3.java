package Assignment4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * (Locate the largest element) Write the following method that returns the location of the largest element in a two-dimensional array: <p>
 * public static int [] locateLargest(double [][] a) </p>
 * The return value is a one-dimensional array that contains two elements. 
 * These two elements indicate the row and column indices of the largest element in the two-dimensional array. 
 * Write a test program (the main method) that prompts the user to enter a two-dimensional array and displays the location of the largest element of the array.
 * 
 * @author Hamzat Olowu
 * <ul><li>Created On 10/08/2021
 */
public class Problem3 {
    public static void main(String[] args) {
        double [] [] arr; int rows, cols; // declare variables

        Scanner input = new Scanner(System.in); // input stream
        System.out.println("Enter a 2D array");
        System.out.print("Enter number of rows: ");
        rows = input.nextInt();
        System.out.print("Enter number of cols: ");
        cols = input.nextInt();

        arr = new double [rows][cols]; // initialize array using user input

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                // use user input to populate the array
                System.out.print("Enter a number: ");
                arr[i][j] = input.nextInt();        
            }
        }

        // print array to console
        System.out.println(Arrays.toString(locateLargest(arr)));
    }

    /**
     * locates the largest number in a 2D array
     * 
     * @param a
     * @return an array containing the index of the largest number
     */
    public static int [] locateLargest(double [][] a){
        int row = 0, col = 0;
        double max = a[0][0];
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++){
                if (max < a[i][j]){
                    max = a[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        return new int []{row, col};
    }
}
