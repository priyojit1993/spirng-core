package SpringIOCLearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        final ConfigurableApplicationContext run = SpringApplication.run(DemoApplication.class, args);
        final ConstructorBasedDependencyInjectionImpl constructorBasedDependencyInjectionImpl = (ConstructorBasedDependencyInjectionImpl)
                run.getBean("constructorBasedDependencyInjectionImpl");
        final SetterBasedDependencyInjection setterBasedDependencyInjection = (SetterBasedDependencyInjection) run.getBean("setterBasedDependencyInjection");
        setterBasedDependencyInjection.getMessage();
        constructorBasedDependencyInjectionImpl.sayHello();
    }

}
