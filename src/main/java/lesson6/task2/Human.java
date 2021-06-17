package lesson6.task2;

import java.util.Map;

public class Human {
    private String surname;
    private String name;
    private int age;
    public Map<PhoneType, String> phoneTypeAndPhone;

    public Human(String surname, String name, int age, Map<PhoneType, String> phoneTypeAndPhone) {
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.phoneTypeAndPhone = phoneTypeAndPhone;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Map<PhoneType, String> getPhoneTypeAndPhone() {
        return phoneTypeAndPhone;
    }
}
