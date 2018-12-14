
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Question_Tes {

	
	    final static String fileLoc = "\"C:/Users/June/Desktop/Documents/test.txt";
	     
	  
	     
	    public void readAndPrintTextFromFile() {
	        String text;
	        try (BufferedReader br = new BufferedReader(new FileReader(fileLoc))) {
	            while((text = br.readLine()) != null) {
	                if (text.contains("<STUFF>")) {
	                    text = text.replace("<STUFF>", "This is text to replace \"<STUFF>\"");
	                    System.out.println(text);
	                } else {
	                    System.out.println(text);
	                }
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}


