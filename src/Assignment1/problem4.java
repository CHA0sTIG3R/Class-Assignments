package Assignment1;

import java.util.Scanner;

/**
 * A program that reads an investment amount, annual interest rate,
 * and the number of years, and displays the future investment value using the following formula:
 * <p>futureInvestmentValue = investmentAmount (1 + (annualInterestRate/12))^numberOfYears*12
 * <p>For example, if you enter amount 1000, annual interest rate 3.25%, and number of years 1,
 *  the future investment value is 1032.98.
 *  <p>Created on 09/05/2021
 * @author Hamzat Olowu
 */
public class problem4 {
    
    public static void main(String[] args) {
        // variable declaration
        double inv, intrt, num;

        //prompt the user for input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Investment amount: ");
        inv = input.nextDouble(); // assign input to a variable
        System.out.println("Enter annual interest rate: ");
        intrt = input.nextDouble();// assign input to a variable
        System.out.println("Enter number of years: ");
        num = input.nextDouble();// assign input to a variable

        // print the futureInvestmentValue() and divide annual interest by 1200 to get monthly interest
        System.out.println("Calculated Future InvestMent is $" + futureInvestmentValue(inv, intrt/1200, num));
    }

    /**
     * Returns the value of the Future Investment
     * 
     * @param investAmnt
     * @param monInterest
     * @param num_of_years
     * @return {@code investAmnt} * {@code (1 + monInterest)^(num_of_years*12)}
     */
    public static double futureInvestmentValue(double investAmnt, double monInterest, double num_of_years) {
        return investAmnt * Math.pow((1 + monInterest), (num_of_years*12));
    }
}
