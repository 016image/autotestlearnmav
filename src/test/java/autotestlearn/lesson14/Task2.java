package autotestlearn.lesson14;

import lesson14.helpers.JsonHelper;
import lesson14.model.Person;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.NoSuchElementException;

public class Task2 {

    private List<Person> persons = JsonHelper.getPersonsFromFile("src/main/java/lesson14/dataset.json");

    @Test
    void personWithPassportStartsBy00Desc() {
        persons.stream()
                .filter(person -> person.getPassport() != null)
                .filter(person -> person.getPassport().getSeries().startsWith("00"))
                .sorted((p1, p2) -> p2.getPassport().getNumber().compareTo(p1.getPassport().getNumber()))
                .forEach(person -> System.out.printf("%s %s %s %s %s%n",
                        person.getLastName(), person.getFirstName(), person.getPatronymic(),
                        person.getPassport().getSeries(), person.getPassport().getNumber()));
    }

    @Test
    void personsWithCardsOnNonExistedAccount() {
        Person person = persons.stream()
                .filter(p -> p.getPassport() != null)
                .filter(p -> p.getPassport().getNumber().endsWith(p.getPassport().getSeries()))
                .findFirst()
                .orElseThrow(NoSuchElementException::new);
        System.out.printf("%s %s %s %s %s%n",
                person.getLastName(), person.getFirstName(), person.getPatronymic(),
                person.getPassport().getSeries(), person.getPassport().getNumber());
    }
}