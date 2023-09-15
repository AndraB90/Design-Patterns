package Iterator;

import java.util.Iterator;

public class Main17 {
    public static void main(String[] args) {
        QueueReverse<Integer> queueReverse = new QueueReverse<Integer>();
        queueReverse.enqueue(1);
        queueReverse.enqueue(2);
        queueReverse.enqueue(3);
        queueReverse.enqueue(4);

        queueReverse.reverse();

        Iterator<Integer> iterator = queueReverse.iterator();
        while (iterator.hasNext()) {
            int current = iterator.next();
            System.out.println("Processing: " + current);
        }
    }
}
