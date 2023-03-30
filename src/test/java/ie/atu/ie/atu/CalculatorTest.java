package ie.atu.ie.atu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator myCalc;

    @Test
    public void testSubtract(){
        myCalc = new Calculator();
        assertEquals(25, myCalc.subtract(50,25));
    }
}
