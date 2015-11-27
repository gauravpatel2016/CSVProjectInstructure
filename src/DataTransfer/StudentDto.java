package DataTransfer;

import DataTransfer.StudentDto;

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
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.courseId == null) ? 0 : this.courseId.hashCode());
        result = prime * result + ((this.user_id == null) ? 0 : this.user_id.hashCode());
        result = prime * result + ((this.user_name == null) ? 0 : this.user_name.hashCode());
        result = prime * result + ((this.user_state == null) ? 0 : this.user_state.hashCode());
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
        StudentDto other = (StudentDto) obj;
        if (this.courseId == null) {
            if (other.courseId != null)
                return false;
        } else if (!this.courseId.equals(other.courseId))
            return false;
        if (this.user_id == null) {
            if (other.user_id != null)
                return false;
        } else if (!this.user_id.equals(other.user_id))
            return false;
        if (this.user_name == null) {
            if (other.user_name != null)
                return false;
        } else if (!this.user_name.equals(other.user_name))
            return false;
        if (this.user_state == null) {
            if (other.user_state != null)
                return false;
        } else if (!this.user_state.equals(other.user_state))
            return false;
        return true;
    }
    
    @Override
    public String toString() {
        return "StudentDto [id=" + this.user_id + ", name=" + this.user_name + ", courseId=" + this.courseId + ", state="
                        + this.user_state + "]";
    }
}
