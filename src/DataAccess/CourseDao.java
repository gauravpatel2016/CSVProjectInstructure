package DataAccess;

import java.util.HashMap;
import java.util.Map;

import DataTransfer.CourseDto;

public class CourseDao {

   private Map<String, CourseDto> courseObject = new HashMap<>();
    
    public void insert(final CourseDto course) {
        courseObject.put(course.getCourseId(), course);
    }
    
    public CourseDto getById(final String courseId) {
        return courseObject.get(courseId);
        
    }

}
