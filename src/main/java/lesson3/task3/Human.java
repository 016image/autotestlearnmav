package lesson3.task3;

public class Human {
    private String name;
    private int age;
    private Human father;
    private Human mather;

    Human(String name, int age, Human father, Human mather) {
        this.name = name;
        this.age = age;
        this.father = father;
        this.mather = mather;
    }

    public Human getFather() {
        return father;
    }

    public Human getMather() {
        return mather;
    }
@Override
    public String toString() {
        return name;
    }
}
