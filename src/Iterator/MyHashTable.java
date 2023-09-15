package Iterator;

import java.util.*;

public class MyHashTable implements Iterable<Integer>{
    private HashMap<Integer, Integer> hashMap = new HashMap<>();

    public MyHashTable(Integer... values) {
        for (Integer value : values) {
            this.hashMap.put(value, value);
        }
    }

    public Integer get(int key) {
        return hashMap.get(key);
    }

    public int size() {
        return hashMap.size();
    }

    @Override
    public Iterator<Integer> iterator() {
        List<Integer> keys = new ArrayList<>(hashMap.keySet());
        Collections.sort(keys);
        return new MyIterator9(this, keys);
    }
}
