# Spring framework basics
One of the benifits form Spring Annotations which can help developers at saving work for configuring the XML files. e.g.
```java
@Configuration
public class AppConfig {
    @Bean
    public TransferService transferService() {
        return new TransferServiceImpl();
    }
}
```
```xml
<beans>
    <bean name="transferService" class="com.acme.TransferServiceImpl"/>
</beans>
```

# There are many ways to achieve different dependency injection in Spring framework. e.g.
* @Autowired can be used for tag fields, constructors and setters.
* @Bean can be used for tag methods for later Spring IOC containers.

# Result
The source code is just very basic examples to show how to use @Bean with e.g ApplicationContext or SpringApplication, Logger LoggerFactory and CommandLineRunner.

# P.S.

DI for fields is generally not reccommended for object immutability [etc](https://stackoverflow.com/questions/39890849/what-exactly-is-field-injection-and-how-to-avoid-it#:~:text=The%20reasons%20why%20field%20injection,in%20unit%20tests)%20without%20reflection.) 

static final place holder cannot be defined as @Bean.

The classes are tagged with @Component can be searched by the @SpringApplication tagged main class.

Java Syntax  to declare an interface type place holder with allocating memory to its implementation class. e.g.
```java
ItheInterface exp1 = new ImptheClass()
```