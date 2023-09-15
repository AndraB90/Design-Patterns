package Iterator;

import java.util.Iterator;

public class Main7 {
    public static void main(String[] args) {
        MyHashMap hashMap=new MyHashMap(5, 2, 8, 1, 9, 4);
        Iterator<Integer> iterator=hashMap.iterator();

        while(iterator.hasNext()){
            Integer value=iterator.next();
            System.out.print("[" +value+ "]");
        }
    }
}
