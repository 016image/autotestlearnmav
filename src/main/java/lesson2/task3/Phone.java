package lesson2.task3;

import java.util.regex.Pattern;

public class Phone {
    public static void main(String[] args) {
        Phone phone = new Phone();
        //q
        System.out.println("+7(910)423-73-12" + " " + "=" + " " + phone.regular("+7(910)423-73-12"));
        System.out.println("7(910)423-73-12" + " " + "=" + " " + phone.regular("7(910)423-73-12"));
        System.out.println("89215310934" + " " + "=" + " " + phone.regular("89215310934"));
        System.out.println("+5(911)310-12-74" + " " + "=" + " " + phone.regular("+5(911)310-12-74"));
        System.out.println("+7(9fg)125-42-99" + " " + "=" + " " + phone.regular("+7(9fg)125-42-99"));
        System.out.println("+7(122)2342343" + " " + "=" + " " + phone.regular("+7(122)2342343"));
        System.out.println();
        System.out.println("+7(910)423-73-12" + " " + "=" + " " + phone.cycles("+7(910)423-73-12"));
        System.out.println("7(910)423-73-12" + " " + "=" + " " + phone.cycles("7(910)423-73-12"));
        System.out.println("89215310934" + " " + "=" + " " + phone.cycles("89215310934"));
        System.out.println("+5(911)310-12-74" + " " + "=" + " " + phone.cycles("+5(911)310-12-74"));
        System.out.println("+7(9fg)125-42-99" + " " + "=" + " " + phone.cycles("+7(9fg)125-42-99"));
        System.out.println("+7(122)2342343" + " " + "=" + " " + phone.cycles("+7(122)2342343"));
    }

    boolean regular(String phone) {
        return Pattern.matches("^\\+7\\(\\d{3}\\)\\d{3}-\\d{2}-\\d{2}$", phone);
    }

    boolean cycles(String phone) {
        if (phone == null || phone.length() != 16)
            return false;
        if (!phone.startsWith("+7("))
            return false;
        if (phone.charAt(6) != ')')
            return false;
        if ((phone.charAt(10) != '-') || (phone.charAt(13) != '-'))
            return false;
        int[] idNumbers = {3, 4, 5, 7, 8, 9, 11, 12, 14, 15};
        String numbers = "0123456789";
        for (int idNumber : idNumbers) {
            String symbol = String.valueOf(phone.charAt(idNumber));
            if (!numbers.contains(symbol))
                return false;
        }
        return true;
    }
}
