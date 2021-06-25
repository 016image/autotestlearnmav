package lesson5.task2;

public class Application {
    public static void main(String[] args) {
        Cat cat0 = new Cat("Мурзик", 2);
        Cat cat1 = new Cat("Барсик", 4);
        Cat cat3 = new Cat("Лева", 8);
        Cat cat4 = new Cat("Семен", 16);
        Cat[] cats = {cat0, cat1, null, cat3, cat4};

        for (Cat currentCat : cats) {
            try {
                System.out.printf("Имя: %s, Возраст: %d.%n", currentCat.getName(), currentCat.getAge());
            } catch (NullPointerException e) {
                System.out.println("Ошибка: данных по объекту нет, ссылка на null");
                break;
            }
        }
    }
}
