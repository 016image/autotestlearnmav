package lesson5.task5;

import lesson5.task5.exceptions.*;

public class Passport {
    private static final Passport[] ALL_PASSPORTS = new Passport[20];
    private static int indexOfPassports = 0;
    private String series;
    private String number;

    private static final String SERIES_REGEX = "^(\\d{2} \\d{2})$";
    private static final String NUMBER_REGEX = "^(\\d{6})$";

    public Passport(String series, String number) throws PassportAlreadyExistsException, PassportIllegalArgumentException, NullPointerException {

        if (series == null) {
            throw new PassportSeriesNullPointerException();
        }
        if (number == null) {
            throw new PassportNumberNullPointerException();
        }
        if (!series.matches(SERIES_REGEX)) {
            throw new PassportSeriesArgumentException();
        }
        if (!number.matches(NUMBER_REGEX)) {
            throw new PassportNumberArgumentException();
        }
        for (Passport passport : ALL_PASSPORTS) {
            if (passport == null) break;
            if (passport.getSeries().equals(series) && passport.getNumbers().equals(number)) {
                throw new PassportAlreadyExistsException();
            }
        }
        this.number = number;
        this.series = series;
        ALL_PASSPORTS[indexOfPassports] = this;
        indexOfPassports++;
    }

    public String getSeries() {
        return this.series;
    }

    public String getNumbers() {
        return this.number;
    }

    public static void printAllPassports() {
        for (Passport passport : ALL_PASSPORTS) {
            if (passport == null) break;
            System.out.println(passport.getSeries() + " - " + passport.getNumbers());
        }
    }
}
