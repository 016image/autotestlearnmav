package lesson6.task2;

import lesson6.task2.generators.HumanGenerator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application {
    public static void main(String[] args) {
        Set<Human> humans = new HashSet<>();
        HumanGenerator.generate(humans, 2000);

        Iterator<Human> iterator = humans.iterator();
        while (iterator.hasNext()) {
            Human human = iterator.next();
            Set<PhoneType> phoneTypes = human.getPhoneTypeAndPhone().keySet();
            if (phoneTypes.contains(PhoneType.HOME) && phoneTypes.contains(PhoneType.MOBILE) && phoneTypes.contains(PhoneType.WORK)) {
                System.out.printf("%s %s, возраст %d, тел: дом. %s, моб. %s, раб. %s%n",
                        human.getSurname(), human.getName(), human.getAge(),
                        human.getPhoneTypeAndPhone().get(PhoneType.HOME), human.getPhoneTypeAndPhone().get(PhoneType.MOBILE), human.getPhoneTypeAndPhone().get(PhoneType.WORK));
            }
            if (phoneTypes.contains(PhoneType.HOME) || phoneTypes.contains(PhoneType.MOBILE) || phoneTypes.contains(PhoneType.WORK))
                iterator.remove();
        }
        System.out.println("Количество людей после удаления: " + humans.size());
    }
}
