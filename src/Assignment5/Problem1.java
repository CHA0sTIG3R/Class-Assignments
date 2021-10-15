package Assignment5;

public class Problem1 {
    public static void main(String[] args) {
        Account acc = new Account(1122, 20000);
        acc.setAnnualInterestRate(4.5);
        acc.withdraw(2500);
        acc.deposit(3000);

        System.out.println(
            "The Account balance is: "+acc.getBalance()+"\n"
            +"The Monthly Interest is: "+acc.getMonthlyInterest()+"\n"+
            "This account was created on: "+acc.getDateCreated());
    }
}
