package Assignment4;

import java.util.*;

/**
 * (Sort students) Write a program that prompts the user to enter the number of students to be processed, 
 * the students’ names, and their scores, and prints the student names in decreasing order of their scores.
 * 
 * @author Hamzat Olowu
 * <ul><li>Created On 10/08/2021
 */
public class Problem1 {
    public static void main(String[] args) {
        // declare variable
       String studentName; int studentScore, studentNum;
       int [] score; String [] name;


       Scanner input = new Scanner(System.in);
       System.out.print("Enter Student's Quantity: "); // get student amount input
       studentNum = input.nextInt();

       // initialize arrays with input
       score = new int [studentNum];
       name = new String [studentNum];

       for(int i = 0; i < studentNum; i++){
           System.out.print("Enter Student's Name: ");
           studentName = input.next(); // assign input to studentName
           System.out.print("Enter Student's Score: ");
           studentScore = input.nextInt(); // assign int input to score

           //append to the name and scores to the arrays
           name[i] = studentName;
           score[i] = studentScore;
       }

       // call sortStudents() and print to the console
       sortStudents(name, score); 
       for (int i = 0; i < name.length; i++){
           System.out.println(name[i]+" --> "+score[i]);
       }
    }

    /**
     * Sorts the arrays {@code name} and {@code score} in descending order.
     * @param name
     * @param score
     */
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
