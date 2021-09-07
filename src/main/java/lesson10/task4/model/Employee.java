
package lesson10.task4.model;

import java.util.Random;

import lesson10.task4.helpers.*;

public class Employee implements Generatable {
    private String lastName;
    private String firstName;
    private Passport passport;
    private Double salary;

    public Double getSalary() {
        return salary;
    }

    @Override
    public Employee generate() {
        lastName = "AutoL" + StringGenerator.generate(Property.EMPLOYEE_LASTNAME_LENGTH, Property.EMPLOYEE_NAME_PATTERN);
        firstName = "AutoF" + StringGenerator.generate(Property.EMPLOYEE_FIRSTNAME_LENGTH, Property.EMPLOYEE_NAME_PATTERN);
        passport = new Passport().generate();
        salary = new Random().nextDouble() * (Property.EMPLOYEE_SALARY_MAX - Property.EMPLOYEE_SALARY_MIN) + Property.EMPLOYEE_SALARY_MIN;
        salary *= 100;
        salary = 1d * Math.round(salary) / 100;
        return this;
    }

    @Override
    public String toString() {
        return String.format("%s %s, %s, %.2f", lastName, firstName, passport, salary);
    }
}