package DataTransfer;

public class CourseDto {

	/*
	 * 
	 * course columns:     course_id, course_name, state
	 * student columns:    user_id,   user_name, course_id, state
	 */
	
    private String course_id;
    private String course_name;
    private String course_state;
    
    public String getId() {
        return this.course_id;
    }
    public void setId(String id) {
        this.course_id = id;
    }
    public String getName() {
        return this.course_name;
    }
    public void setName(String name) {
        this.course_name = name;
    }
    public String getState() {
        return this.course_state;
    }
    public void setState(String state) {
        this.course_state = state;
    }
}
