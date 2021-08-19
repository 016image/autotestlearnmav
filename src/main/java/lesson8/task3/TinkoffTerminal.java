package lesson8.task3;

public class TinkoffTerminal extends Terminal {
    int minTopUpAmount = 100;

    public TinkoffTerminal(String address) {
        super(address, Company.TINKOFF, 0.09f, 600);
    }

    @Override
    public void TopUpBalance(String phoneNumber, int topUpAmount) {
        if (topUpAmount < minTopUpAmount) {
            System.out.printf("Минимальная сумма для пополнения баланса %d рублей. С уважением, ваш %s %s.\n", minTopUpAmount, company, address);
            return;
        }
        super.TopUpBalance(phoneNumber, topUpAmount);
    }
}
