package SpringProfiles.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile(value = "spanish")
public class SpanishGreetImpl implements HelloWorldService {
    @Override
    public void greet() {
        System.out.println("Hola Mundo");
    }
}
