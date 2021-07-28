package lesson7.task4;

import java.util.ArrayList;

public class DifferentiateCredit extends BaseCredit {

    public DifferentiateCredit(double amount, double rate, int duration) {
        super(amount, rate, duration);
    }

    @Override
    public ArrayList<Double> getMonthPayments() {
        ArrayList<Double> monthPayments = new ArrayList<>();
        double creditBody = amount;
        int monthRemaining = duration;
        double overallPayment = 0;
        for (int i = 0; i < duration; i++) {
            double monthPayment = creditBody / monthRemaining + creditBody * rate / 12 / 100;
            monthPayments.add(monthPayment);
            monthRemaining--;
            creditBody -= monthPayment;
            overallPayment += monthPayment;
        }
        this.overallPayment = overallPayment;
        return monthPayments;
    }
}
