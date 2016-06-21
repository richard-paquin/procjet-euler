
import java.math.*;

public class Euler20 {

    public static void exec() {
        BigInteger big = new BigInteger("1");
        for (Integer i = 1; i <= 100; i++) {
            big = big.multiply(new BigInteger(i.toString()));
        }
        int total = 0;
        for (char c : big.toString().toCharArray()) {
            total += c - '0';
        }
        System.out.println(big);
        System.out.println(total);
    }
}
