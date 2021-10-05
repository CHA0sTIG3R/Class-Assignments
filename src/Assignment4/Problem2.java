package Assignment4;

import java.util.*;

public class Problem2 {
    public static void main(String[] args) {
        int [] test = new int [10];

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < test.length; i++){
            System.out.print("Enter Number: ");
            test[i] = input.nextInt();
        }

        System.out.println(Arrays.toString(bubbleSort(test)));
    }

    
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
