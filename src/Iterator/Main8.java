package Iterator;

import java.util.*;

public class Main8 {
    public static void main(String[] args) {
        Map<Integer, List<Integer>> adjacencyList = new HashMap<>();
        adjacencyList.put(1, Arrays.asList(2, 3));
        adjacencyList.put(2, Arrays.asList(4, 5));
        adjacencyList.put(3, Arrays.asList(6, 7));
        adjacencyList.put(4, Arrays.asList(8));
        adjacencyList.put(5, Arrays.asList(9));
        adjacencyList.put(6, Arrays.asList(10));
        adjacencyList.put(7, Arrays.asList(11));
        adjacencyList.put(8, Arrays.asList(12));
        adjacencyList.put(9, Arrays.asList(13));
        adjacencyList.put(10, Arrays.asList(14));
        adjacencyList.put(11, Arrays.asList(15));
        adjacencyList.put(12, new ArrayList<>());
        adjacencyList.put(13, new ArrayList<>());
        adjacencyList.put(14, new ArrayList<>());
        adjacencyList.put(15, new ArrayList<>());

        BFSIterator<Integer> it = new BFSIterator<>(adjacencyList, 1);
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}
