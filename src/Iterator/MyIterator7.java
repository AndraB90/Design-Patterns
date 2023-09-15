package Iterator;

import java.util.Iterator;

public class MyIterator7 implements Iterator<Integer> {
    private BinaryTreeInOrder tree;
    private int index=0;


    public MyIterator7(BinaryTreeInOrder tree) {
        this.tree = tree;
        this.index=0;
    }

    @Override
    public boolean hasNext() {
        return index<tree.size();
    }

    public Integer next(){
        return tree.get(index++);
    }
}
