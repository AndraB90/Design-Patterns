package Iterator;

import java.util.Iterator;
import java.util.List;

public class MyIterator9 implements Iterator<Integer> {
    private MyHashTable hashTable;
    private List<Integer> keys;
    private int index;

    public MyIterator9(MyHashTable hashTable, List<Integer> keys) {
        this.hashTable = hashTable;
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
        return hashTable.get(key);
    }
}

