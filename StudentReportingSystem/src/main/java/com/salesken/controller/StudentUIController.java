package com.salesken.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.salesken.model.Student;
import com.salesken.repository.StudentRepo;
import com.salesken.services.StudentService;

@Controller
public class StudentUIController {

	@Autowired
	private StudentRepo sRepo;
	
	@Autowired
	private StudentService sService;
	
	@GetMapping("/home")
	public String homeLauncher() {
		
		return "welcome";
	}
	
	@GetMapping("/getStudentsReport")
	public String getStudentsReports(Model model){
		
	 Iterable<com.salesken.model.Student> itr= sRepo.findAll();
	 
	 List<com.salesken.model.Student> students= new ArrayList<>();
	 itr.forEach(students::add);
	 
	 model.addAttribute("mydata", students);
	 
	 return "result";
	 
	}
	
	
}
