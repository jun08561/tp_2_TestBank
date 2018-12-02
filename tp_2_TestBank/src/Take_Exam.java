import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;


public class Take_Exam extends JFrame
{

	public void frame() {
		this.setTitle("Java waived exam");
		this.setVisible(true);
		this.setSize(700, 700);
		
		this.addWindowListener(new WindowAdapter()
		{
			@Override
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		
		
	}
	
	public static void main(String[] args)
	{
		Take_Exam exam = new Take_Exam();
		exam.frame();
	}
	

}


