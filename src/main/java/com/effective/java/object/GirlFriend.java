package com.effective.java.object;

public class GirlFriend {

	public String name;
	public int age;

	// 系统默认提供构造器
	public GirlFriend() {
	}

	// 自定义构造器
	public GirlFriend(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		// 使用自定义的构造器给陈鹏创建一个女朋友
		GirlFriend girlFriendOfChenPeng = new GirlFriend("小姐姐", 18);
		System.out.println("陈鹏女朋友的名字： " + girlFriendOfChenPeng.name);
		System.out.println("陈鹏女朋友的年龄： " + girlFriendOfChenPeng.age);
	}
	
	

}
