package com.effective.java.object;

public class Child {
	
	int age = 10;
	int weight = 30;

	public static Child newChild(int age, int weight) {
		Child child = new Child();
		child.weight = weight;
		child.age = age;
		return child;
	}

	public static Child newChildWithWeight(int weight) {
		Child child = new Child();
		child.weight = weight;
		return child;
	}

	public static Child newChildWithAge(int age) {
		Child child = new Child();
		child.age = age;
		return child;
	}
}