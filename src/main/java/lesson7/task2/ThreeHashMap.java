package lesson7.task2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ThreeHashMap<K, V1, V2> extends HashMap<K, V1> {
    private Map<K, V1> map1 = new HashMap<>();
    private Map<K, V2> map2 = new HashMap<>();

    public boolean containsValue2(Object value) {
        return map1.containsValue(value);
    }

    public boolean containsValue1(Object value) {
        return map2.containsValue(value);
    }

    public Object getFirst(Object key) {
        return map1.get(key);
    }

    public Object getSecond(Object key) {
        return map2.get(key);
    }

    //FIXME: не понятно, как сделать тип возвращаемого значения void, как в постановке задачи.
    @Override
    public V1 remove(Object key) {
        map1.remove(key);
        map2.remove(key);
        return null;
    }

    @Override
    public Set<K> keySet() {
        return map1.keySet();
    }

    public Collection<V1> values1() {
        return map1.values();
    }

    public Collection<V2> values2() {
        return map2.values();
    }

    //В постановке задачи нет уточнения, как нужно добавлять. Исходим из того, что для добавления тройки должны быть переданы V1 И V2 с одинаковым K;
    public void putAll(Map<K, V1> map1, Map<K, V2> map2) {
        for (K key : map1.keySet()) {
            if (map2.containsKey(key)) {
                this.map1.put(key, map1.get(key));
                this.map2.put(key, map2.get(key));
            }
        }
    }

    //В задании put без ключа.
    public void put(K key, V1 value1, V2 value2) {
        map1.put(key, value1);
        map2.put(key, value2);
    }

    @Override
    public void clear() {
        map1.clear();
        map2.clear();
    }

    @Override
    public int size() {
        return map1.size();
    }

    @Override
    public boolean isEmpty() {
        return map1.isEmpty();
    }

    @Override
    //Предполагаю, что в постановке задачи опечатка, нет ключа в методе "boolean containsKey()"
    public boolean containsKey(Object key) {
        return map1.containsKey(key);
    }

    public void printAll() {
        for (K key : map1.keySet()) {
            System.out.println(key.toString() + ' ' + map1.get(key).toString() + ' ' + map2.get(key).toString() + '\n');
        }
    }
}
