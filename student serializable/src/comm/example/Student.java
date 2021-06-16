package comm.example;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@SuppressWarnings({ "serial", "rawtypes" })
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class Student implements Serializable,Comparable{
	private String id;
	private String name;
	private String grade;
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}