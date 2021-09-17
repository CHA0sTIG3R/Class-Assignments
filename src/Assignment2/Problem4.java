package Assignment2;

/**
 * (Display leap years) Write a program that displays all the leap years,
 * ten per line (separated by one space), from 101 to 2100, 
 * Also display the number of leap years in this period.<p>
 * 
 * @author Hamzat Olowu
 * <ul><li>Created On 09/16/2021
 */
public class Problem4 {
    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        int count = 0; // initialize a counter variable
        for(int i = 101; i <= 2100; i++){ // set for loop to start at 101 and end at 2100(inclusive)
            if (Problem1.isLeapYear(i)){
                // if its a leap year increment counter
                count++;
                // use print instead of println in order to print 10 results on the same line
                if (count % 10 != 0){
                    System.out.print(i + " ");
                }
                else{
                    System.out.print(i + "\n");
                }
            }
        }

        // print out the counter.
        System.out.println("\n"+ "The number of leap years between 101 to 2100 is a total of " + count);
    }
}
