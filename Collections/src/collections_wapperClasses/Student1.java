package collections_wapperClasses;

import java.io.Serializable;

public class Student1 implements Serializable {
	
	private int age  ;
	private String name;
	
	Student1(int age, String name){
		this.age = age;
		this.name = name;
	}
	
	public void display() {
		
		System.out.println("Name: " + name + ", Age: " + age);
	}

}
