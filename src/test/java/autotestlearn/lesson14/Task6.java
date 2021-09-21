package autotestlearn.lesson14;

import lesson14.helpers.JsonHelper;
import lesson14.model.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.List;

public class Task6 {
    List<Person> persons = JsonHelper.getPersonsFromFile("src/main/java/lesson14/dataset.json");

    @Test
    public void calculateTotalPropertiesCount() {
        long total = persons.stream()
                .map(Person::getProperties)
                .flatMap(Collection::stream)
                .count();

        long livingTotal = persons.stream()
                .map(Person::getProperties)
                .flatMap(Collection::stream)
                .filter(property -> property.getType().equals("Жилая"))
                .count();

        long commercialTotal = persons.stream()
                .map(Person::getProperties)
                .flatMap(Collection::stream)
                .filter(property -> property.getType().equals("Нежилая"))
                .count();

        System.out.println(total);
        System.out.println(livingTotal);
        System.out.println(commercialTotal);
        Assertions.assertEquals(total, livingTotal + commercialTotal);
    }
}
