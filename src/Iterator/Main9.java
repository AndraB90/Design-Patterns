package Iterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Main9 {
    public static void main(String[] args) {
        ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        Iterator<Integer> iterator = queue.iterator();
        while (iterator.hasNext()) {
            int current = iterator.next();
            System.out.println("Processing: " + current);

            if (current == 2) {
                System.out.println("Adding new element to queue.");
                queue.add(5);
            }

            if (current == 3) {
                System.out.println("Removing element from queue.");
                iterator.remove();
            }
        }
    }
}
