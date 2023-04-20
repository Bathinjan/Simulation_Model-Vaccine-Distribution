class Moderna extends Vaccine
{
  private static int modernaDoseCounter = 0;
  private String doseID;
  private final double doseCost = 12.50;

  // single constructor, no params
  public Moderna()
  {
    // calls super w/ param "Moderna"
    super("Moderna");
    // calls setDoseID
    setDoseID();
  }

  // override setDoseID
  void setDoseID()
  {
    // increments pfizerDoseCounter by one
    modernaDoseCounter++;
    // Sets doseID to concatenation of "Moderna" + modernaDoseCounter
    doseID = "Moderna" + modernaDoseCounter;
  }

  // override getDoseID
  String getDoseID()
  {
    // returns doseID
    return doseID;
  }

  // override getDoseCost
  double getDoseCost()
  {
    // returns doseCost
    return doseCost;
  }
}