package com.demoController.ControllerDemo.entities;

public class Student {
	private int id;
	private String name;
	private double height;
	
	public Student() {};

	public Student(String name, double height) {
		super();
		this.name = name;
		this.height = height;
	}
	
	public Student(int id, String name, double height) {
		super();
		this.id = id;
		this.name = name;
		this.height = height;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}
