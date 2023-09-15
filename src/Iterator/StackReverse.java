package Iterator;

import java.util.*;

public class StackReverse <E> implements Iterable<E>{
    private List<E> list = new ArrayList<>();

    public void push(E item) {
        list.add(item);
    }

    public E pop() {
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException();
        }
        return list.remove(size - 1);
    }

    public void reverse(){
        Collections.reverse(list);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }


    public Iterator<E> iterator() {
        return new StackReverse.StackIterator();
    }



    private class StackIterator implements Iterator<E> {
        private int cursor = 0;
        private boolean canRemove = false;

        public boolean hasNext() {
            return cursor <list.size();
        }

        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            canRemove = true;
            return list.get(cursor++);
        }

        public void remove() {
            if (!canRemove) {
                throw new IllegalStateException();
            }
            list.remove(cursor - 1);
            cursor--;
            canRemove = false;
        }
    }
}
