package strategy;

import java.util.List;

public class BubbleSort implements SortableStrategy {

    @Override
    public void sort(List<Integer> integerList) {
        System.out.println("Sorting list using Bubble Sort Algorithm");
    }
}
