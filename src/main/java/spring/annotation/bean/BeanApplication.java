package spring.annotation.bean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.annotation.bean.example.JavaClass;

@SpringBootApplication
public class BeanApplication {
	
	public static void main(String[] args) {
		////  Spring Standalone application get @Bean with CommandRunner interface from org.springframework.boot package
		SpringApplication.run(BeanApplication.class, args);

		//// Spring Standalone application get @Bean with ApplicationContext interface from org.springframework.context
		//// 'obj : AnnotationConfigApplicationContext -> 'a : ApplicationContext
		//ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanApplication.class);

		//// 'a : '@Bean<'a> -> getBean : ('a : '@Bean<'a> -> 'obj : 'a) -> 'obj : 'a
		//JavaClass newObject = appContext.getBean(JavaClass.class);
		//System.out.println("Standard Output: " + newObject.getObjectName());
	}

}
