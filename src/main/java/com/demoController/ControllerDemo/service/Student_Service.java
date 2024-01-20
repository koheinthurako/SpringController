package com.demoController.ControllerDemo.service;

import java.util.List;

import com.demoController.ControllerDemo.entities.Student;

public interface Student_Service {
	public List<Student> getAll();
	public Student findByID(int id);
	public Student save(Student std);
	public String delete(int id);
	public Student update(int id, Student std);
}
