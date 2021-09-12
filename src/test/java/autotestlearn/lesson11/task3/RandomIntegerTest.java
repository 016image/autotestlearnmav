package autotestlearn.lesson11.task3;

import lesson11.task3.Generator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class RandomIntegerTest {

    @Test
    @DisplayName("Тест границ генератора случайных чисел")
    public void integerGeneratorTest() {
        for (int i = 0; i < 10000; i++) {
            int from = new Random().nextInt(1000);
            int to = 1000 + new Random().nextInt(1000);
            int actual = Generator.randomInteger(from, to);
            Assertions.assertEquals(from, actual, to - from);
        }
    }
}
