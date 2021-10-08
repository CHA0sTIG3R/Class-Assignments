package Assignment4;

import java.util.Arrays;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        double [] [] arr; int rows, cols;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 2D array");
        System.out.print("Enter number of rows: ");
        rows = input.nextInt();
        System.out.print("Enter number of cols: ");
        cols = input.nextInt();

        arr = new double [rows][cols];

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                System.out.print("Enter a number: ");
                arr[i][j] = input.nextInt();                
            }
        }
        
        System.out.println(Arrays.toString(locateLargest(arr)));
    }

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
