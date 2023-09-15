package strategy;

import java.util.List;

public class Context {
    SortableStrategy sortableStrategy;

    public Context(SortableStrategy sortableStrategy) {
        this.sortableStrategy = sortableStrategy;
    }

    public void execute(List<Integer> integerList){
        this.sortableStrategy.sort(integerList);
    }
}
