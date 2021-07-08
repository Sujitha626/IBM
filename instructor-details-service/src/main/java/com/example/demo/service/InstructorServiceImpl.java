package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.InstructorDao;
import com.example.demo.entity.Instructor;
@Service
public class InstructorServiceImpl implements InstructorService{

	private InstructorDao instructorDao;
	
	@Autowired
	public InstructorServiceImpl(InstructorDao instructorDao) {
		super();
		this.instructorDao = instructorDao;
	}


	@Override
	public Instructor createInstructor(Instructor instructor) {
		
		return instructorDao.save(instructor);
	}

}