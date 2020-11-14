import java.util.Scanner;  // Import the Scanner class
import java.util.ArrayList;  // Import the Array class
import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class
import java.io.FileWriter; // Import the File Writer class
import java.io.PrintWriter; // Import the Print Writer class
import java.util.Arrays; // Import the Arrays class
import java.util.Collections;// Import the Collections class
/**
* Sort information logged in files
*  
*/
class Sort {
  public static ArrayList<Double> sortKilos(ArrayList<Double> arrayKilos) {
		Collections.sort(arrayKilos);
		return arrayKilos;
	}
	public static void bubbleSortOunces(double doubleList[ ]) {
		Arrays.sort(doubleList);
		/*
    int number = doubleList.length;
    double temp;
    for(int a = 0; a < number; a++){
      for(int b = 1; b < (number-a); b++){
        if(doubleList[b-1] > doubleList[b]){
          temp = doubleList[b-1];
          doubleList[b-1] = doubleList[b];
          doubleList[b] = temp;
        }
			}
		}
		*/
    System.out.println(doubleList);		
	}		
	public static void selectionSortOunces(double doubleList[ ]) {
		Arrays.sort(doubleList);       
    /*
	  int min;    
    int number = doubleList.length;
    for(int a = 0; a < number-1 ; a++)  {
			min = a;
      for(int b = a+1; b < number ; b++ ) {
        if(doubleList[b] < doubleList[min])  {           
          min = b;
      	}
      }
      swap(doubleList[min], doubleList[a]) ; 
    }
		*/
    System.out.println(doubleList);		
	}			
	public static void linearSearchOunces(double doubleList[ ]) {
		int number = doubleList.length;
		for(int a = 0; a < number; a++){
			if (doubleList[a] > 5.0){
				System.out.println(doubleList[a]);
			}
		}
	}
	public static int selectionSearchOunces(double doubleList[ ]){
		Arrays.sort(doubleList);
		int lowEnd = 0;
		int highEnd = doubleList.length-1;
		double searchTarget = 8;
		while(lowEnd<=highEnd){
    	int midEnd=(lowEnd+highEnd)/2;
     	if(doubleList[midEnd]<searchTarget){
        lowEnd=midEnd+1;
     	}
     	else if(doubleList[midEnd]>searchTarget){
        highEnd=midEnd-1;
     	}
     	else{
      	return midEnd;
  		}
   	}
  return 0; 
	}
}