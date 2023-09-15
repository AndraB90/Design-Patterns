package Iterator;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MyCollection col= new MyCollection(4,13,2,9,6);
        Iterator<Integer>iter= col.iterator();
        while(iter.hasNext()){
            Integer value=iter.next();
            System.out.print("[" +value+ "]");
        }

        System.out.println();

        for(Integer value: col){
            System.out.print("[" +value+ "]");
        }
    }
}
