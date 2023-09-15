package Iterator;

import java.util.Iterator;

public class Main15 {
    public static void main(String[] args) {
        BinaryTreeDepthFirst binaryTreeDepthFirst=new BinaryTreeDepthFirst(4,3,2,1,6);
        Iterator<Integer> iter= binaryTreeDepthFirst.iterator();

        while(iter.hasNext()){
            Integer value= iter.next();
            System.out.print("[" +value+ "]");
        }
    }
}

