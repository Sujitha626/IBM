package com.example.demo.controller;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Instructor;
import com.example.demo.entity.InstructorDetail;
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
	
	@GetMapping("/instructors")
	public ResponseEntity<?> getAllInstructor()
	{
		return ResponseEntity.ok(instructorService.getAllInstructor());
	}
	

	@GetMapping("/instructors/{id}")
	public ResponseEntity<Instructor> getInstructorById(@PathVariable(value ="id") Integer id)
	{
		return ResponseEntity.ok(instructorService.getInstructorById(id));
	}
	
	@DeleteMapping("/instructors/delete/{id}")
	public ResponseEntity<String> deleteInstructorById(@PathVariable("id") Integer id)
	{
		
		return ResponseEntity.ok(instructorService.deleteInstructorById(id));
	}
	
	
	@PutMapping("/instructors/update/{id}")
	public ResponseEntity<Instructor> updateInstructorById(@PathVariable("id") Integer id,@RequestBody Instructor instructor,@RequestBody InstructorDetail instructorDetail)
	{
		Instructor instructor1 = instructorService.updateInstructorById(id, instructor,instructorDetail);
		return ResponseEntity.status(HttpStatus.OK).body(instructor1);
	}
	
	
}