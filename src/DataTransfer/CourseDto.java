package DataTransfer;

import DataTransfer.CourseDto;

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
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.course_id == null) ? 0 : this.course_id.hashCode());
        result = prime * result + ((this.course_name == null) ? 0 : this.course_name.hashCode());
        result = prime * result + ((this.course_state == null) ? 0 : this.course_state.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CourseDto other = (CourseDto) obj;
        if (this.course_id == null) {
            if (other.course_id != null)
                return false;
        } else if (!this.course_id.equals(other.course_id))
            return false;
        if (this.course_name == null) {
            if (other.course_name != null)
                return false;
        } else if (!this.course_name.equals(other.course_name))
            return false;
        if (this.course_state == null) {
            if (other.course_state != null)
                return false;
        } else if (!this.course_state.equals(other.course_state))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "CourseDto [id=" + this.course_id + ", name=" + this.course_name + ", state=" + this.course_state + "]";
    }
}
