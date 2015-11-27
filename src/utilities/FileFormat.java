package utilities;

import org.apache.commons.csv.CSVFormat;

// Common-csv.jar used in reference libraries

public class FileFormat {
	
	public static final CSVFormat COURSE_HEADER = CSVFormat.DEFAULT.withHeader(
	      "course_id", "course_name", "state");
	  
	  public static final CSVFormat STUDENT_HEADER = CSVFormat.DEFAULT.withHeader(
	                  "user_id", "user_name", "course_id", "state");
}
