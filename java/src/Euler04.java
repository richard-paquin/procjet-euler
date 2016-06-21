
public class Euler04 {

    public static boolean isPalindrome(int n) {
        String s1 = new StringBuilder(Integer.toString(n)).reverse().toString();
        String s2 = Integer.toString(n);
        return s1.compareTo(s2) == 0;
    }

    public static void exec() {
        /*
        A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
        Find the largest palindrome made from the product of two 3-digit numbers.
         */

        int maxN = 0;
        for (int i = 999; i > 99; i--) {
            for (int j = 999; j > 99; j--) {
                int n = i * j;
                if (n < maxN) {
                    continue;
                }
                if (isPalindrome(n)) {
                    maxN = n;
                }
            }
        }

        System.out.println(maxN);
    }
}
