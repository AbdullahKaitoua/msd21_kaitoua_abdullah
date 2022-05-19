package at.fhj.msd;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static Logger logger = LogManager.getLogger();
    public static void main(String[] args) {
        Calculator calc =new Calculator();

        System.out.println(calc.add(29, 2));
        System.out.println(calc.minus(22, 2));
        System.out.println(calc.divide(26, 5));
        System.out.println(calc.multiply(10, 30));
        logger.info("It is a info logger.");
        logger.error("It is an error logger.");



    }
}
