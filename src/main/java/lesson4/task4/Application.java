package lesson4.task4;

public class Application {
    public static void main(String[] args) {

        Passport correct = new Passport().setSeries("0000").setNumber("111111");
        Passport repeat = new Passport().setSeries("0000").setNumber("111111");
        Passport inCorrect1 = new Passport().setSeries("123").setNumber("12333");
        Passport inCorrect3 = new Passport().setSeries("12345").setNumber("1234567");
        Passport inCorrect4 = new Passport().setSeries("").setNumber("");

        Passport nullPassport = new Passport();
        System.out.printf("NullPassport: %s %s%n", nullPassport.getSeries(), nullPassport.getNumber());

        Passport onlySeriesPassport = new Passport().setSeries("5412");
        Passport onlyNumberPassport = new Passport().setNumber("456321");

        Human human = new Human().setAge(25).setFirstName("Шижгин").setLastName("Андрей").setPassport(correct);

        human.setPassport(onlyNumberPassport).setPassport(onlySeriesPassport);
    }
}
