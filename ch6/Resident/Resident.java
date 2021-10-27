/**
 * Resident
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.time.LocalDate;
import java.time.Period;
public class Resident
{
    // Add instance variables

    private String fullName;
    private String dateOfBirth;
    private String gender;
    private int age;
    private boolean isUSCitizen;
    private boolean canVote;
    private boolean married;

    // Add constructor

    public Resident(String fullName, String dateOfBirth, String gender, String isUSCitizen, String married) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.age = getAge(dateOfBirth);
        this.isUSCitizen = isUSCitizen == "Yes";
        this.canVote = age >= 18 && this.isUSCitizen;
        this.married = married == "Yes";
    }

    // Add Mutator Methods
    
    public void setCitizenStatus(boolean isUSCitizen) {
        this.isUSCitizen = isUSCitizen;
        canVote = age >= 18 && isUSCitizen;-
    }

    public void setMaritalStatus(boolean married) {
        this.married = married;
    }

    // Add accessor method
    
    public boolean getCanVote() {
        return canVote;
    }

    // Add toString method
    
    public String toString() {
        if (gender == "Female") {
            if (married) {
                return "Mrs. " + fullName;
            } else {
                return "Ms. " + fullName;
            }
        } else if (gender == "Male") {
            return "Mr. " + fullName;
        } else {
            return "Mx. " + fullName;
        }
    }

    // Returns age given the date of birth
    //Date of birth must be in this YYYY-MM-DD: "
    private int getAge(String dob) {
        LocalDate convDOB = LocalDate.parse(dob);
        LocalDate curDate = LocalDate.now();
        return Period.between(convDOB, curDate).getYears();
    }
}