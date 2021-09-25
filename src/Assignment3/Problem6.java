package Assignment3;

import java.util.*;

/**
 * (Print distinct numbers) Write a program that reads in ten numbers and displays the number of distinct numbers
 * and the distinct numbers separated by one space (i.e. if a number appears multiple times, it is displayed only once). 
 * <p>(Hint: Read a number and store it to an array if it is new. If the number is already in the array, ignore it.)
 * @author Hamzat Olowu
 * <ul><li>Created On 09/24/2021
 */
public class Problem6 {
    public static void main(String[] args) {
        int num, cnt = 0; // initialize the counter
        int[] arr = new int[10]; // declare the array
        Scanner input = new Scanner(System.in);// instantiate input Source

        // asks for a number 10 times and append the numbers to the array
        for (int i = 0; i < 10; i++){ 
            System.out.print("Enter a number: ");
            num = input.nextInt();
            if (isUnique(arr, num)){ // check if a number already exists in an array
                arr[i] = num;
                cnt++; // count the amount of times a number is actually appended
            }
        }

        System.out.println("The distinct numbers are "+cnt+" in total."); // print the counter
        System.out.print("The distinct numbers are: ");
        // prints the numbers that were appended into the array
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > 0){
                System.out.print(arr[i]+" ");
            }
        }
    }

    /**
     * Checks if an integer exist in an array
     * @param arr
     * @param num
     * @return {@code true} or {@code false}
     */
    public static boolean isUnique(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
			if (num == arr[i]){
				return false;
            }
    }
		return true;
    }
}
