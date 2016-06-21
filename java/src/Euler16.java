
import java.math.*;

public class Euler16 {
    public static BigInteger bigPow(BigInteger base, BigInteger exponent) {
        BigInteger result = BigInteger.ONE;
        while (exponent.signum() > 0) {
            if (exponent.testBit(0)) {
                result = result.multiply(base);
            }
            base = base.multiply(base);
            exponent = exponent.shiftRight(1);
        }
        return result;
    }
    
    public static void exec() {
        
        // Method 1
        BigInteger big = new BigInteger("2").pow(1000);               
        String str = big.toString();
        int retval = 0;
        for (int i = 0; i < str.length(); i++) {
            retval += str.charAt(i) - '0';
        }        
        System.out.println(retval);
        
        // Method 2
        BigInteger big2 = bigPow(BigInteger.valueOf(2), BigInteger.valueOf(1000)) ;
        int retval2 = 0;
        while (big2.compareTo(BigInteger.ZERO) == 1) {
            retval2 += big2.mod(new BigInteger("10")).intValue();
            big2 = big2.divide(new BigInteger("10"));
            
        }
        System.out.println(retval2);
    }
}
