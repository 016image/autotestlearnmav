package lesson12.task1.model;

public interface Generatable<T extends Generatable> {
    T generate();
}