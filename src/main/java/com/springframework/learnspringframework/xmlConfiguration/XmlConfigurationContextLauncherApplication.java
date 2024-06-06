package com.springframework.learnspringframework.xmlConfiguration;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlConfigurationContextLauncherApplication {
public static void main(String[] args) {
		
		try (var context = new ClassPathXmlApplicationContext("contextConfiguration.xml")) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
