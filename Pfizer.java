class Pfizer extends Vaccine
{
  private static int pfizerDoseCounter = 0;
  private String doseID;
  private final double doseCost = 15.50f;

  // single constructor with no params
  public Pfizer()
  {
    // calls super with param value "Pfizer"
    super("Pfizer");
    // calls setDoseID()
    setDoseID();
  }

  // override setDoseID
  void setDoseID()
  {
    // increments pfizerDoseCounter by one
    pfizerDoseCounter++;
    // Sets doseID to concatenation of "Pfizer" + pfizerDoseCounter
    doseID = "Pfizer" + pfizerDoseCounter;
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