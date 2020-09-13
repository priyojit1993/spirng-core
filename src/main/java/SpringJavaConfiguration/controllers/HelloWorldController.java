package SpringJavaConfiguration.controllers;

import SpringJavaConfiguration.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

public class HelloWorldController {
    private HelloWorldService helloWorldService;

    @Autowired
    public HelloWorldController(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    public void greet() {
        helloWorldService.sayHello();
    }
}
