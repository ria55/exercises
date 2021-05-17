package variables_operators;

import java.util.Scanner;

public class FirstWorkMethods {

    public static Scanner input = new Scanner(System.in);

    /**
     * Counts the reminder without using modulo.
     * @param x is the dividend
     * @param y divider
     * @return the reminder after x / y
     */
    public static int countReminder(int x, int y) {
        return (y == 0 ? -1 : x - x / y * y);
    }

    /**
     * Counts the average of the arguments.
     * @param numbers are the numbers
     * @return the average of the numbers
     */
   public static double countAvg(int... numbers) {
       if (numbers.length == 0) {
           return -1d;
       }

       int sum = 0;
       for (int n : numbers) {
           sum += n;
       }

       return (double) sum / numbers.length;
   }

    /**
     * Welcomes the user.
     * @param name is the user's name
     * @return the greeting message
     */
   public static String sayHello(String name) {
       return name + ", Welcome To Hell!";
   }

    /**
     * Prints the result of the arithmetical operations of two numbers.
     * @param x is the first number
     * @param y is the other number
     */
   public static void printArithmeticalOperations(int x, int y) {
       System.out.printf("%d + %d = %d\n", x, y, (x + y));
       System.out.printf("%d - %d = %d\n", x, y, (x - y));
       System.out.printf("%d * %d = %d\n", x, y, (x * y));

       if (y != 0) {
           System.out.printf("%d / %d = %d\n", x, y, (x / y));
       }
   }

    /**
     * Concatenates two letters.
     * @param a is one letter
     * @param b is another letter
     * @return the two letters as String
     */
   public static String concatTwoLetters(char a, char b) {
       return "" + a + b;
   }

    /**
     * Determines that the number is greater than 0 or not.
     * @param x is the number
     * @return true if the number is greater than 0, false otherwise
     */
   public static boolean isGreaterThanZero(int x) {
       return (x > 0);
   }

    /**
     * Finds the maximum value of the arguments.
     * @param numbers are the numbers to check
     * @return the maximum value
     */
   public static int findMaxOfNumbers(int... numbers) {
       if (numbers.length == 0) {
           return -1;
       }

       int max = numbers[0];
       for (int i = 1; i < numbers.length; i++) {
           if (numbers[i] > max) {
               max = numbers[i];
           }
       }

       return max;
   }

    /**
     * Raises the first argument to the power of the second argument.
     * @param number is the base
     * @param exponent is the exponent
     * @return the result
     */
   public static double powerUpNumber(int number, int exponent) {
       return Math.pow(number, exponent);
   }

    /**
     * Counts the square root of the argument.
     * @param number is the argument
     * @return the result
     */
   public static double countSqrt(int number) {
       return Math.sqrt(number);
   }

    /**
     * Generates a random number between the given range.
     * @param minValue is the minimum possible value of the generated number
     * @param maxValue is the maximum possible value of the generated number
     * @return the random number
     */
   public static int generateRandom(int minValue, int maxValue) {
       return (int) (Math.random() * (maxValue - minValue + 1) + minValue);
   }

    /**
     * Gets the length of the given String.
     * @param s is the String
     * @return the length
     */
   public static int getLengthOfString(String s) {
       return s.length();
   }

    /**
     * Converts the given number to String.
     * @param n is the number to be converted
     * @return the number as a String
     */
   public static String convertIntToString(int n) {
       return String.valueOf(n);
   }

    /**
     * Welcomes the user.
     * @param name is the user's name
     * @return the greeting message
     */
   public static String sayHelloAgain(String name) {
       String greeting = "Üdvözöllek, kedves %s! Jó, hogy újra itt vagy!";
       return greeting.replace("%s", name);
   }

    /**
     * Compares two Strings.
     * @param s1 is a String
     * @param s2 is another String
     * @return true if the two Strings are the same, false otherwise
     */
   public static boolean areTheyEqual(String s1, String s2) {
       return s1.equals(s2);
   }

    /**
     * Checks if the given String contains only one word or more.
     * @param text is the String
     * @return true if there are more words in the text, false otherwise
     */
   public static boolean containsMoreWords(String text) {
       return text.trim().contains(" ");
   }

    /**
     * Finds the Nth character of the given String.
     * @param text is the String
     * @param n is the number (not the index!) of the desired character
     * @return the character
     */
   public static char getNthLetter(String text, int n) {
       return (text.length() > n - 1 ? text.charAt(n - 1) : ' ');
   }

    /**
     * Returns the first or the last occurrence of the given character in the given String.
     * @param text is the String to search for the character
     * @param c is the character
     * @param getFirst true to return the first occurrence, false to return the last
     * @return the index of the character, or -1 if the character is not found
     */
   public static int getFirstOrLastIndexOfChar(String text, char c, boolean getFirst) {
       return (getFirst ? text.indexOf(c) : text.lastIndexOf(c));
   }

    /**
     * Replaces the characters with another characters.
     * @param text is the String to replace in
     * @param toReplace is the old character that should be changed
     * @param replacer is the new character
     * @return the modified text
     */
   public static String replaceChars(String text, char toReplace, char replacer) {
       return text.replace(toReplace, replacer);
   }

    /**
     * Counts the digits of the given number by using two methods that have been already written.
     * @param number is the number
     * @return the number of digits
     */
   public static int countDigits(int number) {
       int length = getLengthOfString(convertIntToString(number));
       return (number >= 0 ? length : length - 1);
   }

    /**
     * Returns the substring of the given String.
     * @param text is the String
     * @param n is the number of characters that should be returned
     * @return the substring
     */
   public static String getFirstNChars(String text, int n) {
       return text.substring(0, n);
   }

}
