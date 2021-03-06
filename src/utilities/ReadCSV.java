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
        if(!checkHeader(courseFile,"course_name")){
        	  throw new FileNotFoundException("Invalid Course.csv File");
      
        }
    	
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
    	if(!checkHeader(studentFile,"user_name")){
        	  throw new FileNotFoundException("Invalid Student.csv File");
      
          }
	    
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

	public boolean checkHeader(File typefile, String word) throws IOException {
	    InputStream myinput = new FileInputStream(typefile);
	    InputStreamReader inputread = new InputStreamReader(myinput, Charset.forName("UTF-8"));
	    BufferedReader readbuffer = new BufferedReader(inputread);
		try {
			String headerLine = readbuffer.readLine();
			return headerLine.contains(word);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			readbuffer.close();
			inputread.close();
			myinput.close();
			
		}
		return false;
	}

    
}
