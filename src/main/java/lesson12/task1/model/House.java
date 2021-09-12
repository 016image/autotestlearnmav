package lesson12.task1.model;

import java.util.Arrays;
import java.util.List;

public class House implements Generatable {

    private List<Flat> flats;

    public House() {
    }

    public House(List<Flat> flats) {
        this.flats = flats;
    }

    public List<Flat> getFlats() {
        return flats;
    }

    @Override
    public House generate() {
        this.flats = Arrays.asList(
                new Flat().generate(),
                new Flat().generate(),
                new Flat().generate(),
                new Flat().generate(),
                new Flat().generate()
        );
        return this;
    }
}