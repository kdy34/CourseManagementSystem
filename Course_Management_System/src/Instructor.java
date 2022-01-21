import java.util.List;

public class Instructor extends Staff implements InstructorService{

	private int instructorID;
	private double salary;
	
	public Instructor() {
		
	}

	public Instructor(int instructorID, double salary, int id, String firstName, String lastName, int birthYear) {
		super(id, firstName, lastName, birthYear);
		this.instructorID = instructorID;
		this.salary = salary;
	}

	public int getInstructorID() {
		return instructorID;
	}

	public void setInstructorID(int instructorID) {
		this.instructorID = instructorID;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public void updateInstructorInfo() {
		
		System.out.println("The instructor info has been updated!");
	}

	@Override
	public List<Instructor> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
}
