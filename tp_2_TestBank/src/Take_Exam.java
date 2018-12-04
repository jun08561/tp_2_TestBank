import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;

public class Take_Exam extends ExamFrame{
	private JTextField txtUserName;
	private JTextField txtUserID;
	private JTextField txtClassID;
	
	
	public Take_Exam() {
		super("taking Exam", 400, 500);
		
		getContentPane().setLayout(null);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblLogin.setBounds(153, 28, 116, 34);
		getContentPane().add(lblLogin);
		
		JLabel txtStudentName = new JLabel("Name");
		txtStudentName.setBounds(38, 85, 56, 16);
		getContentPane().add(txtStudentName);
		
		txtUserName = new JTextField();
		txtUserName.setBounds(139, 82, 116, 22);
		getContentPane().add(txtUserName);
		txtUserName.setColumns(10);
		
		JLabel txtStudentID = new JLabel("ID");
		txtStudentID.setBounds(38, 138, 56, 16);
		getContentPane().add(txtStudentID);
		
		txtUserID = new JTextField();
		txtUserID.setBounds(139, 135, 116, 22);
		getContentPane().add(txtUserID);
		txtUserID.setColumns(10);
		
		JLabel txtClass_ID = new JLabel("Class_ID");
		txtClass_ID.setBounds(38, 195, 56, 16);
		getContentPane().add(txtClass_ID);
		
		txtClassID = new JTextField();
		txtClassID.setBounds(139, 192, 116, 22);
		getContentPane().add(txtClassID);
		txtClassID.setColumns(10);
	}
}
