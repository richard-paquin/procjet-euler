
public class Euler06 {

    public static void exec() {
        /*
        The sum of the squares of the first ten natural numbers is,
        1^2 + 2^2 + ... + 10^2 = 385
        The square of the sum of the first ten natural numbers is,
        (1 + 2 + ... + 10)^2 = 552 = 3025
        Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
        Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
         */

        long sumOfSquares = 0;
        long sum = 0;
        for (int i = 100; i > 0; i--) {
            sumOfSquares += i * i;
            sum += i;
        }

        long squareOfSum = sum * sum;
        System.out.println(squareOfSum - sumOfSquares);

    }

}
