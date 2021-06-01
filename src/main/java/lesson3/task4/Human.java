package lesson3.task4;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Human {
    private String name;
    private ArrayList<Human> friends = new ArrayList();


    Human(String name) {
        this.name = name;
    }

    public void addFriend(Human friend) {
        if (!this.hasFriend(friend)) {
            this.friends.add(friend);
            friend.addFriend(this);
        }
    }

    public boolean hasFriend(Human friend) {
        return this.friends.contains(friend);
    }
}

