import javax.swing.JSeparator;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Exam_Taking extends ExamFrame{
	
	public Exam_Taking() {
		super("Taking Exam", 700, 1000);
		getContentPane().setLayout(null);
		
		JLabel lblTakingExam = new JLabel("Taking Exam");
		lblTakingExam.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblTakingExam.setBounds(256, 23, 148, 30);
		getContentPane().add(lblTakingExam);
		
       
	}
}
