package Iterator;

import java.util.*;

public class MySet implements Iterable<Integer> {
    private Set<Integer> values=new HashSet<>();

    List<Integer> list = new ArrayList<>(values);

    public MySet(Integer...values){
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
        return new MyIterator11(this);
    }
}
