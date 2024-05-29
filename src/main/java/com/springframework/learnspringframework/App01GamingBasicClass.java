package com.springframework.learnspringframework;

import com.springframework.learnspringframework.game.GameRunner;
import com.springframework.learnspringframework.game.MarioGame;
import com.springframework.learnspringframework.game.SuperContraGame;

public class App01GamingBasicClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		var game = new MarioGame();
		var game = new SuperContraGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();

	}

}
