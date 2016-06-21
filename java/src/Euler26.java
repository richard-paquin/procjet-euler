
import java.util.TreeSet;

public class Euler26 {

    static boolean isPrime(int value) {
        int s = (int) Math.sqrt(value);
        for (int i = 2; i <= s; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int calc_exp(int b, int e, int mod) {
        // c ≡ 4^13 mod 497
        int a = 1;
        int rem = 1;
        while (e-- > 0) {
            rem = (a * b) % mod;
            a = rem;
        }
        return rem;
    }

    public static int calc_(int prime) {
        int rem = 10 % prime;
        int count = 1;
        while (rem != 1) {
            rem = (10 * rem) % prime;
            count++;
        }
        return count;
    }

    public static void exec() {
        TreeSet<Integer> primes = new TreeSet<>();
        for (int i = 2; i < 1000; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        int max = 0;
        for (Integer prime : primes) {
            if (prime == 2 || prime == 5) {
                continue;
            }
            int calc = calc_(prime);
            if (calc > max) {
                max = calc;
                System.out.println(prime + " " + max);
            }
        }
    }
}
