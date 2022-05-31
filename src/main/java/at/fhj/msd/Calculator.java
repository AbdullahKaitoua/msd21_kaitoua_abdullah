

package at.fhj.msd;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.*;


/**
 * implements  addition, subtraction,division multiplication and faculty methods
 * with logging
 */

public class Calculator {
    /**
     * create logger
     */
    private static Logger logger = LogManager.getLogger();


    /**
     *
     * adds two numbers
     * @param number1 to be added
     * @param number2 to be added
     * @return result of adding two numbers g
     */
    public double add(double number1, double number2) {
        logger.debug(number1 + "+" +number2);

        return number1 + number2;
    }

    /**
     *
     * compute the difference between two numbers
     * @param number1 to be subtracts
     * @param number2 to be subtracts
     * @return result of subtracting two numbers
     */

    public double minus(double number1, double number2) {
        logger.debug(number1 + "-" +number2);

        return number1 - number2;
    }

    /**
     *
     * divide two numbers
     * @param number1 to be divided
     * @param number2 to be divided
     * @return result of division two numbers given over the parameters
     * @throws ArithmeticException by Division by zero exception occurred
     */


    public double divide(double number1, double number2) throws ArithmeticException{
        logger.debug(number1 + "/" + number2);
        if(number2 == 0) {
            logger.error("Division by zero");
            throw new ArithmeticException();
        }else return number1 / number2;
    }

    /**
     *
     * multiply two numbers
     * @param number1 to be multiplied
     * @param number2 to be multiplied
     * @return result of division two numbers given over the parameters
     * @throws ArithmeticException if divided by zero exception occurred
     */

    public double multiply(double number1, double number2) {
        logger.debug(number1 + "*" +number2);
        return number1 * number2;
    }

    /**
     *
     * compute faculty of a number
     * @param number to be computed
     * @return result of computed faculty

     */



    public int facu(int number) {
        logger.debug(number+"!");
        if (number > 1) return number *= facu(number - 1);
        else if (number == 1)return 1;
        else return 0;
    }


}