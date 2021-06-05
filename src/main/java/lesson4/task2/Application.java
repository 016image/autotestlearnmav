package lesson4.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Application {
    public static void main(String[] args) throws IOException {
        Human[] humans = new Human[2];
        int index = 0;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = bufferedReader.readLine();

        while (true) {
            boolean inputValid = Validator.stringFormatValidation(input);
            if (!inputValid) continue;

            String[] arrayFromInput = Validator.convertStringToArrayOfWords(input);

            Human human = new Human();
            human.setLastName(arrayFromInput[0]);
            human.setFirstName(arrayFromInput[1]);
            human.setBirthDate(LocalDate.parse(arrayFromInput[2], DateTimeFormatter.ofPattern("dd.MM.yyyy")));

            boolean isHumanValid = Validator.validateAnObjectOfTypeHuman(human);
            if (!isHumanValid) continue;

            humans[index++] = human;

            boolean isArrayFull = Validator.validateAnArrayOfTypeHuman(humans);
            if (isArrayFull) break;
        }
    }
}
