package Iterator;

import java.util.Iterator;

public class Main12 {
    public static void main(String[] args) {
        MyLinkedListReverse linkedList=new MyLinkedListReverse(2,4,6,8,9,10);
        Iterator<Integer> iter = linkedList.descendingIterator();

        while(iter.hasNext()){
            Integer value=iter.next();
            System.out.print("[" +value+ "]");
        }


    }
}
