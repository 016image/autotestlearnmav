package lesson5.task5;

import lesson5.task5.exceptions.*;

public class Application {
    public static Passport createPassport(String series, String number) {
        Passport passport;
        try {
            passport = new Passport(series, number);
        } catch (PassportSeriesArgumentException | PassportNumberArgumentException |
                PassportNumberNullPointerException | PassportSeriesNullPointerException exception) {
            System.out.println("Введите верные значения серии и номера паспорта");
            return null;
        } catch (PassportAlreadyExistsException exception) {
            System.out.println("Данные серия и номер паспорта уже существуют");
            return null;
        }

        return passport;
    }

    public static void main(String[] args) {
        Application.createPassport("1234", "123456");
        Application.createPassport("12 34", "123 456");
        Application.createPassport(null, "123456");
        Application.createPassport("1234", null);
        Application.createPassport("12 34", "123456");
        Application.createPassport("12 34", "123456");
        Application.createPassport("12 35", "123456");

        Passport.printAllPassports();
    }
}
