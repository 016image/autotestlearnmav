package lesson10.task4.model;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import lesson10.task4.helpers.*;

public class SalaryDocument implements Generatable, Save {

    private List<Employee> employees = new ArrayList<>();
    private Double total = 0d;
    private String uuid;
    private String operationDate;

    public Double getTotal() {
        return total;
    }

    @Override
    public SalaryDocument generate() {
        for (int i = 0; i < Property.SALARY_EMPLOYEE_COUNT; i++) {
            Employee newEmployee = new Employee().generate();
            employees.add(newEmployee);
            total += newEmployee.getSalary();
        }
        total = DoubleHelper.round(total);
        uuid = UUID.randomUUID().toString();
        operationDate = new SimpleDateFormat(Property.SALARY_DATE_FORMAT).format(new Date(new Date().getTime() + 86_400_000L));
        DocumentQueue.QUEUE.add(this);
        return this;
    }

    @Override
    public void save() throws IOException {
        System.out.println();
        FileWriter writer = new FileWriter(Property.SALARY_OUTPUT_FILE);
        writer.write(toString());
        writer.flush();
        writer.close();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Зарплатная ведомость.").append(System.lineSeparator())
                .append("uuid: ").append(uuid).append(System.lineSeparator()).append(System.lineSeparator())
                .append("Время операции: ").append(operationDate).append(".").append(System.lineSeparator()).append(System.lineSeparator())
                .append("Список сотрудников:").append(System.lineSeparator());
        for (Employee employee : employees) {
            builder.append(employee).append(System.lineSeparator());
        }
        builder.append("Общая сумма: ").append(String.format("%.2f", total));
        return builder.toString();
    }

    public String getUuid() {
        return uuid;
    }

    public String getOperationDate() {
        return operationDate;
    }
}