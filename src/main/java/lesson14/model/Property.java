package lesson14.model;

public class Property {
    private String type;
    private String address;
    private double price;

    public Property() {
    }

    public Property(String type, String address, double price) {
        this.type = type;
        this.address = address;
        this.price = price;
    }

    public Property setType(String type) {
        this.type = type;
        return this;
    }

    public Property setAddress(String address) {
        this.address = address;
        return this;
    }

    public Property setPrice(double price) {
        this.price = price;
        return this;
    }

    public String getType() {
        return type;
    }

    public String getAddress() {
        return address;
    }

    public double getPrice() {
        return price;
    }
}
