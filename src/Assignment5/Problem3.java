package Assignment5;

import java.util.Scanner;

/**
 * Write a test program that prompts the user to 
 * enter a, b, c, d, e, and f and displays the result. 
 * If (ad – bc) is 0, report that “The equation has no solution.”
 * @author Hamzat Olowu
 * <ul><li>Created On 10/15/2021
 */
public class Problem3 {
    public static void main(String[] args) {
        //prompt user to enter values
        Scanner input = new Scanner(System.in);
        System.out.print("Enter values in order (a, b, c, d, e, f,): ");

        // pass values to the object of the class
        LinearEquation le = new LinearEquation(
            input.nextDouble(), input.nextDouble(), 
            input.nextDouble(), input.nextDouble(), 
            input.nextDouble(), input.nextDouble());
        input.close();
        //#endregion

        //check if equation is solvable
        if (!le.isSolvable()){
            System.out.println("The equation has no solution");
        }
        else{
            System.out.println( le.isSolvable()+
                "The value for x is: "+ le.getX()+"\n"
                +"The value for y is: "+ le.getY());
        }
    }
}
