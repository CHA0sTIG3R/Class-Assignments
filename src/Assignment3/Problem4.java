package Assignment3;

import java.util.Scanner;

/**
 * Write a program that prompts the user to enter the number of milliseconds and converts the milliseconds to a string hours:minutes:seconds.
 * @author Hamzat Olowu
 * <ul><li>Created On 09/24/2021
 */
public class Problem4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);// instantiate input Source
        System.out.print("Enter the number of milliseconds: ");

        System.out.println(convertMillis(input.nextLong())); // Invoke the method with user input.
    }

    /**
     * Converts milliseconds to the 00:00:00 format
     * @param millis
     * @return {@code hr}:{@code min}:{@code sec}
     */
    public static String convertMillis(long millis) {
        long hr, min, sec;

        hr = Math.floorDiv(millis, 3600000);
        min = Math.floorMod(millis, 3600000) / 60000;
        sec = Math.floorMod(millis, 60000) / 1000;

        return hr + ":" + min + ":" + sec;
    }
}
