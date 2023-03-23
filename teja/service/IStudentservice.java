package in.teja.service;

import in.teja.dto.student;

public interface IStudentservice {
	//operation to be implement
			public String addStudent(String sname,Integer sage,String saddress);
			
			public student searchStudent(Integer sid);
			
			public String upadteStudent(student student);
			public String deleteStudent(Integer sid);
			
}
