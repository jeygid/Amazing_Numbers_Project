package numbers;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Maths {

    static boolean even = false;
    static boolean odd = false;
    static boolean buzz = false;
    static boolean duck = false;
    static boolean palindromic = false;
    static boolean gapful = false;
    static boolean spy = false;
    static boolean square = false;
    static boolean sunny = false;
    static boolean jumping = false;
    static boolean happy = false;
    static boolean sad = false;

    public static void setAllValuesToFalse() {

        even = false;
        odd = false;
        buzz = false;
        duck = false;
        palindromic = false;
        gapful = false;
        spy = false;
        square = false;
        sunny = false;
        jumping = false;
        happy = false;
        sad = false;

    }

    public static void checkAllValues(long number) {

        Maths.isEven(number);

        Maths.isOdd(number);

        Maths.isBuzz(number);

        Maths.isDuck(number);

        Maths.isPalindromic(number);

        Maths.isGapful(number);

        Maths.isSpy(number);

        Maths.isSquare(number);

        Maths.isSunny(number);

        Maths.isJumping(number);

        Maths.isHappy(number);

        Maths.isSad(number);

    }

    public static void printPropertiesForNumbers(long num) {

        String result = num + " is ";

        if (Maths.even) result = result + "even, ";
        if (Maths.odd) result = result + "odd, ";
        if (Maths.buzz) result = result + "buzz, ";
        if (Maths.duck) result = result + "duck, ";
        if (Maths.palindromic) result = result + "palindromic, ";
        if (Maths.gapful) result = result + "gapful, ";
        if (Maths.spy) result = result + "spy, ";
        if (Maths.square) result = result + "square, ";
        if (Maths.sunny) result = result + "sunny, ";
        if (Maths.jumping) result = result + "jumping, ";
        if (Maths.happy) result = result + "happy, ";
        if (Maths.sad) result = result + "sad, ";

        result = result.substring(0, result.length() - 2);

        System.out.println(result);
    }

    public static void printPropertiesForSingleNumber(long number) {

        System.out.println("\nProperties of " + number + "\n" +
                "        even: " + Maths.even + "\n" +
                "        odd: " + Maths.odd + "\n" +
                "        buzz: " + Maths.buzz + "\n" +
                "        duck: " + Maths.duck + "\n" +
                "        palindromic: " + Maths.palindromic + "\n" +
                "        gapful: " + Maths.gapful + "\n" +
                "        spy: " + Maths.spy + "\n" +
                "        square: " + Maths.square + "\n" +
                "        sunny: " + Maths.sunny + "\n" +
                "        jumping: " + Maths.jumping + "\n" +
                "        happy: " + Maths.happy + "\n" +
                "        sad: " + Maths.sad);
        ;
    }

    public static void isEven(long a) {

        if (a % 2 == 0) {
            even = true;
        }
    }

    public static void isOdd(long a) {

        if (a % 2 != 0) {
            odd = true;
        }
    }

    public static void isBuzz(long a) {

        String aString = String.valueOf(a);

        if (a % 7 == 0 || aString.substring(aString.length() - 1).equals("7")) {
            buzz = true;
        }
    }

    public static void isDuck(long a) {

        String aString = String.valueOf(a);

        Pattern pattern = Pattern.compile("[0]+");
        Matcher matcher = pattern.matcher(aString);
        int counter = 0;
        while (matcher.find()) {
            counter++;
        }

        if (counter > 0) {
            duck = true;
        }
    }

    public static void isPalindromic(long a) {

        String aString = String.valueOf(a);

        StringBuilder str = new StringBuilder(aString);
        String aStringReversed = str.reverse().toString();

        if (aStringReversed.equals(aString)) {
            palindromic = true;
        }
    }

    public static void isGapful(long a) {

        String aString = String.valueOf(a);

        int length = aString.length();
        int gap = Integer.parseInt(aString.substring(0, 1) + aString.substring(length - 1));

        if (length >= 3 && a % gap == 0) {
            gapful = true;
        }
    }

    public static void isSpy(long a) {

        String aString = String.valueOf(a);

        long mult = 1;
        long sum = 0;

        for (int i = 0; i <= aString.length() - 1; i++) {
            long val = Long.parseLong(String.valueOf(aString.charAt(i)));
            sum += val;
            mult *= val;
        }

        if (sum == mult) spy = true;
    }

    public static void isSquare(long a) {
        double x = Math.sqrt(a);
        if (x % 1 == 0) square = true;
    }

    public static void isSunny(long a) {
        double x = Math.sqrt(a + 1);
        if (x % 1 == 0) sunny = true;
    }

    public static void isJumping(long a) {

        String aString = String.valueOf(a);

        if (aString.length() == 1) {
            jumping = true;
        } else if (aString.length() > 1) {

            int counter = 0;

            for (int i = 1; i < aString.length(); i++) {
                int b = Integer.parseInt(String.valueOf(aString.charAt(i - 1)));
                int c = Integer.parseInt(String.valueOf(aString.charAt(i)));

                if (b - c == 1 || c - b == 1) {
                    counter++;
                }

            }
            if (counter == aString.length() - 1) jumping = true;
        }
    }

    public static void isHappy(long a) {

        Set<Long> digits = new HashSet<>();

        while (digits.add(a)) {

            int result = 0;

            while (a > 0) {
                result += Math.pow(a % 10, 2);
                a = a / 10;
            }

            a = result;
        }

        if (a == 1) happy = true;

    }

    public static void isSad(long a) {

        Set<Long> digits = new HashSet<>();

        while (digits.add(a)) {

            int result = 0;

            while (a > 0) {
                result += Math.pow(a % 10, 2);
                a = a / 10;
            }

            a = result;
        }

        if (a != 1) sad = true;

    }

}



