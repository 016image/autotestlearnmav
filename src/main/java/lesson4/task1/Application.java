package lesson4.task1;

import java.time.LocalDate;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Human human = new Human();

        System.out.println("Введите фамилию:");
        Scanner lastName = new Scanner(System.in);
        human.setLastName(lastName.nextLine());

        System.out.println("Введите имя:");
        Scanner firstName = new Scanner(System.in);
        human.setFirstName(firstName.nextLine());

        System.out.println("даты рождения:");
        human.setBirthDate(LocalDate.of(1900, 1, 1));
        human.setBirthDate(LocalDate.of(2021, 6, 20));
    }
}

