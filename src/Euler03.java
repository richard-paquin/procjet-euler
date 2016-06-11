
public class Euler03 {

    public static void exec() {
        /*
        The prime factors of 13195 are 5, 7, 13 and 29.
        What is the largest prime factor of the number 600851475143 ?
         */

        long v = 600851475143L;
        double s = Math.sqrt(v);
        long i = 2;
        while (i < Math.sqrt(v)) {
            if (v % i == 0) {
                v = v / i;
                System.out.println("v: " + v + " sqrt: " + Math.sqrt(v));

            } else {
                i++;
            }

        }

        System.out.println(v);

    }

}
