package basics.helpers;

public class Helper {

    public static int generateRandom(int minValue, int maxVale) {
        return (int) (Math.random() * (maxVale - minValue + 1) + minValue);
    }

    public static double sumArr(byte[] arr) {
        double sum = 0;
        for (byte b : arr) {
            sum += b;
        }
        return sum;
    }

    public static double sumArr(char[] arr) {
        double sum = 0;
        for (char c : arr) {
            sum += c;
        }
        return sum;
    }

    public static double sumArr(int[] arr) {
        double sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    public static double sumArr(double[] arr) {
        double sum = 0;
        for (double d : arr) {
            sum += d;
        }
        return sum;
    }

    public static String sumArr(String[] arr) {
        StringBuilder b = new StringBuilder();
        for (String s : arr) {
            b.append(s);
        }
        return b.toString();
    }

    public static String arrToString(int[] arr) {
        StringBuilder b = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            b.append(i + 1).append(". element: ").append(arr[i]);
            b.append("\n");
        }

        b.setLength(b.length() - 1);

        return b.toString();
    }

    public static String arrToString(int[] arr, String separator) {
        StringBuilder b = new StringBuilder();

        for (int j : arr) {
            b.append(j).append(separator);
        }

        b.setLength(b.length() - separator.length());

        return b.toString();
    }

    public static String arrToString(char[] arr, String separator) {
        StringBuilder b = new StringBuilder();

        for (char c : arr) {
            b.append(c).append(separator);
        }

        b.setLength(b.length() - separator.length());

        return b.toString();
    }

    public static String arrToString(String[] arr, String separator) {
        StringBuilder b = new StringBuilder();

        for (String s : arr) {
            b.append(s).append(separator);
        }

        b.setLength(b.length() - separator.length());

        return b.toString();
    }

    public static String matrixToString(double[][] matrix, String separator) {
        StringBuilder b = new StringBuilder();

        for (double[] arr : matrix) {
            for (double d : arr) {
                b.append(d).append(separator);
            }

            b.setLength(b.length() - separator.length());
            b.append("\n");
        }

        b.setLength(b.length() - 1);

        return b.toString();
    }

    public static String matrixToString(char[][] matrix, String separator) {
        StringBuilder b = new StringBuilder();

        for (char[] arr : matrix) {
            for (char c : arr) {
                b.append(c).append(separator);
            }

            b.setLength(b.length() - separator.length());
            b.append("\n");
        }

        b.setLength(b.length() - 1);

        return b.toString();
    }

}
