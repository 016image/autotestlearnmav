package lesson13.task3;

import java.util.Collections;
import java.util.List;

public class Functions {

    public static final Func<Object, String> toStringFunction = Object::toString;
    public static final Func<List<Integer>, Integer> summFunction = list -> {
        int summ = 0;
        for (Integer integer : list)
            summ += integer;
        return summ;
    };
    public static final Func<List<Object>, Boolean> onlyEqualsObjects = list -> {
        if (list.isEmpty()) return true;
        Object object = list.get(0);
        for (Object obj : list)
            if (!obj.equals(object))
                return false;
        return true;
    };
    public static final Func<List<Comparable>, Comparable> maxObject = list -> {
        Collections.sort(list);
        Collections.reverse(list);
        return list.get(0);
    };
}
