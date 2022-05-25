package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 * @author Vinzent Schmid
 **/
public class Calculator {
    private static Logger logger = LogManager.getLogger();
    /**
     * @param number1;
     * @param number2;
     * @return : the result of numbers which were added
     **/
    double add(double number1, double number2){
        logger.debug(number1 + "+" + number2);
        return number1 + number2;
    }
    /**
     * @param number1;
     * @param number2;
     * @return : the result of numbers which were subtracted
     **/
    double minus(double number1, double number2){
        logger.debug(number1 + "-" + number2);
        return number1 - number2;
    }
    /**
     * @param number1;
     * @param number2;
     * @return : the result of numbers which were divided
     **/
    double divide(double number1, double number2) throws ArithmeticException{
        logger.debug(number1 + "/" + number2);
        if(number2 == 0) {
            logger.error("Division by zero");
            throw new ArithmeticException();
        }
        return number1 / number2;
    }
    /**
     * @param number1;
     * @param number2;
     * @return : the result of numbers which were multiplied
     **/
    double multiply(double number1, double number2){
        logger.debug(number1 + "*" + number2);
        return number1 * number2;
    }
    /**
     * @param number;
     * @return : the factorial result of a number
     **/
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
