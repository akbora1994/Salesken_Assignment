package com.salesken.services;

import java.util.List;

import com.salesken.exception.StudentNotFoundException;
import com.salesken.model.MarksDTO;
import com.salesken.model.Semester;
import com.salesken.model.Student;

public interface StudentService {

	public Student createStudent(Student student) throws StudentNotFoundException;
	
	public MarksDTO averagePercentage(Integer semesterId);
	
	public void addMarks(Integer studentId, Semester semester);
	
	public List<Student> topTwoStudents();

}
