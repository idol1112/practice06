package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		
		Customer c01 = new Customer("jws", "j1234", "정우성", 1000);
		Customer c02 = new Customer("yjs", "y2345", "이효리", 2000);
		Employee e01 = new Employee("master", "m7788", "운영자", 5000000);
		
		c01.showInfo();
		c02.showInfo();
		e01.showInfo();
	}

}
