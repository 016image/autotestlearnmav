package lesson4.task4;

public class PassportBase {
    private static final Passport[] PASSPORT_BASE = new Passport[100];
    private static int index = 0;

    public static void addPassportBase(Passport passport) {
        PASSPORT_BASE[index++] = passport;
    }

    public static Boolean duplicatePassport(String series, String number) {
        for (int i = 0; i < PASSPORT_BASE.length; i++) {
            if (PASSPORT_BASE[i] == null) {
                break;
            }
            String currentSeries = PASSPORT_BASE[i].getSeries();
            String currentNumber = PASSPORT_BASE[i].getNumber();
            if (currentNumber == null || currentSeries == null) {
                continue;
            }
            if (PASSPORT_BASE[i].getSeries().equals(series) && PASSPORT_BASE[i].getNumber().equals(number)) {
                System.out.printf("Паспорт с такими данными %s %s уже существует%n", PASSPORT_BASE[i].getSeries(), PASSPORT_BASE[i].getNumber());
                return true;
            }
        }
        return false;
    }
}

