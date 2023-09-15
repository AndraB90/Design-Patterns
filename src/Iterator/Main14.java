package Iterator;

import java.util.Iterator;

public class Main14 {
    public static void main(String[] args) {
        MyHashTable hashTable=new MyHashTable(5, 2, 8, 1, 9, 4);
        Iterator<Integer> iterator=hashTable.iterator();

        while(iterator.hasNext()){
            Integer value=iterator.next();
            System.out.print("[" +value+ "]");
        }
    }
}
