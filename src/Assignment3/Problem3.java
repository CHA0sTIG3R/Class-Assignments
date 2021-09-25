package Assignment3;

import java.util.Scanner;

/**
 * Write a program that prompts the user to enter a string and a character and displays the number of occurrences of the character in the string. 
 * @author Hamzat Olowu
 * <ul><li>Created On 09/24/2021
 */
public class Problem3 {
    public static void main(String[] args) {
        String word; char letter; // variable declaration
        
        // input stream
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Word: ");

        //assigning input to variable
        word = input.nextLine();
        System.out.print("Enter a letter: ");
        letter = input.next().charAt(0);

        // invoking method with both variable in lowercase to make it more accurate.
        System.out.println(letter + " occurs " + count(word.toLowerCase(), Character.toLowerCase(letter))+" times in " + word );
    }

    /**
     * Counts how many times {@code l} occurs in {@code w}
     * @param w
     * @param l
     * @return the number of times {@code l} was found in {@code w}
     */
    public static int count(String w, char l) {
        int count = 0;

        for (int i = 0; i < w.length(); i++){
            if (l == w.charAt(i)){
                count++;
            }
        }
        return count;
    }
}
