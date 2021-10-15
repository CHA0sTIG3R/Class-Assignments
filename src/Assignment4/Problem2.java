package Assignment4;

import java.util.*;

/**
 * Write a sort method that uses the bubble-sort algorithm to sort numbers in ascending order. 
 * The bubble-sort algorithm makes several passes through the array. 
 * On each pass, successive neighboring pairs are compared. 
 * If a pair is not in order, its values are swapped; otherwise, the values remain unchanged. 
 * The technique is called bubble-sort or sinking sort because the larger values gradually “bubble” 
 * their way to the top and the smaller values “sink” to the bottom. 
 * Write also a test program that reads in ten numbers, invokes the method, and displays the sorted numbers.
 * 
 * @author Hamzat Olowu
 * <ul><li>Created On 10/08/2021
 */
public class Problem2 {
    public static void main(String[] args) {
        int [] test = new int [10];  // initialize the array

        Scanner input = new Scanner(System.in); // input stream
        for (int i = 0; i < test.length; i++){
            // use user input to populate the array
            System.out.print("Enter Number: ");
            test[i] = input.nextInt();
        }

        System.out.println(Arrays.toString(bubbleSort(test)));
    }

    /**
     * sorts an array using bubble-sort algorithm
     * 
     * @param arr
     * @return sorted {@code arr}  
     */
    public static int [] bubbleSort(int [] arr) {
        int i = 1, hold; boolean check = false;

        while (i < arr.length && check == false){
            check = true;
            for (int j = 0; j < arr.length - i; j++){
                if (arr[j] > arr[j+1]){
                    hold = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = hold;
                    check = false;
                }
            }
            i++;
        }
        return arr;
    }

}
