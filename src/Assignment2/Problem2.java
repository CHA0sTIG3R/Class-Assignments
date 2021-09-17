package Assignment2;

import java.util.Scanner;
/**
 * Write a program that prompts the user to enter three cities 
 * and displays them in ascending (alphabetical) order.
 * 
 * @author Hamzat Olowu
 * <ul><li>Created On 09/15/2021
 */
public class Problem2 {
    public static void main(String[] args) {
        String city1, city2, city3;

        // assign user inputs to city1, 2 and 3.
        Scanner input = new Scanner(System.in); // user input resource declaration
        System.out.println("Enter First City: ");
        city1 = input.nextLine();
        System.out.println("Second City: ");
        city2 = input.nextLine();
        System.out.println("Third City: ");
        city3 = input.nextLine();

        // declare default output 
        String output = "3 cities in alphabetical order: ";

        // checks if city1 is the 1st alphabetically
        if (city1.compareToIgnoreCase(city2) < 0 && city1.compareToIgnoreCase(city3) < 0){
            // if true, check the city that comes second by comparing the remaining 2 cities
            if (city2.compareToIgnoreCase(city3) < 0){
                System.out.println(output + city1 + " " + city2 + " " + city3);
            }
            else{
                System.out.println(output + city1 + " " + city3 + " " + city2);
            }
        }
        // same process to check for city 2
        else if (city2.compareToIgnoreCase(city1) < 0 && city2.compareToIgnoreCase(city3) < 0){
            // comparison between the 2 remaining cities
            if (city3.compareToIgnoreCase(city1) < 0){
                System.out.println(output + city2 + " " + city3 + " " + city1);
            }
            else{
                System.out.println(output + city2 + " " + city1 + " " + city3);
            }
        }
        // if the above condition is not met then city3 is automatically first 
        else{
            // comparison between the 2 remaining cities
            if (city1.compareToIgnoreCase(city2) < 0){
                System.out.println(output + city3 + " " + city1 + " " + city2);
            }
            else{
                System.out.println(output + city3 + " " + city2 + " " + city1);
            }
        }
    }
}
