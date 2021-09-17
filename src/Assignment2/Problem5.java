package Assignment2;

/**
 * (Perfect number) A positive integer is called a perfect number if it is equal
 *  to the sum of all of its positive divisors, excluding itself.<p>
 * For example, 6 is the first perfect number because 6 = 3 + 2 + 1. 
 * The next is 28 = 14 + 7 + 4 + 2 + 1.<p>
 * There are four perfect numbers less than 10,000. 
 * Write a program to find all these four numbers. 
 * @author Hamzat Olowu
 * <ul><li>Created On 09/16/2021
 */
public class Problem5 {
    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        
        for (int x = 1; x <= 10000; x++){ // checks for perfect number from 1 to 10,000
            if (perfectNumber(x)){
                System.out.println(x); // and prints it out to the console.
            }
        }
    }

    /**
     * Checks if a number is a perfect number.
     * 
     * @param n
     * @return {@code true} or {@code false} if {@code n} is a perfect number
     */
    public static boolean perfectNumber(int n) {
        int sum = 0;

        for (int i = 1; i < n; i++){
            if (n % i == 0){
                sum += i;
            }
        }
        return sum == n;
    }
}
