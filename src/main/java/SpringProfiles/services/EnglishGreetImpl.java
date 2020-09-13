package SpringProfiles.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile(value = "english")
public class EnglishGreetImpl implements HelloWorldService {
    @Override
    public void greet() {
        System.out.println("Hello World");
    }
}
