package autotestlearn.lesson13.task3;

import lesson13.task3.Functions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

public class FuncAllEqualsTests {

    @Test
    @DisplayName("test function allEquals on Objects")
    void testFuncAllEqualsObjects() {
        Object object1 = new Object();
        Object object2 = object1;
        Object object3 = object1;
        Object object4 = object1;
        Object object5 = new Object();
        Assertions.assertTrue(Functions.onlyEqualsObjects.execute(Arrays.asList(object1, object2, object3, object4)));
        Assertions.assertTrue(Functions.onlyEqualsObjects.execute(Collections.emptyList()));
        Assertions.assertFalse(Functions.onlyEqualsObjects.execute(Arrays.asList(object1, object2, object3, object4, object5)));
    }

    @Test
    @DisplayName("test function allEquals on Strings")
    void testFuncAllEqualsStrings() {
        Assertions.assertTrue(Functions.onlyEqualsObjects.execute(Arrays.asList("s1", "s1", "s1")));
        Assertions.assertFalse(Functions.onlyEqualsObjects.execute(Arrays.asList("s1", "s2", "s1")));
    }

    @Test
    @DisplayName("test function allEquals on Cats")
    void testFuncAllEqualsCats() {
        class Cat {
            private String name;
            private int age;

            public Cat(String name, int age) {
                this.name = name;
                this.age = age;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Cat cat = (Cat) o;
                if (age != cat.age) return false;
                return Objects.equals(name, cat.name);
            }

            @Override
            public int hashCode() {
                int result = name != null ? name.hashCode() : 0;
                result = 31 * result + age;
                return result;
            }
        }
        Cat cat1 = new Cat("Барсик", 3);
        Cat cat2 = new Cat("Барсик", 3);
        Cat cat3 = new Cat("Барсик", 3);
        Cat cat4 = new Cat("Мурзик", 2);
        Assertions.assertTrue(Functions.onlyEqualsObjects.execute(Arrays.asList(cat1, cat2, cat3)));
        Assertions.assertFalse(Functions.onlyEqualsObjects.execute(Arrays.asList(cat1, cat4, cat3)));
    }

}
