package Assignment2;

public class Problem4 {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 101; i < 2100; i++){
            if (Problem1.isLeapYear(i)){
                count++;
                if (count % 10 != 0){
                    System.out.print(i + " ");
                }
                else{
                    System.out.print(i + "\n");
                }
            }
        }

        System.out.println("\n"+ "The number of leap years between 101 to 2100 is a total of " + count);
    }
}
