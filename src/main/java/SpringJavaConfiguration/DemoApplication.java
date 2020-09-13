package SpringJavaConfiguration;

import SpringJavaConfiguration.controllers.HelloWorldController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        final ConfigurableApplicationContext run = SpringApplication.run(DemoApplication.class, args);
        final HelloWorldController helloWroldController = (HelloWorldController) run.getBean("helloWorldController");
        helloWroldController.greet();
    }
}
