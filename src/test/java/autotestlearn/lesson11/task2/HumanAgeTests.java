package autotestlearn.lesson11.task2;

import lesson11.task2.Human;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class HumanAgeTests {

    @Test
    @DisplayName("Проверка установки возраста человека - 0 лет")
    public void zeroAgeTest() {
        Human human = new Human();
        human.setAge(0);
        Assertions.assertEquals(0, human.getAge());
    }

    @Test
    @DisplayName("Проверка установки возраста человека - 60 лет")
    public void validAgeTest() {
        Human human = new Human();
        human.setAge(60);
        Assertions.assertEquals(60, human.getAge());
    }

    @Test
    @DisplayName("Проверка установки возраста человека - 120 лет")
    public void boundaryValidAgeTest() {
        Human human = new Human();
        human.setAge(120);
        Assertions.assertEquals(120, human.getAge());
    }

    @Test
    @DisplayName("Проверка установки возраста человека - отрицательный возраст")


    public void nonValidAgeTest() {
        Human human = new Human();
        try {
            human.setAge(-1);
            Assertions.fail("Проверка не прошла");
        } catch (IllegalArgumentException iae) {
            Assertions.assertEquals("Некорректный возраст: -1", iae.getMessage());
        }
    }

    @Test
    @DisplayName("Проверка установки возраста человека - 121 лет")
    public void boundaryOutAgeTest() throws IllegalArgumentException {
        Human human = new Human();
        try {
            human.setAge(121);
            Assertions.fail("Проверка не прошла");

        } catch (IllegalArgumentException iae) {
            Assertions.assertEquals("Некорректный возраст: 121", iae.getMessage());
        }
    }
}
