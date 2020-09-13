package SpringJavaConfiguration.config;

import SpringJavaConfiguration.controllers.HelloWorldController;
import SpringJavaConfiguration.services.HelloWorldEnglishImpl;
import SpringJavaConfiguration.services.HelloWorldService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configurartion {

    /*
     * This class will create the objects and register them as bean using @Bean annotation
     * Generally this approach is followed to register beans of objects that are comming
     * form other jars (on the source code we don not have controll)
     * For the source code we have controll its better to use @component @controller anotation
     * and let spring do the wiring and injection
     * typically this apporach is suitable to create bean for those object whose source
     * code we dont have to add @controller or @component on them and register them as bean
     * One use case can be registering a third party jdbc object as a bean
     * */

    @Bean
    public HelloWorldService helloWroldEnglishImpl() {
        return new HelloWorldEnglishImpl();
    }

    @Bean
    public HelloWorldController helloWorldController() {
        return new HelloWorldController(helloWroldEnglishImpl());
    }

    /*public HelloWorldService helloWroldSpanishImpl() {
        return new ();
    }*/


}
