package Assignment2;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        String city1, city2, city3;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter First City: ");
        city1 = input.nextLine();
        System.out.println("Second City: ");
        city2 = input.nextLine();
        System.out.println("Third City: ");
        city3 = input.nextLine();

        String output = "3 cities in alphabetical order: ";

        if (city1.compareToIgnoreCase(city2) < 0 && city1.compareToIgnoreCase(city3) < 0){
            if (city2.compareToIgnoreCase(city3) < 0){
                System.out.println(output + city1 + " " + city2 + " " + city3);
            }
            else{
                System.out.println(output + city1 + " " + city3 + " " + city2);
            }
        }
        else if (city2.compareToIgnoreCase(city1) < 0 && city2.compareToIgnoreCase(city3) < 0){
            if (city3.compareToIgnoreCase(city1) < 0){
                System.out.println(output + city2 + " " + city3 + " " + city1);
            }
            else{
                System.out.println(output + city2 + " " + city1 + " " + city3);
            }
        }
        else{
            if (city1.compareToIgnoreCase(city2) < 0){
                System.out.println(output + city3 + " " + city1 + " " + city2);
            }
            else{
                System.out.println(output + city3 + " " + city2 + " " + city1);
            }
        }
    }
}
