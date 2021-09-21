package autotestlearn.lesson13.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import lesson13.task3.Functions;

public class FuncToStringTests {

    @Test
    @DisplayName("test function to String: String")
    void testFuncStringToString() {
        Assertions.assertEquals("s1", Functions.toStringFunction.execute("s1"));
    }

    @Test
    @DisplayName("test function to String: Object")
    void testFuncObjectToString() {
        Object object = new Object();
        String expectedToString = object.getClass().getName() + "@" + Integer.toHexString(object.hashCode());
        Assertions.assertEquals(expectedToString, Functions.toStringFunction.execute(object));
    }

    @Test
    @DisplayName("test function to String: Cat")
    void testFuncCatToString() {
        class Cat {
            private String name;
            private int age;

            private Cat(String name, int age) {
                this.name = name;
                this.age = age;
            }

            @Override
            public String toString() {
                return String.format("Имя: %s, Возраст: %d", name, age);
            }
        }

        Object cat = new Cat("Барсик", 3);
        Assertions.assertEquals("Имя: Барсик, Возраст: 3", Functions.toStringFunction.execute(cat));
    }
}
