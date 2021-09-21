package autotestlearn.lesson13.task3;

import lesson13.task3.Functions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class FuncSummTests {

    @Test
    @DisplayName("test function Summ")
    void testFuncSumm() {
        Assertions.assertEquals(55, Functions.summFunction.execute(Arrays.asList(1, 2, 3, 4, 5, 10, 9, 8, 7, 6)));
    }
}
