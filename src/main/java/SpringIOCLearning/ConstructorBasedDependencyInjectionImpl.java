package SpringIOCLearning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ConstructorBasedDependencyInjectionImpl {


    private HelloWorldService helloWorldService;

    @Autowired
    public ConstructorBasedDependencyInjectionImpl(
            @Qualifier(value = "helloWorldServiceImpl") HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    public void sayHello() {
        helloWorldService.sayHello();
    }

}
