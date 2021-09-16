package Assignment2;

public class Problem5 {
    public static void main(String[] args) {
        
        for (int x = 1; x <= 10000; x++){
            if (perfectNumber(x)){
                System.out.println(x);
            }
        }
    }

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
