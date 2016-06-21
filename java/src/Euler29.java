
import java.util.*;
import java.math.*;

public class Euler29 {

    public static void exec() {
        TreeSet<BigInteger> tree = new TreeSet<>();
        int max_val = 100;

        for (Integer a = 2; a <= max_val; a++) {
            BigInteger ba = new BigInteger(a.toString());
            for (Integer b = 2; b <= max_val; b++) {
                tree.add(ba.pow(b));
            }
        }
//        for (BigInteger b : tree) {
//            System.out.println(b);
//        }
        System.out.println(tree.size());
    }
}
