import java.util.*;

abstract class Patient implements Comparable<Patient>
{
  // Instance Variables
  private static int idCounter = 0;
  private int arrivalTime;
  private int shotTime; 
  private int waitTime;
  private int totalTime;
  private String patientID;
  private Vaccine vacDose;

  // Single constructor w/ 'arrivalTime' param
  public Patient (int arrivalTime)
  {
    // calls setArrivalTime with arrivalTime from param
    setArrivalTime(arrivalTime);
    // calls PatientID()
    setPatientID();
  }

  // Getters
  public int getIdCounter()
  {
    return idCounter;
  }
  
  public int getArrivalTime()
  {
    return arrivalTime;
  }

  public int getShotTime()
  {
    return shotTime;
  }

  public int getWaitTime()
  {
    return waitTime;
  }

  public int getTotalTime()
  {
    return totalTime;
  }

  public String getPatientID()
  {
    return patientID;
  }

  public Vaccine getVacDose()
  {
    return vacDose;
  }

  // Setters
  public void setArrivalTime(int arrivalTime)
  {
    this.arrivalTime = arrivalTime;
  }

  public void setShotTime(int shotTime)
  {
    this.shotTime = shotTime;
    waitTime = shotTime - arrivalTime;
  }

  public void setTotalTime(int endTime)
  {
    totalTime = endTime - arrivalTime;
  }

  public void setPatientID()
  {
    idCounter++;
    // sets patient ID to concat
    patientID = "Patient" + idCounter;
  }

  public void setVaccine(Vaccine vaccine)
  {
    vacDose = vaccine;
  }

  // Abstract Methods
  abstract void setAge();
  abstract int getAge();
  abstract void setPatType();
  abstract String getPatType();
  public abstract int compareTo(Patient patient);
  
}