package Iterator;

import java.util.Iterator;

public class MyIterator3 implements Iterator<Integer> {
    private MyHashSet set;
    private int index=0;

    public MyIterator3(MyHashSet set){
        this.set=set;
        this.index=0;
    }

    public boolean hasNext(){
        return index<set.size();
    }

    public Integer next(){
        return set.get(index++);
    }
}
