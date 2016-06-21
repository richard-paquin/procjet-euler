
public class Euler07 {

    public static void exec() {
        /*
        By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
        What is the 10 001st prime number?
         */

        int[] primes = new int[10002];

        primes[0] = 2;
        primes[1] = 3;
        int testInteger = 3;
        int currentIndex = 2;

        int desiredPrime = 10001;

        while (true) {
            testInteger += 2;
            boolean isPrime = true;
            for (int i = 0; primes[i] <= Math.sqrt(testInteger); i++) {
                if (testInteger % primes[i] != 0) {
                    continue;
                }
                isPrime = false;
                break;
            }
            // Add to prime table
            if (isPrime) {
                primes[currentIndex++] = testInteger;
            }

            // Break condition
            if (currentIndex == desiredPrime) {
                break;
            }
        }

        System.out.println(primes[currentIndex - 1]);
    }

}
