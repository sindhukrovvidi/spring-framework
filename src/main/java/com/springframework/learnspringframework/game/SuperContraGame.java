package com.springframework.learnspringframework.game;

public class SuperContraGame implements GamingConsole{

	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("Up");
		
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("Sit Down");
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("Go back");
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("Shoot a bullet");
		
	}

}
