package com.ujwalacode.studentsystem.service;

import java.util.List;

import com.ujwalacode.studentsystem.model.Student;

public interface StudentService {
	public Student saveStudent(Student student);
	public List<Student> getAllStudents();

}
