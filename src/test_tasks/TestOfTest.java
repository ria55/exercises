package test_tasks;

public class TestOfTest {

    public static void main(String[] args) {
        // meow
    }

    /**
     * 1.
     * Írj metódust, amely eldönti egy bemenetként kapott int számról, hogy az osztható-e 7-tel!
     */
    public static boolean canDivideBy7(int number) {
        return (number % 7 == 0);
    }

    /**
     * 1.
     * Szorgalmi: oldd meg a feladatot úgy, hogy bármilyen számmal való oszthatóságot képes vizsgálni!
     */
    public static boolean canDivideByN(int number, int n) {
        return (number % n == 0);
    }

    /**
     * 2.
     * Írj egy metódust, amely megszámolja, hogy egy bemenetül kapott int számnak hány osztója van!
     */
    public static int countDivisors(int number) {
        int counter = 0;

        for (int i = 1; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                counter++;
            }
        }

        return (number % Math.sqrt(number) == 0 ? counter * 2 + 1 : counter * 2);
    }

    /**
     * 2.
     * Szorgalmi: oldd meg a feladatot úgy, hogy meg lehessen adni a számlálónak limitet - tehát hogy maximum hány osztót számláljon!
     */
    public static int countDivisorsWithLimit(int number, int limit) {
        int counter = 0;

        // ugyanaz, mint az előző, csak itt van limit is - ha ezt eléri, nem is keres további osztókat
        for (int i = 1; i < Math.sqrt(number); i++) {
            if (counter == limit) {
                return counter;
            }
            if (number % i == 0) {
                counter++;
            }
        }

        int result = (number % Math.sqrt(number) == 0 ? counter * 2 + 1 : counter * 2);

        // ha az összes osztó nagyobb, mint a limit, akkor a limittel tér vissza - máskülönben az összes osztóval
        return Math.min(result, limit);
    }

    /**
     * 3.
     * Írj metódust, amely megszámolja, hogy egy bemenetül kapott int számnak hány osztópárja van!
     */
    public static int countDivisorPairs(int number) {
        return (int)(Math.ceil(countDivisors(number) / 2d));
    }

    /**
     * 4.
     * Írj metódust, amely visszaadja egy bemenetül kapott egész szám számjegyeinek az összegét!
     * (Figyelj arra, hogy a számjegyek összege csak pozitív egész szám lehet!)
     */
    public static int addDigits(int number) {
        // this method works well even if number is negative
        int n = Math.abs(number);
        int sum = 0;

        while (n > 0) {
            sum += (n % 10);
            n /= 10;
        }

        return sum;
    }

    /**
     * 4.
     * Szorgalmi: Írj metódust, amely azt adja vissza, hogy a számjegyek összege és az eredeti szám között mekkora a különbség!
     * (Figyelj arra, hogy a különbség a két szám közötti eltérés.)
     */
    public static int countDifferenceBetweenNumberAndSumOfDigits(int number) {
        return (Math.abs(number - addDigits(number)));
    }

    /**
     * 5.
     * Írj metódust, amely megmondja egy szövegről, hogy az palindrom-e!
     */
    public static boolean isPalindrome(String text) {
        for (int i = 0; i < text.length() / 2; i++) {
            if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    /**
     * 5.
     * Szorgalmi: Írj metódust, amely azt állapítja meg, hogy hány karaktert kéne átírni a szövegben ahhoz,
     * hogy az palindrom legyen!
     */
    public static int countNonPalindromeLetters(String text) {
        int counter = 0;

        for (int i = 0; i < text.length() / 2; i++) {
            if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
                counter++;
            }
        }

        return counter;
    }

    /**
     * 6. (alap és szorgalmi egyben)
     * Írj metódust, amely visszaadja az első tíz prímszámot!
     * (Az első prímszámnak a 2-t tekintjük. Valamint: visszaadja - azaz nem kiírja!)
     * Szorgalmi: oldd meg a feladatot úgy, hogy az első 10 prímszám helyett az első N darab prímszámot adod vissza!
     */
    public static int[] findFirstNPrimes(int n) {
        int[] primes = new int[n];
        int counter = 0;
        int i = 2;

        while (counter < primes.length) {
            if (isPrime(i)) {
                primes[counter++] = i;
            }
            i++;
        }

        return primes;
    }

    /**
     * 6. (segéd metódus)
     */
    public static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * 7.
     * Írj metódust, amely egy String[] tömbből kikeresi azokat az elemeket, amelyek tartalmaznak egy adott karaktert.
     * Add meg az indexeit a megtalált elemeknek egy tömbbe.
     */
    public static int[] findElementIndexWithChar(String[] arr, char c) {
        StringBuilder b = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains(Character.toString(c))) {
                b.append(i).append(" ");
            }
        }

        String[] indexString = b.toString().split(" ");

        return convertStringArrToInt(indexString);
    }

    /**
     * 7.
     * Szorgalmi: oldd meg a feladatot úgy, hogy azokat az elemeket keresd, amelyekben pontosan N-szer szerepel az adott karakter!
     */
    public static int[] findElementIndexWithChar(String[] arr, char c, int occurrence) {
        StringBuilder b = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            int counter = 0;
            for (int j = 0; j < arr[i].length(); j++) {
                if (arr[i].charAt(j) == c) {
                    counter++;
                }
            }
            if (counter == occurrence) {
                b.append(i).append(" ");
            }
        }

        String[] indexString = b.toString().split(" ");

        return convertStringArrToInt(indexString);
    }

    /**
     * 7. (segéd metódus)
     */
    public static int[] convertStringArrToInt(String[] arr) {
        int[] ints = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            ints[i] = Integer.parseInt(arr[i]);
        }

        return ints;
    }

    /**
     * 8.
     * Írj metódust, amely megszámolja, hogy hányszor szerepel egy adott szám egy int[] típusú tömbben!
     * és azokat számolja meg!
     */
    public static int countNumberInArr(int[] arr, int number) {
        int counter = 0;

        for (int i : arr) {
            if (i == number) {
                counter++;
            }
        }

        return counter;
    }

    /**
     * 8.
     * Szorgalmi: oldd meg a feladatot úgy, hogy ne adott számot, hanem egy intervallumon belül keressen értékeket,
     */
    public static int countNumbersInArrBetween(int[] arr, int from, int to) {
        int counter = 0;

        for (int i : arr) {
            if (i >= from && i <= to) {
                counter++;
            }
        }

        return counter;
    }

    /**
     * 9.
     * Írj metódust, amely megállapítja egy int[] típusú tömbről, hogy abban hány különböző érték szerepel!
     */
    public static int countDifferentNumsInArr(int[] arr) {
        StringBuilder b = new StringBuilder();
        int counter = 0;

        for (int i : arr) {
            String numToString = String.valueOf(i) + " ";
            if (!b.toString().contains(numToString)) {
                b.append(numToString);
                counter++;
            }
        }

        return counter;
    }

    /**
     * 9.
     * Szorgalmi: valósítsd meg a feladatot kétdimenziós tömbbel is!
     */
    public static int countDifferentNumsInArr(int[][] matrix) {
        StringBuilder b = new StringBuilder();
        int counter = 0;

        for (int[] arr : matrix) {
            for (int i : arr) {
                String numToString = String.valueOf(i) + " ";
                if (!b.toString().contains(numToString)) {
                    b.append(numToString);
                    counter++;
                }
            }
        }

        return counter;
    }

    /**
     * 10.
     * Írj metódust, amely egy kétdimenziós tömbről megállapítja, hogy mely két sorának összege között a legnagyobb a különbség!
     */
    public static int[] findTwoRowsWithBiggestDifference(int[][] matrix) {
        int[] sums = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            sums[i] = sum(matrix[i]);
        }

        return findBiggestDifference(sums);
    }

    /**
     * 10.
     * Szorgalmi: valósítsd meg ezt a metódust úgy is, hogy a sorok összege helyett az oszlopok összegét vizsgálod!
     */
    public static int[] findTwoColsWithBiggestDifference(int[][] matrix) {
        int[] sums = new int[matrix.length];

        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[j][i];
            }
            sums[i] = sum;
            sum = 0;
        }

        return findBiggestDifference(sums);
    }

    /**
     * 10. (segéd metódus)
     */
    public static int sum(int[] arr) {
        int sum = 0;

        for (int i : arr) {
            sum += i;
        }

        return sum;
    }

    /**
     * 10. (segéd metódus)
     */
    public static int[] findBiggestDifference(int[] sums) {
        int maxDif = 0;
        int pos1 = 0, pos2 = 0;

        for (int i = 0; i < sums.length; i++) {
            for (int j = i + 1; j < sums.length; j++) {
                int diff = Math.abs(sums[i] - sums[j]);
                if (diff > maxDif) {
                    maxDif = diff;
                    pos1 = i;
                    pos2 = j;
                }
            }
        }

        return new int[]{pos1, pos2};
    }

}
