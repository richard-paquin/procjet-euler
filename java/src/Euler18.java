
import java.util.*;

public class Euler18 {

    public static void exec() {
        List<List<Integer>> numbers = new ArrayList<>();
        String[] inputLines = {"75",
            "95 64",
            "17 47 82",
            "18 35 87 10",
            "20 04 82 47 65",
            "19 01 23 75 03 34",
            "88 02 77 73 07 63 67",
            "99 65 04 28 06 16 70 92",
            "41 41 26 56 83 40 80 70 33",
            "41 48 72 33 47 32 37 16 94 29",
            "53 71 44 65 25 43 91 52 97 51 14",
            "70 11 33 28 77 73 17 78 39 68 17 57",
            "91 71 52 38 17 14 91 43 58 50 27 29 48",
            "63 66 04 68 89 53 67 30 73 16 69 87 40 31",
            "04 62 98 27 23 09 70 98 73 93 38 53 60 04 23"};
        for (String line : inputLines) {
            List<Integer> row = new ArrayList<>();
            Scanner s = new Scanner(line);
            while (s.hasNextInt()) {
                row.add(s.nextInt());
            }
            numbers.add(row);
        }
        int longest = numbers.get(numbers.size() - 1).size();
        System.out.println("size: " + longest);
        // where the answers will be
        int[] max_path = new int[longest];
        // init with last row
        List<Integer> last_row = numbers.get(numbers.size() - 1);
        for (int i = 0; i < longest; i++) {
            max_path[i] = last_row.get(i);
        }
        for (int i = numbers.size() - 2; i >= 0; i--) {
            List<Integer> l = numbers.get(i);
            for (int j = 0; j < l.size(); j++) {
                int max_val = Math.max(max_path[j], max_path[j + 1]);
                max_path[j] = max_val + l.get(j);
            }
        }
        System.out.println(max_path[0]);
    }
}
