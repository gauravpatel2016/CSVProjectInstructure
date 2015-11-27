package utilities;

import java.io.File;
import java.io.IOException;
import java.util.List;

import DataTransfer.CourseDto;
import DataTransfer.StudentDto;
import utilities.ReadCSV;
import DataAccess.CourseDao;
import DataAccess.StudentDao;

public class DriverScript {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	 final String studentFile = args[0];
     final String courseFile = args[1];
    
     final ReadCSV csvExtractor = new ReadCSV();
     final CourseDao courseDao = new CourseDao();
     final StudentDao studentDao = new StudentDao();
     
     // loadStudentData
     List<StudentDto> studentList = csvExtractor.getStudentData(new File(studentFile));
     for (StudentDto student : studentList) {
         studentDao.insert(student);
     }
     // loadCourseData
     List<CourseDto> courseList = csvExtractor.getCourseData(new File(courseFile));
     for (CourseDto course : courseList) {
         courseDao.insert(course);
     }
     
     //get all students from the database
     
     for (StudentDto student : studentDao.getAll()) {
         CourseDto course = courseDao.getById(student.getCourseId());
         System.out.println(String.format("Student :%s, Course :%s", student, course));
     }

	}

}
