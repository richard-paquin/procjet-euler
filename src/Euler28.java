
public class Euler28 {

    static final int MAT_SIZE = 1001;
    public static int[][] my_array = new int[MAT_SIZE][MAT_SIZE];

    public static enum Dir {
        RIGHT, UP, LEFT, DOWN;
        private static final Dir[] vals = values();

        public Dir next() {
            return vals[(this.ordinal() + 1) % vals.length];
        }
    }

    public static void exec() {
        int x = MAT_SIZE / 2;
        int y = MAT_SIZE / 2;
        int stepsInDir = 1;
        int stepsMadeInDir = 0;
        int dirsUntilIncrement = 2;
        int value = 1;
        Dir dir = Dir.RIGHT;
        while (true) {
            my_array[x][y] = value;
//            System.out.print(" x:" + x);
//            System.out.print(" y:" + y);
//            System.out.println(" val:" + value);
            // move forward
            switch (dir) {
                case UP:
                    y += 1;
                    break;
                case DOWN:
                    y -= 1;
                    break;
                case RIGHT:
                    x += 1;
                    break;
                case LEFT:
                    x -= 1;
                    break;
                default:
                    break;
            }
            stepsMadeInDir++;
            value++;
            // rotate
            if (stepsMadeInDir == stepsInDir) {
                dir = dir.next();
                stepsMadeInDir = 0;
                // make side longer
                if (--dirsUntilIncrement == 0) {
                    dirsUntilIncrement = 2;
                    stepsInDir += 1;
                }
            }
            // out of boundaries
            if (x < 0 || x >= MAT_SIZE || y < 0 || y >= MAT_SIZE) {
                break;
            }
        }
        int total = 0;
        for (int i = 0; i < MAT_SIZE; i++) {
            total += my_array[i][i];
            total += my_array[MAT_SIZE - i - 1][i];
        }
        System.out.println(total - 1);
    }
}
