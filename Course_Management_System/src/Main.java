import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1, "SEN1001");
		Course course2 = new Course(2, "CMP1001");
		Course course3 = new Course(3, "AIN1001");
		
		Student student1 = new Student(1, 35000, 123456789, "Kutay Deniz", "Yazýcýoðlu", 2002);
		Student student2 = new Student(2, 30000, 12345678, "Baran", "Baþaran", 2001);
		Student student3 = new Student(3, 25000, 12345678, "Benan", "Aydý", 2002);
		Student student4 = new Student(4, 50000, 12345678, "Aleyna", "Kurt", 2001);
		Student student5 = new Student(5, 28000, 12345678, "Görkem", "Avcý", 2000);
		Student student6 = new Student(6, 39000, 12345678, "Kaan", "Aydemir", 2001);
		
		Instructor instructor1 = new Instructor(1, 10000, 12345, "Merve", "Arýtürk", 1987);
		Instructor instructor2 = new Instructor(2, 12000, 123456, "Özge Yücel", "Kasap", 1985);
		Instructor instructor3 = new Instructor(3, 15000, 123457, "Yücel Batu", "Salman", 1980);
		
		
		for (int i = 0; i < course1.getStudents().length; i++) {
			System.out.println(course1.getStudents()[i]);
		}
		
		course1.addStudent(student1);
		course1.addStudent(student2);
		course1.addStudent(student3);
		course1.addStudent(student4);
		course1.addStudent(student5);
		course1.addStudent(student6);
		
		course1.addInstructor(instructor1);
		course1.addInstructor(instructor2);
		course1.addInstructor(instructor3);
		
		for (int i = 0; i < course1.getInstructors().length; i++) {
			System.out.println(course1.getInstructors()[i]);
		}
		
		System.out.println(Arrays.toString(course1.getStudents()));
		
		course1.removeStudent(student6);
		
		course2.updateCourseInfo();
		
		System.out.println("Course3 = id: " + course3.getCourseID() + " " + course3.getCourseName());
		
		System.out.println("Student1 is " + student1.getFirstName() + " " + student1.getLastName() + ". Also, he pays " + student1.getSchoolFee() + " fee.");
		
		student1.updateStudentInfo();
		
		System.out.println(instructor1.getAll());
		
		instructor1.updateInstructorInfo();
	}

}
