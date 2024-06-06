package com.springframework.learnspringframework.depInjection;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class BusinessClass {

	Dependency1 dependency1;
	
	Dependency2 dependency2;
	
	public BusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
		super();
		this.dependency1 = dependency1;
		this.dependency2 = dependency2;
	}

//	@Autowired
//	public void setDependency1(Dependency1 dependency1) {
//		this.dependency1 = dependency1;
//	}
//
//	@Autowired
//	public void setDependency2(Dependency2 dependency2) {
//		this.dependency2 = dependency2;
//	}

	public String toString() {
		return "Depenedency injection: " + dependency1 + " and " + dependency2; 
	}
}

@Component
class Dependency1 {
	
}

@Component
class Dependency2 {
	
}

@Configuration
@ComponentScan
public class DepInjectionConfigurationContextLauncherApplication {
public static void main(String[] args) {
		
		try (var context = new AnnotationConfigApplicationContext(DepInjectionConfigurationContextLauncherApplication.class)) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.print(context.getBean(BusinessClass.class));
			
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
