package autotestlearn.lesson14;

import lesson14.helpers.JsonHelper;
import lesson14.model.Person;
import lesson14.model.Property;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.List;

public class Task10 {
    List<Person> persons = JsonHelper.getPersonsFromFile("src/main/java/lesson14/dataset.json");

    @Test
    public void allSummAmounts() {
        double allAccountsAmount = persons.stream()
                .filter(person -> !person.getAccounts().isEmpty())
                .map(person -> person.getAccounts())
                .flatMap(accounts -> accounts.stream())
                .map(account -> account.getAccountBalance())
                .reduce((acc1, acc2) -> acc1 + acc2)
                .get();

        double allPropertiesAmount = persons.stream()
                .filter(person -> !person.getProperties().isEmpty())
                .map(Person::getProperties)
                .flatMap(Collection::stream)
                .map(Property::getPrice)
                .reduce(Double::sum)
                .get();

        System.out.printf("%.2f%n", allAccountsAmount);
        System.out.printf("%.2f%n", allPropertiesAmount);
    }
}
