package tobyspring.helloboot.helloboot;

import org.springframework.boot.SpringApplication;
import tobyspring.helloboot.config.MySpringBootApplication;

@MySpringBootApplication
public class HelloBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloBootApplication.class, args);
    }
}
