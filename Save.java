import java.util.Scanner;  // Import the Scanner class
import java.util.ArrayList;  // Import the Array class
import java.io.BufferedWriter;
import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class
import java.io.FileWriter; // Import the File Writer class
import java.io.PrintWriter; // Import the Print Writer class
import java.util.Arrays; // Import the Arrays class
/**
* Logs carbon emission and date data to files
*  
*/
class Save {
	public static void fileAdd(double number) {	
		try{
			BufferedWriter writer = new BufferedWriter(new FileWriter("carbonStorage.txt", true));
			String sumKilosText = String.valueOf(number);
			System.out.println("The total carbon produced by today's meal is: "+number+" kilograms.");
			writer.append(sumKilosText + System.lineSeparator());    
			writer.close();    
		} catch (IOException e) {
      System.out.println("error.");
    } 	
	}
	public static void dateAdd(String date) {	
		try{
			BufferedWriter writer = new BufferedWriter(new FileWriter("dateStorage.txt", true));
			System.out.println(date);
			writer.append(date + System.lineSeparator());    
			writer.close();    
		} catch (IOException e) {
      System.out.println("error.");
    } 	
		
	}	
}