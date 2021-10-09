package Assignment4;

import java.util.Scanner;

/**
 * (Markov matrix) An n x n matrix is called a positive Markov matrix if each element is positive and the sum of the elements in each column is 1. 
 * Write the following method to check whether a matrix is a Markov matrix. <p>
 * public static boolean isMarkovMatrix(double [][] m)<p>
 * Write a test program (the main method) that prompts the user to enter a 3 x 3 matrix of double values and tests whether it is a Markov matrix.
 * 
 * @author Hamzat Olowu
 * <ul><li>Created On 10/08/2021
 */
public class Problem5 {
    public static void main(String[] args) {
        
        double[][] matrix = new double[3][3];
        Scanner input = new Scanner(System.in); // input stream

        System.out.println("Enter a 3-by-3 matrix row by row");
        for (int i = 0; i < matrix.length; i++){
            System.out.println("Row "+(i+1)+": ");
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = input.nextDouble(); // use user input to populate the array
            }
        }

        // conditionals using ternary operator to print to console.
        System.out.println(isMarkovMatrix(matrix) ? "This is a Markov matrix." : "This is NOT a Markov matrix.");
    }

    /**
     * checks if a 2D array is a Markov Matrix
     * 
     * @param arr
     * @return {@code true} or {@code false}
     */
    public static boolean isMarkovMatrix(double[][] arr) {
        double sum = 0, num;
        for (int j = 0; j < arr[0].length; j++) {

            for (int i = 0; i < arr.length; i++) {
                num = arr[i][j];
                if (num < 0){return false;} 
                sum += num;
            }
            if (sum != 1){ return false;}
        }
        return true;
    }

}
