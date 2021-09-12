package lesson12.task1.model;

import java.util.Arrays;
import java.util.List;

public class Flat implements Generatable {
    private List<Room> rooms;


    public Flat() {
    }

    public Flat(List<Room> rooms) {
        this.rooms = rooms;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    @Override
    public Flat generate() {
        this.rooms = Arrays.asList(
                new Room().generate(),
                new Room().generate()
        );
        return this;
    }
}