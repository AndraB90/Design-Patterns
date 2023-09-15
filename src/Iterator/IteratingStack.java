package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class IteratingStack<E> implements Iterable<E> {
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

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public Iterator<E> iterator() {
        return new StackIterator();
    }

    private class StackIterator implements Iterator<E> {
        private int cursor = list.size() - 1;
        private boolean canRemove = false;

        public boolean hasNext() {
            return cursor >= 0;
        }

        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            canRemove = true;
            return list.get(cursor--);
        }

        public void remove() {
            if (!canRemove) {
                throw new IllegalStateException();
            }
            list.remove(cursor + 1);
            cursor++;
            canRemove = false;
        }
    }
}
