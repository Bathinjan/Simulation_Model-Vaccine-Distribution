class Nurse
{
  private static int nurseCounter = 0;
  private boolean isFree;
  private int nurseIDNumber; 
  private int totalPatientsProcessedByNurse; 
  private int timeRemainingForShot;
  private Patient assignedPatient;

  // Has a single constructor with int parameter 'nurseIDNumber'
  public Nurse(int nurseIDNumber)
  {
    setNurseIDNumber(nurseIDNumber);
    setIsFree(true);
  }

  // Getters
  public boolean getIsFree()
  {
    return isFree;
  }
  public int getNurseIDNumber()
  {
    return nurseIDNumber;
  }
  public int getTotalPatientsProcessedByNurse()
  {
    return totalPatientsProcessedByNurse;
  }
  public int getTimeRemainingForShot()
  {
    return timeRemainingForShot;
  }
  public Patient getAssignedPatient()
  {
    return assignedPatient;
  }

  // Setters
  public void setNurseIDNumber(int nurseIDNumber)
  {
    nurseCounter++;
    this.nurseIDNumber = nurseIDNumber;
  }

  public void setIsFree(boolean isFree)
  {
    this.isFree = isFree;
  }

  public void setAssignedPatient(Patient assignedPatient)
  {
    this.assignedPatient = assignedPatient;
    setIsFree(false);
  }

  public void setTimeRemainingForShot(int timeRemainingForShot)
  {
    this.timeRemainingForShot = timeRemainingForShot;
  }

  // Other methods
  public Patient removeAssignedPatient()
  {
    // create temp Patient ref equal to assignedPatient reference
    Patient tempPatient = assignedPatient;
    // set assignedPatient to null
    setAssignedPatient(null);
    // call setIsFree to true
    setIsFree(true);
    // increments totalPatientsProcessedByNurse by 1
    totalPatientsProcessedByNurse++;
    // return the value of the temp patient reference
    return tempPatient;
  }

  public void decrementTimeRemainingForShot()
  {
    timeRemainingForShot--;
  }

  public String toString()
  {
    return "Nurse " + getNurseIDNumber() + "gives shots to " + getTotalPatientsProcessedByNurse() + " persons";
  }

}