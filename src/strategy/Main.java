package strategy;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>(Arrays.asList(10,3,6,8,9,5));

        Context context = new Context(new BubbleSort());
        context.execute(integerArrayList);

        context = new Context(new MergeSort());
        context.execute(integerArrayList);

        context = new Context(new InsertionSort());
        context.execute(integerArrayList);

        context = new Context(new QuickSort());
        context.execute(integerArrayList);
    }
}
