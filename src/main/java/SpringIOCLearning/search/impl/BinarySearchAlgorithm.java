package SpringIOCLearning.search.impl;

import SpringIOCLearning.search.SearchAlgorithm;
import SpringIOCLearning.sort.SortingAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/*
 * When we declare a java class with @component annotation we are telling the spring framework
 * to create object of this class and maintain this object when required
 * */


@Component
public class BinarySearchAlgorithm implements SearchAlgorithm {

    /*
     * @Autowired annotation when used spring searches by java type for the give java class among its beans
     * or among the java class that are marked as @Component or its child annotation.
     * If it finds the  bean then it assigns that object to the variable , if it finds more than one bean of the same type
     * then we have to reslove the  ambiguity by following
     *   1. Marking one one of the beans or @Components classes with @Primary
     *   2. Using @Qualifier annotation in the @Component class as well as the @Autowired section to get the bean with given @bean name
     *   3. We can use @profile and assign profile names in application.properties for each name and then use that profile name to get the correct Bean
     *   4. We can name our instance variable with the default Bean name= Same as the Bean class name with the first Character as small
     *      (eg BubbleSort class will have default bean name bubbleSort).
     * @Primary  @Profil and @Qualifier has more precedence then name based matching
     *
     * */


    // geeting the bean with the default beanName used as the variable name.
    @Autowired // this will by default use setter based dependency injection
//    @Qualifier("quickSortAlgorithm") -> if we use this then although the name is for BubbleSort implementation it will still use QuickSort as @Qualifier overrides the name based search
            SortingAlgorithm bubbleSortAlgorithm;


 /*   @Autowired
    public BinarySearchAlgorithm(SortingAlgorithm bubbleSortAlgorithm) {
        this.bubbleSortAlgorithm = bubbleSortAlgorithm;
    }
    This will add dependency injection via constructor
    the spring will have following log for constructor based dependency injection
    Autowiring by type from bean name 'binarySearchAlgorithm' via constructor to bean named 'bubbleSortAlgorithm'
    Generally compulsory dependecny are injected using constructor and optional dependency via setter based , but now
    as we can directly inject default during variable declaration so generally it is used.
    */




/*
  Getting the bean name with @Qualifier annotation and passing the default bean name as the name , we can also assign custom name to a bean in its
  corresponding class and then use that name in here as @Qualifier
    @Qualifier("quickSortAlgorithm")
    @Autowired
    SortingAlgorithm sortingAlgorithm;

    */


    @Override
    public void search() {
        bubbleSortAlgorithm.sort();
    }
}
