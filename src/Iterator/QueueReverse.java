package Iterator;

import java.util.*;

public class QueueReverse<E> implements Iterable<E> {
    private List<E> list = new ArrayList<>();

    public void enqueue(E item) {
        list.add(item);
    }

    public E dequeue() {
        return list.remove(0);
    }

    public void reverse(){
        Collections.reverse(list);
    }

    public Iterator<E> iterator() {
        return new QueueIterator();
    }

    private class QueueIterator implements ListIterator<E> {
        private int cursor = 0;
        private boolean canRemove = false;

        public boolean hasNext() {
            return cursor < list.size();
        }

        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            canRemove = true;
            return list.get(cursor++);
        }

        public boolean hasPrevious() {
            return cursor > 0;
        }

        public E previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            canRemove = true;
            return list.get(--cursor);
        }

        public int nextIndex() {
            return cursor;
        }

        public int previousIndex() {
            return cursor - 1;
        }

        public void remove() {
            if (!canRemove) {
                throw new IllegalStateException();
            }
            list.remove(cursor - 1);
            cursor--;
            canRemove = false;
        }

        public void set(E item) {
            if (!canRemove) {
                throw new IllegalStateException();
            }
            list.set(cursor - 1, item);
        }

        public void add(E item) {
            list.add(cursor++, item);
            canRemove = false;
        }
    }
}
