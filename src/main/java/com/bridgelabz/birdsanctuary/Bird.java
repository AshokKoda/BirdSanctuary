package com.bridgelabz.birdsanctuary;

public class Bird {

	String name;
	String color;
	
	void eat() {
		System.out.println(getClass().getSimpleName() + " can eat");
	}
	
	void fly() {
		System.out.println(getClass().getSimpleName() + " can fly !");
	}
	
	void swim() {
		System.out.println(getClass().getSimpleName() + " can swim !");
	}

	@Override
	public String toString() {
		return "Bird [name=" + name + ", color=" + color + "]";
	}

}
