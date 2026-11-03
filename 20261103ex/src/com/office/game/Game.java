package com.office.game;

public class Game {

	// 캐릭터
	private Bear bear;
	private Robot robot;
	private AirPlain airPlain;
	private Dog dog;
	private ICharacter[] iCharacters;

	public Game(Bear bear, Robot robot, AirPlain airPlain, Dog dog) {
		
		super();           // object 클래스의 생성자 호출 - 메서드를 사용하기 위해서. (생략 가능)
		this.bear = bear;
		this.robot = robot;
		this.airPlain = airPlain;
		this.dog = dog;
		
		iCharacters = new ICharacter[] {
				this.bear,
				this.robot,
				this.airPlain,
				this.dog
		};
		
	}

	public void move(int x, int y) {
		
		for (int i = 0; i < iCharacters.length; i++) {
			
			iCharacters[i].run(x, y);
			
		}
		
	}
	
}
