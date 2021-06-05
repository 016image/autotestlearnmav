package lesson4.task3.workers;

public class ServiceDesk {
    private static int ticketNumber = 0;

    public static void createTicket(String description) {
        System.out.printf("Заявка %d была создана: %s%n", ++ticketNumber, description);
        if (description.matches("^(.*)((справк[ауеио])|(отчет)|(бюджет))(.*)$")) {
            Accountant.takeTicket(ticketNumber);
            return;
        }
        if (description.matches("^.*((доставк[ауие])|(курьер)).*$")) {
            Logistician.takeTicket(ticketNumber);
            return;
        }
        if (description.matches("^.*((компьютер)|(сервер)|(принтер)).*$")) {
            SysAdmin.takeTicket(ticketNumber);
            return;
        }
        if (description.contains("уборк")) {
            Cleaner.takeTicket(ticketNumber);
            return;
        }
        takeTicket();
    }

    private static void takeTicket() {
        System.out.printf("Специалист по выполнению заявки %d не найден%n", ticketNumber);
    }
}
