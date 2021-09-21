package autotestlearn.lesson13.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import lesson13.task2.Modifiers;

public class ModifiersTest {

    @Test
    @DisplayName("Test Modifier for Boolean")
    void modifierTestBooleans() {
        Assertions.assertFalse(Modifiers.invert.modify(true));
        Assertions.assertTrue(Modifiers.invert.modify(false));
    }

    @Test
    @DisplayName("Test Modifier for Integer")
    void modifierTestIntegers() {
        Assertions.assertEquals(5, Modifiers.absolute.modify(5));
        Assertions.assertEquals(5, Modifiers.absolute.modify(-5));
        Assertions.assertEquals(0, Modifiers.absolute.modify(0));
        Assertions.assertEquals(Integer.MAX_VALUE, Modifiers.absolute.modify(Integer.MIN_VALUE + 1));
        Assertions.assertEquals(Integer.MAX_VALUE, Modifiers.absolute.modify(-Integer.MAX_VALUE));
    }

    @Test
    @DisplayName("Test Modifier for String")
    void modifierTestString() {
        Assertions.assertEquals("ytrewq", Modifiers.reverse.modify("qwerty"));
        Assertions.assertEquals("refer", Modifiers.reverse.modify("refer"));
        Assertions.assertEquals("", Modifiers.reverse.modify(""));
    }
}
