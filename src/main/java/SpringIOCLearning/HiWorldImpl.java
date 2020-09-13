package SpringIOCLearning;

import org.springframework.stereotype.Component;

@Component
public class HiWorldImpl implements HelloWorldService {
    @Override
    public void sayHello() {
        System.out.println("Hi world");
    }
}
