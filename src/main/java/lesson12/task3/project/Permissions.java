package lesson12.task3.project;

import java.util.Objects;

public class Permissions {

    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public Permissions setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Permissions setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Permissions)) return false;
        Permissions that = (Permissions) o;
        return Objects.equals(getId(), that.getId()) &&
                Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName());
    }
}
