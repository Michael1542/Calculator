import java.util.Scanner;  // Import the Scanner class
import java.util.ArrayList;  // Import the Array class
import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class
import java.io.FileWriter; // Import the File Writer class
import java.io.FileReader; // Import the File Reader class
import java.io.BufferedReader; // Import the Buffered Reader class
import java.io.PrintWriter; // Import the Print Writer class
import java.util.Arrays; // Import the Arrays class
/**
* Display information logged in files
*  
*/
class Records {
	public static void fileRead(){	
		System.out.println("Reading Files");
    File carbonStorage = new File("carbonStorage.txt");
    File dateStorage = new File("dateStorage.txt");
		try (BufferedReader br = new BufferedReader(new FileReader(carbonStorage))) {
			BufferedReader brd = new BufferedReader(new FileReader(dateStorage));
			String newLine;
			String newDate;
			while ((newLine = br.readLine()) != null) {
				newDate = brd.readLine();
				System.out.println(newDate);
				System.out.println(newLine);				
			}										
		}
		catch (IOException e) {
      System.out.println("error.");
		}		 			
	}
	public static ArrayList<Double> fileCompare(){	
		System.out.println("Reading Files");
    File carbonStorage = new File("carbonStorage.txt");
		ArrayList<Double> weekKiloValues = new ArrayList<Double>();
		try (BufferedReader br = new BufferedReader(new FileReader(carbonStorage))) {
			double nextInput;
			String nextInputIntermediate;
			int count;
			while ((nextInputIntermediate = br.readLine()) != null) {
				nextInput = Double.valueOf(nextInputIntermediate);
				weekKiloValues.add(nextInput);
			}										
		}
		catch (IOException e) {
      System.out.println("error.");
		}		



		/*double[] weekKiloValues = new double[7];		
		try (BufferedReader br = new BufferedReader(new FileReader(carbonStorage))) {
			double nextInput;
			int count;
			for (count = 0; count < 7; count++){
				String nextInputIntermediate = br.readLine();
				nextInput = Double.valueOf(nextInputIntermediate);
				weekKiloValues[count] = nextInput;
			}										
		}
		catch (IOException e) {
      System.out.println("error.");
		}		 			*/
		return weekKiloValues;
	}	
}
/*
			while ((newLine = br.readLine()) != null) {
				try (BufferedReader brd = new BufferedReader(new FileReader(dateStorage))) {
					String newDate;
					while ((newDate = brd.readLine()) != null) {	
						System.out.println(newDate);	
					}
				}
				catch (IOException e) {
					System.out.println("error.");
				}		
			}						

*/








		/*
    System.out.println("Opening Save File");				
		Scanner carbonStorage = new Scanner("carbonStorage.txt");	
    while (carbonStorage.hasNextLine()) {
    	String read = carbonStorage.nextLine();
    	System.out.println(read);		
		}
		carbonStorage.close();  */  		