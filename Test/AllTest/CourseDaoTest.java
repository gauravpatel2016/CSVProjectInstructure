package AllTest;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import utilities.ReadCSV;
import DataTransfer.CourseDto;
import DataAccess.CourseDao;

public class CourseDaoTest {

	CourseDao daoObject = new CourseDao();
	final ReadCSV courseExtractor = new ReadCSV();
	final File courseFile = new File("C:\\Users\\gaurav\\workspace\\CSVProjectInstructure\\course.csv");

	@Before
	public void loadData() throws IOException{
		  
	        List<CourseDto> courseList = courseExtractor.getCourseData(courseFile);
	        for (CourseDto course : courseList) {
	        	daoObject.insert(course);
	        }
	}

	@Test
	public void testGetById() throws IOException {
		CourseDto result= daoObject.getById("1002");
		
		assertEquals("CourseDto [id=1002, name=Math, state=Active]" , result.toString());
	}
	
	@Test
	public void verifyifDataNotInFile() {
		assertNull("Data is not in the file", daoObject.getById("4000"));	
	}

	@Test
	public void verifywrongHeaders() throws IOException {
		assertFalse(courseExtractor.checkHeader(courseFile, "coursename"));
	}

}
