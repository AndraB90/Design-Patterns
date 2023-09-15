package Iterator;

import java.util.Iterator;
import java.util.List;

public class MyIterator6 implements Iterator<Integer> {
    private MyHashMap hashMap;
    private List<Integer> keys;
    private int index;

    public MyIterator6(MyHashMap hashMap, List<Integer> keys) {
        this.hashMap = hashMap;
        this.keys = keys;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < keys.size();
    }

    @Override
    public Integer next() {
        int key = keys.get(index++);
        return hashMap.get(key);
    }
}
