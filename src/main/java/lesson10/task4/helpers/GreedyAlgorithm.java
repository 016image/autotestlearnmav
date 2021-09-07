
package lesson10.task4.helpers;

import java.util.Map;
import java.util.TreeMap;

public class GreedyAlgorithm {

    public static Map<Double, Integer> calculate(Double[] nominals, Double amount) {
        Map<Double, Integer> result = new TreeMap<>();
        for (Double nominal : nominals) {
            int count = (int) (amount / nominal);
            amount -= count * nominal;
            amount = DoubleHelper.round(amount);
            if (count != 0)
                result.put(nominal, count);
        }
        return result;
    }
}