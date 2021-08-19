package lesson8.task4;

import java.util.Arrays;
import java.util.List;

import lesson8.task4.entities.Account;
import lesson8.task4.entities.Branch;
import lesson8.task4.entities.Client;
import lesson8.task4.entities.Entity;
import lesson8.task4.entities.User;

public class Application {

    public static void main(String[] args) {
        Entity user = new User("Иванов Петр", "Программист");
        user.validate();
        Entity user2 = new User("Иванов Петр", "Программист");
        user2.validate();
        Entity user3 = new User("Иванов Петр", "Тестировщик");
        user3.validate();
        Entity user4 = new User("Петров Иван", "Тестировщик");
        user4.validate();
        List<Entity> entities = Arrays.asList(
                new Account("Расчетный счет ФЛ", "40817810412345678901"),
                new Account("Расчетный счет ФЛ", "40817810412345678901"),
                new Account("Расчетный счет ФЛ-2", "40817810412345678901"),
                new Account("Расчетный счет ФЛ", "40817810400000000000"),

                new Branch("Операционный офис", "г. Москва"),
                new Branch("Операционный офис", "г. Москва"),
                new Branch("Операционный филиал", "г. Москва"),
                new Branch("Операционный офис", "г. Саратов"),

                new Client("ООО Рога и копыта", "г. Москва, ул. Миклухо-Маклая, д. 41"),
                new Client("ООО Рога и копыта", "г. Москва, ул. Миклухо-Маклая, д. 41"),
                new Client("ООО Рога и копыта", "г. Москва, ул. Проходчиков, д. 3"),
                new Client("ООО Зеркало", "г. Москва, ул. Миклухо-Маклая, д. 41")
        );

        for (Entity entity : entities)
            entity.validate();
    }
}
