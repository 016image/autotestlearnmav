package autotestlearn.lesson14;

import lesson14.helpers.PersonFilterHelper;
import lesson14.model.Person;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Task15 {

    @Test
    public void printSortedPropertyInfo() {
        List<Person> persons = PersonFilterHelper.getFilteredPersons();
        persons.stream()
                .sorted((p1, p2) -> {
                    String fio1 = p1.getLastName() + p1.getFirstName() + p1.getPatronymic();
                    String fio2 = p2.getLastName() + p2.getFirstName() + p2.getPatronymic();
                    return fio1.compareTo(fio2);
                })
                .forEach(person -> {
                    System.out.printf("ФИО: %s %s %s, Паспорт: %s %s%n",
                            person.getLastName(), person.getFirstName(), person.getPatronymic(),
                            person.getPassport().getSeries(), person.getPassport().getNumber());
                    final int[] propertyIndex = {1};
                    person.getProperties().stream()
                            .sorted((p1, p2) -> {
                                Double price1 = p1.getPrice();
                                Double price2 = p2.getPrice();
                                return price1.compareTo(price2);
                            })
                            .forEach(property -> {
                                System.out.printf("\tНедвижимость объект %d: %s, %.2f%n",
                                        propertyIndex[0]++, property.getAddress(), property.getPrice());
                            });
                });
    }
}
