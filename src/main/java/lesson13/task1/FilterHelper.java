package lesson13.task1;

import java.util.ArrayList;
import java.util.List;

public class FilterHelper {

    public static List<Integer> filterInteger(List<Integer> source, Filter filter) {
        List<Integer> destination = new ArrayList<>();
        if (source == null) return null;
        for (Integer current : source) {
            if (filter.filter(current))
                destination.add(current);
        }
        return destination;
    }
}
