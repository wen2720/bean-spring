package spring.annotation.bean.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.CommandLineRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Configuration
public class BeanConfig {

    private static final Logger log = LoggerFactory.getLogger(BeanConfig.class);
    private static int counter = 0;
    // @Bean //Dependency Injection, method injection
    // public JavaClass javaClass(){
    //     return new JavaClass("new java class");
    // }
    @Bean CommandLineRunner nonPrimitiveClassExample(){
        return args -> {
            log.info("Loggin new Instance Creation: " + new JavaClass("JavaClass") + String.valueOf(counter+1));
        };
    }
}