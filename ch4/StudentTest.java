/**
 * Classes & Objects
 * 
 * @author Ryan Kulyassa
 * @date 9/13
*/

public class StudentTest {
	public static void main(String[] args) {
		Student s1 = new Student(123, "Anthony", 16, 11);
		// Student - class / data type
		// s1 - object / variable name
		System.out.println(s1); // print memory location
		// System.out.println(s1.studentName); - error
		System.out.println(s1.getStudentName());
		System.out.println(s1.getGrade());
		s1.setGPA(3.9);
		System.out.println(s1.getGPA());
		System.out.println(s1.isHonors());

		Student s2 = new Student(124, "Shrika", 16, 11);
		System.out.println(s2.getStudentName());
		System.out.println(s2.getGrade());
		s2.setGPA(3.7);
		System.out.println(s2.getGPA());
		System.out.println(s2.isHonors());
	}
}