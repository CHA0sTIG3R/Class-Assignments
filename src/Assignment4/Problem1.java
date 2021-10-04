package Assignment4;

import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
       String studentName; int studentScore, studentNum;
       int [] score; String [] name;
       //HashMap<String, Integer> studentRecords = new HashMap<>();


       Scanner input = new Scanner(System.in);
       System.out.print("Enter Student's Quantity: ");
       studentNum = input.nextInt();
       score = new int [studentNum];
       name = new String [studentNum];

       for(int i = 0; i < studentNum; i++){
           System.out.print("Enter Student's Name: ");
           studentName = input.next();
           System.out.print("Enter Student's Score: ");
           studentScore = input.nextInt();

           name[i] = studentName;
           score[i] = studentScore;
       }
       
       sortStudents(name, score);
       for (int i = 0; i < name.length; i++){
           System.out.println(name[i]+" --> "+score[i]);
       }
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

    public static void sortStudents(String [] name, int [] score) {
        int i = 1, hold; String hold1; boolean check = false;

        while (i < score.length && check == false){
            check = true;
            for (int j = 0; j < score.length - i; j++){
                if (score[j] < score[j+1]){
                    hold = score[j];
                    hold1 = name[j];
                    score[j] = score[j+1];
                    score[j+1] = hold;
                    name[j] = name[j+1];
                    name[j+1] = hold1;
                    check = false;
                }
            }
            i++;
        }
    }

}
