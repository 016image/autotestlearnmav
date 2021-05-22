package lesson2.task7;

public class AgeType {
    public static void main(String[] args) {
        System.out.println(getAgeType(32));
        System.out.println(getAgeType(52));
        System.out.println(getAgeType(66));
        System.out.println(getAgeType(82));
        System.out.println(getAgeType(25));
        System.out.println(getAgeType(44));
        System.out.println(getAgeType(60));
        System.out.println(getAgeType(75));
        System.out.println(getAgeType(22));
        System.out.println(getAgeType(119));
    }

    static String getAgeType(int age) {
        String result;
        if (age >= 25 && age < 44)
            result = age + " -" + " молодой возраст";
        else if (age >= 44 && age < 60)
            result = age + " -" + " средний возраст";
        else if (age >= 60 && age < 75)
            result = age + " -" + " пожилой возраст";
        else if (age >= 75 && age < 90)
            result = age + " -" + " старческий возраст";
        else result = age + " -" + " неизвестный программе возраст";
        return result;
    }
}
