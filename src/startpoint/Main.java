package startpoint;

import calculation.CalculationUtils;
import logger.Logger;

import java.util.Scanner;

public class Main {

    private static final String RESULT = "Result : ";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double first;
        double second;
        int choose;
        int continueKey;
        do {
            Logger.logToConsole("Hello in simple calculator\n Choose operation\n" +
                    "1 - addition\n" +
                    "2 - subtraction\n" +
                    "3 - multiplication\n" +
                    "4 - division\n");


            choose = scanner.nextInt();

            Logger.logToConsole("Insert first digit : ");
            first = scanner.nextDouble();
            Logger.logToConsole("Insert second digit : ");
            second = scanner.nextDouble();

            switch (choose) {
                case 1:
                    Logger.logToConsole(RESULT + String.valueOf(CalculationUtils.add(first, second)));
                    break;
                case 2:
                    Logger.logToConsole(RESULT + String.valueOf(CalculationUtils.subtract(first, second)));
                    break;
                case 3:
                    Logger.logToConsole(RESULT + String.valueOf(CalculationUtils.multiply(first, second)));
                    break;
                case 4:
                    Logger.logToConsole(RESULT + String.valueOf(CalculationUtils.divide(first, second)));
                    break;
                default:
                    Logger.logToConsole("Not available function");
            }
            Logger.logToConsole("Continue work with calculator? yes-1, no-2");
            continueKey = scanner.nextInt();
        } while (continueKey == 1);
    }
}
