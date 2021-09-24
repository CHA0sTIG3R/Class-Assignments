package Assignment3;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of milliseconds: ");

        System.out.println(convertMillis(input.nextLong()));
    }

    public static String convertMillis(long millis) {
        long hr, min, sec;

        hr = Math.floorDiv(millis, 3600000);
        min = Math.floorMod(millis, 3600000) / 60000;
        sec = Math.floorMod(millis, 60000) / 1000;

        return hr + ":" + min + ":" + sec;
    }
}
