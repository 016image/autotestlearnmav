package autotestlearn.lesson14;

import lesson14.helpers.PersonFilterHelper;
import lesson14.model.Person;
import lesson14.model.Property;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Task12 {

    @Test
    public void printPropertyPrices() {
        List<Person> persons = PersonFilterHelper.getFilteredPersons();

        persons.stream()
                .sorted((p1, p2) -> {
                    Double summ1 = p1.getProperties().stream().map(Property::getPrice).reduce(Double::sum).get();
                    Double summ2 = p2.getProperties().stream().map(Property::getPrice).reduce(Double::sum).get();
                    return summ2.compareTo(summ1);
                })
                .forEach(person -> System.out.printf("ФИО: %s %s %s, Суммарная стоимость недвижимости: %.2f%n",
                                person.getLastName(), person.getFirstName(), person.getPatronymic(),
                                person.getProperties().stream().map(Property::getPrice).reduce(Double::sum).get()
                        )
                );
    }
}
