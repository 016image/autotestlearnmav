package lesson7.task4;

import java.util.ArrayList;

public class BaseCredit {
    protected double amount;
    protected double rate;
    protected int duration;
    protected double overallPayment;

    public BaseCredit(double amount, double rate, int duration) {
        this.amount = amount;
        this.rate = rate;
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public ArrayList<Double> getMonthPayments() {
        ArrayList<Double> monthPayments = new ArrayList<>();
        this.overallPayment = 0;
        for (int i = 0; i < duration; i++) {
            monthPayments.add(amount / duration);
            overallPayment += (amount / duration);
        }
        return monthPayments;
    }

    public double calculateOverpayment() {
        return overallPayment - amount;
    }
}
