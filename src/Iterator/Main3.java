package Iterator;

import java.util.Iterator;

public class Main3 {
    public static void main(String[] args) {
        MyHashSet set=new MyHashSet(1,2,3,4,5);
        Iterator<Integer>iter=set.iterator();

        while(iter.hasNext()){
            Integer value= iter.next();
            System.out.print("[" +value+ "]");
        }
        System.out.println();

        for(Integer value:set){
            System.out.print("[" +value+ "]");
        }
    }
}
