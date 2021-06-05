package basics.variables_operators;

import java.util.Scanner;

public class FirstWork {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
        // 2. get reminder without modulo
        System.out.println("Give me two numbers!");
        int x = input.nextInt();
        int y = input.nextInt();
        int reminder = x - x / y * y;
        System.out.printf("Reminder after %d / %d = %d\n", x, y, reminder);
         */

        /*
        // 3. count average of three numbers
        System.out.println("Give me three numbers!");
        int first = input.nextInt();
        int second = input.nextInt();
        int third = input.nextInt();
        double avg = (first + second + third) / 3d;
        System.out.printf("Average of %.2f, %.2f, %.2f is %.2f", first, second, third, avg);
         */

        /*
        // 4. say hello to the "user"
        String greeting = ", Welcome To Hell!";
        System.out.println("What is your name?");
        String userName = input.nextLine();
        System.out.println(userName + greeting);
         */

        /*
        // 5. print + - * / of two input numbers
        System.out.println("Give me two numbers!");
        int x = input.nextInt();
        int y = input.nextInt();
        System.out.printf("%d + %d = %d\n", x, y, (x + y));
        System.out.printf("%d - %d = %d\n", x, y, (x - y));
        System.out.printf("%d * %d = %d\n", x, y, (x * y));
        System.out.printf("%d / %d = %d\n", x, y, (x / y));
         */

        /*
        // 6. concatenate two letters
        System.out.println("Give me two letters!");
        char first = input.next().charAt(0);
        char second = input.next().charAt(0);
        System.out.println("" + first + second);
         */

        /*
        // 7. print true if number is greater than 0, false otherwise
        System.out.println("Give me a number!");
        int x = input.nextInt();
        System.out.println(x > 0);
         */

        /*
        // 8. find max of two numbers
        int x = 333;
        int y = 222;
        System.out.println(Math.max(x, y));
         */

        /*
        // 9. power up a number with exponent 2
        System.out.println("Give me a number!");
        int x = input.nextInt();
        System.out.println(Math.pow(x, 2));
         */

        /*
        // 10. power up a number with exponent input number
        System.out.println("Give me two numbers!");
        int basic = input.nextInt();
        int exponent = input.nextInt();
        System.out.printf("%d on %dth = %.0f", basic, exponent, (Math.pow(basic, exponent)));
         */

        /*
        // 11. print square root of a number
        int x = 225;
        System.out.println(Math.sqrt(x));
         */

        /*
        // 12. generate random between 0 and 9
        System.out.println((int) (Math.random() * 10));
         */

        /*
        // 13. generate random between two input numbers
        System.out.println("Give me two numbers!");
        int x = input.nextInt();
        int y = input.nextInt();
        int min = Math.min(x, y);
        int max = Math.max(x, y);       // can increase by 1, if largest number is included
        int random = (int)(Math.random() * (max - min) + min);
        System.out.printf("Your random number is %d.\n", random);
         */

        /*
        // 14. print the length of a text
        String s = "random string for the task";
        System.out.printf("The random string's length is %d", s.length());
         */

        /*
        // 15. create a string from a number
        int number = 666;
        String s = String.valueOf(number);
         */

        /*
        // 16. say hello to the "user"
        String greeting = "Üdvözöllek, kedves %s! Jó, hogy újra itt vagy!";
        System.out.println("Add meg a neved!");
        String name = input.nextLine();
        System.out.printf(greeting, name);
         */

        /*
        // 17. compare two words
        System.out.println("Give me two words!");
        String first = input.next();
        String second = input.next();
        String result = (first.equals(second) ? "Yes!" : "No...");
        System.out.println("Do your words equals? " + result);
         */

        /*
        // 18. check if input text contains one word or more
        System.out.println("Give me a text!");
        String userText = input.nextLine();
        boolean containsMoreWords = userText.trim().contains(" ");          // without trim(), it might return false result
        System.out.println(containsMoreWords ? "Your text contains more words." : "Your text is a single word.");
         */

        /*
        // 19. print first and last letter of a string
        String text = "There is nothing either good or bad, but thinking makes it so";
        System.out.printf("First letter of the text is %s, last one is %s", text.charAt(0), text.charAt(text.length() - 1));
         */

        /*
        // 20. print first and last occurrence of letter 't'
        String text = "There is nothing either good or bad, but thinking makes it so";
        System.out.printf("First 't' in the text is at %d, last one is at %d", text.indexOf('t'), text.lastIndexOf('t'));
         */

        /*
        // 21. replace dots with hyphens
        String text = "2021.05.05";
        String replaced = text.replaceAll("\\.", "-");
        System.out.println(replaced);
         */

        /*
        // 22. print the number of digits of a number
        int x = 12345;
        int length = String.valueOf(x).length();
        System.out.println((x >= 0 ? length : length - 1));
         */

        /*
        // 23. print first 10 characters of a text
        String text = "In a hole in the ground there lived a hobbit.";
        System.out.println(text.substring(0, 10));
         */

        /*
        // 24. print first word of a text
        String text = "In a hole in the ground there lived a hobbit.";
        int firstSpaceIndex = text.indexOf(" ");
        System.out.println(text.substring(0, firstSpaceIndex));
         */

    }

}
