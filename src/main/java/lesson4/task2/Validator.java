package lesson4.task2;

public class Validator {

    public static boolean stringFormatValidation(String str) {
        boolean stringValid = str.matches("^\\S*\\s\\S*\\s\\S*$");
        if (stringValid) {
            System.out.println("Строка соответствует формату");
        } else {
            System.out.println("Строка не соответствует формату");
        }
        return stringValid;
    }

    public static String[] convertStringToArrayOfWords(String str) {
        String[] words = str.split(" ");
        System.out.println("Строка разделена на слова по пробелам");
        return words;
    }

    public static boolean validateAnObjectOfTypeHuman(Human human) {
        boolean validHuman = human.getLastName() != null && human.getFirstName() != null && human.getBirthDate() != null;
        if (validHuman) {
            System.out.println("Объект типа Human валиден");
        } else {
            System.out.println("Объект типа Human не валиден");
        }
        return validHuman;
    }

    public static boolean validateAnArrayOfTypeHuman(Human[] humans) {
        boolean arrayIsFull = true;
        for (Human human : humans) {
            if (human == null) {
                arrayIsFull = false;
                break;
            }
        }
        if (arrayIsFull) {
            System.out.println("Массив заполнен");
        } else {
            System.out.println("В массиве есть свободное место");
        }
        return arrayIsFull;
    }
}
