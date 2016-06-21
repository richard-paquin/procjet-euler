
public class Euler19 {

    public static class Year {

        public final boolean leap;
        public final Day startsOn;
        public final Day endsOn;
        public final int year;

        public Year(int y, Day startsOn) {
            this.year = y;
            this.startsOn = startsOn;
            if (y % 4 == 0 && (y % 100 != 0 || y % 400 == 0)) {
                this.leap = true;
            } else {
                leap = false;
            }
            if (leap) {
                endsOn = startsOn.next();
            } else {
                endsOn = startsOn;
            }
        }

        public int sundaysInFirstOfMonth() {
            int sunday = Day.SUNDAY.ordinal();
            int start = this.startsOn.ordinal();
            int count = 0;
            for (Month m : Month.values()) {
                if (start == sunday) {
                    count += 1;
                }
                System.out.println(m + "(" + this.year + ") " + Day.values()[start]);
                int dim = daysInMonth(m, this.leap);
                //int offset = dim % Day.values().length;
                start = (start + dim) % Day.values().length;
            }
            return count;
        }

        public int sundaysInJanuary() {
            int n = daysInMonth(Month.JAN, this.leap);
            Day d = this.startsOn;
            while (d != Day.SUNDAY) {
                d = d.next();
                n--;
            }
            return n / 7 + 1;
        }
    }

    public static enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
        THURSDAY, FRIDAY, SATURDAY;
        private static final Day[] vals = values();

        public Day next() {
            return vals[(this.ordinal() + 1) % vals.length];
        }
    }

    public static enum Month {
        JAN, FEB, MAR, APR, MAI, JUN,
        JUL, AUG, SEP, OCT, NOV, DEC;
        private static final Month[] vals = values();

        public Month next() {
            return vals[(this.ordinal() + 1) % vals.length];
        }
    }

    public static int daysInMonth(Month m, boolean leap) {
        switch (m) {
            case FEB:
                return (leap ? 29 : 28);
            case JAN:
            case MAR:
            case MAI:
            case JUL:
            case AUG:
            case OCT:
            case DEC:
                return 31;
            default:
                return 30;
        }
    }

    public static void exec() {
        // 1 Jan 1900 was a Monday.
        int i = 1900;
        Day d = Day.MONDAY;
        int total_count = 0;
        Euler19.Year y;
        y = new Euler19.Year(i++, d);
        d = y.endsOn.next();
        while (i < 2001) {
            y = new Euler19.Year(i, d);
            int count = y.sundaysInFirstOfMonth();
            total_count += count;
            System.out.println(i + ": " + count + " (" + y.startsOn + ")");
            i++;
            d = y.endsOn.next();
        }
        System.out.println(total_count);
    }
}
