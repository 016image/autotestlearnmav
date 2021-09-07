package lesson10.task4;

import java.io.IOException;

import lesson10.task4.model.*;

public class Application {

    public static void main(String[] args) throws IOException {
        new SalaryDocument().generate().save();
        new CashDocument().generate().save();
    }
}