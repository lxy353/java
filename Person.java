package com.lxy;

public class Person {
	int age;
	String name;

public Person(String name, int age) {
	this.age = age;
	this.name = name;
}
public void display() {
	System.out.println("姓名："+name);
	System.out.println("年龄："+age);
	
}

public static void main(String[] args) {
	Person p = new Person("XingyuLiu",18);
	p.display();
	
}
}