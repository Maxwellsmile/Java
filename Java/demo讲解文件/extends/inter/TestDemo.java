package com.hxj.inter;

public class TestDemo {

	public static void main(String[] args) {
		
//		OldMonkey oldMonkey = new LittleMonkey();
//		oldMonkey.name = "����";
//		oldMonkey.upTree();
//		
//		LittleMonkey littleMonkey = new LittleMonkey();
//		littleMonkey.name = "����";
//		littleMonkey.upTree();
//		littleMonkey.swim();
		
		SwimAble fish = new LittleMonkey();
		SwimAble fish1 = new Cat();
		
		SwimGame game = new SwimGame();
		game.gameStart(fish);
		game.gameStart(fish1);
	}
	
}
