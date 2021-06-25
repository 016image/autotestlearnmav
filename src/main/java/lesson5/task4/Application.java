package lesson5.task4;

public class Application {
    public static void main(String[] args) throws AgeTooHighException {
        Cat[] cats = new Cat[10];

        for (int i = 0; i < cats.length; i++) {
            try {
                cats[i] = new Cat("Кошка" + i, (int) (Math.random() * 100) - 50);
            } catch (AgeTooHighException e) {
                cats[i] = null;
                System.out.println("Слишком большой возраст для кота");
            }
        }
        System.out.println();

        for (Cat cat : cats) {
            try {
                System.out.printf("Имя: %s, Возраст: %d%n", cat.getName(), cat.getAge());
            } catch (NullPointerException exception) {
                System.out.println("Ошибка вывода данных");
            }
        }
    }
}
