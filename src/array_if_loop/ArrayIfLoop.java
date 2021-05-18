package array_if_loop;

import helpers.ArraysForTask;

public class ArrayIfLoop {

    // Melyik adattípusú tömb a leghosszabb?
    public static String findLongestArr() {
        String[] typeWithLength = collectTypeWithLength();
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

    public static String[] collectTypeWithLength() {
        String[] typeWithLength = new String[5];

        typeWithLength[0] = ArraysForTask.bytes.getClass().getSimpleName() + " " + ArraysForTask.bytes.length;
        typeWithLength[1] = ArraysForTask.chars.getClass().getSimpleName() + " " + ArraysForTask.chars.length;
        typeWithLength[2] = ArraysForTask.ints.getClass().getSimpleName() + " " + ArraysForTask.ints.length;
        typeWithLength[3] = ArraysForTask.doubles.getClass().getSimpleName() + " " + ArraysForTask.doubles.length;
        typeWithLength[4] = ArraysForTask.strings.getClass().getSimpleName() + " " + ArraysForTask.strings.length;

        return typeWithLength;
    }

    // Add össze a tömbök értékét külön-külön!
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

    // Hány negatív és hány pozitív szám szerepel a bytes, az ints és a doubles nevű tömbökben?
    public static int countNegOrPosInByteArr(boolean countPositive) {
        int countNeg = 0, countPos = 0;

        for (byte b : ArraysForTask.bytes) {
            if (b > 0) {
                countPos++;
            } else if (b < 0) {
                countNeg++;
            }
        }

        return countPositive ? countPos : countNeg;
    }

    public static int countNegOrPosInIntArr(boolean countPositive) {
        int countNeg = 0, countPos = 0;

        for (int i : ArraysForTask.ints) {
            if (i > 0) {
                countPos++;
            } else if (i < 0) {
                countNeg++;
            }
        }

        return countPositive ? countPos : countNeg;
    }

    public static int countNegOrPosInDoubleArr(boolean countPositive) {
        int countNeg = 0, countPos = 0;

        for (double d : ArraysForTask.doubles) {
            if (d > 0) {
                countPos++;
            } else if (d < 0) {
                countNeg++;
            }
        }

        return countPositive ? countPos : countNeg;
    }

    // Hány darab olyan karakter szerepel a chars nevű tömbben, amelyik nem az ABC egyik betűje?
    public static int countNonLetters() {
        int nonLetter = 0;

        for (char c : ArraysForTask.chars) {
            if (!Character.isLetter(c)) {
                nonLetter++;
            }
        }

        return nonLetter;
    }

    // Melyik a leghosszabb eleme a strings nevű tömbnek? (Elfogadható válaszok: maga az elem VAGY az elem indexe VAGY az elem sorszáma
    // - de tüntesd fel, hogy melyiket írod.)
    public static String findLongestElement() {
        int maxLength = 0;
        String result = "";
        for (String s : ArraysForTask.strings) {
            if (s.length() > maxLength) {
                maxLength = s.length();
                result = "";
            }
        }
        return result;
    }

    public static int findMaxLength() {
        int maxLength = 0;
        for (String s : ArraysForTask.strings) {
            if (s.length() > maxLength) {
                maxLength = s.length();
            }
        }
        return maxLength;
    }

    public static String[] findLongestElements() {
        int maxLength = findMaxLength();
        StringBuilder result = new StringBuilder();

        for (String s : ArraysForTask.strings) {
            if (s.length() == maxLength) {
                result.append(s).append(" ");
            }

        }
        return result.toString().split(" ");
    }

    // Hozz létre egy kétdimenziós tömböt a szám adattípusú tömbökből! A kétdimenziós tömb “sorai” legyenek az eredeti tömbök külön-külön.
    // (Az eredményt nem kell kommentként leírnod.)
    public static double[][] createMatrix() {
        return new double[][]{createDoubleFromByte(), createDoubleFromInt(), ArraysForTask.doubles};
    }

    public static double[] createDoubleFromByte() {
        double[] arr = new double[ArraysForTask.bytes.length];

        for (int i = 0; i < ArraysForTask.bytes.length; i++) {
            arr[i] = ArraysForTask.bytes[i];
        }

        return arr;
    }

    public static double[] createDoubleFromInt() {
        double[] arr = new double[ArraysForTask.ints.length];

        for (int i = 0; i < ArraysForTask.ints.length; i++) {
            arr[i] = ArraysForTask.ints[i];
        }

        return arr;
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

    // Hozz létre egy char[] típusú tömböt a strings nevűből úgy, hogy minden elem minden
    //karakterét egyesével szerepelteted az új tömbben!
    public static char[] createCharArr() {
        char[] arr = new char[countStringsLength()];
        int j = 0;

        for (String s : ArraysForTask.strings) {
            for (int i = 0; i < s.length(); i++) {
                arr[j++] = s.charAt(i);
            }
        }

        return arr;
    }

    public static int countStringsLength() {
        int length = 0;

        for (String s : ArraysForTask.strings) {
            length += s.length();
        }

        return length;
    }

    public static char[][] createCharMatrix() {
        char[][] matrix = new char[ArraysForTask.strings.length][];

        for (int i = 0; i < ArraysForTask.strings.length; i++) {
            matrix[i] = new char[ArraysForTask.strings[i].length()];
            for (int j = 0; j < ArraysForTask.strings[i].length(); j++) {
                matrix[i][j] = ArraysForTask.strings[i].charAt(j);
            }
        }

        return matrix;
    }

    public static int generateRandom(int from, int to) {
        return (int) (Math.random() * (to - from + 1) + from);
    }

    public static int[] createArr(int minSize, int maxSize, int minValue, int maxValue) {
        int[] arr = new int[generateRandom(minSize, maxSize)];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = generateRandom(minValue, maxValue);
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
        return sumArr(arr) / arr.length;
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

}
