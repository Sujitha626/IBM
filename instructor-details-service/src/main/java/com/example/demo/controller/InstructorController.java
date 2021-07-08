package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Instructor;
import com.example.demo.service.InstructorService;

@RestController
@RequestMapping("/api")
public class InstructorController {
	
	private InstructorService instructorService;

	public InstructorController(InstructorService instructorService) {
		super();
		this.instructorService = instructorService;
	}
	
	@PostMapping("/instructors")
	public ResponseEntity<Instructor> createInstructor(@RequestBody Instructor instructor)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(instructorService.createInstructor(instructor));
	}

}