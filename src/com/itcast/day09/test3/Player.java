package com.itcast.day09.test3;

public abstract class Player extends Animal{
	
	public Player() {}

	public Player(String name,String age) {
		super(name,age);
	}
	
	public abstract void play();
}
