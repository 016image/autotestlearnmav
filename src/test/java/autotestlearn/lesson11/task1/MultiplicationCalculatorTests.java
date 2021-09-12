package autotestlearn.lesson11.task1;

import lesson11.task1.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MultiplicationCalculatorTests {

    @Test
    @DisplayName("Проверка метода калькулятора: умножение n чисел")
    public void multiplicationTest() {
        int rightResult1 = 720;
        int rightResult2 = 6;
        Assertions.assertEquals(rightResult1, Calculator.multiplyAll(1, 2, 3, 4, 5, 6));
        Assertions.assertEquals(rightResult2, Calculator.multiplyAll(2,3));
    }
}