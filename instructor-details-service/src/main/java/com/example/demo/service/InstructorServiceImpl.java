package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.InstructorDao;
import com.example.demo.entity.Instructor;
import com.example.demo.entity.InstructorDetail;


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
		// TODO Auto-generated method stub
		return instructorDao.save(instructor);
	}



	@Override
	public List<Instructor> getAllInstructor() {
		// TODO Auto-generated method stub
		List<Instructor> i=instructorDao.findAll();
		return i;
	}



	@Override
	public Instructor getInstructorById(Integer id) {
		// TODO Auto-generated method stub
		Instructor i1 = instructorDao.findById(id).get();
		return i1;
	}



	@Override
	public String deleteInstructorById(Integer id) {
		// TODO Auto-generated method stub
		try {
			instructorDao.deleteInstructorById(id);
			return "deleted successfully";
		}catch(Exception e) {
			return "enter proper Id";
		}
	}



	@Override
	public Instructor updateInstructorById(Integer id, Instructor instructor , InstructorDetail instructorDetail) {
		// TODO Auto-generated method stub
		
		Instructor i2=  getInstructorById(id);
		i2.setFirstName(instructor.getFirstName());
		i2.setLastName(instructor.getLastName());
		i2.setEmail(instructor.getEmail());
		InstructorDetail i3 = new InstructorDetail();
		i3.setYoutubeChannel(instructorDetail.getYoutubeChannel());
		i3.setHobby(instructorDetail.getHobby());
		i2.setInstructorDetail(i3);
		return instructorDao.save(i2);
		
	}
}