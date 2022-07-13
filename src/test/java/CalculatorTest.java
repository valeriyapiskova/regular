package calculatordemo;

import calculatordemo.Calculator;
import org.junit.*;

public class CalculatorTest {

        static Calculator calculator = new Calculator();


    @Test
        public void CalculatorTest(){
            Assert.assertEquals(899, Calculator.calculate("fu4uh5ghr890"));
        }

}
