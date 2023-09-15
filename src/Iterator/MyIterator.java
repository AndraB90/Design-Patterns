package Iterator;

import java.util.Iterator;

public class MyIterator implements Iterator<Integer> {

    private MyCollection col;
    private int index=0;

    public MyIterator(MyCollection col){
        this.col=col;
        this.index=0;
    }

    @Override
    public boolean hasNext() {
        return index<col.size();
    }

    @Override
    public Integer next() {
        return col.get(index++);
    }
}
