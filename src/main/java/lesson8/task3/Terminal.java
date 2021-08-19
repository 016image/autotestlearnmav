package lesson8.task3;

abstract class Terminal implements TopUpBalance {
    String address;
    Company company;
    float commission;
    int commissionBoundary;

    public Terminal(String address, Company company, float commission, int commissionBoundary) {
        this.address = address;
        this.company = company;
        this.commission = commission;
        this.commissionBoundary = commissionBoundary;
    }

    @Override
    public void TopUpBalance(String phoneNumber, int topUpAmount) {
        float afterCommission;
        if (topUpAmount < commissionBoundary) {
            afterCommission = topUpAmount * (1 - commission);
        } else {
            afterCommission = topUpAmount;
        }
        System.out.printf("Внесена сумма %d для пополнения телефона %s. Баланс пополнен на сумму %.2f. С уважением, ваш %s, %s\n", topUpAmount, phoneNumber, afterCommission, company, address);
    }
}
