package tobyspring.helloboot;

import java.util.Objects;

public class HelloController {
         private final HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    // Objects.requireNonNull() - null 이라면 예외를 던지고 null 이 아니라면 값을 그대로 리턴해준다.
    public String hello(String name) {
        return helloService.sayHello(Objects.requireNonNull(name));
    }
}
