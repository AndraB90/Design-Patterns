package Iterator;

import java.util.Iterator;

public class Main10 {
    public static void main(String[] args) {
        IteratingStack<Integer> stack = new IteratingStack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        Iterator<Integer> iterator = stack.iterator();
        while (iterator.hasNext()) {
            int current = iterator.next();
            System.out.println("Processing: " + current);

            if (current == 2) {
                System.out.println("Adding new element to stack.");
                stack.push(5);
            }

            if (current == 3) {
                System.out.println("Removing element from stack.");
                iterator.remove();
            }
        }
    }
}
