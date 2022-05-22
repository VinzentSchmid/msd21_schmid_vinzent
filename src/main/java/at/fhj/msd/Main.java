package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Main {
    private static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        double number1 = 3.0;
        double number2 = 1.0;

        Calculator calculator = new Calculator();
        System.out.println(calculator.add(number1, number2));
        System.out.println(calculator.minus(number1, number2));
        System.out.println(calculator.divide(number1, number2));
        System.out.println(calculator.multiply(number1, number2));
        System.out.println(calculator.factorial(number1));

        logger.info("It is a info logger.");
        logger.error("It is an error logger.");
    }
}
