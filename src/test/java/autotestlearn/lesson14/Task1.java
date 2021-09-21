package autotestlearn.lesson14;

import lesson14.helpers.JsonHelper;
import lesson14.model.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Task1 {

    private List<Person> persons = JsonHelper.getPersonsFromFile("src/main/java/lesson14/dataset.json");

    @Test
    void personsWithoutPassportAndWith3Properties() {
        long count = persons.stream()
                .filter(person -> person.getPassport() == null)
                .filter(person -> person.getProperties().size() == 3)
                .peek(person -> System.out.printf("%s %s %s%n", person.getLastName(), person.getFirstName(), person.getPatronymic()))
                .count();
        Assertions.assertEquals(3, count);
    }

    @Test
    void personsWithDifferentAmountOfAccountsAndCards() {
        long count = persons.stream()
                .filter(person -> person.getLastName().equals("Васильев"))
                .filter(person -> person.getAccounts().size() != person.getCards().size())
                .peek(person -> System.out.printf("%s %s %s%n", person.getLastName(), person.getFirstName(), person.getPatronymic()))
                .count();
        Assertions.assertEquals(10, count);
    }

    @Test
    void personWithPassportSeriesStartsBy00() {
        persons.stream()
                .filter(person -> person.getPassport() != null)
                .filter(person -> person.getPassport().getSeries().startsWith("00"))
                .limit(5)
                .forEach(person -> System.out.printf("%s %s %s%n", person.getLastName(), person.getFirstName(), person.getPatronymic()));
    }
}
