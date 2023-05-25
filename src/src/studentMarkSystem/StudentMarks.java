package studentMarkSystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentMarks {

	private JFrame frame;
	private JTextField sub1;
	private JTextField sub2;
	private JTextField sub3;
	private JTextField totalmarks;
	private JTextField average;
	private JTextField grade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentMarks window = new StudentMarks();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StudentMarks() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 638, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(128, 128, 128), Color.GREEN, null, null));
		panel.setBounds(31, 28, 547, 351);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Marks Calculation System");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 23));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(69, 10, 392, 33);
		panel.add(lblNewLabel);
		
		JLabel lblSubject = new JLabel("Subject 1");
		lblSubject.setHorizontalAlignment(SwingConstants.CENTER);
		lblSubject.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblSubject.setBounds(10, 72, 128, 33);
		panel.add(lblSubject);
		
		JLabel lblSubject_5 = new JLabel("Subject 2");
		lblSubject_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblSubject_5.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblSubject_5.setBounds(10, 103, 128, 33);
		panel.add(lblSubject_5);
		
		JLabel lblSubject_1 = new JLabel("Subject 3");
		lblSubject_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblSubject_1.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblSubject_1.setBounds(10, 137, 128, 33);
		panel.add(lblSubject_1);
		
		JLabel lblTotalMarks = new JLabel("Total Marks");
		lblTotalMarks.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotalMarks.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblTotalMarks.setBounds(10, 191, 128, 33);
		panel.add(lblTotalMarks);
		
		JLabel lblAverage = new JLabel("Average ");
		lblAverage.setHorizontalAlignment(SwingConstants.CENTER);
		lblAverage.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblAverage.setBounds(10, 223, 128, 33);
		panel.add(lblAverage);
		
		JLabel lblSubject_4_1 = new JLabel("Grade");
		lblSubject_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblSubject_4_1.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblSubject_4_1.setBounds(10, 266, 128, 33);
		panel.add(lblSubject_4_1);
		
		sub1 = new JTextField();
		sub1.setBounds(151, 81, 96, 19);
		panel.add(sub1);
		sub1.setColumns(10);
		
		sub2 = new JTextField();
		sub2.setColumns(10);
		sub2.setBounds(151, 112, 96, 19);
		panel.add(sub2);
		
		sub3 = new JTextField();
		sub3.setColumns(10);
		sub3.setBounds(151, 146, 96, 19);
		panel.add(sub3);
		
		totalmarks = new JTextField();
		totalmarks.setColumns(10);
		totalmarks.setBounds(151, 200, 96, 19);
		panel.add(totalmarks);
		
		average = new JTextField();
		average.setColumns(10);
		average.setBounds(151, 232, 96, 19);
		panel.add(average);
		
		grade = new JTextField();
		grade.setColumns(10);
		grade.setBounds(151, 275, 96, 19);
		panel.add(grade);
		
		JButton btncal = new JButton("Calculate");
		btncal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int s1 = Integer.parseInt(sub1.getText());
				int s2 = Integer.parseInt(sub2.getText());
				int s3 = Integer.parseInt(sub3.getText());
				int total = s1 + s2 + s3 ;
				float avg = total/3;
				totalmarks.setText(String.valueOf(total));
				average.setText(String.valueOf(avg));
				
				if(avg>45) {
					grade.setText("Passed");
				}
				else {
					grade.setText("Falied");
				}
				


				
			}
		});
		btncal.setFont(new Font("Times New Roman", Font.BOLD, 23));
		btncal.setBounds(347, 103, 155, 47);
		panel.add(btncal);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sub1.setText("");
				sub2.setText("");
				sub3.setText("");
				average.setText("");
				grade.setText("");
				totalmarks.setText("");
				sub1.requestFocus();
				
			}
		});
		btnClear.setFont(new Font("Times New Roman", Font.BOLD, 23));
		btnClear.setBounds(347, 182, 155, 47);
		panel.add(btnClear);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 23));
		btnExit.setBounds(347, 257, 155, 47);
		panel.add(btnExit);
	}
}
