
import java.math.*;

public class Euler25 {

    public static void exec() {

        BigInteger prevBig = new BigInteger("1");
        BigInteger curBig = new BigInteger("1");
        long curIndex = 2;

        while (true) {
            BigInteger sum = prevBig.add(curBig);
            prevBig = curBig;
            curBig = sum;
            curIndex++;
            if (curBig.toString().length() >= 1000) {
                break;
            }
        }

        System.out.println(curBig);
        System.out.println(curIndex);

    }

}
