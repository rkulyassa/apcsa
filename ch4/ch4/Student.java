/**
 * Classes & Objects
 * 
 * @author Ryan Kulyassa
 * @date 9/13
*/

public class Student {
  // attributes or instance variables or fields
  // instance variables are always "private"
  private int studentID;
  private String studentName;
  private int age;
  private int grade;
  private String schoolName;
  private double GPA;

  // constructors
  // set initial values of the instance variables
  // constructors do not have return type
  public Student(int id, String n, int a, int g) {
    // set the parameter values to the instance variables
    studentID = id;
    studentName = n;
    grade = g;
    age = a;
    schoolName = "Robbinsville Public Schools";
    GPA = 0;
  }

  // access to the private variables
  // read access - accessor methods
  public String getStudentName() {
    return studentName; // instance variable
  }

  // accessor method for student's grade
  public int getGrade() {
    return grade;
  }

  public double getGPA() {
    return GPA;
  }

  // edit access - mutator methods
  public void setGPA(double g) {
    GPA = g;
  }

  // behaviors - other methods
  public boolean isHonors() {
    // check if GPA > 3.8 - return true
    return GPA >= 3.8;
  }
}