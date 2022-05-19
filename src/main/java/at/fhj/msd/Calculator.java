package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static Logger logger = LogManager.getLogger();

    public Calculator() {
    }

    public double add(double number1, double number2) {
        logger.debug(number1 + "+" +number2);

        return number1 + number2;
    }

    public double minus(double number1, double number2) {
        logger.debug(number1 + "-" +number2);

        return number1 - number2;
    }


    public double divide(double number1, double number2) throws ArithmeticException{
        logger.debug(number1 + "/" + number2);
        if(number2 == 0) {
            logger.error("Division by zero");
            throw new ArithmeticException();
        }else return number1 / number2;
    }

    public double multiply(double number1, double number2) {
        logger.debug(number1 + "*" +number2);
        return number1 * number2;
    }

    public int facu(int number) {
        logger.debug(number+"!");
        if (number > 1) return number *= facu(number - 1);
        else if (number == 1)return 1;
        else return 0;
    }


}