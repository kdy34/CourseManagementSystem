import java.util.List;

public class Student extends Staff implements StudentService{

	
	private int studentID;
	private double schoolFee;
	
	public Student() {
		
	}

	public Student(int studentID, double schoolFee, int id, String firstName, String lastName, int birthYear) {
		super(id, firstName, lastName, birthYear);
		this.studentID = generateID();
		this.schoolFee = schoolFee;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public double getSchoolFee() {
		return schoolFee;
	}

	public void setSchoolFee(double schoolFee) {
		this.schoolFee = schoolFee;
	}

	@Override
	public void updateStudentInfo() {
		
		System.out.println("The student info has been updated.");
	}

	@Override
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public int generateID() {
		
		int idLenght = 7;
		
		String id = "";
		
		for (int i = 0; i < idLenght; i++) {
			
			id += (int)(Math.random()*10);
		}
		
		int stuID = Integer.parseInt(id);
		
		return stuID;
	}
	
	
	
	
}
