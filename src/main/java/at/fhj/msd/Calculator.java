package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static Logger logger = LogManager.getLogger();

    double add(double number1, double number2){
        logger.debug(number1 + "+" + number2);
        return number1 + number2;
    }
    double minus(double number1, double number2){
        logger.debug(number1 + "-" + number2);
        return number1 - number2;
    }
    double divide(double number1, double number2) throws ArithmeticException{
        logger.debug(number1 + "/" + number2);
        if(number2 == 0) {
            logger.error("Division by zero");
            throw new ArithmeticException();
        }
        return number1 / number2;
    }
    double multiply(double number1, double number2){
        logger.debug(number1 + "*" + number2);
        return number1 * number2;
    }
    double factorial(double number){
        int factorial = 1;
        if(number < 0)
            return 0;
        for(int i = 1; i <= number; i++){
            factorial *= i;
        }
        logger.debug("factorial with number: " + number);
        return factorial;
    }
}
