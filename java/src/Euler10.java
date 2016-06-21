
public class Euler10 {

    public static void exec() {
        /*
        The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
        Find the sum of all the primes below two million.
         */
        int max_number = 2000000;
        int max_primes = max_number / 10;
        int[] primes = new int[max_primes]; // not optimal
        primes[0] = 2;
        primes[1] = 3;
        int primeIndex = 2;
        // 1st find all primes below max_number
        for (int i = 5; i < max_number; i += 2) {
            boolean isPrime = true;
            for (int j = 0; primes[j] <= Math.sqrt(i); j++) {
                if (i % primes[j] == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primes[primeIndex++] = i;
            }
        }
        long sum = 0;
        for (int i = 0; i < primeIndex; i++) {
            sum += primes[i];
        }

        System.out.println(sum);
    }
}
