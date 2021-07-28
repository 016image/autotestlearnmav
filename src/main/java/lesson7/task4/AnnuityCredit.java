package lesson7.task4;

import java.util.ArrayList;

public class AnnuityCredit extends BaseCredit {

    public AnnuityCredit(double amount, double rate, int duration) {
        super(amount, rate, duration);
    }

    @Override
    public ArrayList<Double> getMonthPayments() {
        ArrayList<Double> monthPayments = new ArrayList<>();
        double overallPayment = 0;
        double monthPayment;
        double monthRate = rate / 100 / 12;
        monthPayment = amount * (monthRate * Math.pow(1 + monthRate, duration)) / (Math.pow(1 + monthRate, duration) - 1);
        for (int i = 0; i < duration; i++) {
            monthPayments.add(monthPayment);
            overallPayment += monthPayment;
        }
        this.overallPayment = overallPayment;
        return monthPayments;
    }
}
