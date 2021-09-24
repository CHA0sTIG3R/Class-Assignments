package Assignment3;
import Assignment1.*;

public class Triangle {
    double s1, s2, s3;

    public Triangle(double s1, double s2, double s3){
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }
    /**
     * Uses the {@code distance()} from {@linkplain problem1} to calculate the sides of the triangle
     * and assigns them to the class variables {@code s1}, {@code s2} and {@code s3}
     * 
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     * @param x3
     * @param y3
     */
    public void distPoints(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.s1 = problem1.distance(x1, y1, x2, y2);
        this.s2 = problem1.distance(x2, y2, x3, y3);
        this.s3 = problem1.distance(x3, y3, x1, y1);
    }

    public boolean isValid(double s1, double s2, double s3) {
        // check if a + b > c
        if ((s1 + s2 > s3) && (s2 + s3 > s1) && (s3 + s1 > s2)){
            // returns true if true
            return true;
        }
        else{
            // returns false otherwise
            return false;
        }
    }
    
    /**
     * Returns the perimeter of a triangle
     * 
     * @param s1
     * @param s2
     * @param s3
     * @return {@code s1} + {@code s2} + {@code s3}
     */
    public double perimeter(double s1, double s2, double s3) {
        return s1+s2+s3;
    }

    /**
     * Returns the area of a triangle
     * 
     * @param s1
     * @param s2
     * @param s3
     * @return √({@code s}*({@code s}- {@code s1})*({@code s}-{@code s2})*({@code s}-{@code s3}))
     */
    public double area(double s1, double s2, double s3) {
        double s = (s1 + s2 + s3)/2;
        return Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
    }
}
