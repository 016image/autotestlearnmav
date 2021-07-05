package lesson6.task4;

public enum IdentityDocumentType {
    MILITARY_ID("07", "Военный билет"),
    DIPLOMATIC_PASSPORT("09", "Дипломатический паспорт"),
    FOREIGN_CITIZEN_PASSPORT("10", "Паспорт иностранного гражданина"),
    RUSSIAN_CITIZEN_PASSPORT("21", "Паспорт гражданина Российской Федерации"),
    INTERNATIONAL_PASSPORT("22", "Загранпаспорт гражданина Российской Федерации");

    private String code;
    private String description;

    IdentityDocumentType(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static IdentityDocumentType byCode(String code) {
        for (IdentityDocumentType documentType : values()) {
            if (documentType.code.equals(code)) return documentType;
        }
        return null;
    }
}
