package Assignment5;

public class Problem2 {
    public static void main(String[] args) {
        RegularPolygon tri = new RegularPolygon();
        RegularPolygon hex = new RegularPolygon(6, 4);
        RegularPolygon deca = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println("A Polygon with 3 sides with 1 sidelength has an area of: "+tri.getArea()+" with perimeter of: "+tri.getPerimeter());
        System.out.println("A Polygon with 6 sides with 4 sidelength has an area of: "+hex.getArea()+" and it's perimeter is: "+hex.getPerimeter());
        System.out.println("A Polygon with 10 sides with 4 sidelength has an area of: "+deca.getArea()+" with it's perimeter being: "+deca.getPerimeter());
    }
}
