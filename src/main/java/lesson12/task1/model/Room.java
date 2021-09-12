package lesson12.task1.model;

import java.util.Objects;

public class Room implements Generatable {
    private int width;
    private int height;

    public Room() {
    }

    public Room(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public Room generate() {
        this.width = 5;
        this.height = 3;
        return this;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return width == room.width &&
                height == room.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }
}