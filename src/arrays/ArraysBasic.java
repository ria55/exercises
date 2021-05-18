package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysBasic {

    public static Scanner input = new Scanner(System.in);

    public static int[] ints = new int[5];
    public static float[] floats = new float[5];
    public static boolean[] booleans = new boolean[5];
    public static char[] chars = new char[5];
    public static String[] strings = new String[5];
    public static Integer[] integers = new Integer[5];

    public static void main(String[] args) {

        // voluntary task: street with houses

        int[] street = createArray(10, 1, 5);
        System.out.println("The street's houses look like...");
        System.out.println(arrToString(street, " - "));

        for (int i : street) {
            System.out.println(getMessage(i));
        }

    }

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

    // prints the default values of the specified types, because empty arrays contains these values
    public static void printFirstAndLast() {
        System.out.println("ints first and last elements: " + ints[0] + ", " + ints[ints.length - 1]);
        System.out.println("floats first and last elements: " + floats[0] + ", " + floats[floats.length - 1]);
        System.out.println("booleans first and last elements: " + booleans[0] + ", " + booleans[booleans.length - 1]);
        System.out.println("chars first and last elements: " + chars[0] + ", " + chars[chars.length - 1]);
        System.out.println("strings first and last elements: " + strings[0] + ", " + strings[strings.length - 1]);
        System.out.println("integers first and last elements: " + integers[0] + ", " + integers[integers.length - 1]);
    }

    public static void addFirstElements() {
        ints[0] = 5;
        floats[0] = 3.14f;
        booleans[0] = true;
        chars[0] = 'x';
        strings[0] = "puppy";
        integers[0] = 42;
    }

    public static int[] createArray(int size, int minValue, int maxValue) {
        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = generateRandom(minValue, maxValue);
        }

        return numbers;
    }

    public static void increaseOrChangeElement(int[] arr, int index, int value, boolean onlyChange) {
        if (onlyChange) {
            arr[index] = value;
        } else {
            arr[index] += value;
        }
    }

    public static int[] askUserToCreateArr(int size) {
        System.out.printf("Please give me %d numbers!", size);

        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.println("Thank you!");

        return numbers;
    }

    public static void askUserToChange(int[] arr) {
        System.out.println("Which element do you want to change? Enter the position!");
        System.out.println(arrToString(arr));
        int index = input.nextInt() - 1;

        System.out.println("What should be the new value? Enter a number!");
        arr[index] = input.nextInt();

        System.out.println("Done. The new array is now...");
        System.out.println(arrToString(arr));
    }

    public static int getRandomElement(int[] arr) {
        return arr[generateRandom(0, arr.length - 1)];
    }

    public static int sum(int[] arr) {
        int sum = 0;

        for (int i : arr) {
            sum += i;
        }

        return sum;
    }

    public static String getMessage(int n) {
        return (n % 2 == 0? "szeretem a páros számot!" : "ó jaj!");
    }

}
