package lesson12.task3.person;

import java.util.Objects;

public class Mother {

    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mother)) return false;
        Mother mother = (Mother) o;
        return Objects.equals(getName(), mother.getName()) &&
                Objects.equals(getAge(), mother.getAge());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }

    public Mother setName(String name) {
        this.name = name;
        return this;
    }

    public Mother setAge(Integer age) {
        this.age = age;
        return this;
    }
}
