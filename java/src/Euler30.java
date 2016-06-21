
public class Euler30 {

    public static void exec() {
        // problem requirement -- initial condition
        int exp = 5;

        // find upper bound
        int digits = 0;
        while (true) {
            digits++;
            int min_in_range = (int) Math.pow(10, digits - 1);
            int max_value = (int) (digits * Math.pow(9, exp));
            if (min_in_range > max_value) // too big
            {
                break;
            }
        }

        int upperLimit = (int) (--digits * Math.pow(9, exp));
        int bigTotal = 0;
        for (Integer i = 1; i <= upperLimit; i++) {
            String str = i.toString();
            int total = 0;
            for (char c : str.toCharArray()) {
                total += Math.pow(c - '0', exp);
            }
            if (total == i && total != 1) {
                System.out.println(i);
                bigTotal += i;
            }
        }
        System.out.println("sum of all: " + bigTotal);
    }
}
