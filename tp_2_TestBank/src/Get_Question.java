import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Get_Question {

    public static void main(String[] args) throws IOException {
    
    String token1 = "";

    
    File file = new File("C:/Users/June/Desktop/Documents/freedom.txt");
    Scanner inFile1 = new Scanner(file);
 
    List<String> temps = new ArrayList<String>();

   
    while (inFile1.hasNext()) {
      
      token1 = inFile1.next();
      temps.add(token1);
    }
    inFile1.close();

    String[] tempsArray = temps.toArray(new String[0]);

//    System.out.print("The array: (");
//	for(int i=0; i<tempsArray.length; i++) {
//		if(i==tempsArray.length-1) {
//		System.out.print(tempsArray[i]);}
//		else {
//			System.out.print(tempsArray[i]+",");
//		}
//		
//		
//	}
//	System.out.print(")");
//	System.out.print("The array: ( {");
//	for(int i=0; i<tempsArray.length; i++) {
//		if(i==tempsArray.length-1) {
//		System.out.print("("+tempsArray[i]+")");}
//		else {
//			System.out.print("("+tempsArray[i]+")"+",");
//		}
//		
//	}
//	System.out.print("} )");
 }
}