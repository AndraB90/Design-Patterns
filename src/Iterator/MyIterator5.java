package Iterator;

import java.util.Iterator;

public class MyIterator5 implements Iterator<Integer> {
    private MyTextFile file;
    private int index;

    public MyIterator5(MyTextFile file) {
        this.file = file;
        this.index=0;
    }

    @Override
    public boolean hasNext(){
        return index< file.size();
    }

    @Override
    public Integer next(){
        return file.get(index++);
    }
}
