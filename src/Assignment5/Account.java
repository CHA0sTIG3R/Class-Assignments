package Assignment5;
import java.util.*;

/**
 * @author Hamzat Olowu
 * <ul><li>Created On 10/15/2021
 */
public class Account {
    
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    /**
     * Sets the field defaults
     */
    public Account(){
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
        this.dateCreated = new Date();
    }
    
    /**
     * Sets the field id and balance fields to the arguments given
     * @param id
     * @param balance
     */
    public Account(int id, double balance){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = 0;
        this.dateCreated = new Date();
    }

    /**
     * Setter for id field
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Setter for balance field
     * @param balance
     */
    public void setBalance(double balance){
        this.balance = balance;
    }

    /**
     * Setter for annualInterestRate field
     * @param annualInterestRate
     */
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    /**
     * gets the value of the id field
     * @return {@code id}
     */
    public int getId(){
        return this.id;
    }

    /**
     * gets the value of the balance field
     * @return {@code balance}
     */
    public double getBalance(){
        return this.balance;
    }

    /**
     * gets the value of the AnnualInterestRate field
     * @return {@code annualInterestRate}
     */
    public double getAnnualInterestRate(){
        return this.annualInterestRate;
    }

    /**
     * gets the value of the dateCreated field
     * @return {@code dateCreated}
     */
    public Date getDateCreated(){
        return this.dateCreated;
    }

    /**
     * Calculates Monthly Interest Rate with {@code annualInterestRate}
     * @param annualInterestRate
     * @return a {@code double} value
     */
    public double getMonthlyInterestRate() {
        return this.annualInterestRate/1200;
    }
    
    /**
     * Calculates Monthly Interest
     * @return a rounded {@code double} value
     */
    public double getMonthlyInterest() {
        return Math.round((this.balance* this.getMonthlyInterestRate())*100)/100.0;
    }

    /**
     * Removes {@code amount} from {@code balance}
     * @param amount
     */
    public void withdraw(double amount){
        this.balance -= amount;
    }

    /**
     * Adds the {@code amount} to {@code balance}
     * @param amount
     */
    public void deposit(double amount){
        this.balance += amount;
    }
}
