package lesson11.task2;

public class Human {
    private String firstName;
    private int age;


    public String setFirstName(String firstName) {
        boolean matches = firstName.matches("^[А-Я][а-я]{2,11}$");
        if (matches) {
            this.firstName = firstName;
            return firstName;
        } else {
            throw new IllegalArgumentException(String.format("Некорректное имя: %s", firstName));
        }
    }

    public void setAge(int age) {
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException(String.format("Некорректный возраст: %d", age));
        } else this.age = age;
        System.out.printf("Поле установлено значением %d", age);
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public void start() {
    }
}