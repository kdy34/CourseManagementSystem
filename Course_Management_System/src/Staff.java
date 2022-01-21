
public class Staff implements StaffService{
	
	private int id;
	private String firstName;
	private String lastName;
	private int birthYear;
	
	public Staff() {
		
	}

	public Staff(int id, String firstName, String lastName, int birthYear) {
		//super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
	}

	public int getId() {
		return id;
	}

	/*public void setId(int id) {
		this.id = id;
	}*/
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	@Override
	public void add(Staff staff) {
		
		System.out.println("Staff has been added successfully!");
	}

	@Override
	public void remove(Staff staff) {
		
		System.out.println("Staff has been removed successfully!");
	}
	
	
	
	

}
