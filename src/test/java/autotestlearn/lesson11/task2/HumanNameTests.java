package autotestlearn.lesson11.task2;

import lesson11.task2.Human;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class HumanNameTests {

    @Test
    @DisplayName("Проверка корректного имени Иван")
    public void nameTest() {
        Human human = new Human();
        human.setFirstName("Иван");
        Assertions.assertEquals("Иван", human.getFirstName());
    }

    @Test
    @DisplayName("Проверка некорректного имени Ив")
    public void wrongNameTest1() {
        Human human = new Human();
        try {
            human.setFirstName("Ив");
            Assertions.fail("Должно быть исключение IllegalArgumentException");
        } catch (IllegalArgumentException iae) {
            Assertions.assertEquals("Некорректное имя: Ив", iae.getMessage());
        }
    }

    @Test
    @DisplayName("Проверка некорректного имени Ивансдлиннымименем")
    public void wrongNameTest2() {
        Human human = new Human();
        try {
            human.setFirstName("Ивансдлиннымименем");
            Assertions.fail("Должно быть исключение IllegalArgumentException");
        } catch (IllegalArgumentException iae) {
            Assertions.assertEquals("Некорректное имя: Ивансдлиннымименем", iae.getMessage());
        }
    }

    @Test
    @DisplayName("Проверка некорректного имени Иван5аа")
    public void wrongNameTest3() {
        Human human = new Human();
        try {
            human.setFirstName("Иван5аа");
            Assertions.fail("Должно быть исключение IllegalArgumentException");
        } catch (IllegalArgumentException iae) {
            Assertions.assertEquals("Некорректное имя: Иван5аа", iae.getMessage());
        }
    }
}
