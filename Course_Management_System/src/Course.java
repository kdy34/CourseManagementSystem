
public class Course implements CourseService{
	
	private int courseID;
	private String courseName;
	
	private int quota = 5;
	//private double courseFee;
	private Student[] students;
	private Instructor[] instructors;
	
	public Course() {
		
	}

	public Course(int courseID, String courseName) {
		//super();
		this.courseID = courseID;
		this.courseName = courseName;
		
		//this.students = students;
		students = new Student[quota];
		
		//this.instructors = instructors;
		instructors = new Instructor[2];
	}

	public int getCourseID() {
		return courseID;
	}

	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public int getQuota() {
		return quota;
	}

	public void setQuota(int quota) {
		this.quota = quota;
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

	public Instructor[] getInstructors() {
		return instructors;
	}

	public void setInstructors(Instructor[] instructors) {
		this.instructors = instructors;
	}

	@Override
	public void addStudent(Student student) {
		
		boolean isAdded = false;
		
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = student;
				isAdded = true;
				System.out.println("Student added successfully.");
				break;
			}
		}
		
		if (!isAdded) {
			System.out.println("Sorry, student cannot added successfully.");
		}
		
	}

	@Override
	public void removeStudent(Student student) {
		
		boolean isRemoved = false;
		
		for (int i = 0; i < students.length; i++) {
			if (students[i].getStudentID() == student.getStudentID()) {
				students[i] = null;
				isRemoved = true;
				System.out.println("Student removed successfully.");
				break;
			}
		}
		
		if(!isRemoved) {
			System.out.println("Something went wrong!");
		}
		
	}

	@Override
	public void addInstructor(Instructor instructor) {
		
		boolean isAdded = false;
		
		for (int i = 0; i < instructors.length; i++) {
			if (instructors[i] == null) {
				instructors[i] = instructor;
				isAdded = true;
				System.out.println("Instructor added successfully.");
				break;
			}
		}
		
		if (!isAdded) {
			System.out.println("Sorry, instructor cannot added successfully.");
		}
		
	}

	@Override
	public void removeInstructor(Instructor instructor) {
		
		boolean isRemoved = false;
		
		for (int i = 0; i < instructors.length; i++) {
			
			if(instructors[i].getInstructorID() == instructor.getInstructorID()) {
				instructors[i] = null;
				isRemoved = true;
				System.out.println("Instructor removed successfully.");
				break;
			}
		}
		
		if(!isRemoved) {
			System.out.println("Sorry, instructor cannot removed successfully.");
		}
		
	}

	@Override
	public void updateCourseInfo() {
		
		System.out.println("The course informations have been updated.");
	}
	
	
	
	

}
