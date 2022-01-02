package Assignment6;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Problem4 {
    public static void main(String[] args) {
		System.out.println("\n The e values for i = 100 to 1000:");
		System.out.println(" i                e");
		for (BigDecimal i = new BigDecimal("100"); 
			i.compareTo(new BigDecimal("1000")) <= 0; 
			i = i.add(new BigDecimal("100"))) {
			System.out.println(i + "     " + e(i));
		}
	}

    public static BigDecimal e(BigDecimal num) {
		BigDecimal one = new BigDecimal("1");
		BigDecimal e = new BigDecimal("0.0");
		for (BigDecimal i = one; i.compareTo(num) <= 0; i = i.add(one)) {
			BigDecimal denom = i;
			for (BigDecimal j = i.subtract(one); 
				j.compareTo(one) >= 1; 
				j = j.subtract(one)) {
				denom = denom.multiply(j);
			}
			// Use 25 digits of precision
			e = e.add(one.divide(denom, 25, RoundingMode.UP));  
		}
		return e;
	}
}
