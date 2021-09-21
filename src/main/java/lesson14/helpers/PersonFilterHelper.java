package lesson14.helpers;

import lesson14.model.Person;
import lesson14.model.Property;
import org.junit.jupiter.api.Assertions;

import java.util.List;
import java.util.stream.Collectors;

public class PersonFilterHelper {

    public static List<Person> getFilteredPersons() {
        List<Person> persons = JsonHelper.getPersonsFromFile("src/main/java/homework_task/lesson14/dataset.json");
        List<Person> filteredPersons = persons.stream()
                .filter(person -> !person.getProperties().isEmpty())
                .filter(person -> person.getCards().size() == 3)
                .filter(person -> person.getPassport() != null)
                .filter(person -> person.getProperties().stream()
                        .map(Property::getPrice)
                        .reduce(Double::sum)
                        .get() > 20_000_000)
                .collect(Collectors.toList());

        Assertions.assertEquals(20, filteredPersons.size(), "Проверка числа клиентов отсортированного списка");
        return filteredPersons;
    }
}
