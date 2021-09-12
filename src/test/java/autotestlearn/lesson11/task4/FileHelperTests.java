package autotestlearn.lesson11.task4;

import lesson11.task4.FileHelper;
import lesson11.task4.Passport;
import lesson11.task4.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class FileHelperTests {

    private Date fromString(String parse) throws ParseException {
        return new SimpleDateFormat("dd.MM.yyyy").parse(parse);
    }

    @Test
    @DisplayName("Получение персон из листа Person1")
    void getPersonsFromSheetTest() throws ParseException {
        List<Person> persons = FileHelper.getPersonsFromExcel("src\\main\\java\\lesson11\\persons.xlsx", "Persons1");

        List<Person> expectedPersons = Arrays.asList(
                new Person("Иванов", "Владимир", "Михайлович", fromString("14.01.1990"), new Passport("4510", "155442")),
                new Person("Петров", "Михаил", "Валерьевич", fromString("12.06.1984"), new Passport("4511", "523533")),
                new Person("Васильев", "Валерий", "Александрович", fromString("17.12.1991"), new Passport("4512", "325235")),
                new Person("Михайлов", "Константин", "Игоревич", fromString("18.05.1972"), new Passport("4500", "535344")),
                new Person("Александрова", "Мария", "Сергеевна", fromString("19.11.1985"), new Passport("4502", "154333")),
                new Person("Кузнецов", "Сергей", "Николаевич", fromString("17.07.1978"), new Passport("4504", "532212"))
        );

        Assertions.assertNotNull(persons);
        Assertions.assertEquals(expectedPersons.size(), persons.size());
        for (int i = 0; i < persons.size(); i++) {
            Assertions.assertEquals(expectedPersons.get(i), persons.get(i));
        }
    }

    @Test
    @DisplayName("Получение персон из листа Person2")
    void getPersonsFromSheet2Test() throws ParseException {
        List<Person> persons = FileHelper.getPersonsFromExcel("src\\main\\java\\lesson11\\persons.xlsx", "Persons2");

        List<Person> expectedPersons = Arrays.asList(
                new Person("Иванов", "Владимир", "Михайлович", fromString("14.01.1990"), new Passport("4510", "155442")),
                new Person("Петров", "Михаил", "Валерьевич", fromString("12.06.1984"), new Passport("4511", "523533")),
                new Person("Васильев", "Валерий", "Александрович", fromString("17.12.1991"), new Passport("4512", "325235")),
                new Person("Александрова", "Мария", "Сергеевна", fromString("19.11.1985"), new Passport("4502", "154333")),
                new Person("Кузнецов", "Сергей", "Николаевич", fromString("17.07.1978"), new Passport("4504", "532212"))
        );

        Assertions.assertNotNull(persons);
        Assertions.assertEquals(expectedPersons.size(), persons.size());
        for (int i = 0; i < persons.size(); i++) {
            Assertions.assertEquals(expectedPersons.get(i), persons.get(i));
        }
    }

    @Test
    @DisplayName("Получение персон из несуществующего листа")
    void getPersonFromWrongSheetTest() {
        List<Person> persons = FileHelper.getPersonsFromExcel("src\\main\\java\\lesson11\\persons.xlsx", "NonPerson");
        Assertions.assertNull(persons);
    }

    @Test
    @DisplayName("Получение персон из несуществующего файла")
    void getPersonFromWrongFileTest() {
        List<Person> persons = FileHelper.getPersonsFromExcel("src\\main\\java\\lesson11\\NotFound.xlsx", "NonPerson");
        Assertions.assertNull(persons);
    }

    @Test
    @DisplayName("Получение персон из листа = null")
    void getPersonFromNullSheetTest() {
        List<Person> persons = FileHelper.getPersonsFromExcel("src\\main\\java\\lesson11\\persons.xlsx", null);
        Assertions.assertNull(persons);
    }

    @Test
    @DisplayName("Получение персон из файла = null")
    void getPersonFromNullFileTest() {
        List<Person> persons = FileHelper.getPersonsFromExcel(null, "Persons1");
        Assertions.assertNull(persons);
    }
}
