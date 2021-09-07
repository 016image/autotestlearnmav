package lesson10.task4.model;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

import lesson10.task4.helpers.*;

public class CashDocument implements Generatable, Save {
    private SalaryDocument salaryDocument;
    private Double[] denomination;
    private String uuid;
    private Map<Double, Integer> cashNominalAmounts;

    @Override
    public CashDocument generate() {
        salaryDocument = DocumentQueue.QUEUE.poll();
        denomination = Property.CASH_NOMINALS;
        uuid = UUID.randomUUID().toString();
        cashNominalAmounts = GreedyAlgorithm.calculate(denomination, salaryDocument.getTotal());
        return this;
    }

    @Override
    public void save() throws IOException {
        System.out.println();
        FileWriter writer = new FileWriter(Property.CASH_OUTPUT_FILE);
        writer.write(toString());
        writer.flush();
        writer.close();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Заявка на выдачу средств из кассы.").append(System.lineSeparator())
                .append("uuid: ").append(uuid).append(System.lineSeparator())
                .append(System.lineSeparator())
                .append("Обоснование: Зарплатная ведомость ").append(salaryDocument.getUuid()).append(System.lineSeparator())
                .append(System.lineSeparator())
                .append("Время операции: ").append(salaryDocument.getOperationDate()).append(".").append(System.lineSeparator())
                .append(System.lineSeparator())
                .append("Сумма операции: ").append(String.format("%.2f", salaryDocument.getTotal()))
                .append(System.lineSeparator());
        for (Map.Entry<Double, Integer> entry : cashNominalAmounts.entrySet()) {
            builder.append(String.format("%.2f - %d шт.%n", entry.getKey(), entry.getValue()));
        }
        return builder.toString();
    }
}