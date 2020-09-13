package SpringProfiles;

import SpringProfiles.controllers.HelloWorldController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        final ConfigurableApplicationContext run = SpringApplication.run(DemoApplication.class, args);
        final HelloWorldController helloWorldController = (HelloWorldController) run.getBean("helloWorldController");
        helloWorldController.greetController();

    }
}
