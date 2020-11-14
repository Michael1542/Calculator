import java.util.Scanner;  // Import the Scanner class
import java.util.ArrayList;  // Import the Array class
import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class
import java.io.FileWriter; // Import the File Writer class
import java.io.PrintWriter; // Import the Print Writer class
import java.util.Arrays; // Import the Arrays class
/**
* Logs carbon emission data to file
*  
*/
class Create {
	public static void createFile() throws IOException{
    try {
      File carbonStorage = new File("carbonStorage.txt");
      if (carbonStorage.createNewFile()) {
        System.out.println("New Save File");
      } else {
        System.out.println("Save File Exists");
      }
    } catch (IOException e) {
      System.out.println("error");
      e.printStackTrace();
    }		
    try {
      File dateStorage = new File("dateStorage.txt");
      if (dateStorage.createNewFile()) {
        System.out.println("New Date Save File");
      } else {
        System.out.println("Date Save File Exists");
      }
    } catch (IOException e) {
      System.out.println("error");
      e.printStackTrace();
    }			
	}	
}	
/*
    try { 
      File carbonStorage = new File("storage.txt"); 
			if (carbonStorage.createNewFile()) 
        System.out.println("File created"); 
      else
        System.out.println("File already exists"); 
    } 
    catch (Exception e) { 
      System.err.println("yikes.");
		}	 



		    File carbonStorage = new File("storage.txt"); 
		carbonStorage.createNewFile();
		*/