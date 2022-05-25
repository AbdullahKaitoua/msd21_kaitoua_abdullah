package at.fhj.msd;

/**
 * prints some calculation operations by calling the right method from <code>Calculation</code>
 * @author: Abdullah Kaitoua
 */

public class Main {


    public static void main(String[] args) {
        Calculator calc =new Calculator();

        System.out.println(calc.add(29, 2));
        System.out.println(calc.minus(22, 2));
        System.out.println(calc.divide(26, 5));
        System.out.println(calc.multiply(10, 30));
        System.out.println(calc.facu(10));
    }
}
