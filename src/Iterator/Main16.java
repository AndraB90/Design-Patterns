package Iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main16 {
    public static void main(String[] args) {
        StackReverse<Integer> stack = new StackReverse<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        stack.reverse();


        Iterator<Integer> iterator = stack.iterator();
        while (iterator.hasNext()) {
            int current = iterator.next();
            System.out.println("Processing: " + current);

        }

    }
}
