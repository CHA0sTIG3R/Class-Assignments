package Assignment5;

/**
 * @author Hamzat Olowu
 * <ul><li>Created On 10/15/2021
 */
public class LinearEquation {
    private double a,b,c,d,e,f;

    /**
     * Sets the fields to the arguments values
     * @param a
     * @param b
     * @param c
     * @param d
     * @param e
     * @param f
     */
    public LinearEquation(double a, double b, double c, double d, double e, double f){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    /**
     * Gets the value of field {@code a}
     * @return {@code a}
     */
    public double getA() {
        return this.a;
    }

    /**
     * Gets the value of field {@code b}
     * @return {@code b}
     */
    public double getB() {
        return this.b;
    }

    /**
     * Gets the value of field {@code c}
     * @return {@code c}
     */
    public double getC() {
        return this.c;
    }

    /**
     * Gets the value of field {@code d}
     * @return {@code d}
     */
    public double getD() {
        return this.d;
    }

    /**
     * Gets the value of field {@code e}
     * @return {@code e}
     */
    public double getE() {
        return this.e;
    }

    /**
     * Gets the value of field {@code f}
     * @return {@code f}
     */
    public double getF(){
        return this.f;
    }

    /**
     * Checks if equation is solvable
     * @return {@code true} or {@code false}
     */
    public boolean isSolvable() {
        return (this.a * this.d) - (this.b * this.c) != 0;
    }

    /**
     * Calculates the value of x
     * @return {@code (ed – bf) / (ad – bc)}
     */
    public double getX() {
        return ((this.e*this.d) - (this.b*this.f))/((this.a * this.d) - (this.b * this.c)); 
    }

    /**
     * Calculates the value of y
     * @return {@code (af – ec) / (ad – bc)}
     */
    public double getY(){
        return ((this.a*this.f) - (this.e*this.c))/((this.a * this.d) - (this.b * this.c));
    }
}
