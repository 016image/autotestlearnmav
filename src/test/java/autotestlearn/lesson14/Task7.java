package autotestlearn.lesson14;

import lesson14.helpers.JsonHelper;
import lesson14.model.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Task7 {
    List<Person> persons = JsonHelper.getPersonsFromFile("src/main/java/lesson14/dataset.json");

    @Test
    public void countAccounts() {
        long total = persons.stream()
                .flatMap(person -> person.getAccounts().stream())
                .count();

        long checkingTotal = persons.stream()
                .flatMap(person -> person.getAccounts().stream())
                .filter(account -> account.getAccountType().equalsIgnoreCase("расчетный"))
                .count();

        long depositTotal = persons.stream()
                .flatMap(person -> person.getAccounts().stream())
                .filter(account -> account.getAccountType().equalsIgnoreCase("депозитный"))
                .count();

        long currentTotal = persons.stream()
                .flatMap(person -> person.getAccounts().stream())
                .filter(account -> account.getAccountType().equalsIgnoreCase("текущий"))
                .count();

        System.out.println(total);
        System.out.println(checkingTotal);
        System.out.println(depositTotal);
        System.out.println(currentTotal);

        Assertions.assertEquals(total, checkingTotal + currentTotal + depositTotal);
    }
}
