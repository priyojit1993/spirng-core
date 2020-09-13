package SpringIOCLearning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SetterBasedDependencyInjection {

    HelloWorldService helloWorldService;

    @Autowired

    public SetterBasedDependencyInjection(
            @Qualifier(value = "hiWorldImpl") HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    public void getMessage() {
        helloWorldService.sayHello();
    }
}
