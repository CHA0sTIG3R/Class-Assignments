package Assignment3;

import java.util.Scanner;

/**
 * (Palindrome integer) A number is a palindrome if its reversal is the same as itself.
 *  Write a program that prompts the user to enter an integer and reports whether the integer is a palindrome.
 * @author Hamzat Olowu
 * <ul><li>Created On 09/24/2021
 */
public class Problem1 {
    public static void main(String[] args) {
        int inp; //input variable

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        
        inp = input.nextInt(); // assign to user input

        // check if its a Palindrome
        if (isPalindrome(inp)){
            System.out.println(inp +" is a Palindrome");
        }
        else{
            System.out.println(inp +" is not a Palindrome");
        }
    }

    /**
     * Reverses an integer
     * @param num
     * @return an {@code int} in reverse
     */
    public static int reverse(int num) {
        String s = Integer.toString(num);
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--){
            rev += s.charAt(i);
        }
        return Integer.parseInt(rev);
    }

    /**
     * Checks if an {@code integer} is a palindrome
     * @param num
     * @return {@code true} or {@code false}
     */
    public static boolean isPalindrome(int num) {
        
        if (num == reverse(num)){
            return true;
        }
        else{
            return false;
        }
    }
}