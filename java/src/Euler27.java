
import static java.lang.Math.sqrt;
import java.util.TreeSet;

public class Euler27 {

    public static TreeSet<Long> primes = new TreeSet<>();
    public static Long maxVerifiedValue = 1L;

    public static boolean isPrime(Long value) {
        if (value < 2) {
            return false;
        }
        if (value % 2 == 0 && value != 2) {
            return false;
        }
        if (value > maxVerifiedValue) {
            updatePrimeList(value);
        }
        return primes.contains(value);
    }

    private static void updatePrimeList(Long value) {
        if (primes.isEmpty()) {
            primes.add((2L));
            primes.add((3L));
            maxVerifiedValue = 3L;
        }
        for (Long i = maxVerifiedValue + 2; i <= value; i += 2) {
            boolean isPrime = true;
            int s = (int) sqrt(i);
            for (Long prime : primes) {
                if (i % prime == 0) {
                    isPrime = false;
                    break;
                }
                if (prime > s) {
                    break;
                }
            }
            if (isPrime) {
                primes.add(i);
            }
        }
        maxVerifiedValue = value;
    }

    public static void exec() {
        long max_n = 0;
        for (long a = -999; a < 1000; a++) {
            for (long b = -999; b < 1000; b++) {
                if (a == 1 && b == 41) {
                    System.out.println("here");
                }
                long n = 0;
                while (true) {
                    long calc = n * n + n * a + b;
                    if (!isPrime(calc)) {
                        break;
                    }
                    n++;
                }
                n--;
                if (n > max_n) {
                    long calc = n * n + n * a + b;
                    max_n = n;
                    System.out.print("(" + a * b + ") ");
                    System.out.print(n + "^2 + ");
                    System.out.print(n + "*" + a + " + ");
                    System.out.print(b + " = ");
                    System.out.println(calc);
                }
            }
        }
    }
}
