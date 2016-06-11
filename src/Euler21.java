
public class Euler21 {

    public static int SumOfAllDivisors(int x) {
        assert x > 1;
        int s = (int) Math.sqrt(x);
        int sum = 1;
        for (int i = 2; i < s; i++) {
            if (x % i != 0) {
                continue;
            }
            sum += i + x / i;
        }
        if (s * s == x) {
            sum += s;
        }
        return sum;
    }

    public static void exec() {
        int amicableNumbersSum = 0;
        for (int i = 2; i < 10000; i++) {
            int sum = SumOfAllDivisors(i);
            if (sum == 1 || sum == i) {
                continue;
            }
            if (SumOfAllDivisors(sum) == i) {
                amicableNumbersSum += i;
            }
        }
        System.out.println(amicableNumbersSum);
    }
}
