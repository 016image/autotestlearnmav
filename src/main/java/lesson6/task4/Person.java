package lesson6.task4;

import lesson6.task1.NameGenerator;

public class Person {
    private String lastName;
    private String firstName;
    private IdentityDocument identityDocument;

    public Person(String lastName, String firstName, IdentityDocument identityDocument) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.identityDocument = identityDocument;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public IdentityDocument getIdentityDocument() {
        return identityDocument;
    }

    public static Person random() {
        String lastName = NameGenerator.generate();
        String firstName = NameGenerator.generate();
        IdentityDocument identityDocument = IdentityDocument.random();
        return new Person(lastName, firstName, identityDocument);
    }
}
