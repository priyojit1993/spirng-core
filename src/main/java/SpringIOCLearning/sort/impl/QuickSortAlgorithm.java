package SpringIOCLearning.sort.impl;

import SpringIOCLearning.sort.SortingAlgorithm;
import org.springframework.stereotype.Component;

@Component
public class QuickSortAlgorithm implements SortingAlgorithm {
    @Override
    public void sort() {
        System.out.println("Calling Quick Sort Algorithm");
    }
}
