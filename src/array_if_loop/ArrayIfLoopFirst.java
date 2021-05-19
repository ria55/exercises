package array_if_loop;

import helpers.Helper;

public class ArrayIfLoopFirst {



    public static void main(String[] args) {
        byte[] bytes = {10, 33, -2, 0, 56, -42, 99, -73, 60};
        char[] chars = {'A', '*', 'c', 'd', 'E', ' '};
        int[] ints = {27, 969, -56, 1222, 8647000, -333, 7541, 89, 6502, -53042, 123, 876};
        double[] doubles = {3.14, -765.99, 52.4986, -10.3333337, 834.0965};
        String[] strings = {"alma", "málna", "barack", "szilva"};

        System.out.println("type of longest arr: " + findLongestArr(bytes, chars, ints, doubles, strings));
        System.out.println();

        System.out.println("sum of byte arr: " + Helper.sumArr(bytes));
        System.out.println("sum of char arr: " + Helper.sumArr(chars));
        System.out.println("sum of int arr: " + Helper.sumArr(ints));
        System.out.println("sum of double arr: " + Helper.sumArr(doubles));
        System.out.println("sum of String arr: " + Helper.sumArr(strings));
        System.out.println();

        System.out.printf("%d negative and %d positive values in byte arr\n",
                countNegOrPos(bytes, false), countNegOrPos(bytes, true));
        System.out.printf("%d negative and %d positive values in int arr\n",
                countNegOrPos(ints, false), countNegOrPos(ints, true));
        System.out.printf("%d negative and %d positive values in double arr\n",
                countNegOrPos(doubles, false), countNegOrPos(doubles, true));
        System.out.println();

        System.out.printf("%d non-letter character(s) in char arr\n", countNonLetters(chars));
        System.out.println();

        System.out.println("longest element of String arr: " + findLongestElement(strings));
        System.out.println("but there are more elements with this length...");
        System.out.println( Helper.arrToString(findLongestElements(strings), ", ") );
        System.out.println();

        double[][] matrix = createMatrix(bytes, ints, doubles);
        System.out.println(Helper.matrixToString(matrix, ", "));
        System.out.println();

        double sum = sumMatrix(matrix);
        double avg = countAvgOfMatrix(matrix, sum);
        System.out.println("sum of matrix: " + sum);
        System.out.println("average of matrix: " + avg);
        System.out.println();

        char[] arrFromStringArr = createCharArr(strings);
        System.out.println(Helper.arrToString(arrFromStringArr, ", "));

        char[][] charMatrix = createCharMatrix(strings);
        System.out.println(Helper.matrixToString(charMatrix, ", "));

    }

    public static String findLongestArr(byte[] bytes, char[] chars, int[] ints, double[] doubles, String[] strings) {
        String[] typeWithLength = collectTypeWithLength(bytes, chars, ints, doubles, strings);
        int max = 0;
        String type = "";
        for (String s : typeWithLength) {
            String[] temp = s.split(" ");
            int length = Integer.parseInt(temp[1]);
            if (length > max) {
                max = length;
                type = temp[0];
            }
        }
        return type;
    }

    public static String[] collectTypeWithLength(byte[] bytes, char[] chars, int[] ints, double[] doubles, String[] strings) {
        String[] typeWithLength = new String[5];

        typeWithLength[0] = bytes.getClass().getSimpleName() + " " + bytes.length;
        typeWithLength[1] = chars.getClass().getSimpleName() + " " + chars.length;
        typeWithLength[2] = ints.getClass().getSimpleName() + " " + ints.length;
        typeWithLength[3] = doubles.getClass().getSimpleName() + " " + doubles.length;
        typeWithLength[4] = strings.getClass().getSimpleName() + " " + strings.length;

        return typeWithLength;
    }

    public static int countNegOrPos(byte[] bytes, boolean countPositive) {
        int countNeg = 0, countPos = 0;

        for (byte b : bytes) {
            if (b > 0) {
                countPos++;
            } else if (b < 0) {
                countNeg++;
            }
        }

        return countPositive ? countPos : countNeg;
    }

    public static int countNegOrPos(int[] ints, boolean countPositive) {
        int countNeg = 0, countPos = 0;

        for (int i : ints) {
            if (i > 0) {
                countPos++;
            } else if (i < 0) {
                countNeg++;
            }
        }

        return countPositive ? countPos : countNeg;
    }

    public static int countNegOrPos(double[] doubles, boolean countPositive) {
        int countNeg = 0, countPos = 0;

        for (double d : doubles) {
            if (d > 0) {
                countPos++;
            } else if (d < 0) {
                countNeg++;
            }
        }

        return countPositive ? countPos : countNeg;
    }

    public static int countNonLetters(char[] chars) {
        int nonLetter = 0;

        for (char c : chars) {
            if (!Character.isLetter(c)) {
                nonLetter++;
            }
        }

        return nonLetter;
    }

    public static String findLongestElement(String[] strings) {
        int maxLength = 0;
        String result = "";
        for (String s : strings) {
            if (s.length() > maxLength) {
                maxLength = s.length();
                result = "";
            }
        }
        return result;
    }

    public static String[] findLongestElements(String[] strings) {
        int maxLength = findMaxLength(strings);
        StringBuilder result = new StringBuilder();

        for (String s : strings) {
            if (s.length() == maxLength) {
                result.append(s).append(" ");
            }

        }
        return result.toString().split(" ");
    }

    public static int findMaxLength(String[] strings) {
        int maxLength = 0;
        for (String s : strings) {
            if (s.length() > maxLength) {
                maxLength = s.length();
            }
        }
        return maxLength;
    }

    public static double[][] createMatrix(byte[] bytes, int[] ints, double[] doubles) {
        return new double[][]{createDouble(bytes), createDouble(ints), doubles};
    }

    public static double[] createDouble(byte[] bytes) {
        double[] arr = new double[bytes.length];

        for (int i = 0; i < bytes.length; i++) {
            arr[i] = bytes[i];
        }

        return arr;
    }

    public static double[] createDouble(int[] ints) {
        double[] arr = new double[ints.length];

        for (int i = 0; i < ints.length; i++) {
            arr[i] = ints[i];
        }

        return arr;
    }

    public static int countElementsOfMatrix(double[][] matrix) {
        int counter = 0;

        for (double[] arr : matrix) {
            counter += arr.length;
        }

        return counter;
    }

    public static double sumMatrix(double[][] matrix) {
        double sum = 0;

        for (double[] arr : matrix) {
            for (double d : arr) {
                sum += d;
            }
        }

        return sum;
    }

    public static double countAvgOfMatrix(double[][] matrix) {
        return sumMatrix(matrix) / countElementsOfMatrix(matrix);
    }

    public static double countAvgOfMatrix(double[][] matrix, double sum) {
        return sum / countElementsOfMatrix(matrix);
    }

    public static char[] createCharArr(String[] strings) {
        char[] arr = new char[countStringsLength(strings)];
        int j = 0;

        for (String s : strings) {
            for (int i = 0; i < s.length(); i++) {
                arr[j++] = s.charAt(i);
            }
        }

        return arr;
    }

    public static int countStringsLength(String[] strings) {
        int length = 0;

        for (String s : strings) {
            length += s.length();
        }

        return length;
    }

    public static char[][] createCharMatrix(String[] strings) {
        char[][] matrix = new char[strings.length][];

        for (int i = 0; i < strings.length; i++) {
            matrix[i] = new char[strings[i].length()];
            for (int j = 0; j < strings[i].length(); j++) {
                matrix[i][j] = strings[i].charAt(j);
            }
        }

        return matrix;
    }

}
