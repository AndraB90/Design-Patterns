package Iterator;

import java.util.Iterator;

public class MyIterator8 implements Iterator<Integer> {
    private MyLinkedListReverse li;
    private int index=0;

    public MyIterator8(MyLinkedListReverse li){
        this.li=li;
        this.index=0;
    }

    @Override
    public boolean hasNext(){
        return index<li.size();
    }

    @Override
    public Integer next(){
        return li.get(index++);
    }
}
