package SpringIOCLearning;

import SpringIOCLearning.search.SearchAlgorithm;
import SpringIOCLearning.search.impl.BinarySearchAlgorithm;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        final ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        SearchAlgorithm searchAlgorithm = context.getBean(BinarySearchAlgorithm.class);
        searchAlgorithm.search();

    }
}
