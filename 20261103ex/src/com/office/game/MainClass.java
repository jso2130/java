package com.office.game;

public class MainClass {

	public static void main(String[] args) {
		                            // DI (의존성 주입)
		Game game = new Game(new Bear(),new Robot(),new AirPlain(),new Dog());
		
		game.move(200, 300);
		
	}
	
}
