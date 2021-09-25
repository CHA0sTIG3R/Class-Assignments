package Assignment3;


import java.util.*;


public class Problem5 {
    public static void main(String[] args) {
        int num, count = 0;
        int[] arr = new int[100];
        int[] unq = new int[100];

        Scanner input = new Scanner(System.in);

        while (true){
            System.out.print("Enter a number between 1 and 100 (enter 0 to stop): ");
            num = input.nextInt();
            count++;
            arr[count] = num;
            
            unq[count] = num;

            if (num == 0){
                break;
            }
        }

        numCount(arr, unq);
    }

    public static void numCount(int[] arr, int[] unq) {
        
        TreeMap<Integer, Integer> mydict = new TreeMap<>();
        for (int i = 0; i < unq.length; i++){
            mydict.put(unq[i], 0);
            for (int j = 0; j < arr.length; j++){
                if (unq[i] == arr[j]){
                    mydict.replace(unq[i], mydict.get(unq[i]) + 1);
                }
            }
        }
        mydict.remove(0);

        for (int num : mydict.keySet()) {
            
            int cnt = mydict.get(num);

            System.out.print(num +" occurs " + cnt);
            if (cnt == 1){
                System.out.println(" time");
            }
            else{
                System.out.println(" times");
            }
        }
        
    }
}
