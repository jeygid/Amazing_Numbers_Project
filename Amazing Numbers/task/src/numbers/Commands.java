package numbers;

import java.util.ArrayList;
import java.util.Set;

public class Commands {

    public static void checkSingleNumber(long number) {

        Maths.checkAllValues(number);

        Maths.printPropertiesForSingleNumber(number);
    }

    public static void checkPropertyNumbers(long number, long quantity, Set<String> properties) {

        int counter = 0;
        long checkNum = number;
        long truePropertiesCounter = 0;
        ArrayList<Long> result = new ArrayList<>();

        while (counter != quantity) {

            for (String property : properties) {

                switch (property) {
                    case "EVEN":
                        Maths.isEven(checkNum);
                        if (Maths.even) {
                            truePropertiesCounter++;
                        }
                        Maths.even = false;
                        break;
                    case "ODD":
                        Maths.isOdd(checkNum);
                        if (Maths.odd) {
                            truePropertiesCounter++;
                        }
                        Maths.odd = false;
                        break;
                    case "BUZZ":
                        Maths.isBuzz(checkNum);
                        if (Maths.buzz) {
                            truePropertiesCounter++;
                        }
                        Maths.buzz = false;
                        break;
                    case "DUCK":
                        Maths.isDuck(checkNum);
                        if (Maths.duck) {
                            truePropertiesCounter++;
                        }
                        Maths.duck = false;
                        break;
                    case "PALINDROMIC":
                        Maths.isPalindromic(checkNum);
                        if (Maths.palindromic) {
                            truePropertiesCounter++;
                        }
                        Maths.palindromic = false;
                        break;
                    case "GAPFUL":
                        Maths.isGapful(checkNum);
                        if (Maths.gapful) {
                            truePropertiesCounter++;
                        }
                        Maths.gapful = false;
                        break;
                    case "SPY":
                        Maths.isSpy(checkNum);
                        if (Maths.spy) {
                            truePropertiesCounter++;
                        }
                        Maths.spy = false;
                        break;
                    case "SQUARE":
                        Maths.isSquare(checkNum);
                        if (Maths.square) {
                            truePropertiesCounter++;
                        }
                        Maths.square = false;
                        break;
                    case "SUNNY":
                        Maths.isSunny(checkNum);
                        if (Maths.sunny) {
                            truePropertiesCounter++;
                        }
                        Maths.sunny = false;
                        break;
                    case "JUMPING":
                        Maths.isJumping(checkNum);
                        if (Maths.jumping) {
                            truePropertiesCounter++;
                        }
                        Maths.jumping = false;
                        break;
                    case "HAPPY":
                        Maths.isHappy(checkNum);
                        if (Maths.happy) {
                            truePropertiesCounter++;
                        }
                        Maths.happy = false;
                        break;
                    case "SAD":
                        Maths.isSad(checkNum);
                        if (Maths.sad) {
                            truePropertiesCounter++;
                        }
                        Maths.sad = false;
                        break;
                }

            }

            if (truePropertiesCounter == properties.size()) {
                counter++;
                result.add(checkNum);
            }

            truePropertiesCounter = 0;

            checkNum++;

        }

        System.out.println();

        for (Long num : result) {

            Maths.checkAllValues(num);

            Maths.printPropertiesForNumbers(num);

            Maths.setAllValuesToFalse();

        }


    }

    public static void checkPropertyNumbers(long number, long quantity,
                                            Set<String> properties, Set<String> noProperties) {

        int counter = 0;
        long checkNum = number;
        long propertiesCounter = 0;
        ArrayList<Long> result = new ArrayList<>();

        ArrayList<String> allProperties = new ArrayList<>();

        allProperties.addAll(properties);
        allProperties.addAll(noProperties);

        while (counter != quantity) {

            for (String property : allProperties) {

                switch (property) {
                    case "EVEN":
                        Maths.isEven(checkNum);
                        if (Maths.even) {
                            propertiesCounter++;
                        }
                        Maths.even = false;
                        break;
                    case "ODD":
                        Maths.isOdd(checkNum);
                        if (Maths.odd) {
                            propertiesCounter++;
                        }
                        Maths.odd = false;
                        break;
                    case "BUZZ":
                        Maths.isBuzz(checkNum);
                        if (Maths.buzz) {
                            propertiesCounter++;
                        }
                        Maths.buzz = false;
                        break;
                    case "DUCK":
                        Maths.isDuck(checkNum);
                        if (Maths.duck) {
                            propertiesCounter++;
                        }
                        Maths.duck = false;
                        break;
                    case "PALINDROMIC":
                        Maths.isPalindromic(checkNum);
                        if (Maths.palindromic) {
                            propertiesCounter++;
                        }
                        Maths.palindromic = false;
                        break;
                    case "GAPFUL":
                        Maths.isGapful(checkNum);
                        if (Maths.gapful) {
                            propertiesCounter++;
                        }
                        Maths.gapful = false;
                        break;
                    case "SPY":
                        Maths.isSpy(checkNum);
                        if (Maths.spy) {
                            propertiesCounter++;
                        }
                        Maths.spy = false;
                        break;
                    case "SQUARE":
                        Maths.isSquare(checkNum);
                        if (Maths.square) {
                            propertiesCounter++;
                        }
                        Maths.square = false;
                        break;
                    case "SUNNY":
                        Maths.isSunny(checkNum);
                        if (Maths.sunny) {
                            propertiesCounter++;
                        }
                        Maths.sunny = false;
                        break;
                    case "JUMPING":
                        Maths.isJumping(checkNum);
                        if (Maths.jumping) {
                            propertiesCounter++;
                        }
                        Maths.jumping = false;
                        break;
                    case "HAPPY":
                        Maths.isHappy(checkNum);
                        if (Maths.happy) {
                            propertiesCounter++;
                        }
                        Maths.happy = false;
                        break;
                    case "SAD":
                        Maths.isSad(checkNum);
                        if (Maths.sad) {
                            propertiesCounter++;
                        }
                        Maths.sad = false;
                        break;
                    case "-EVEN":
                        Maths.isEven(checkNum);
                        if (!Maths.even) {
                            propertiesCounter++;
                        }
                        Maths.even = false;
                        break;
                    case "-ODD":
                        Maths.isOdd(checkNum);
                        if (!Maths.odd) {
                            propertiesCounter++;
                        }
                        Maths.odd = false;
                        break;
                    case "-BUZZ":
                        Maths.isBuzz(checkNum);
                        if (!Maths.buzz) {
                            propertiesCounter++;
                        }
                        Maths.buzz = false;
                        break;
                    case "-DUCK":
                        Maths.isDuck(checkNum);
                        if (!Maths.duck) {
                            propertiesCounter++;
                        }
                        Maths.duck = false;
                        break;
                    case "-PALINDROMIC":
                        Maths.isPalindromic(checkNum);
                        if (!Maths.palindromic) {
                            propertiesCounter++;
                        }
                        Maths.palindromic = false;
                        break;
                    case "-GAPFUL":
                        Maths.isGapful(checkNum);
                        if (!Maths.gapful) {
                            propertiesCounter++;
                        }
                        Maths.gapful = false;
                        break;
                    case "-SPY":
                        Maths.isSpy(checkNum);
                        if (!Maths.spy) {
                            propertiesCounter++;
                        }
                        Maths.spy = false;
                        break;
                    case "-SQUARE":
                        Maths.isSquare(checkNum);
                        if (!Maths.square) {
                            propertiesCounter++;
                        }
                        Maths.square = false;
                        break;
                    case "-SUNNY":
                        Maths.isSunny(checkNum);
                        if (!Maths.sunny) {
                            propertiesCounter++;
                        }
                        Maths.sunny = false;
                        break;
                    case "-JUMPING":
                        Maths.isJumping(checkNum);
                        if (!Maths.jumping) {
                            propertiesCounter++;
                        }
                        Maths.jumping = false;
                        break;
                    case "-HAPPY":
                        Maths.isHappy(checkNum);
                        if (!Maths.happy) {
                            propertiesCounter++;
                        }
                        Maths.happy = false;
                        break;
                    case "-SAD":
                        Maths.isSad(checkNum);
                        if (!Maths.sad) {
                            propertiesCounter++;
                        }
                        Maths.sad = false;
                        break;
                }


            }

            if (propertiesCounter == allProperties.size()) {
                counter++;
                result.add(checkNum);
            }

            propertiesCounter = 0;

            checkNum++;

        }

        System.out.println();

        for (Long num : result) {

            Maths.checkAllValues(num);

            Maths.printPropertiesForNumbers(num);

            Maths.setAllValuesToFalse();

        }
    }

    public static void checkNoPropertyNumbers(long number, long quantity) {

        System.out.println();

        for (long actNumber = number; actNumber <= (number + quantity) - 1; actNumber++) {

            Maths.checkAllValues(actNumber);

            Maths.printPropertiesForNumbers(actNumber);

            Maths.setAllValuesToFalse();


        }
    }

}
