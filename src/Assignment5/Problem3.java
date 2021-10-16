package Assignment5;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter values in order (a, b, c, d, e, f,): ");

        LinearEquation le = new LinearEquation(
            input.nextDouble(), input.nextDouble(), 
            input.nextDouble(), input.nextDouble(), 
            input.nextDouble(), input.nextDouble());
        input.close();
        //#endregion
        if (!le.isSolvable()){
            System.out.println("The equation has no solution");
        }
        else{
            System.out.println(
                "The value for x is: "+ le.getX()+"\n"
                +"The value for y is: "+ le.getY());
        }
    }
}
