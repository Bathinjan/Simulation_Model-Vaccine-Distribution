import java.util.Comparator;

class VacPriority implements Comparator<Patient>// 10 points
{
  // Seniors have higher priority than Adults, who have higher priority than olderteens
  public int compare(Patient patientA, Patient patientB)
  {
    // if the two pat types are equal
    if (patientA.getPatType() == patientB.getPatType())
    {
      // compare them by age
      return patientA.getAge() - patientB.getAge();
    }

    // 1st patient is the only senior
    else if (patientA.getPatType() == "Senior" && patientB.getPatType() != "Senior")
    {
      // 1st patient has priority
      return -1;
    }

    // 2nd is the senior
    else if (patientB.getPatType() == "Senior" && patientA.getPatType() != "Senior")
    {
      // 2nd patient has priority
      return 1;
    }

    // 2nd is adult over child
    else if (patientB.getPatType() == "Adult" && patientA.getPatType() == "OlderTeen")
    {
      // 1st has priority
      return 1;
    }

    // 1st is a child over an adult
    else // if (patientA.getPatType() == "OlderTeen")
    {
      // passed in patient has priority
      return -1;
    }
  }
}