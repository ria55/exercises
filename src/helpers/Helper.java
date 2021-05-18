package helpers;

public class Helper {

    public static int generateRandom(int minValue, int maxVale) {
        return (int) (Math.random() * (maxVale - minValue + 1) + minValue);
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

}
