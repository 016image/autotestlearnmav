package lesson6.task4;

import java.util.Random;

public class StringGenerator {
    private static final String DIGITS = "0123456789";
    private static final String RUSSIAN_CAPITALS = "ЙЦУКЕНГШЩЗХЪФЫВАПРОЛДЖЭЯЧСМИТЬБЮ";
    private static final String RANDOM_SYMBOL = "QAZXSWEDCVFRTGBNHYUJMKILOP0123456789";

    public static String generate(IdentityDocumentType documentType) {
        switch (documentType) {
            case MILITARY_ID:
                return generateMilitaryId();
            case DIPLOMATIC_PASSPORT:
                return generateDiplomaticId();
            case FOREIGN_CITIZEN_PASSPORT:
                return generateForeignCitizenId();
            case RUSSIAN_CITIZEN_PASSPORT:
                return generateRussianCitizenId();
            case INTERNATIONAL_PASSPORT:
                return generateInternationalId();
            default:
                throw new IllegalArgumentException("Не описан метод генерации серии и номера для переданного типа документа " + documentType.name());
        }
    }

    private static String generateMilitaryId() {
        return String.format("%s %s", randomString(RUSSIAN_CAPITALS, 2), randomOrEmpty(DIGITS) + randomString(DIGITS, 6));
    }

    private static String generateDiplomaticId() {
        return String.format("%s %s", randomString(DIGITS, 2), randomString(DIGITS, 7));
    }

    private static String generateForeignCitizenId() {
        return randomString(RANDOM_SYMBOL, 25);
    }

    private static String generateRussianCitizenId() {
        return String.format("%s %s %s", randomString(DIGITS, 2), randomString(DIGITS, 2), randomString(DIGITS, 6));
    }

    private static String generateInternationalId() {
        return String.format("%s %s", randomString(DIGITS, 2), randomString(DIGITS, 7));
    }

    private static String randomOrEmpty(String pattern) {
        int random = new Random().nextInt(100);
        if (random <= 50) return "";
        else return String.valueOf(pattern.charAt(new Random().nextInt(pattern.length())));
    }

    private static String randomString(String pattern, int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(pattern.charAt(new Random().nextInt(pattern.length())));
        }
        return sb.toString();
    }
}
