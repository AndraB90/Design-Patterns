package Iterator;

import java.util.*;

public class BFSIterator<T> implements Iterator<T> {
    private Map<T, List<T>> adjacencyList;
    private Queue<T> queue;
    private Set<T> visited;

    public BFSIterator(Map<T, List<T>> adjacencyList, T start) {
        this.adjacencyList = adjacencyList;
        this.queue = new LinkedList<>();
        this.visited = new HashSet<>();
        queue.add(start);
        visited.add(start);
    }

    public boolean hasNext() {
        return !queue.isEmpty();
    }

    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        T current = queue.poll();
        List<T> neighbors = adjacencyList.get(current);
        if (neighbors != null) {
            for (T neighbor : neighbors) {
                if (!visited.contains(neighbor)) {
                    queue.add(neighbor);
                    visited.add(neighbor);
                }
            }
        }
        return current;
    }
}