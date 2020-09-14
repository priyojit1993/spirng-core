package SpringScopeLearning;

import SpringIOCLearning.search.SearchAlgorithm;
import SpringIOCLearning.search.impl.BinarySearchAlgorithm;
import SpringScopeLearning.DAO.TestDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        final ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);

        /*
         * Spring creates and manages the lifecycle of the beans that is defined in spring context
         * Scope of a Spring  Bean refers to the scope/lifecycle of the instance or object that Spring Context manages
         * when we ask for a bean from Spring context by context.getBean("<name of the bean">)
         * spring searches from thee  instances of the bean it  manages and gives us the java object of that  bean.
         * There are 4 major Scopes that Spring has for each of its bean they are:
         *   a. Singleton: One instance per Spring Context (Default Scope of any Spring Bean)
         *   b. Prototype: New Bean whenever requested
         *   c. request: One Bean per HTTP request
         *   d. session: One bean per HTTP Session
         * */

        final Logger logger = LoggerFactory.getLogger(DemoApplication.class);

        final TestDAO bean = context.getBean(TestDAO.class); // this is the process of requesting for a Spring Bean
        final TestDAO bean1 = context.getBean(TestDAO.class);
        logger.info("{}", bean);
        logger.info("{}", bean.getJdbcConnection());
        logger.info("{}", bean.getJdbcConnection());// evrey getter will use a proxy instance instead of the singleton source bean and will get a new instance of protoype dependent/injected bean

        logger.info("{}", bean1);
        logger.info("{}", bean1.getJdbcConnection());


        /*
         * In case of Default  Bean scope which is singleton and both the bean/object will be same and have same
         * hashcode
         * But if we change the Scope of the TestDAO bean to "prototype" then we will get new object every time we
         * ask for a bean from spring context
         * */


        /*
         * If the Bean where the dependency is used has a scope of Singleton and the Bean which is injected
         * has a scope of prototype then even though we should get a new instance when we call for an instance of the bean from the
         * source class we will get the same instance in order to overcome that and get a new instance of the injected bean we should use the
         * proxy property of @Scope annotation, the Proxy property makes sure the  injected bean returns a new instance whenever
         * it is called from the source bean ,if it has scope of prototype
         *
         * If we are not using proxy=Target class  for the dependant bean then whenever we are calling the getJdbcConnection() method
         * from the source bean which has singleton scope the single shared source instance is being used to call the getter method as a result
         * of which it is getting the injected instance already present with it
         *
         * But as soon as we are using proxy then evrey time we call the getter to get the target dependent bean instance from the source instance instead
         * of sending the shared singleton instance of source bean a new proxy instance is used which gets a new instance of the dependent/injected bean.
         *
         *
         *
         * */


    }
}
