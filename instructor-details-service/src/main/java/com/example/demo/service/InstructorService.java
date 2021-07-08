package com.example.demo.service;

import java.util.List;


import com.example.demo.entity.Instructor;
import com.example.demo.entity.InstructorDetail;


public interface InstructorService {

	public Instructor createInstructor(Instructor instructor);
	public List<Instructor> getAllInstructor();
	public Instructor getInstructorById(Integer id);
	public String deleteInstructorById(Integer id);
	public Instructor updateInstructorById(Integer id, Instructor instructor, InstructorDetail instructorDetail );
}