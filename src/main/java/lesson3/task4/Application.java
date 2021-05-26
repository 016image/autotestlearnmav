package lesson3.task4;

public class Application {
    public static void main(String[] args) {
        Human sergey = new Human("Сергей");
        Human valeriy = new Human("Валерий");
        Human mihail = new Human("Михаил");
        Human egor = new Human("Егор");
        Human stanislav = new Human("Станислав");
        Human alexandr = new Human("Александр");
        Human grigoriy = new Human("Григорий");

        sergey.addFriend(valeriy);
        sergey.addFriend(grigoriy);
        valeriy.addFriend(stanislav);
        stanislav.addFriend(mihail);
        mihail.addFriend(alexandr);
        alexandr.addFriend(egor);
        alexandr.addFriend(grigoriy);
        egor.addFriend(grigoriy);

        System.out.println(areFriends(sergey, grigoriy));
        System.out.println(areFriends(sergey, alexandr));
        System.out.println(areFriends(stanislav, mihail));
        System.out.println(areFriends(mihail, valeriy));
    }

    static boolean areFriends(Human firstFried, Human secondFried) {
        return firstFried.hasFriend(secondFried) && secondFried.hasFriend(firstFried);
    }
}
