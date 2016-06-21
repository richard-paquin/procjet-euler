
import java.util.*;

public class Euler15 {

    public static class OrderedTuple {

        public final long x;
        public final long y;

        public OrderedTuple(long x, long y) {
            if (x > y) {
                this.x = x;
                this.y = y;
            } else {
                this.x = y;
                this.y = x;
            }
        }

        @Override
        public boolean equals(Object other) {
            boolean result;
            if ((other == null) || (getClass() != other.getClass())) {
                result = false;
            } // end if
            else {
                OrderedTuple o = (OrderedTuple) other;
                result = this.x == o.x && this.y == o.y;
            } // end else
            return result;
        } // end equals

        @Override
        public int hashCode() {
            int hash = 7;
            hash = 97 * hash + (int) (this.x ^ (this.x >>> 32));
            hash = 97 * hash + (int) (this.y ^ (this.y >>> 32));
            return hash;
        }
    }

    public static HashMap<OrderedTuple, Long> calculated = new HashMap<>();

    public static long calc_test(long x, long y) {
        if (x == 1) {
            return y + 1;
        }
        if (y == 1) {
            return x + 1;
        }
        OrderedTuple o = new OrderedTuple(x, y);
        if (calculated.containsKey(o)) {
            return calculated.get(o);
        }

        long calc = calc_test(x - 1, y) + calc_test(x, y - 1);
        calculated.put(o, calc);
        return calc;
    }

    public static long calc_square(long n) {
        return calc_test(n, n);
    }

    public static void exec() {

        long x = calc_square(20);
        System.out.println(x);
    }

}
