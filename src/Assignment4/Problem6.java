package Assignment4;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        int rows; int[][] matrix; int[] l;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows in the matrix: ");
        rows = input.nextInt();
        matrix = new int[rows][rows]; // create square with user input

        System.out.println("Enter the matrix row by row");
        for (int i = 0; i < matrix.length; i++){
            System.out.println("Row "+(i+1)+": ");
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = input.nextInt(); // use user input to populate the array
            }
        }

        l = getLocation(matrix); //invoke and assign getLocation to a variable

        if (l != null) {
            System.out.println("The maximum square submatrix is at ("+l[0]+", "+l[1]+")"+ " with size "+l[2]);
        }

    }

    /**
     * searches for the max possible submatrix of a given matrix
     * 
     * @param arr
     * @return an array of the coordinates and size of the submatrix
     */
    public static int[] getLocation(int[][] arr) {
        int exist;
        int[] hBlock = null;
        int hRow = 0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[0].length; j++) {

                exist = getInstance(arr, i, j);

                if (exist < 2){ continue;} // not a square

                if (checkBlock(arr, i, j, exist) && exist > hRow) {

                    hRow = exist;
                    hBlock = new int[]{i,j,exist};
                }
            }
        }
        return hBlock;
    }

    /**
     * calculates the possible occurrences in the matrix
     * 
     * @param arr
     * @param row
     * @param col
     * @return an {@code int} 
     */
    public static int getInstance(int[][] arr, int row, int col) {

        int exist = 0;

        if (col == arr[0].length - 1) return 0;

        for (int j = col; j < arr[0].length; j++) {

            if (arr[row][j] == 1) {
                exist++;
                if (j == arr[0].length - 1) {return exist;} // if in the end of grid

            }
             else if (exist > 1) {return exist;}

            else {return 0;}
        }
        return 0;
    }

    /**
     * checks values in the blocks with the coordinates ({@code row}, {@code col})
     * 
     * @param arr
     * @param row
     * @param col
     * @param exist
     * @return {@code true} or {@code false}
     */
    public static boolean checkBlock(int[][] arr, int row, int col, int exist) {

        if (row + exist > arr.length) {return false;} // out of range

        for (int i = row; i < exist + row; i++) {

            for (int j = col; j < exist + col; j++) {
                if (arr[i][j] == 0) {return false;}
            }
        }
        return true;
    }

}
