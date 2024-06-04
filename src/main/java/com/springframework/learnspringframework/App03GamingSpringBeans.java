package com.springframework.learnspringframework;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.springframework.learnspringframework.game.GameRunner;
import com.springframework.learnspringframework.game.GamingConsole;
import com.springframework.learnspringframework.game.SuperContraGame;

@Configuration
@ComponentScan("com.springframework.learnspringframework.game")
public class App03GamingSpringBeans {
	public static void main(String[] args) {
		
		try (var context = new AnnotationConfigApplicationContext(App03GamingSpringBeans.class)) {
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
			
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
