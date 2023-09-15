package Iterator;

import java.util.Iterator;

public class MyIterator4 implements Iterator<String> {
    private MyString string;
    private int index=0;

    public MyIterator4(MyString string) {
        this.string = string;
        this.index=index;
    }

    @Override
    public boolean hasNext(){
        return index< string.size();
    }

    @Override
    public String next(){
        return String.valueOf(string.getString().charAt(index++));
    }
}
