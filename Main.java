import java.util.Scanner;  // Import the Scanner class
import java.util.ArrayList;  // Import the Array class
import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class
import java.io.FileWriter; // Import the File Writer class
import java.io.PrintWriter; // Import the Print Writer class
import java.util.Arrays; // Import the Arrays class
import java.util.Calendar;// Import the Calendar Class
import java.text.SimpleDateFormat;// Import the SimpleDateFormat Class
import java.util.Date;// Import the Date Class


/**
* The Main program implements an application that creates files intended for storage. 
*
* @author  Michael Wang
* @version 1.5
* @since   2020-03-23 
*/
public class Main extends Ounces{
  public static void main(String[] args) throws IOException{
		System.out.println("Program Starting.");
		String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
		Create.createFile();
		double porkCarbonKilos = Conversions.porkConversion(porkOunces);
		double beefCarbonKilos = Conversions.beefConversion(beefOunces);
		double lambCarbonKilos = Conversions.lambConversion(lambOunces);
		double chickenCarbonKilos = Conversions.chickenConversion(chickenOunces);
		double turkeyCarbonKilos = Conversions.turkeyConversion(turkeyOunces);
		double cheeseCarbonKilos = Conversions.cheeseConversion(cheeseOunces);
		double eggCarbonKilos = Conversions.eggConversion(eggOunces);
		double tunaCarbonKilos = Conversions.porkConversion(tunaOunces);
		double salmonCarbonKilos = Conversions.salmonConversion(salmonOunces);
		double yogurtCarbonKilos = Conversions.yogurtConversion(yogurtOunces);
		double veggieCarbonKilos = Conversions.veggieConversion(veggieOunces);
		double[] kiloValues = {yogurtCarbonKilos, salmonCarbonKilos,tunaCarbonKilos, eggCarbonKilos,cheeseCarbonKilos,turkeyCarbonKilos,chickenCarbonKilos, lambCarbonKilos,beefCarbonKilos,porkCarbonKilos,veggieCarbonKilos};	
		double sumKilos = 0;		
		int count;
		for (count = 0; count < kiloValues.length; count++){
      sumKilos +=  kiloValues[count]; 
		}	
		Save.fileAdd(sumKilos);
		Save.dateAdd(date);		
		Records.fileRead();
		ArrayList<Double> lastWeek = Records.fileCompare();
		ArrayList<Double> sortedKilos = Sort.sortKilos(lastWeek);
		System.out.println("The least carbon produced by a single meal of the record is "+sortedKilos.get(0));		
		System.out.println("The most carbon produced by a single meal of the record is "+sortedKilos.get(sortedKilos.size() - 1));		
		System.out.println("Program Ending.");	
		//Delete.deleteFileContents();
	}	
}



/*

Bytes are a data type, representing an integer value between -128 and 127. They are limited to this range, and are sometimes used instead of ints in order to save space when the int value falls within this range.

Ints are a data type, representing an integera value between a minimum and a maximum of such a high magnitude that it is unlikely to matter. It is limited to the storage of integer number values.

Floats are a data type representing a numerical value limited to seven digits. When doing calculations or other functions that may require more decimal points, it would be preferable to use the Double data type.

Doubles are a data type representing a numerical value limited to 16 digits. They are limited by having so much storage, as they can slow the run-time of a program due to being data-intensive. 

Strings are a data type representing text rather than numbers. They can contain combinations of special characters, numbers, spaces, letters. They are limited due to this, certain functions, such as mathematical operations, cannot work on them (even if the string just consists of numbers), and must be converted into a different data type. 

Objects store and consist of states and behaviours. They can contain functions, the definitions of variables, etc. The limitations of object-oriented programs are tha they are usually quite CPU-intensive and can be rather slow to run.

In general, finite data representations are either limited by their storage capabilities and their CPU usage. Either they are capable of storing complicated data (such as with many digits) and slow down the program, or they cannot store very complicated data and are fairly unintensive. In some cases, such as with Strings, they are limited to a specific purpose that is outside of the scope of other forms of data representation. It is important to use appropriate data representations, such that the program both works and works as quickly and efficiently as it can.  
*/
