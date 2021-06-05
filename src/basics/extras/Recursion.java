package basics.extras;

/**
 * Recursive methods to solve problems.<br><br>
 * This is <b>NOT</b> the part of the curriculum, so do not be nervous if you do not understand them!
 */
public class Recursion {

    public static void main(String[] args) {

        System.out.println(addDigitsOfNum(55));

    }

    /**
     * Prints the numbers between the arguments in ascending order.
     * @param start is the number where begins
     * @param end is the number where ends
     */
    public static void countFromTo(int start, int end) {
        if (start > end) {
            return;
        }
        System.out.println(start);
        countFromTo(start + 1, end);
    }

    /**
     * Prints the numbers between the arguments in descending order.
     * @param start is the number where starts
     * @param end is the number where ends
     */
    public static void countFromToReverse(int start, int end) {
        if (start < end) {
            return;
        }
        System.out.println(start);
        countFromToReverse(start - 1, end);
    }

    /**
     * Adds the number between the arguments.
     * @param start is the number where starts
     * @param end is the number where ends
     * @return the sum of the numbers
     */
    public static int sumNumbersBetween(int start, int end) {
        if (start == end) {
            return start;
        }
        return sumNumbersBetween(start, end - 1) + end;
    }

    /**
     * Inserts spaces between the given text's characters.
     * @param text is the text
     * @param index is the index where begins, should be 0
     * @return the text with spaces between its characters
     */
    public static String insertSpaces(String text, int index) {
        String s = String.valueOf(text.charAt(index));
        if (index == text.length() - 1) {
            return s;
        }
        return s + " " + insertSpaces(text, index + 1);
    }

    /**
     * Adds the digits of the given number.
     * @param number is the given number
     * @return the sum of the digits
     */
    public static int addDigitsOfNum(int number) {
        if (number / 10 == 0) {
            return Math.abs(number);
        }
        return addDigitsOfNum(number / 10) + Math.abs((number % 10));
    }

}