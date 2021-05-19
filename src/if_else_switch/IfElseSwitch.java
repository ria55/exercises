package if_else_switch;

public class IfElseSwitch {

    public static int[] ageLimits = {0, 3, 13, 20};
    public static String[] greetings = {"Hello, Marty McFly!", "bru-bru-bruu babuci", "szióka", "csá", "Jó napot kívánok!"};

    public static char[] vowels = {'a', 'e', 'i', 'o', 'u'};
    public static char[] consonants = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x',
                'y', 'z'};

    public static void main(String[] args) {
        System.out.println(isPrime(4));
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static String getGreeting(int age) {
        for (int i = 0; i < ageLimits.length; i++) {
            if (age < ageLimits[i]) {
                return greetings[i];
            }
        }
        return greetings[greetings.length - 1];
    }

    public static String getMessageForColor(String color) {
        if (color.equals("piros")) {
            return "A piros tilos!";
        } else if (color.equals("zöld")) {
            return "Szabad!";
        }
        return "N/A";
    }

    public static boolean canBeRectangularTriangle(double one, double two, double three) {
        double c = Math.max(Math.max(one, two), three);
        double a = Math.min(Math.min(one, two), three);
        double b = one + two + three - c - a;

        return Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2);
    }

    public static String getCharType(char c) {
        for (char ch : vowels) {
            if (ch == Character.toLowerCase(c)) {
                return "vowel";
            }
        }
        for (char ch : consonants) {
            if (ch == c) {
                return "consonant";
            }
        }
        return "n/a";
    }

    public static String getLetterType(char c) {
        if (Character.isLetter(c)) {
            for (char ch : vowels) {
                if (ch == Character.toLowerCase(c)) {
                    return "vowel";
                }
            }
            return "consonant";
        }
        return "n/a";
    }

    public static String getCharTypeWithSwitch(char c) {
        return switch (Character.toLowerCase(c)) {
            case 'a', 'e', 'i', 'o', 'u'
                    -> "vowel";
            case 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'
                    -> "consonant";
            default
                    -> "n/a";
        };
    }

    public static boolean isLeapYear(int year) {
        return year >= 1582 && ( year % 400 == 0 || (year % 100 != 0 && year % 4 == 0) );
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
