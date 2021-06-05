package basics.task_0525;

public class MiddleEarth1 {

    public static int[] hills = {100, 430, 380, 230, 310, 225, 213, 178, 202, 30, 110};

    public static int[] weights = {84, 83, 82, 76, 61, 70, 58, 67, 72, 85};
    public static int timeToCross = 5;

    public static int[] heights = {130, 138, 135, 128, 130, 120, 125, 130, 110};
    public static int troll = 270;

    public static int[][] weightsAndHeights = {{84, 144}, {83, 130}, {82, 138}, {76, 135}, {61, 128}, {70, 130},
            {58, 120}, {67, 125}, {72, 130}, {85, 110}};

    public static String[] messageOfPeredhel = {"obbnagy", "intm", "incharm", "sé", "ím!pr", "enjM", "eb", "a",
            "ebblegkis", "ámúsz", "tónaj", "nekmely", "ámasz"};

    public static void main(String[] args) {

        System.out.println("1. task");
        int highestIndex = findHighestHill();
        System.out.println("The highest hill's index and height is: " + highestIndex + " and " + hills[highestIndex]);
        System.out.println();

        System.out.println("2. task");
        printNextHighestHills();
        System.out.println();

        System.out.println("3. task");
        int timeToCross = countTimeToCrossTheBridge();
        System.out.printf("Crossing the bridge takes %d minutes.\n", timeToCross);
        System.out.println();

        System.out.println("4. task");
        boolean canDefeatTroll = canDefeatTheTroll();
        System.out.println( (canDefeatTroll ? "They CAN defeat dat f*in troll!" : "Eeeeeewwwwwwwwwwrrrr......") );
        System.out.println();

        System.out.println("5. task");
        int dwarfTower = buildADwarfTower();
        System.out.println("The highest dwarf-tower that can be built is: " + dwarfTower + " (centimeters - maybe)");
        System.out.println();

        System.out.println("6. task");
        System.out.println("Peredhel Quendi's message is...");
        System.out.println( decodePeredhelQuendi() );

    }

    /*
    String tömbből Stringet csinál (kiíráshoz használom)
     */
    public static String arrToString(String[] arr) {
        StringBuilder b = new StringBuilder();

        for (String s : arr) {
            b.append(s).append(" ");
        }

        b.setLength(b.length() - 1);

        return b.toString();
    }

    /*
    megtalálja egy tömb legnagyobb elemének indexét (több feladatnál is használom)
     */
    public static int findMaxIndex(int[] arr) {
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[index]) {
                index = i;
            }
        }
        return index;
    }

    // ------------------------------------------------------------------------------------------------

    /*
    1. - megtalálni a legmagasabb dombot
     */

    public static int findHighestHill() {
        return findMaxIndex(hills);
    }

    // ------------------------------------------------------------------------------------------------

    /*
    2. - megtalálni a következő legmagasabb dombot (beleértve azt is, ahol állunk éppen)
     */

    public static void printNextHighestHills() {
        for (int i = 0; i < hills.length; i++) {
            int next = findNextHighestHill(i);
            System.out.printf("Standing on the %d. hill, the next tallest is the %d with %d height.\n",
                    (i + 1), (next + 1), hills[next]);
        }
    }

    public static int findNextHighestHill(int current) {
        if (current == hills.length - 1) {
            return current;
        }
        int index = current;
        for (int i = current + 1; i < hills.length; i++) {
            if (hills[i] > hills[index]) {
                index = i;
            }
        }
        return index;
    }


    /*
    3. - kiszámolni, mennyi ideig tart a hídon való átkelés
     */

    public static int countTimeToCrossTheBridge() {
        sort(weights);

        int time = countTime();

        if (weights.length % 2 == 1) {
            time += 5;
        }

        return time;
    }

    public static void sort(int[] arr) {
        int end = arr.length;
        while (end > 0) {
            bubbleUp(arr, end--);
        }
    }

    public static void bubbleUp(int[] arr, int lastIndex) {
        for (int i = 0; i < lastIndex - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
    }

    public static int countTime() {
        int time = 0;

        for (int i = 0; i < weights.length / 2; i++) {
            int last = weights.length - 1 - i;
            if (weights[i] + weights[last] > 150) {
                time += 2 * timeToCross;
            } else {
                time += timeToCross;
            }
        }

        return time;
    }

    // ------------------------------------------------------------------------------------------------

    /*
    4. - megnézni, le tudják-e győzni a fránya trollt
     */

    public static boolean canDefeatTheTroll() {
        return (countTwoTallestDwarvesHeight() >= troll);
    }

    public static int countTwoTallestDwarvesHeight() {
        int tallestIndex = findMaxIndex(heights);
        int nextTallestIndex = 0;

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[nextTallestIndex] && heights[i] < heights[tallestIndex]) {
                nextTallestIndex = i;
            }
        }

        return (heights[tallestIndex] + heights[nextTallestIndex]);
    }

    // ------------------------------------------------------------------------------------------------

    /*
    5. - megépíteni a lehető legmagasabb törptornyot
     */

    public static int buildADwarfTower() {
        sortDwarvesByHeightsAndWeights();

        int tower = weightsAndHeights[weightsAndHeights.length - 1][1];
        int[] max = weightsAndHeights[weightsAndHeights.length - 1];

        for (int i = weightsAndHeights.length - 2; i >= 0; i--) {
            int[] actual = weightsAndHeights[i];
            if (actual[1] < max[1] && actual[0] < max[0]) {
                max = actual;
                tower += actual[1];
            }
        }

        return tower;

    }

    public static void sortDwarvesByHeightsAndWeights() {
        int end = weightsAndHeights.length;
        while (end > 0) {
            changeDwarvesByHeights(weightsAndHeights, end--);
        }
        changeDwarvesByWeights();
    }

    public static void changeDwarvesByHeights(int[][] arr, int end) {
        for (int i = 0; i < end - 1; i++) {
            if (arr[i][1] > arr[i + 1][1]) {
                int[] temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
    }

    public static void changeDwarvesByWeights() {
        for (int i = 0; i < weightsAndHeights.length - 1; i++) {
            int[] first = weightsAndHeights[i];
            int[] second = weightsAndHeights[i + 1];
            if (first[1] == second[1] && first[0] > second[0]) {
                weightsAndHeights[i] = second;
                weightsAndHeights[i + 1] = first;
            }
        }
    }

    // ------------------------------------------------------------------------------------------------

    /*
    6. - megfejteni Peredhel Quendi üzenetét
     */

    public static String decodePeredhelQuendi() {
        String[] message = shiftArray(messageOfPeredhel, 8);

        for (int i = 0; i < message.length; i++) {
            message[i] = shiftString(message[i], -3);
        }

        return arrToString(message);
    }

    public static String[] shiftArray(String[] arr, int time) {
        int index = setRotateTime(arr.length, time);

        if (index == 0) {
            return arr;
        }

        String[] shifted = new String[arr.length];

        for (int i = 0; i < shifted.length; i++) {
            if (index == arr.length) {
                index = 0;
            }
            shifted[i] = arr[index++];
        }

        return shifted;
    }

    public static String shiftString(String text, int time) {
        int index = setRotateTime(text.length(), time);

        if (index == 0) {
            return text;
        }

        String first = text.substring(index);
        String last = text.substring(0, index);

        return first + last;
    }

    public static int setRotateTime(int length, int time) {
        int rotate = Math.abs(time) % length;
        if (rotate == 0) {
            return 0;
        }
        return (time > 0 ? length - rotate : rotate);
    }

}
