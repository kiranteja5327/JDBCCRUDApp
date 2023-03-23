package in.teja.service;

import in.teja.daofactory.StudentDaoFactory;
import in.teja.dto.student;
import in.teja.persistence.IStudentDao;

//service layer logic
public class StudentServiceImpl implements IStudentservice {

	private IStudentDao stdDao;

	public String addStudent(String sname, Integer sage, String saddress) {
		stdDao = StudentDaoFactory.getStudentDao();
		return stdDao.addStudent(sname, sage, saddress);
	}

	public student searchStudent(Integer sid) {
		stdDao = StudentDaoFactory.getStudentDao();
		return stdDao.searchStudent(sid);
	}

//	public String updateStudent(Integer sid, String sname, Integer sage, String saddress) {
//		stdDao = StudentDaoFactory.getStudentDao();
//		//return stdDao.updateStudent(student);
//	}

	public String deleteStudent(Integer sid) {
		stdDao = StudentDaoFactory.getStudentDao();
		return stdDao.deleteStudent(sid);
	}

	@Override
	public String upadteStudent(student student) {
		// TODO Auto-generated method stub
		return null;
	}

}
