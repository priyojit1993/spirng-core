package SpringIOCLearning;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldServiceImpl implements HelloWorldService {
    @Override
    public void sayHello() {
        System.out.println("Hello World!!");
    }
}
