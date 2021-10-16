package Assignment5;

public class Location {
    public int row, column;
    public double maxValue;

    public Location(int row, int column, double maxValue){
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }

    public static Location locateLargest(double[][]arr) {
        int row = 0;
        int column = 0;
        double maxValue = arr[0][0];
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if (maxValue < arr[i][j]){
                    maxValue = arr[i][j];
                    row = i;
                    column = j;
                }
            }
        }
        return new Location(row,column,maxValue);
    }
}
