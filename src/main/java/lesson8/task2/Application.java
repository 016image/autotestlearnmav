package lesson8.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>(10);

        for (int j = 10; j < 31; j++) {
            double successfulCounter = 0;
            for (int k = 0; k < 100_000; k++) {
                for (int i = 0; i < j; i++) {
                    personList.add(new Person());
                }
                if (hasTwoBdaysSameDate(personList)) {
                    successfulCounter++;
                }
                personList.clear();
            }
            System.out.printf("%d: %.2f %%\n", j, successfulCounter / 1_000);
        }
    }

    private static boolean hasTwoBdaysSameDate(List<Person> persons) {
        Collections.sort(persons);
        for (int i = 0; i < persons.size() - 1; i++) {
            if (persons.get(i).equals(persons.get(i + 1))) {
                return true;
            }
        }
        return false;
    }
}
