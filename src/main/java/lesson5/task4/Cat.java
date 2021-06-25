package lesson5.task4;

public class Cat {
    String name;
    int age;

    public Cat(String name, int age) throws AgeTooHighException {

        try {
            if (age < 0) {
                throw new AgeUnderZeroException();
            }
            if (age > 20) {
                throw new AgeTooHighException();
            }
            this.name = name;
            this.age = age;
        } catch (AgeUnderZeroException e) {
            StackTraceElement[] methods = e.getStackTrace();
            System.out.println(methods[0] + " - Возраст не может быть меньше 0");
        }
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        if (this.name == null) {
            throw new NullPointerException();
        }
        return name;
    }
}
