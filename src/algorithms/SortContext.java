package algorithms;

import java.util.List;

public class SortContext{
    private SortStrategy sortStrategy;

    public SortContext(SortStrategy sortStrategy){
        this.sortStrategy = sortStrategy;
    }


    public <T extends Comparable<T>> void sort(List<T> listToSort) throws NoStrategyException{
        if(sortStrategy != null){
            sortStrategy.sort(listToSort);
        } else {
            throw new NoStrategyException("Нет стратегии");
        }
    }
}