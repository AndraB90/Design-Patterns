package strategy;

import java.util.List;

public class InsertionSort implements SortableStrategy{
    @Override
    public void sort(List<Integer> integerList) {
        System.out.println("Sorting list using Insertion Sort Algorithm");
    }
}
