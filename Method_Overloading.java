package com.polymorphism;

public class Method_Overloading {

	private void Student_Data(char name, String initial) {
		System.out.println("Student Initial : " + name);
		System.out.println("Student Name : " + initial);

	}

	private void Student_Data(int age) {
		System.out.println("Student Age :" + age);
	}

	private void Student_Data(float height) {
		System.out.println("Student Height : " + height);

	}

	private void Student_Data(boolean mark) {
		System.out.println("Student Pass :" + mark);

	}
	
	private void Student_Data(int1 age){
		System.out.println("Student age :"+age")
		
		
	}

	public static void main(String[] args) {
		Method_Overloading data = new Method_Overloading();
		data.Student_Data('A', "Reena");
		data.Student_Data(24);
		data.Student_Data(5.96f);
		data.Student_Data(true);
		data.Student_Data(25);
	}

}
