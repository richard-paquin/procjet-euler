
public class Euler09 {

    public static void exec() {
        /*
        A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
        a2 + b2 = c2
        For example, 32 + 42 = 9 + 16 = 25 = 52.
        There exists exactly one Pythagorean triplet for which a + b + c = 1000.
        Find the product abc.
         */

        for (int a = 1; a < 1000; a++) {
            for (int b = a; b < 1000; b++) {
                for (int c = b; c < 1000; c++) {
                    if (a + b + c != 1000) {
                        continue;
                    }
                    if (a * a + b * b != c * c) {
                        continue;
                    }
                    System.out.println("a: " + a);
                    System.out.println("b: " + b);
                    System.out.println("c: " + c);

                    System.out.println("prod: " + a * b * c);
                }
            }
        }
    }

}
