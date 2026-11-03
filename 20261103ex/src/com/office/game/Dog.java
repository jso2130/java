package com.office.game;

public class Dog implements ICharacter {
	
	public void run(int x, int y) {
		
		System.out.printf("%d, %d로 네발로 이동합니다\n", x, y);
		
	}

}
