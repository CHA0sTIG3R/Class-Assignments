package Assignment5;

/**
 * Write a test program that creates an Account object with an account ID of 1122,
 *  a balance of $20,000, and an annual interest rate of 4.5%. 
 * Use the withdraw method to withdraw $2,500, use the deposit method to deposit $3,000,
 * and print the balance, the monthly interest, and the date when this account was created.
 * @author Hamzat Olowu
 * <ul><li>Created On 10/15/2021
 */
public class Problem1 {
    public static void main(String[] args) {
        Account acc = new Account(1122, 20000); // instantiate the class to obj acc
        acc.setAnnualInterestRate(4.5); // set the annual interest rate
        acc.withdraw(2500); // withdraw from the account
        acc.deposit(3000); // deposit to the account

        // print account information
        System.out.println(
            "The Account balance is: "+acc.getBalance()+"\n"
            +"The Monthly Interest is: "+acc.getMonthlyInterest()+"\n"+
            "This account was created on: "+acc.getDateCreated());
    }
}
