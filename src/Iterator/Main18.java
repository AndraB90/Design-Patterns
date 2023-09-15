package Iterator;

import java.util.Iterator;

public class Main18 {
    public static void main(String[] args) {

        MySet set = new MySet(1, 2, 3, 4, 5);
        Iterator<Integer> iter = set.iterator();
        int count=0;

        while (iter.hasNext()) {
            Integer value = iter.next();
            System.out.print("[" + value + "]");
            count++;
            if(count>10){
                break;
            }
        }
        System.out.println();
    }
}
