package Iterator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MyTextFile {
    private List<Integer>readFileInList=new ArrayList<>();

    public MyTextFile(Integer...readFileInList) {
        this.readFileInList.addAll(Arrays.asList(readFileInList));
    }

    public Integer get(int index){
        return readFileInList.get(index);
    }

    public int size(){
        return readFileInList.size();
    }

    public Iterator<Integer> iterator(){
        return new MyIterator5(this);
    }
}
