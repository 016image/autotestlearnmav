package lesson7.task4;

public class Application {
    public static void main(String[] args) {
        BaseCredit baseCredit = new BaseCredit(300_000d, 16.9d, 12);
        BaseCredit differentiateCredit = new DifferentiateCredit(300_000d, 16.9d, 12);
        BaseCredit annuityCredit = new AnnuityCredit(300_000d, 16.9d, 12);

        for (int i = 0; i < baseCredit.getDuration(); i++) {
            System.out.printf("%d: %.2f  %.2f  %.2f\n", i + 1, baseCredit.getMonthPayments().get(i), differentiateCredit.getMonthPayments().get(i), annuityCredit.getMonthPayments().get(i));
        }
        System.out.printf("Переплата по кредитам:\n%.2f  %.2f  %.2f\n", baseCredit.calculateOverpayment(), differentiateCredit.calculateOverpayment(), annuityCredit.calculateOverpayment());
    }
}
