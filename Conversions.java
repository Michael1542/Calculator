import java.util.Scanner;  // Import the Scanner class
import java.util.ArrayList;  // Import the Array class
import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class
import java.io.FileWriter; // Import the File Writer class
import java.io.PrintWriter; // Import the Print Writer class
import java.util.Arrays; // Import the Arrays class
/**
 * This interface represents the conversion of ounces of food type consumed to kilograms of carbon produced
 */
class Conversions {
	/**
  * Converts user input ounces of pork value to kilograms of carbon emitted
  *  
  * @param value - This is the food ounce value.
  * @return this ounce value as kilogram carbon emissions.
  */
  public static double porkConversion(double ounces) {
    double kiloCarbonPork = ounces * 12.12 / 35.273962;
		return kiloCarbonPork;
  }
	/**
  * Converts user input ounces of beef value to kilograms of carbon emitted
  *  
  * @param value - This is the food ounce value.
  * @return this ounce value as kilogram carbon emissions.
  */
  public static double beefConversion(double ounces) {
    double kiloCarbonBeef = ounces * 26.99 / 35.273962;
		return kiloCarbonBeef;
  }
 	/**
  * Converts user input ounces of lamb value to kilograms of carbon emitted
  *  
  * @param value - This is the food ounce value.
  * @return this ounce value as kilogram carbon emissions.
  */ 
  public static double lambConversion(double ounces) {
    double kiloCarbonLamb = ounces * 39.25 / 35.273962;
		return kiloCarbonLamb;
  }
 	/**
  * Converts user input ounces of chicken value to kilograms of carbon emitted
  *  
  * @param value - This is the food ounce value.
  * @return this ounce value as kilogram carbon emissions.
  */ 
  public static double chickenConversion(double ounces) {
    double kiloCarbonChicken = ounces * 6.87 / 35.273962;
		return kiloCarbonChicken;
  }
 	/**
  * Converts user input ounces of turkey value to kilograms of carbon emitted
  *  
  * @param value - This is the food ounce value.
  * @return this ounce value as kilogram carbon emissions.
  */ 
  public static double turkeyConversion(double ounces) {
    double kiloCarbonTurkey = ounces * 11.00 / 35.273962;
		return kiloCarbonTurkey;
  }
 	/**
  * Converts user input ounces of cheese value to kilograms of carbon emitted
  *  
  * @param value - This is the food ounce value.
  * @return this ounce value as kilogram carbon emissions.
  */ 
  public static double cheeseConversion(double ounces) {
    double kiloCarbonCheese = ounces * 10.89 / 35.273962;
		return kiloCarbonCheese;
  }
 	/**
  * Converts user input ounces of yogurt value to kilograms of carbon emitted
  *  
  * @param value - This is the food ounce value.
  * @return this ounce value as kilogram carbon emissions.
  */ 
  public static double yogurtConversion(double ounces) {
    double kiloCarbonYogurt = ounces * 2.17 /35.273962;
		return kiloCarbonYogurt;
  }
 	/**
  * Converts user input ounces of egg value to kilograms of carbon emitted
  *  
  * @param value - This is the food ounce value.
  * @return this ounce value as kilogram carbon emissions.
  */ 
  public static double eggConversion(double ounces) {
    double kiloCarbonEgg = ounces * 4.83 / 35.273962;
		return kiloCarbonEgg;
  }
	/**
  * Converts user input ounces of salmon value to kilograms of carbon emitted
  *  
  * @param value - This is the food ounce value.
  * @return this ounce value as kilogram carbon emissions.
  */	
  public static double salmonConversion(double ounces) {
    double kiloCarbonSalmon = ounces * 11.89 / 35.273962;
		return kiloCarbonSalmon;
  }
	/**
  * Converts user input ounces of tuna value to kilograms of carbon emitted
  *  
  * @param value - This is the food ounce value.
  * @return this ounce value as kilogram carbon emissions.
  */	
  public static double tunaConversion(double ounces) {
    double kiloCarbonTuna = ounces * 6.06 / 35.273962;
		return kiloCarbonTuna;
	}
	/**
  * Converts user input ounces of veggie value to kilograms of carbon emitted
  *  
  * @param value - This is the food ounce value.
  * @return this ounce value as kilogram carbon emissions.
  */	
	public static double veggieConversion(double ounces) {
    double kiloCarbonVeggies = ounces * 2.00 / 35.273962;
		return kiloCarbonVeggies;
  }
}