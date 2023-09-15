package strategy;

import java.util.List;

public class QuickSort implements SortableStrategy {
    @Override
    public void sort(List<Integer> integerList) {
        System.out.println("Sorting list using Quick Sort Algorithm");
    }
}
