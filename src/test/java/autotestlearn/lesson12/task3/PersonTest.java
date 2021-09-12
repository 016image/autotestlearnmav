package autotestlearn.lesson12.task3;

import lesson12.task3.FileHelper;
import lesson12.task3.person.Mother;
import lesson12.task3.person.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Arrays;

public class PersonTest extends JsonDeserializationTest {

    @Test
    @DisplayName("Проверка правильности составления модельных классов person")
    void testPersonDeserialization() throws IOException {
        FileHelper<Person> helper = new FileHelper<>();
        Person person = helper.getObjectFromJsonInFile(PERSON_JSON, Person.class);

        Person expectedPerson = new Person()
                .setName("Иван")
                .setAge(37)
                .setMother(new Mother().setName("Ольга").setAge(58))
                .setChildren(Arrays.asList("Маша", "Игорь", "Таня"))
                .setMarried(true);

        Assertions.assertEquals(expectedPerson, person);
    }
}
