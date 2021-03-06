package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor

@AllArgsConstructor
@Data
@Entity
@Table(name="course")
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name="course_name")
	private String courseName;
	@ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,
			CascadeType.PERSIST,
			CascadeType.REFRESH,})
	@JoinColumn(name="instructor_id")
	private Instructor instructor;
	@OneToMany(mappedBy = "course",cascade = CascadeType.ALL)
	private List<Review> review;
	
	public void addReview(Review rev)
	{
		if(review==null)
		{
			review=new ArrayList<Review>();
		}
		review.add(rev);
		rev.setCourse(this);
	}
}