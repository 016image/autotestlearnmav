package lesson3.task5;

import java.util.Random;

public class Names {
    public static String[] namePeoples = {"Андрей", "Егор", "Влад", "Илья", "Олег", "Кирилл", "Жбан", "Чел", "Виталя", "Александр НАГОРНОВ", "ММ"};
    static String[] nameDogs = {"Рекс", "Коди", "Харли", "Лола", "Виксен",};
    static String[] nameCats = {"Барсик", "Кузя", "Алекс", "Мурзик", "Персик",};

    public static String RandomNamePeople() {
        return getRandomIndex(namePeoples);
    }

    public static String RandomNameDogs() {
        return getRandomIndex(nameDogs);
    }

    public static String RandomNameCats() {
        return getRandomIndex(nameCats);
    }

    public static String getRandomIndex(String[] names) {
        int RandomIndex = new Random().nextInt(names.length - 1);
        return names[RandomIndex];
    }
}

