import java.util.*;

class Senior extends Patient
{
  private static Random randySenior =  new Random(8);
  private int age;
  private String patType;

  // single constructor with 1 int param
  public Senior(int arrivalTime)
  {
    // calls super with arrivalTime
    super(arrivalTime);
    // calls setAge with no parameters
    setAge();
    // calls setPatType with no parameters
    setPatType();
  }

  // Getters
  public int getAge()
  {
    return age;
  }

  public String getPatType()
  {
    return patType;
  }

  // Setters
  public void setAge()
  {
    // calculates the age as a value from 61 to 100 (inclusive) using randySenior
    // sets age to that value
    age = randySenior.nextInt(61, 101);
  }

  public void setPatType()
  {
    // sets patType to "senior"
    patType = "Senior";
  }

  public int compareTo(Patient patient)
  {
    // returns -1, 0, 1 dependend on whether the param patent has an age greater than, equal to
    // or less than the age of the patient object that calls the method
    if (patient.getAge() < getAge())
    {
      return -1;
    }

    else if (patient.getAge() > getAge())
    {
      return 1;
    }

    else
    {
      return 0;
    }
  }

  // this did not end up working
  public String toString()
  {
    // Format according to this sentence:
    // The Adult patient who is 49 years old with ID Patient12 who uses the Moderna vaccine waited 28 minutes for the shot
    return getPatientID() + "     " + getPatType() + "     " + getAge() + "     ";
  }
}