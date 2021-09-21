package autotestlearn.lesson14;

import lesson14.helpers.JsonHelper;
import lesson14.model.Account;
import lesson14.model.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Task9 {
    List<Person> persons = JsonHelper.getPersonsFromFile("src/main/java/lesson14/dataset.json");

    @Test
    public void countCards() {
        long accountCount = persons.stream()
                .filter(person -> !person.getAccounts().isEmpty())
                .filter(person -> person.getAccounts().stream()
                        .map(Account::getAccountBalance)
                        .reduce((bal1, bal2) -> bal1 + bal2)
                        .get() > 20_000_000d)
                .count();

        long propertiesCount = persons.stream()
                .filter(person -> !person.getProperties().isEmpty())
                .filter(person -> person.getProperties().stream()
                        .map(property -> property.getPrice())
                        .reduce((price1, price2) -> price1 + price2)
                        .get() > 26_000_000d)
                .count();
        System.out.println(accountCount);
        System.out.println(propertiesCount);

        Assertions.assertEquals(accountCount, propertiesCount);

    }
}
