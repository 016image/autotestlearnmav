package autotestlearn.lesson14;

import lesson14.helpers.JsonHelper;
import lesson14.model.Person;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Task3 {
    private List<Person> persons = JsonHelper.getPersonsFromFile("src/main/java/lesson14/dataset.json");

    @Test
    public void uniquePassportSeries() {
        long seriesCount = persons.stream()
                .filter(person -> person.getPassport() != null)
                .map(person -> person.getPassport().getSeries())
                .distinct()
                .count();
        System.out.println("Количество различных серий паспортов: " + seriesCount);
    }

    @Test
    public void getFrom50To99With3AccountsAnd2Cards() {
        Person person = persons.stream()
                .skip(49)
                .limit(50)
                .filter(p -> p.getAccounts().size() == 3)
                .filter(p -> p.getCards().size() == 2)
                .findFirst()
                .orElse(persons.get(0));
        System.out.printf("%s %s %s%n", person.getLastName(), person.getFirstName(), person.getPatronymic());
        System.out.printf("%s %s %s%n", person.getAccounts().get(0).getAccountNumber(),
                person.getAccounts().get(1).getAccountNumber(), person.getAccounts().get(2).getAccountNumber());
        System.out.printf("%s %s%n", person.getCards().get(0).getCardNumber(), person.getCards().get(1).getCardNumber());
    }

    @Test
    void validatePassportSeriesAndNumbers() {
        boolean allPassportValid = persons.stream()
                .filter(p -> p.getPassport() != null)
                .map(Person::getPassport)
                .allMatch(passport -> passport.getSeries().matches("^[0-9]{4}$") && passport.getNumber().matches("^[0-9]{6}"));
        String output = allPassportValid
                ? "У всех клиентов, у которых есть паспорт, данные соответствуют формату"
                : "Есть клиенты, у которых данные паспорта не соответствуют формату";
        System.out.println(output);
    }
}
