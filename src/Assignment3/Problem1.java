package Assignment3;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        int inp;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        
        inp = input.nextInt();

        if (isPalindrome(inp)){
            System.out.println(inp +" is a Palindrome");
        }
        else{
            System.out.println(inp +" is not a Palindrome");
        }
    }

    public static int reverse(int num) {
        String s = Integer.toString(num);
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--){
            rev += s.charAt(i);
        }
        return Integer.parseInt(rev);
    }

    public static boolean isPalindrome(int num) {
        
        if (num == reverse(num)){
            return true;
        }
        else{
            return false;
        }
    }
}