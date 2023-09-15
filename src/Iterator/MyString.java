package Iterator;

import java.util.Iterator;

public class MyString implements Iterable<String> {
    private String myString;

    public MyString(String myString) {
        this.myString = myString;
    }

    public Integer get(char ch){
        int index=myString.indexOf(ch);
        return index!=-1 ? index:null;
    }

    public int size(){
        return myString.length();
    }

    public String getString() {
        return myString;
    }

    @Override
    public Iterator<String>iterator(){
        return new MyIterator4(this);
    }
}
