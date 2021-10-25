/**
 * Resident Test
 *
 * @author Ryan Kulyassa
 * @date 10/25
 */
public class ResidentTest
{
   public static void main(String[] args){
       // Make sure parameters match the ones
       // from the constructor
       Resident r1 = new Resident("John Smith", "2004-05-31", "Male", "Yes", "No");
       System.out.println("Can " + r1 + " vote? " + r1.getCanVote());
       
       // Add more residents of this township 
       // and print if each can vote.
       Resident r2 = new Resident("Ryan Kulyassa", "2003-12-19", "Male", "Yes", "No");
       System.out.println("Can " + r2 + " vote? " + r2.getCanVote());
       
       Resident r3 = new Resident("Jane Doe", "1960-11-30", "Female", "No", "Yes");
       System.out.println("Can " + r3 + " vote? " + r3.getCanVote());
       r3.setCitizenStatus(true);
       System.out.println("Can " + r3 + " vote? " + r3.getCanVote());
   }
}