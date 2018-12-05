
import java.util.ArrayList;
import java.util.List;

public class Student_Report
{
	
	public static void main(String[] args)
	{
		Take_Exam people = new Take_Exam();
		people.getrecord();
		List<String> l = new ArrayList<String>(people.getrecord().keySet());
		
		
		
		
		
	}
}
