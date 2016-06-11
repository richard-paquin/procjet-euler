
public class Euler17 {

    public static String PutInWords(int value) {
        if (value == 0) {
            return "";
        }
        if (value == 1) {
            return "one";
        }
        if (value == 2) {
            return "two";
        }
        if (value == 3) {
            return "three";
        }
        if (value == 4) {
            return "four";
        }
        if (value == 5) {
            return "five";
        }
        if (value == 6) {
            return "six";
        }
        if (value == 7) {
            return "seven";
        }
        if (value == 8) {
            return "eight";
        }
        if (value == 9) {
            return "nine";
        }

        if (value == 10) {
            return "ten";
        }
        if (value == 11) {
            return "eleven";
        }
        if (value == 12) {
            return "twelve";
        }
        if (value == 13) {
            return "thirteen";
        }
        if (value == 14) {
            return "fourteen";
        }
        if (value == 15) {
            return "fifteen";
        }
        if (value == 16) {
            return "sixteen";
        }
        if (value == 17) {
            return "seventeen";
        }
        if (value == 18) {
            return "eighteen";
        }
        if (value == 19) {
            return "nineteen";
        }

        if (value == 20) {
            return "twenty";
        }
        if (value == 30) {
            return "thirty";
        }
        if (value == 40) {
            return "forty";
        }
        if (value == 50) {
            return "fifty";
        }
        if (value == 60) {
            return "sixty";
        }
        if (value == 70) {
            return "seventy";
        }
        if (value == 80) {
            return "eighty";
        }
        if (value == 90) {
            return "ninety";
        }

        if (value == 100) {
            return "hundred";
        }

        if (value == 1000) {
            return "thousand";
        }

        throw new UnsupportedOperationException("what's that ?");
    }

    public static String numberLogic(int value) {
        String str = "";
        if (value >= 1000) {
            str += PutInWords(value / 1000) + PutInWords(1000);
            value %= 1000;
        }

        if (value >= 100) {
            str += PutInWords(value / 100) + PutInWords(100);
            value %= 100;
            if (value > 0) {
                str += "and";
            }
        }

        if (value >= 20) {
            str += PutInWords((value / 10) * 10);
            value %= 10;
        }

        str += PutInWords(value);
        return str;
    }

    public static void exec() {

        String x;
        x = numberLogic(452);
        System.out.println(x);
        x = numberLogic(3);
        System.out.println(x);
        System.out.println(x.length());

        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            String str = numberLogic(i);
            System.out.println(str);
            count += str.length();
        }

        System.out.println(count);
    }

}
