
import java.util.*;

public class Euler23 {

    public static boolean isAbundant(int value) {
        assert value > 1;
        int s = (int) Math.sqrt(value);
        int sum = 1;
        for (int i = 2; i <= s; i++) {
            if (value % i != 0) {
                continue;
            }
            sum += i + value / i;
        }
        if (s * s == value) {
            sum -= s;
        }
        if (sum > value) {
            return true;
        }
        return false;
    }

    public static void exec() {
        TreeSet<Integer> abundants = new TreeSet<>();
        for (int i = 10; i <= 28123; i++) {
            if (isAbundant(i)) {
                abundants.add(i);
            }
        }
        long sumOfAllPositiveIntegers = 0;
        for (int i = 1; i <= 28123; i++) {
            System.out.println(i);
            boolean sumOfTwoAbundants = false;
            int j = 0;
            for (int a : abundants) {
                if (a > i / 2) {
                    break;
                }
                //int a = abundants.get(j);
                int leaves = i - a;
                if (abundants.contains(leaves)) {
                    sumOfTwoAbundants = true;
                    break;
                }
                j++;
            }
            if (!sumOfTwoAbundants) {
                sumOfAllPositiveIntegers += i;
            }
        }
        System.out.println(sumOfAllPositiveIntegers);
    }
}
