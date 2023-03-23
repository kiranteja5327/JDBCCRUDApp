package in.teja.persistence;

import in.teja.dto.student;

public interface IStudentDao {
	
	// operations to be implemented
	public String addStudent(String sname, Integer sage, String saddress);

	public student searchStudent(Integer sid);

	public String updateStudent(student student);

	public String deleteStudent(Integer sid);

}
