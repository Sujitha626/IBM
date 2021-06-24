package org.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="instructor")
public class course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="email")
	private String email;
	@OneToOne(cascade = {
			CascadeType.DETACH,
			CascadeType.MERGE,
			CascadeType.PERSIST,
			CascadeType.REMOVE,
			CascadeType.REFRESH
	})
	@JoinColumn(name="instruction_details_id")
	private InstructorDetails instructorDetails;
	@OneToMany(cascade = {
			CascadeType.DETACH,
			CascadeType.MERGE,
			CascadeType.PERSIST,CascadeType.REFRESH
	})
	
	private List<course> course;
	public void add(course tempCourse)
	{
		if(course==null)
		{
			course=new ArrayList<course>();
			
		}
		course.add(tempCourse);
		tempCourse.setInstructor(this);
	}
	private void setInstructor(course course2) {
		// TODO Auto-generated method stub
		
	}
	void setInstructor(Instructor instructor) {
		// TODO Auto-generated method stub
		
	}
	public void setCourseName(String string) {
		// TODO Auto-generated method stub
		
	}
}