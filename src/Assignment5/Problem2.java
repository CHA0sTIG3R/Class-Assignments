package Assignment5;

/**
 * Write a test program that creates three RegularPolygon objects,
 * created using a no-arg constructor, using RegularPolygon(6, 4),
 * and using RegularPolygon(10, 4, 5.6, 7.8). 
 * For each object display its perimeter and area.
 * @author Hamzat Olowu
 * <ul><li>Created On 10/15/2021
 */
public class Problem2 {
    public static void main(String[] args) {

        //instantiate class by creating objects
        RegularPolygon tri = new RegularPolygon(); 
        RegularPolygon hex = new RegularPolygon(6, 4); 
        RegularPolygon deca = new RegularPolygon(10, 4, 5.6, 7.8);

        // print out each objects information to the console
        System.out.println("A Polygon with 3 sides with 1 sidelength has an area of: "+tri.getArea()+" with perimeter of: "+tri.getPerimeter());
        System.out.println("A Polygon with 6 sides with 4 sidelength has an area of: "+hex.getArea()+" and it's perimeter is: "+hex.getPerimeter());
        System.out.println("A Polygon with 10 sides with 4 sidelength has an area of: "+deca.getArea()+" with it's perimeter being: "+deca.getPerimeter());
    }
}
