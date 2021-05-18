package arrays;

public class StreetAndHouses {

    public static void main(String[] args) {

        // voluntary task: street with houses

        int[] street = ArraysBasic.createArray(10, 1, 5);

        System.out.println("The street's houses look like...");
        System.out.println(ArraysBasic.arrToString(street, " - "));

        for (int i : street) {
            System.out.println(getMessage(i));
        }

    }

    public static String getMessage(int n) {
        return (n % 2 == 0? "szeretem a páros számot!" : "ó jaj!");
    }

}
