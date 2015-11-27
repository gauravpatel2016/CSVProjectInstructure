package utilities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import DataTransfer.CourseDto;
import DataTransfer.StudentDto;


public class ReadCSV {
    
   
    public List<CourseDto> getCourseData(final File courseFile) throws IOException {
    	
    	
        final List<CourseDto> courseList = new ArrayList<>();
        
        try (final CSVParser csvrows = CSVParser.parse(courseFile, Charset.defaultCharset(), FileFormat.COURSE_HEADER)) {
          // Ignore first row
          csvrows.iterator().next();
        
          for (final CSVRecord csvRecord : csvrows) {
                final CourseDto course = new CourseDto();
              
                //System.out.println(csvRecord.get("course_id"));
                
                course.setCourseId(csvRecord.get("course_id"));
                course.setCourseName(csvRecord.get("course_name"));
                course.setCourseState(csvRecord.get("state"));
                courseList.add(course);
                
          }
        }
        return courseList;
    }
    
    public List<StudentDto> getStudentData(final File studentFile) throws IOException {

	    
	    final List<StudentDto> studentList = new ArrayList<>();
	    try (final CSVParser csvRows = CSVParser.parse(studentFile, Charset.defaultCharset(), FileFormat.STUDENT_HEADER)) {
	
	      csvRows.iterator().next();// skip header
	      
	      for (final CSVRecord csvRecord : csvRows) {
	            final StudentDto student = new StudentDto();
	            student.setUserId(csvRecord.get("user_id"));
	            student.setUserName(csvRecord.get("user_name"));
	            student.setCourseId(csvRecord.get("course_id"));
	            student.setUserState(csvRecord.get("state"));
	            studentList.add(student);
	      }
	    }
	    return studentList;
	    
    }

    
}
