package array_if_loop;

import helpers.Helper;

public class ArrayIfLoopSecond {

    public static void main(String[] args) {

        int[] arr = createArr(18, 42, 1, 100);

        System.out.println("generated array:");
        System.out.println(Helper.arrToString(arr, ", "));
        System.out.println();

        System.out.println("evens in arr: " + countEvensOrOdds(arr, true));
        System.out.println("odds in arr: " + countEvensOrOdds(arr, false));
        System.out.println();

        System.out.println("min of arr: " + findMin(arr));
        System.out.println("max of arr: " + findMax(arr));
        System.out.println();

        double avg = getAvg(arr);
        int difference = 2;
        System.out.println("average of arr: " + avg);
        System.out.printf("number of elements that are not lesser than avg - %d and not greater than avg + %d: %d",
                difference, difference, countAlmostAvg(arr, avg, difference));
    }

    public static int[] createArr(int minSize, int maxSize, int minValue, int maxValue) {
        int[] arr = new int[Helper.generateRandom(minSize, maxSize)];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Helper.generateRandom(minValue, maxValue);
        }

        return arr;
    }

    public static int countEvensOrOdds(int[] arr, boolean countEven) {
        int even = 0, odd = 0;

        for (int i : arr) {
            if (i % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        return (countEven ? even : odd);
    }

    public static int findMin(int[] arr) {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static double getAvg(int[] arr) {
        return Helper.sumArr(arr) / arr.length;
    }

    public static int countAlmostAvg(int[] arr, int difference) {
        double avg = getAvg(arr);
        int counter = 0;

        for (int i : arr) {
            if (i <= avg + difference && i >= avg - difference) {
                counter++;
            }
        }

        return counter;
    }

    public static int countAlmostAvg(int[] arr, double avg, int difference) {
        int counter = 0;

        for (int i : arr) {
            if (i <= avg + difference && i >= avg - difference) {
                counter++;
            }
        }

        return counter;
    }

}
