package calculation;

import logger.Logger;

public class CalculationUtils {

    public static double add(double one, double second) {
        return one + second;
    }

    public static double subtract(double one, double second) {
        return one - second;
    }

    public static double multiply(double one, double second) {
        return one * second;
    }

    public static double divide(double one, double second) {
        double result = 0;
        try {
            result = one / second;
        } catch (ArithmeticException e) {
            Logger.logToConsole("Exception : can`t divide by zero!");
        }
        return result;
    }
}
