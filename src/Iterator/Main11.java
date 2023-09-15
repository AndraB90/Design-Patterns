package Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Main11 {
    public static void main(String[] args) {
        BinaryTreeInOrder binaryTreeInOrder=new BinaryTreeInOrder(4,3,2,1,6);
        Iterator<Integer> iter= binaryTreeInOrder.iterator();

        while(iter.hasNext()){
            Integer value= iter.next();
            System.out.print("[" +value+ "]");
        }
    }
}
