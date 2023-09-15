package Iterator;

import java.util.Iterator;

public class MyIterator2 implements Iterator<Integer> {
    private MyLinkedList li;
    private int index=0;

    public MyIterator2(MyLinkedList li){
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
