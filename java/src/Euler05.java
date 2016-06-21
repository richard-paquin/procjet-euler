
public class Euler05 {

    public static void exec() {
        /*
        2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
        What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
         */

        int i = 1;
        int maxF = 20;
        while (true) {
            boolean found = false;
            for (int f = 1; f <= maxF; f++) {
                if (i % f != 0) {
                    break;
                }
                if (f == maxF) {
                    found = true;
                }
            }
            if (found) {
                break;
            }
            i++;
        }
        System.out.println(i);
    }
}
