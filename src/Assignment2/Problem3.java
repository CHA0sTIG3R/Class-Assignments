package Assignment2;

/**
 * (Compute π) You can approximate π by using the following series:
 * <p>π=4 (1-(1/3)+(1/5)-(1/7)+(1/9)-(1/11)+⋯+ (-1)^(i+1)/(2i-1))
 * <p> Write a program that displays the π value for i = 10000, 20000, …, and 100000
 *  using a repetition loop.
 * @author Hamzat Olowu
 * <ul><li>Created On 09/15/2021
 */
public class Problem3 {
    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        
        System.out.println("The π symbol for 10,000: " +(4*pi(10000)));
        System.out.println("The π symbol for 20,000: " +(4*pi(20000)));
        System.out.println("The π symbol for 100,000: " +(4*pi(100000)));
    }

    // /**
    //  * Calculates the value for π
    //  * 
    //  * <p> Recursion approach
    //  * 
    //  * <p> Not recomended for numbers greater 20,000,
    //  *  since it will throw {@code java.lang.StackOverflowError}
    //  * 
    //  * @param n
    //  * @return {@code Math.pow(-1, n+1.0)/((2*n) - 1)} + {@code pi(n-1)}
    //  */
    // public static double pi(int n) {
    //     if (n == 1){
    //         return 1;
    //     }
    //     return (Math.pow(-1, n+1.0))/((2*n) - 1) + pi(n-1);

    // }

    /**
     * Calculates the value for π
     * 
     * @param n
     * @return the value for π
     */
    public static double pi(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++){
            // adds the results of calculating the values of i to sum
            sum += Math.pow(-1, i+1)/((2*i) - 1);
        }

        return sum;
    }
}
