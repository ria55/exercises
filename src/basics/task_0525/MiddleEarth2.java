package basics.task_0525;

public class MiddleEarth2 {

    public static int[][] tunnel = { {0, 1}, {0, 1}, {0, 0}, {1, 0}, {1, 0}, {1, 0},
            {1, 0}, {0, 0}, {0, 1}, {0, 1}, {0, 1}, {0, 0}, {1, 0} };
    public static int timeToCollect = 60;

    public static void main(String[] args) {

        System.out.println("Can they leave the tunnel? " + (canTheyLeaveTheTunnel() ? "Yes!" : "Eeeeehhhhrrr..."));
        System.out.println();

        int allTreasure = collectTreasure();
        System.out.println("treasure collected: " + allTreasure);
        System.out.println();

        // {84, 83, 82, 76, 61, 70, 58, 67, 72, 85};
        // System.out.println(85 * 4 + 84 * 4 + 83 * 4 + 82 * 4 + 76 * 4 + 72 * 4);

        int treasurePerDwarf = countTreasurePerDwarf(allTreasure);
        int treasureForGandalf = treasurePerDwarf + countTreasureForGandalf(allTreasure);

        System.out.println("treasure per dwarf: " + treasurePerDwarf);
        System.out.println("treasure for Gandalf: " + treasureForGandalf);
        System.out.println();

        findBilbo();

    }

    public static boolean canTheyLeaveTheTunnel() {
        boolean maybe = true;
        int i = 0;

        while (maybe && i < tunnel.length - 1) {
            // ha két csapda van, akkor nem tudnak átmenni
            if (tunnel[i][0] == 1 && tunnel[i][1] == 1) {
                maybe = false;
            }
            // ha ott, ahol állnak, van csapda ÉS a következő sorban is van csapda...
            // és a következő sorban máshol van a csapda, mint ott, ahol állnak
            // - akkor sem tudnak átmenni
            if (tunnel[i][0] != tunnel[i][1] && tunnel[i + 1][0] != tunnel[i + 1][1] &&
                    tunnel[i][0] - tunnel[i + 1][0] != tunnel[i][1] - tunnel[i + 1][1]) {
                maybe = false;
            }

            i++;
        }

        return maybe;
    }

    public static int collectTreasure() {
        MiddleEarth1.sort(MiddleEarth1.weights);
        int length = MiddleEarth1.weights.length - 1;

        int allTreasure = 0;

        for (int i = length; i > length - (timeToCollect / 10); i--) {
            allTreasure += (MiddleEarth1.weights[i] * 4);
        }

        return allTreasure;

    }

    public static int countTreasurePerDwarf(int allTreasure) {
        return allTreasure / MiddleEarth1.weights.length;
    }

    public static int countTreasureForGandalf(int allTreasure) {
        return allTreasure % MiddleEarth1.weights.length;
    }

    public static void findBilbo() {
        System.out.println("Bilbo has been lost at the very beginning of the story...");
    }

}
