package autotestlearn.lesson13.task3;

import lesson13.task3.Functions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class FuncMaxObjectTests {

    @Test
    @DisplayName("test function MaxObject Strings")
    void testFuncMaxObjectStrings() {
        Assertions.assertEquals("zxcv", Functions.maxObject.execute(Arrays.asList("abcdf", "zxcv", "fdnsnj", "qwwj")));
    }

    @Test
    @DisplayName("test function MaxObject Doubles")
    void testFuncMaxObjectDoubles() {
        Assertions.assertEquals(258.15, Functions.maxObject.execute(Arrays.asList(11.78, 258.15, 192.34, -246.11)));
    }
}
