
public class Euler02 {

    public static void exec() {

        int i1, i2 = 1, i3 = 2, sum = 0;
        while (i3 < 4000000) {
            if (i3 % 2 == 0) {
                sum += i3;
            }
            i1 = i2;
            i2 = i3;
            i3 = i2 + i1;
        }

        System.out.println(sum);
    }

}
