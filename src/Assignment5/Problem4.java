package Assignment5;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        int row, col;
        double[][] arrlst; Location loc;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 2D array");
        System.out.print("Enter number of rows: ");
        row = input.nextInt();
        System.out.print("Enter number of cols: ");
        col = input.nextInt();

        arrlst = new double[row][col];

        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                // use user input to populate the array
                System.out.print("Enter a number: ");
                arrlst[i][j] = input.nextDouble();        
            }
        }
        input.close();
        loc = Location.locateLargest(arrlst);

        System.out.println(
            "The largest element is "+loc.maxValue
            +" and it is located at ("+loc.row+","+loc.column+")");

    }
}
