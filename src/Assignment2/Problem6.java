package Assignment2;

import java.util.Scanner;
/**
 * (Decimal to binary) Write a program that prompts the user to enter an integer 
 * (in base 10) and displays its corresponding binary value as a string.<p>
 * Don’t use Java’s Integer.toBinaryString(int) in this program.
 * @author Hamzat Olowu
 * <ul><li>Created On 09/16/2021
 */
public class Problem6 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        decToBin(input.nextInt());
    }

    /**
     * Converts {@code int} {@code n} to binary and prints it out using recursion.
     * 
     * @param n
     */
    public static void decToBin(int n) {
        
        if (n >= 1){
            decToBin(n / 2);
        }
        
        System.out.print(n % 2);
    }
}
