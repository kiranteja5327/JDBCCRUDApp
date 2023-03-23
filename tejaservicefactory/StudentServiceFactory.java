package in.tejaservicefactory;


import in.teja.service.IStudentservice;
import in.teja.service.StudentServiceImpl;


//Abstraction logic of implementation
public class StudentServiceFactory {

	//make constuctor private to avoid object creation
	private StudentServiceFactory() {

	}

	private static IStudentservice studentService = null;

	public static IStudentservice getStudentService() {
		
		//singleton pattern code
		if (studentService == null) {
			studentService = new StudentServiceImpl();
		}
		return studentService;
	}

}
