public class CourseDBElement implements Comparable {

	public String courseID;
	public int crn;
	public int credits;
	public String roomNumber;
	public String instructor;
	
	public int hashcode;

	/**
	 * constructor
	 * 
	 * @param courseID
	 * @param crn
	 * @param credits
	 * @param roomNumber
	 * @param instructor
	 */
	public CourseDBElement(String courseID, int crn, int credits, String roomNumber, String instructor) {
		this.courseID = courseID;
		this.crn = crn;
		this.credits = credits;
		this.roomNumber = roomNumber;
		this.instructor = instructor;
	}
	
	public CourseDBElement() {
	}

	public int getCRN() {
		return this.crn;
	}
	
	public int hashCode() {
		return hashcode;		
	}
	
	public String toString() {
		return "\nCourse:"+courseID+" CRN:"+crn+" Credits:"+credits+" Instructor:"+instructor+" Room:"+roomNumber;
	}

	@Override
	public int compareTo(Object o) {
		CourseDBElement other = (CourseDBElement) o;
		return 0;
	}

	public void setCRN(int parseInt) {
		this.crn = parseInt;
		
	}

}