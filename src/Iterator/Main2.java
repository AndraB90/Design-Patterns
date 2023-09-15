package Iterator;

import java.util.Iterator;

public class Main2 {
    public static void main(String[] args) {
        MyLinkedList linkedList=new MyLinkedList(2,4,6,8,9,10);
        Iterator<Integer>iter=linkedList.iterator();

        while(iter.hasNext()){
            Integer value=iter.next();
            System.out.print("[" +value+ "]");
        }

        System.out.println();

        for(Integer value: linkedList){
            System.out.print("[" +value+ "]");
        }
    }
}
