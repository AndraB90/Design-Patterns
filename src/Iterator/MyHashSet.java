package Iterator;

import java.util.*;

public class MyHashSet implements Iterable<Integer> {
    private HashSet<Integer>values=new HashSet<>();

    List<Integer> list = new ArrayList<>(values);

    public MyHashSet(Integer...values){
        this.values.addAll(Arrays.asList(values));
        this.list = new ArrayList<>(Arrays.asList(values));
    }

    public Integer get(int index){
        return list.get(index);
    }

    public int size(){
        return values.size();
    }

    @Override
    public Iterator<Integer> iterator(){
        return new MyIterator3(this);
    }
}
