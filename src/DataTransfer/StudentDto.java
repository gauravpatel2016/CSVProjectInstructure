package DataTransfer;

public class StudentDto {

	/*
	 * 
	 * course columns:     course_id, course_name, state
	 * student columns:    user_id,   user_name, course_id, state
	 */
	
	/*
	 * 
	 * Member Variables - Student
	 */
	private String user_id;
    private String user_name;
    private String courseId;
    private String user_state;
    
    /*
     * Getter-Setter for above Member Vars
     */
    
    public String getUserId() {
        return this.user_id;
    }
    public void setUserId(String id) {
        this.user_id = id;
    }
    public String getUserName() {
        return this.user_name;
    }
    public void setUserName(String name) {
        this.user_name = name;
    }
    public String getCourseId() {
        return this.courseId;
    }
    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }
    public String getUserState() {
        return this.user_state;
    }
    public void setUserState(String state) {
        this.user_state = state;
    }
}
