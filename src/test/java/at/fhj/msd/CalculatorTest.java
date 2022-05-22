package at.fhj.msd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    private Calculator calc;
    @BeforeEach
    public void setup(){calc = new Calculator();}

    @Test
    public void calcTestAddExpected(){
        Assertions.assertEquals(8, calc.add(5.0, 3.0));
    }
    @Test
    public void calcTestAddActual(){
        Assertions.assertEquals(5.0+3.0, calc.add(5.0, 3.0));
    }
    @Test
    public void calcTestMinusExpected(){
        Assertions.assertEquals(2, calc.minus(5.0, 3.0));
    }
    @Test
    public void calcTestMinusActual(){
        Assertions.assertEquals(5.0-3.0, calc.minus(5.0, 3.0));
    }
    @Test
    public void calcTestDivideExpected(){
        Assertions.assertEquals(5, calc.divide(5.0, 1.0));
    }
    @Test
    public void calcTestDivisionByZero(){
        assertThrows(ArithmeticException.class, () -> {
            calc.divide(5, 0);
        });

    }
    @Test
    public void calcTestDivideActual(){
        Assertions.assertEquals(5.0 / 1.0, calc.divide(5.0, 1.0));
    }
    @Test
    public void calcTestMultiplyExpected(){
        Assertions.assertEquals(15, calc.multiply(5.0, 3.0));
    }
    @Test
    public void calcTestMultiplyActual(){
        Assertions.assertEquals(5.0*3.0, calc.multiply(5.0, 3.0));
    }
    @Test
    public void calcTestFactorial1(){
        Assertions.assertEquals(120, calc.factorial(5.0));
    }
    @Test
    public void calcTestFactorial2(){
        Assertions.assertEquals(0, calc.factorial(-5.0));
    }
    @Test
    public void calcTestFactorial3(){
        Assertions.assertEquals(24.0, calc.factorial(4.0));
    }

}
