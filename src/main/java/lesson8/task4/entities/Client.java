package lesson8.task4.entities;

import java.util.Objects;

public class Client extends Entity {
    private String address;

    public Client(String name, String address) {
        super(name);
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        if (!Objects.equals(address, client.address)) return false;
        return Objects.equals(name, client.name);
    }

    @Override
    public int hashCode() {
        int result = address != null ? address.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Client{" +
                "address='" + address + '\'' +
                ", uuid=" + uuid +
                ", name='" + name + '\'' +
                '}';
    }
}
