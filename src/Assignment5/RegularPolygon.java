package Assignment5;

/**
 * @author Hamzat Olowu
 * <ul><li>Created On 10/15/2021
 */
public class RegularPolygon {
    private int n;
    private double side;
    private double x;
    private double y;

    /**
     * Use when none of the field values are available<p>
     * Sets default values {@code 3}, {@code 1}, {@code 0} and {@code 0}to {@code n}, {@code side}, {@code x} and {@code y} respectively
     */
    public RegularPolygon(){
        this.n = 3;
        this.side = 1;
        this.x = 0;
        this.y = 0;
    }

    /**
     * Use when number of sides and sidelength are known<p>
     * Sets default value {@code 0} to {@code x}- and {@code y}- coordinates
     * @param n
     * @param side
     */
    public RegularPolygon(int n, double side){
        this.n = n;
        this.side = side;
        this.x = 0;
        this.y = 0;
    }

    /**
     * Use if values for all fields are available
     * @param n
     * @param side
     * @param x
     * @param y
     */
    public RegularPolygon(int n, double side, double x, double y){
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    /**
     * Sets the number of sides using the argument {@code n}
     * @param n
     */
    public void setSide(int n){
        this.n = n;
    }

    /**
     * Sets the length of the sides using the argument {@code side}
     * @param side
     */
    public void setSideLength(double side){
        this.side = side;
    }

    /**
     * Sets the {@code x}- and {@code y}- coordinates of the Polygon center 
     * @param x
     * @param y
     */
    public void setCoordinates(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Gets the number of sides
     * @return {@code n}
     */
    public int getSide(){
        return this.n;
    }

    /**
     * Gets the length of the sides
     * @return {@code side}
     */
    public double getSideLength(){
        return this.side;
    }

    /**
     * Gets the value of x-coordinate
     * @return {@code x}
     */
    public double getXCoord(){
        return this.x;
    }

    /**
     * Gets the value of y-coordinate
     * @return {@code y}
     */
    public double getYCoord(){
        return this.y;
    }

    /**
     * Calculates the Perimeter of the Polygon Object
     * @return a {@code double} value
     */
    public double getPerimeter() {
        return this.n *this.side;
    }

    /**
     * Calculates the Area of the Polygon Object
     * @return a {@code double} value 
     */
    public double getArea() {
        return (this.n*Math.pow(this.side, 2))/(4* Math.tan(Math.PI/this.n));
    }
}
