package strategy;

import java.util.List;

public class MergeSort implements SortableStrategy{
    @Override
    public void sort(List<Integer> integerList) {
        System.out.println("Sorting list using Merge Sort Algorithm");
    }
}
