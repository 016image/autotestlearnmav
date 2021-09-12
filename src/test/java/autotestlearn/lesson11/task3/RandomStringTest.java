package autotestlearn.lesson11.task3;

import lesson11.task3.Generator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class RandomStringTest {

    @Test
    @DisplayName("Тест границ генератора случайной строки")
    public void stringGeneratorTest() {
        for (int i = 0; i < 10000; i++) {
            int from = new Random().nextInt(1000);
            int to = 1000 + new Random().nextInt(1000);
            int actual = Generator.randomString(from, to).length();
            Assertions.assertEquals(from, actual, to - from);
        }
    }
}
