package autotestlearn.lesson13.task1;

import lesson13.task1.Filter;
import lesson13.task1.FilterHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class FilterTests {

    @Test
    @DisplayName("Проверка метода с фильтрацией < 5")
    public void testFilterLess5() {
        List<Integer> list = Arrays.asList(-20, 0, 4, 5, 7, 9);
        Filter filter = value -> value < 5;
        List<Integer> filteredList = FilterHelper.filterInteger(list, filter);
        Assertions.assertEquals(filteredList, Arrays.asList(-20, 0, 4));
    }

    @Test
    @DisplayName("Проверка метода с фильтрацией > 10")
    public void testFilterMore10() {
        List<Integer> list = Arrays.asList(-20, 0, 4, 5, 7, 9, 10, 15, 25);
        Filter filter = value -> value > 10;
        List<Integer> filteredList = FilterHelper.filterInteger(list, filter);
        Assertions.assertEquals(filteredList, Arrays.asList(15, 25));
    }

    @Test
    @DisplayName("Проверка метода с вхождением в список")
    public void testFilterInList() {
        List<Integer> list = Arrays.asList(-20, 0, 4, 5, 7, 9, 10, 15, 25);
        Filter filter = value -> Arrays.asList(-20, 4, 9, 12, 15).contains(value);
        List<Integer> filteredList = FilterHelper.filterInteger(list, filter);
        Assertions.assertEquals(filteredList, Arrays.asList(-20, 4, 9, 15));
    }

    @Test
    @DisplayName("Проверка метода возвращающего лист только с уникальными значениями")
    public void onlyUniqueListTest() {
        List<Integer> list = Arrays.asList(-10, -7, 5, 15, 5, -2, 4, 15);
        Filter filter = value -> list.indexOf(value) == list.lastIndexOf(value);
        List<Integer> filteredList = FilterHelper.filterInteger(list, filter);
        Assertions.assertEquals(filteredList, Arrays.asList(-10, -7, -2, 4));
    }

}
