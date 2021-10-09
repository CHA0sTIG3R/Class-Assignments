package Assignment4;

import java.util.Scanner;

import Assignment1.*;

/**
 * (Central city) Given a set of cities, the central city is the city that has the shortest distance to all other cities. 
 * Write a program that prompts the user to enter the number of cities and the locations of the cities (the coordinates are two decimal numbers),
 * and finds the central city and its total distance to all other cities.
 * 
 * @author Hamzat Olowu
 * <ul><li>Created On 10/08/2021
 */
public class Problem4 {
    public static void main(String[] args) {
        double [] [] coord; 
        Scanner input = new Scanner(System.in); // input stream

        System.out.print("Enter number of cities: ");
        coord = new double[input.nextInt()][3]; // initialize array using user input

        for (int i = 0; i < coord.length; i++){
            System.out.print("Enter city "+ (i+1) +" Coordinates: ");
            for (int j = 0; j < coord[0].length-1; j++){
                coord[i][j] = input.nextDouble(); // use user input to populate the array
            }
        }

        double [] central = getCentral(coord); //invoke and assign getCentral to a variable

        // print to the console
        System.out.println("The central city is at coordinates ("+central[0]+", "+central[1]+")");
        System.out.println("With its total distance to other cities being " + central[2]);
    }

    /**
     * calculates the cities distances to find the central city
     * 
     * @param arr
     * @return an array containing the coordinates of the central city and the total distance
     */
    public static double [] getCentral(double [] [] arr) {
        double [] larr;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                if (i != j){
                    arr[i][2] += problem1.distance(arr[i][0], arr[i][1], arr[j][0], arr[j][1]);
                }
              }
        }
        larr = arr[0];
        for (int i= 0; i < arr.length; i++){
            if (larr[2] < arr[i][2]){
                larr = arr[i];
            }
        }

        return larr;
    }
}
