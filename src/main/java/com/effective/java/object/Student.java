package com.effective.java.object;

import java.util.Objects;

public class Student {
	
	public String name;
	public String className;

	@Override
	public boolean equals(Object obj) {
		// 对于一个null的对象 我们总是返回false
		if (Objects.isNull(obj)) {	
			return false;
		}
		
		// 利用instanceof检查类型后,强转
		if (obj instanceof Student) {
			Student other = (Student) obj;
			
			// 再对关键的属性做比较 得出结论
			if (name.equals(other.name) && className.equals(other.className)) {
				return true;
			}
		}
		return false;
	}
}
