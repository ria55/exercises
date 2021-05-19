package array_if_loop;

public class ArrayIfLoopThird {

    public static void main(String[] args) {

        int n = 5;
        String s = "*";
        char c = '*';

        // Cheaters' Solutions...
        System.out.println(getStairs(n, s));
        System.out.println(getStairsReverse(n, s));
        System.out.println(getPyramid(n, s));
        System.out.println();

        // Real Solutions...
        drawStairs(n, c);
        drawStairsReverse(n, c);
        drawPyramid(n, c);

    }

    public static String getStairs(int size, String sign) {
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < size; i++) {
            b.append(sign.repeat(i + 1));
            b.append("\n");
        }
        b.setLength(b.length() - 1);
        return b.toString();
    }

    public static String getStairsReverse(int size, String sign) {
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < size; i++) {
            b.append(" ".repeat(size - i - 1)).append(sign.repeat(i + 1));
            b.append("\n");
        }
        b.setLength(b.length() - 1);
        return b.toString();
    }

    public static String getPyramid(int size, String sign) {
        StringBuilder b = new StringBuilder();
        int k = 1;
        for (int i = 0; i < size; i++) {
            b.append(" ".repeat(size - i - 1));
            b.append(sign.repeat(k));
            k += 2;
            b.append("\n");
        }
        b.setLength(b.length() - 1);
        return b.toString();
    }

    public static void drawStairs(int size, char sign) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(sign);
            }
            System.out.println();
        }
    }

    public static void drawStairsReverse(int size, char sign) {
        for (int i = 0; i < size; i++) {
            for (int j = size; j > i + 1; j--) {
                System.out.print(" ");
            }
            for (int j = size; j > size - i - 1; j--) {
                System.out.print(sign);
            }
            System.out.println();
        }
    }

    public static void drawPyramid(int size, char sign) {
        int k = 1;
        for (int i = 0; i < size; i++) {
            for (int j = size; j > i + 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < k; j++) {
                System.out.print(sign);
            }
            k += 2;
            System.out.println();
        }
    }

}
