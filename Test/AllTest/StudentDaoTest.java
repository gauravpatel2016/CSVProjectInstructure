package AllTest;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import DataTransfer.StudentDto;
import utilities.ReadCSV;

import DataAccess.StudentDao;


public class StudentDaoTest {

	StudentDao daoObject = new StudentDao();
	final ReadCSV studentExtractor = new ReadCSV();
	final File studentFile = new File("C:\\Users\\gaurav\\workspace\\CSVProjectInstructure\\student.csv");

	@Before
	public void loadData() throws IOException{
		  
	        List<StudentDto> StudentList = studentExtractor.getStudentData(studentFile);
	        for (StudentDto Student : StudentList) {
	        	daoObject.insert(Student);
	        }
	}
	
	@Test
	public void testGetById() throws IOException {
		StudentDto result= daoObject.getById("4");
		System.out.println(result.toString());
		assertEquals("StudentDto [id=4, name=Janet, CourseId=1001, state=Active]" , result.toString());
	}
	
	@Test
	public void verifyifDataNotInFile() {
		assertNull("Data is not in the file", daoObject.getById("7"));	
	}

	@Test
	public void verifyvalidHeaders() throws IOException {
		assertTrue(studentExtractor.checkHeader(studentFile, "user_id"));
	}

	@Test
	public void verifywrongHeaders() throws IOException {
		assertFalse(studentExtractor.checkHeader(studentFile, "username"));
	}
}
