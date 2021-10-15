package Assignment5;

public class RegularPolygon {
    private int n;
    private double side;
    private double x;
    private double y;

    public RegularPolygon(){
        this.n = 3;
        this.side = 1;
        this.x = 0;
        this.y = 0;
    }

    public RegularPolygon(int n, double side){
        this.n = n;
        this.side = side;
        this.x = 0;
        this.y = 0;
    }

    public RegularPolygon(int n, double side, double x, double y){
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public void setSide(int n){
        this.n = n;
    }

    public void setSideLength(double side){
        this.side = side;
    }

    public void setCoordinates(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public int getSide(){
        return this.n;
    }

    public double getSideLength(){
        return this.side;
    }

    public double getXCoord(){
        return this.x;
    }

    public double getYCoord(){
        return this.y;
    }

    public double getPerimeter() {
        return this.n *this.side;
    }

    public double getArea() {
        return (this.n*Math.pow(this.side, 2))/(4* Math.tan(Math.PI/this.n));
    }
}
