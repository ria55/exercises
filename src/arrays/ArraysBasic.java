package arrays;

import helpers.Helper;

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
            numbers[i] = Helper.generateRandom(minValue, maxValue);
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
        System.out.println(Helper.arrToString(arr));
        int index = input.nextInt() - 1;

        System.out.println("What should be the new value? Enter a number!");
        arr[index] = input.nextInt();

        System.out.println("Done. The new array is now...");
        System.out.println(Helper.arrToString(arr));
    }

    public static int getRandomElement(int[] arr) {
        return arr[Helper.generateRandom(0, arr.length - 1)];
    }

    public static int sum(int[] arr) {
        int sum = 0;

        for (int i : arr) {
            sum += i;
        }

        return sum;
    }

}
