package ie.atu.ie.atu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator myCalc;

    @Test
    public void testDivide(){
        myCalc = new Calculator();
        assertEquals(10, myCalc.divide(30,3));
    }
}
