
import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Euler22 {

    public static void exec() throws IOException {
        Path filePath = Paths.get("p022_names.txt");
        Scanner scanner = new Scanner(filePath);
        scanner.useDelimiter(",");
        SortedSet<String> names = new TreeSet<String>() {
        };
        while (scanner.hasNext()) {
            names.add(scanner.next().replaceAll("\"", ""));
        }

        //Arrays.sort(names);
        long bigsum = 0;
        int pos = 1;
        for (String s : names) {
            long namesum = 0;
            for (char c : s.toCharArray()) {
                namesum += c - 'A' + 1;
            }
            namesum *= pos;
            if (s.equalsIgnoreCase("COLIN")) {
                System.out.println("COLIN: " + namesum);
            }
            bigsum += namesum;
            pos++;
        }
        System.out.println("total: " + bigsum);

    }
}
