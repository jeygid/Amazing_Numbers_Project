package numbers;

import java.util.*;

public class Runner {

    public static void run() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Amazing Numbers!\n" +
                "\nSupported requests:\n" +
                "- enter a natural number to know its properties;\n" +
                "- enter two natural numbers to obtain the properties of the list:\n" +
                "  * the first parameter represents a starting number;\n" +
                "  * the second parameter shows how many consecutive numbers are to be printed;\n" +
                "- two natural numbers and properties to search for;\n" +
                "- a property preceded by minus must not be present in numbers;\n" +
                "- separate the parameters with one space;\n" +
                "- enter 0 to exit.");

        while (true) {

            System.out.println("\nEnter a request:");

            String command = scanner.nextLine();

            /* Exit */

            if (command.equals("0")) {
                System.out.println("\nGoodbye!");
                break;
            }

            /* Single number checking */

            if (command.matches("[-]?[0-9]+")) {

                long number = Long.parseLong(command);

                if (number < 0) {
                    System.out.println("The first parameter should be a natural number or zero.");
                    continue;
                }

                Commands.checkSingleNumber(number);

                /* Checking row of numbers with properties */

            } else if (command.matches("[0-9]+[ ][-]?[0-9]+([ ][\\S]+)+")) {

                String[] arr = command.split(" ");

                long number = Long.parseLong(arr[0]);
                long quantity = Long.parseLong(arr[1]);

                Set<String> properties = new HashSet<>();
                Set<String> noProperties = new HashSet<>();

                String prop;

                for (int i = 2; i < arr.length; i++) {
                    prop = arr[i].toUpperCase(Locale.ROOT);
                    if (prop.startsWith("-")) {
                        noProperties.add(prop);
                    } else {
                        properties.add(prop);
                    }
                }

                if (number < 0) {
                    System.out.println("The first parameter should be a natural number or zero.");
                    continue;
                }

                if (quantity <= 0) {
                    System.out.println("The second parameter should be a natural number.");
                    continue;
                }

                String regEx = "[-]?(BUZZ|DUCK|PALINDROMIC|GAPFUL|SPY|EVEN|ODD|SUNNY|SQUARE|JUMPING|HAPPY|SAD)";
                int wrongPropertiesCounter = 0;
                StringBuilder wrongPropertiesBuilder = new StringBuilder();

                for (String property : properties) {
                    if (!property.matches(regEx)) {
                        wrongPropertiesBuilder.append(property).append(", ");
                        wrongPropertiesCounter++;
                    }
                }

                for (String property : noProperties) {
                    if (!property.matches(regEx)) {
                        wrongPropertiesBuilder.append(property).append(", ");
                        wrongPropertiesCounter++;
                    }
                }

                if (wrongPropertiesCounter > 0) wrongPropertiesBuilder.setLength(wrongPropertiesBuilder.length() - 2);

                if (wrongPropertiesCounter > 1) {
                    System.out.println("The properties [" + wrongPropertiesBuilder + "] are wrong.\n" +
                            "Available properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, EVEN, " +
                            "ODD, SQUARE, SUNNY, JUMPING, HAPPY, SAD]");
                    continue;
                } else if (wrongPropertiesCounter == 1) {
                    System.out.println("The property [" + wrongPropertiesBuilder + "] is wrong.\n" +
                            "Available properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, EVEN, " +
                            "ODD, SQUARE, SUNNY, JUMPING, HAPPY, SAD]");
                    continue;
                }


                if ((properties.contains(Properties.EVEN.name()) && properties.contains(Properties.ODD.name())) ||
                        (noProperties.contains("-" + Properties.EVEN.name()) && noProperties.contains("-" + Properties.ODD.name()))
                ) {
                    System.out.println("The request contains mutually exclusive properties: [EVEN, ODD]\n" +
                            "There are no numbers with these properties.");
                    continue;
                }

                if ((properties.contains(Properties.DUCK.name()) && properties.contains(Properties.SPY.name())) ||
                        (noProperties.contains("-" + Properties.DUCK.name()) && noProperties.contains("-" + Properties.SPY.name()))
                ) {
                    System.out.println("The request contains mutually exclusive properties: [DUCK, SPY]\n" +
                            "There are no numbers with these properties.");
                    continue;
                }

                if ((properties.contains(Properties.SQUARE.name()) && properties.contains(Properties.SUNNY.name())) ||
                        (noProperties.contains("-" + Properties.SQUARE.name()) && noProperties.contains("-" + Properties.SUNNY.name()))
                ) {
                    System.out.println("The request contains mutually exclusive properties: [SQUARE, SUNNY]\n" +
                            "There are no numbers with these properties.");
                    continue;
                }

                if ((properties.contains(Properties.HAPPY.name()) && properties.contains(Properties.SAD.name())) ||
                        (noProperties.contains("-" + Properties.HAPPY.name()) && noProperties.contains("-" + Properties.SAD.name()))
                ) {
                    System.out.println("The request contains mutually exclusive properties: [HAPPY, SAD]\n" +
                            "There are no numbers with these properties.");
                    continue;
                }

                if (properties.contains(Properties.EVEN.name()) && noProperties.contains("-" + Properties.EVEN.name()))
                {
                    System.out.println("The request contains mutually exclusive properties: [EVEN, -EVEN]\n" +
                            "There are no numbers with these properties.");
                    continue;
                }

                if (properties.contains(Properties.ODD.name()) && noProperties.contains("-" + Properties.ODD.name()))
                {
                    System.out.println("The request contains mutually exclusive properties: [EVEN, -ODD]\n" +
                            "There are no numbers with these properties.");
                    continue;
                }

                if (properties.contains(Properties.BUZZ.name()) && noProperties.contains("-" + Properties.BUZZ.name()))
                {
                    System.out.println("The request contains mutually exclusive properties: [EVEN, -ODD]\n" +
                            "There are no numbers with these properties.");
                    continue;
                }

                if (properties.contains(Properties.DUCK.name()) && noProperties.contains("-" + Properties.DUCK.name()))
                {
                    System.out.println("The request contains mutually exclusive properties: [EVEN, -ODD]\n" +
                            "There are no numbers with these properties.");
                    continue;
                }

                if (properties.contains(Properties.PALINDROMIC.name()) && noProperties.contains("-" + Properties.PALINDROMIC.name()))
                {
                    System.out.println("The request contains mutually exclusive properties: [EVEN, -ODD]\n" +
                            "There are no numbers with these properties.");
                    continue;
                }

                if (properties.contains(Properties.GAPFUL.name()) && noProperties.contains("-" + Properties.GAPFUL.name()))
                {
                    System.out.println("The request contains mutually exclusive properties: [EVEN, -ODD]\n" +
                            "There are no numbers with these properties.");
                    continue;
                }

                if (properties.contains(Properties.SPY.name()) && noProperties.contains("-" + Properties.SPY.name()))
                {
                    System.out.println("The request contains mutually exclusive properties: [EVEN, -ODD]\n" +
                            "There are no numbers with these properties.");
                    continue;
                }

                if (properties.contains(Properties.SQUARE.name()) && noProperties.contains("-" + Properties.SQUARE.name()))
                {
                    System.out.println("The request contains mutually exclusive properties: [EVEN, -ODD]\n" +
                            "There are no numbers with these properties.");
                    continue;
                }

                if (properties.contains(Properties.SUNNY.name()) && noProperties.contains("-" + Properties.SUNNY.name()))
                {
                    System.out.println("The request contains mutually exclusive properties: [EVEN, -ODD]\n" +
                            "There are no numbers with these properties.");
                    continue;
                }

                if (properties.contains(Properties.JUMPING.name()) && noProperties.contains("-" + Properties.JUMPING.name()))
                {
                    System.out.println("The request contains mutually exclusive properties: [EVEN, -ODD]\n" +
                            "There are no numbers with these properties.");
                    continue;
                }

                if (properties.contains(Properties.HAPPY.name()) && noProperties.contains("-" + Properties.HAPPY.name()))
                {
                    System.out.println("The request contains mutually exclusive properties: [EVEN, -ODD]\n" +
                            "There are no numbers with these properties.");
                    continue;
                }

                if (properties.contains(Properties.SAD.name()) && noProperties.contains("-" + Properties.SAD.name()))
                {
                    System.out.println("The request contains mutually exclusive properties: [EVEN, -ODD]\n" +
                            "There are no numbers with these properties.");
                    continue;
                }

                if (noProperties.isEmpty()) {
                    Commands.checkPropertyNumbers(number, quantity, properties);
                } else {
                    Commands.checkPropertyNumbers(number, quantity, properties, noProperties);
                }

                /* Checking row of numbers with no properties */

            } else if (command.matches("[0-9]+[ ][-]?[0-9]+")) {

                String[] arr = command.split(" ");

                long number = Long.parseLong(arr[0]);
                long quantity = Long.parseLong(arr[1]);

                if (number <= 0) {
                    System.out.println("The first parameter should be a natural number or zero.");
                    continue;
                }

                if (quantity <= 0) {
                    System.out.println("The second parameter should be a natural number.");
                    continue;
                }

                Commands.checkNoPropertyNumbers(number, quantity);

            }

            Maths.setAllValuesToFalse();

        }
    }
}

