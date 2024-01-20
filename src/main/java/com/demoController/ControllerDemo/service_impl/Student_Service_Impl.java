package com.demoController.ControllerDemo.service_impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Configuration;

import com.demoController.ControllerDemo.entities.Student;
import com.demoController.ControllerDemo.service.Student_Service;

@Configuration
public class Student_Service_Impl implements Student_Service{
	
	List<Student> stds = new ArrayList<Student>();
	
	public Student_Service_Impl() {
		stds.add(new Student(1, "aye aye", 5.3));
	}

	@Override
	public List<Student> getAll() {
		return stds;
	}

	@Override
	public Student findByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student save(Student std) {
		Student newStd = new Student();
		newStd.setHeight(std.getHeight());
		newStd.setName(std.getName());
		newStd.setId(stds.size()+1);
		stds.add(newStd);
		return newStd;
	}

	@Override
	public String delete(int id) {
		
		return null;
	}

	@Override
	public Student update(int id, Student std) {
		for(Student ss: stds) {
			if(ss.getId()==id) {
				ss.setHeight(std.getHeight());
				ss.setName(std.getName());
			}
		}
		return stds.get(id-1);
	}
	
}
