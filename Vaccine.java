abstract class Vaccine
{
  // Instance variable
  private String maker;

  // single constructor with 1 param
  public Vaccine(String maker)
  {
    setMaker(maker);
  }

  // Getters
  public String getMaker()
  {
    return maker;
  }

  // Setters
  public void setMaker(String maker)
  {
    this.maker = maker;
  }

  // Abstract methods
  abstract void setDoseID();
  abstract String getDoseID();
  abstract double getDoseCost();
  
}