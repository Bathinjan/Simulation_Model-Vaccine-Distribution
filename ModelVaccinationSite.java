import java.util.Scanner;
import java.io.*;

class ModelVaccinationSite
{
  public static void main(String[] args) throws Exception
  {
    // create scanner to read keyboard input
    Scanner keyboard = new Scanner(System.in);
    
    // request siteName, seed, number of nurses, total number of doses available
    System.out.println("Please enter the site name: ");
    String siteName = keyboard.next();

    System.out.println("Please enter the seed: ");
    int seed = keyboard.nextInt();

    System.out.println("Please enter the number of nurses as an integer: ");
    int numNurses = keyboard.nextInt();

    System.out.println("Please enter the total number of vaccine doses as an integer: ");
    int numVaccines = keyboard.nextInt();
    
    // create new VaccinationSite with 4 values as params
    VaccinationSite vaccinationSite = new VaccinationSite(siteName, seed, numNurses, numVaccines);

    // call openVaccinationSiteLIne for the just created VaccinationSite
    vaccinationSite.openVaccinationSiteLine();

    // request / read number of minutes to keep site open for patients (durationForArriving) after doors open
    System.out.println("Please enter the number of minutes to keep entrance open after the site opens: ");
    int durationForArriving = keyboard.nextInt();
    
    // call operateVaccinationSite for the VaccinationSite created with durationForArriving as param
    vaccinationSite.operateVaccinationSite(durationForArriving);

    // request and read in the name of the output file
    System.out.println("Please enter the name of the output file: ");
    String outputName = (keyboard.next() + ".txt");
    
    try 
    {
      // call generateVaccinationSiteResults for the VaccinationSite created w/ name of file as param
      vaccinationSite.generateVaccinationSiteResults(outputName);
    }

    catch (Exception e)
    {
      System.out.println(e.getMessage());
    }

    // Is it Friday?
    java.util.Date date = new java.util.Date();
    if (date.toString().contains("Fri"))
    {
      // It's Friday Night...
      vaccinationSite.itsFridayNight();
    }

    // close out keyboard
    keyboard.close();
  }
}