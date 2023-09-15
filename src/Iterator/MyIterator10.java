package Iterator;

import java.util.Iterator;

public class MyIterator10 implements Iterator<Integer> {
    private BinaryTreeDepthFirst tree;
    private int index=0;


    public MyIterator10(BinaryTreeDepthFirst tree) {
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
