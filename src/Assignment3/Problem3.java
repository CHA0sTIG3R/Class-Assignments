package Assignment3;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        String word; char letter;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Word: ");
        word = input.nextLine();
        System.out.print("Enter a letter: ");
        letter = input.next().charAt(0);

        System.out.println(letter + " occurs " + count(word.toLowerCase(), Character.toLowerCase(letter))+" times in " + word );
    }

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
