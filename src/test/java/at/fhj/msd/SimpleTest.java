package at.fhj.msd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SimpleTest {
    private Calculator calculation;
    double result;


    @BeforeEach
    public void setUp() {
        calculation = new Calculator();

    }

    @Test
    public void testAdd1() {
        Assertions.assertEquals(7, calculation.add(4, 3));
    }

    @Test
    public void testAdd2() {
        result = 2.9 + 6.9;
        Assertions.assertEquals(result, calculation.add(2.9, 6.9));
    }

    @Test
    public void testMinus1() {
        Assertions.assertEquals(6, calculation.minus(12, 6));
    }

    @Test
    public void testMinus2() {
        result = 24.9 - 6.5;
        Assertions.assertEquals(result, calculation.minus(24.9, 6.5));
    }
    @Test
    public void testDivide1() {
        Assertions.assertEquals(2, calculation.divide(4, 2));
    }
    @Test
    public void testDivide2() {
        result = 8.5/4;
        Assertions.assertEquals(result, calculation.divide(8.5, 4));
    }
    @Test
    public void testMultiply1() {
        Assertions.assertEquals(15, calculation.multiply(5, 3));
    }
    @Test
    public void testMultiply2() {
        result = 15*33;
        Assertions.assertEquals(result, calculation.multiply(15, 33));
    }

    @Test
    public void testFaculty0() {

        Assertions.assertEquals(0, calculation.facu(-4));
    }

    @Test
    public void testFaculty1() {
        Assertions.assertEquals(24, calculation.facu(4));
    }

    @Test
    public void testFaculty2() {
        result = 5*4*3*2*1;
        Assertions.assertEquals(result, calculation.facu(5));
    }


}

