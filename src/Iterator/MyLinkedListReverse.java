package Iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class MyLinkedListReverse implements Iterable<Integer>{
    private LinkedList<Integer> values=new LinkedList<>();

    public MyLinkedListReverse(Integer...values){
        this.values.addAll(Arrays.asList(values));
    }

    public Integer get(int index){
        return values.get(index);
    }

    public int size(){
        return values.size();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MyIterator8(this);
    }

    public Iterator<Integer> descendingIterator() {
        return values.descendingIterator();
    }
}
