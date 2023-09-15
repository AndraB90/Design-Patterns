package Iterator;

import java.util.Iterator;

public class Main13 {
    public static void main(String[] args) {
        MyPriorityQueue<Integer> queue = new MyPriorityQueue<Integer>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        Iterator<Integer> iterator = queue.iterator();
        while (iterator.hasNext()) {
            int current = iterator.next();
            System.out.println("Processing: " + current);

        }
    }
}
