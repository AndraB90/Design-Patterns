package Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class MyCollection implements Iterable<Integer> {

    private ArrayList<Integer> values= new ArrayList<>();

    public MyCollection(Integer...values){
        this.values.addAll(Arrays.asList(values));
    }

    public Integer get(int index){
        return values.get(index);
    }

    public int size(){
        return values.size();
    }

    public Iterator<Integer> iterator(){
        return new MyIterator(this);
    }
}
