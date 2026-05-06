import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void testCalc() {
        Calculator calc = new Calculator();
        // calc(2, 4): sum=6, product=8, result=6/8=0.75
        assertEquals(0.75, calc.calculateRatio(2, 4), 0.001);
    }

    @Test
    void testCalcWithLargerNumbers() {
        Calculator calc = new Calculator();
        // calc(3, 6): sum=9, product=18, result=9/18=0.5
        assertEquals(0.5, calc.calculateRatio(3, 6), 0.001);
    }
}