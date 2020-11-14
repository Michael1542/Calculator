import java.util.Scanner;  // Import the Scanner class
import java.util.ArrayList;  // Import the Array class
import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class
import java.io.FileWriter; // Import the File Writer class
import java.io.PrintWriter; // Import the Print Writer class
import java.util.Arrays; // Import the Arrays class
import java.util.Collections;// Import the Collections class
/**
* Delete information logged in files
*  
*/
class Delete {
	public static void deleteFileContents(){	
		try (PrintWriter deleteCarbon = new PrintWriter("carbonStorage.txt")) {	
			deleteCarbon.close();
		}
		catch (IOException e) {
      System.out.println("error.");
		}		 			
		try (PrintWriter deleteDate = new PrintWriter("dateStorage.txt")) {	
			deleteDate.close();
		}
		catch (IOException e) {
      System.out.println("error.");
		}	
	}
}