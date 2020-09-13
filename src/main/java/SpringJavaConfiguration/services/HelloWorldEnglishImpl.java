package SpringJavaConfiguration.services;

public class HelloWorldEnglishImpl implements HelloWorldService {
    @Override
    public void sayHello() {
        System.out.println("Hello World");
    }
}
