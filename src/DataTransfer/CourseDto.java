package DataTransfer;

public class CourseDto {

	/*
	 * 
	 * course columns:     course_id, course_name, state
	 * student columns:    user_id,   user_name, course_id, state
	 */
	
	/*
	 * Member Variables - Course Class
	 */
    private String course_id;
    private String course_name;
    private String course_state;
    
    
    /*
     * 
     *  Getter - Setter for Member Vars 
     */
    
    public String getCourseId() {
        return this.course_id;
    }
    public void setCourseId(String id) {
        this.course_id = id;
    }
    public String getCourseName() {
        return this.course_name;
    }
    public void setCourseName(String name) {
        this.course_name = name;
    }
    public String getCourseState() {
        return this.course_state;
    }
    public void setCourseState(String state) {
        this.course_state = state;
    }
    
    @Override
    public String toString() {
        return "CourseDto [id=" + this.course_id + ", name=" + this.course_name + ", state=" + this.course_state + "]";
    }
}
