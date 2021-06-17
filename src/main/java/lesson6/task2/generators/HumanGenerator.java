package lesson6.task2.generators;

import lesson6.task2.Chance;
import lesson6.task2.PhoneType;
import lesson6.task2.Human;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HumanGenerator {
    public static void generate(Set setName, int quantity) {
        for (int i = 0; i < quantity; i++) {
            String surname = NameGenerator.generate();
            String name = NameGenerator.generate();
            int age = AgeGenerator.generate();
            Map<PhoneType, String> phoneTypeAndPhone = new HashMap<>();
            for (int j = 0; j < PhoneType.values().length; j++) {
                if (Chance.calculateChance(20)) {
                    PhoneType phoneType = PhoneType.values()[j];
                    phoneTypeAndPhone.put(phoneType, PhoneGenerator.generate());
                }
            }
            Human human = new Human(surname, name, age, phoneTypeAndPhone);
            setName.add(human);
        }
    }
}
