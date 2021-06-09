package lesson4.task4;

public class Passport {
    String series;
    String number;
    private static final String NUMBER = "номера паспорта";
    private static final String SERIES = "серии паспорта";

    public Passport() {
        PassportBase.addPassportBase(this);
    }

    public Passport setNumber(String number) {
        if (PassportBase.duplicatePassport(series, number)) {
            return this;
        }
        if (number.matches("^[0-9]{6}$")) {
            setCorrectPrint(NUMBER, number);
            this.number = number;
        } else {
            setIncorrectPrint(number);
        }
        return this;
    }

    public Passport setSeries(String series) {
        if (PassportBase.duplicatePassport(series, number)) {
            return this;
        }
        if (series.matches("^[0-9]{4}$")) {
            setCorrectPrint(SERIES, series);
            this.series = series;
        } else {
            setIncorrectPrint(series);
        }
        return this;
    }

    public String getNumber() {
        return number;
    }

    public String getSeries() {
        return series;
    }

    private void setCorrectPrint(String type, String value) {
        System.out.printf("Установлено корректное значение %s: %s%n", type, value);
    }

    private void setIncorrectPrint(String value) {
        System.out.printf("Введенное значение некорректно: %s%n", value);
    }
}
