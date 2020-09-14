package SpringIOCLearning.sort.impl;

import SpringIOCLearning.sort.SortingAlgorithm;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
/* @Primary -> if we use this annotation here it will make this Bean as the primary bean out all the Beans under the same interface */
/* @Profile("bubbleSort") -> we can give profile names to Bean and then in application.properties
 *   if we use the following line -> spring.profile.active=bubbleSort  then it will tell spring to take this bean as the active bean out
 *    of all the beans under the same interface
 *
 * */
@Qualifier("bubbleSort") // gives custom bean name to the following Bean Class
public class BubbleSortAlgorithm implements SortingAlgorithm {
    @Override
    public void sort() {
        System.out.println("Calling Bubble Sort Algorithm");
    }
}
