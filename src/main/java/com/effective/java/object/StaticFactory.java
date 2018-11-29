package com.effective.java.object;

public class StaticFactory {

	public static Boolean valueOf(boolean b) {
		return b ? Boolean.TRUE : Boolean.FALSE;
	}

	public static void main(String[] args) {
		Boolean b = StaticFactory.valueOf(false);
		System.out.println("创建的对象类型：  " + b.getClass());
		System.out.println("创建的对象值：  " + b);
	}

}
