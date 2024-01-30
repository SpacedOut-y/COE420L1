package pack1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Example1 {

	private JFrame frame;
	private JTextField textFieldNum1;
	private JTextField textFieldNum2;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JTextField textFieldAnswer;
	private JLabel lblNewLabel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Example1 window = new Example1();
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
	public Example1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 535, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textFieldNum1 = new JTextField();
		textFieldNum1.setFont(new Font("Times New Roman", Font.BOLD, 29));
		textFieldNum1.setBounds(36, 44, 189, 49);
		frame.getContentPane().add(textFieldNum1);
		textFieldNum1.setColumns(10);
		
		textFieldNum2 = new JTextField();
		textFieldNum2.setFont(new Font("Times New Roman", Font.BOLD, 29));
		textFieldNum2.setBounds(235, 44, 177, 49);
		frame.getContentPane().add(textFieldNum2);
		textFieldNum2.setColumns(10);
		
		btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2, answer;
				
				try {
					num1=Integer.parseInt(textFieldNum1.getText());
					num2=Integer.parseInt(textFieldNum2.getText());
					answer = num1+num2;
					textFieldAnswer.setText(Integer.toString(answer));
				}catch(Exception e2) {
					JOptionPane.showMessageDialog(null, "Please enter valid numbers");
				}
			}
		});
		btnNewButton.setBounds(76, 166, 133, 49);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("SUBTRACT");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					int num1,num2, answer;
					
					try {
						num1=Integer.parseInt(textFieldNum1.getText());
						num2=Integer.parseInt(textFieldNum2.getText());
						answer = num1-num2;
						textFieldAnswer.setText(Integer.toString(answer));
					}catch(Exception e1) {
						JOptionPane.showMessageDialog(null, "Please enter valid numbers");
					}
				}
			
		});
		btnNewButton_1.setBounds(255, 166, 133, 49);
		frame.getContentPane().add(btnNewButton_1);
		
		textFieldAnswer = new JTextField();
		textFieldAnswer.setFont(new Font("Times New Roman", Font.BOLD, 29));
		textFieldAnswer.setBounds(177, 260, 224, 54);
		frame.getContentPane().add(textFieldAnswer);
		textFieldAnswer.setColumns(10);
		
		lblNewLabel = new JLabel("The answer is : ");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel.setBounds(24, 268, 143, 34);
		frame.getContentPane().add(lblNewLabel);
	}
}
