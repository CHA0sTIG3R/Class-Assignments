package Assignment3;

import java.util.*;

public class Problem6 {
    public static void main(String[] args) {
        int num, cnt = 0;
        int[] arr = new int[10];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 10; i++){
            System.out.print("Enter a number: ");
            num = input.nextInt();
            if (isUnique(arr, num)){
                arr[i] = num;
                cnt++;
            }
        }

        System.out.println("The distinct numbers are "+cnt+" in total.");
        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > 0){
                System.out.print(arr[i]+" ");
            }
        }
    }

    public static boolean isUnique(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
			if (num == arr[i]){
				return false;
            }
    }
		return true;
    }
}
