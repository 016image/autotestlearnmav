package lesson8.task3;

public class Application {
    public static void main(String[] args) {
        QiwiTerminal qiwiTerminal = new QiwiTerminal("г. Москва, ул. Проходчиков, д.3");
        EleksnetTerminal eleksnetIzmailovo = new EleksnetTerminal("г. Москва, Измайловский пр-т, 73/2");
        EleksnetTerminal eleksnetBakuninskaya = new EleksnetTerminal("г. Москва, ул. Бакунинская, д.1");
        EleksnetTerminal eleksnetDesantnikov = new EleksnetTerminal("г. Новосибирск, ул. Героев-Десантников, д. 4");
        TinkoffTerminal tinkoffTerminal = new TinkoffTerminal("г. Москва, Ленинградский пр-т, д. 15");

        qiwiTerminal.TopUpBalance("+7(977)648-3991", 100);
        qiwiTerminal.TopUpBalance("+7(977)648-3991", 999);
        qiwiTerminal.TopUpBalance("+7(977)648-3991", 1000);
        eleksnetBakuninskaya.TopUpBalance("+7(900)644-0678", 200);
        eleksnetDesantnikov.TopUpBalance("+7(900)644-0678", 299);
        eleksnetIzmailovo.TopUpBalance("+7(900)644-0678", 300);
        tinkoffTerminal.TopUpBalance("+7(900)631-8976", 99);
        tinkoffTerminal.TopUpBalance("+7(900)631-8976", 100);
        tinkoffTerminal.TopUpBalance("+7(900)631-8976", 599);
        tinkoffTerminal.TopUpBalance("+7(900)631-8976", 600);

    }
}
