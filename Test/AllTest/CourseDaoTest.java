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
	

	
}
