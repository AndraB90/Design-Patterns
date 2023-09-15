package Iterator;

import java.util.Iterator;
import java.util.Random;

public class MyIterator11 implements Iterator<Integer> {
    private MySet set;
    private int index=0;

    Random g=new Random();


    public MyIterator11(MySet set){
        this.set=set;
        this.index=0;
    }

    public boolean hasNext(){
        return index<set.size();
    }

    public Integer next(){
        return set.get(g.nextInt(set.size()));
    }
}

