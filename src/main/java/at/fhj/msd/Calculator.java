package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 * <p>Calculator class.</p>
 *
 * @author Vinzent Schmid
 * @version $Id: $Id
 */
public class Calculator {
    private static Logger logger = LogManager.getLogger();
   /**
    * @param number1 Parameter1
    * @param number2 Parameter2
    * @return the result of two numbers which were added
    */
    public double add(double number1, double number2){
        logger.debug(number1 + "+" + number2);
        return number1 + number2;
    }
    /**
     * @param number1 Parameter 1
     * @param number2 Parameter 2
     * @return the result of numbers which were subtracted
     */
    public double minus(double number1, double number2){
        logger.debug(number1 + "-" + number2);
        return number1 - number2;
    }
    /**
     * @param number1 Parameter 1
     * @param number2 Parameter 2
     * @return the result of numbers which were divided
     */
    public double divide(double number1, double number2) throws ArithmeticException{
        logger.debug(number1 + "/" + number2);
        if(number2 == 0) {
            logger.error("Division by zero");
            throw new ArithmeticException();
        }
        return number1 / number2;
    }
    /**
     * @param number1 Parameter 1
     * @param number2 Parameter 2
     * @return : the result of numbers which were multiplied
     */
    public double multiply(double number1, double number2){
        logger.debug(number1 + "*" + number2);
        return number1 * number2;
    }
    /**
     * @param number Parameter 1
     * @return : the factorial result of a number
     */
    public double factorial(double number){
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
