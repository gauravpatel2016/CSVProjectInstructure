package DataAccess;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import DataTransfer.StudentDto;


public class StudentDao {
    private Map<String, StudentDto> studentObject = new HashMap<>();
    
    public void insert(final StudentDto student) {
    	studentObject.put(student.getUserId(), student);
    }
    
    public StudentDto getById(final String studentId) {
        return studentObject.get(studentId);
        
    }
    
    public Collection<StudentDto> getAll(){
        return studentObject.values();
    }

}
