import java.util.*;

class Adult extends Patient
{
  private static Random randyAdult =  new Random(5);
  private int age;
  private String patType;

  // single constructor with 1 int param
  public Adult(int arrivalTime)
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
    // calculates the age as a value from 20 to 60 (inclusive) using randySenior
    // sets age to that value
    age = randyAdult.nextInt(21, 61);
  }

  public void setPatType()
  {
    // sets patType to "Adult"
    patType = "Adult";
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