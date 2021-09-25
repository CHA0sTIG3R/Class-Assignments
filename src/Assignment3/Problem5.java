package Assignment3;


import java.util.*;

/**
 * (Count occurrence of numbers) Write a program that reads integers
 * between 1 and 100 and counts the occurrence of each (you should store the numbers in an array). 
 * <p>Output should be in ascending order. Assume the input ends when the user enters a 0.
 * @author Hamzat Olowu
 * <ul><li>Created On 09/24/2021
 */
public class Problem5 {
    public static void main(String[] args) {
        int num, count = 0;
        // declare the arrays
        int[] arr = new int[100];
        int[] unq = new int[100];

        Scanner input = new Scanner(System.in); // instantiate input Source

        while (true){ // continues the loop unless i break from inside
            System.out.print("Enter a number between 1 and 100 (enter 0 to stop): ");
            num = input.nextInt(); // assigns input to num
            count++;
            // append num to both arrays
            arr[count] = num; 
            
            unq[count] = num; 

            // end loop condition
            if (num == 0){
                break;
            }
        }

        numCount(arr, unq); // invoke the method
    }

    /**
     * Iterates on {@code arr} and {@code unq} to check the repeating elements and how many times it's repeating<p>
     * It alse uses a Treemap to check its occurrence number and sort the array in ascending order.
     * @param arr
     * @param unq
     */
    public static void numCount(int[] arr, int[] unq) {
        
        TreeMap<Integer, Integer> mydict = new TreeMap<>(); // a map declaration
        for (int i = 0; i < unq.length; i++){ // iterate through the first array
            mydict.put(unq[i], 0); // putting every element in unq array into the map and setting its values to 0
            for (int j = 0; j < arr.length; j++){ // iterate the second array
                if (unq[i] == arr[j]){ // check if unq elements occurs in arr
                    mydict.replace(unq[i], mydict.get(unq[i]) + 1); // adds 1 to the value every time it finds the same elements in arr.
                }
            }
        }
        mydict.remove(0); // removes 0 from the map

        for (int num : mydict.keySet()) { // iterate through the map using the keys
            
            int cnt = mydict.get(num); // find the values using the key

            System.out.print(num +" occurs " + cnt); // print out the key and values(number times the keys occurred in the array) 
            if (cnt == 1){ // singular if the value is 1 and plural otherwise.
                System.out.println(" time");
            }
            else{
                System.out.println(" times");
            }
        }
        
    }
}
