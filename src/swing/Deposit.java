//package swing;
//
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JOptionPane;
//import javax.swing.JPasswordField;
//
//import java.awt.Font;
//import java.awt.Color;
//import javax.swing.JTextField;
//
//import javax.swing.JButton;
//import java.awt.event.ActionListener;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.Statement;
//import java.awt.event.ActionEvent;
//
//public class Deposit {
//
//	private JFrame frame;
//	private JTextField textField;
//	private JPasswordField passwordField;	
//
//
//public static void main(String[] args) {
//	
//				new Deposit();
//				
//			
//}
//
// Deposit() {
//		frame = new JFrame();
//		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
//		frame.setBounds(100, 20, 450, 400);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.getContentPane().setLayout(null);
//		
//		
//		JLabel lblNewLabel = new JLabel("Please Select a Amount:");
//		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
//		lblNewLabel.setBounds(125, 23, 328, 41);
//		frame.getContentPane().add(lblNewLabel);
//		
//		JLabel lblNewLabel_1 = new JLabel("Amount:");
//		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
//		lblNewLabel_1.setBounds(72, 117, 120, 36);
//		frame.getContentPane().add(lblNewLabel_1);
//		
//		
//		JTextField textField = new JTextField();
//		textField.setBounds(210, 128, 150, 20);
//		frame.getContentPane().add(textField);
//		textField.setColumns(10);
//
//		
//
////		JLabel lblNewLabel_2 = new JLabel("Pin No:");
////		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
////		lblNewLabel_2.setBounds(72, 167, 120, 36);
////		frame.getContentPane().add(lblNewLabel_2);
////		
////		
////		JPasswordField passwordField = new JPasswordField();
////		passwordField.setBounds(210, 178, 150, 20);
////		frame.getContentPane().add(passwordField);
////		passwordField.setColumns(10);
//		
//		
//		frame.setVisible(true);
//		
//		
//		JButton b1 = new JButton("Enter");
//		b1.addActionListener(new ActionListener() {
//		
//			public void actionPerformed(ActionEvent ae) {
//				if(ae.getSource() == b1) {
//				
//				String pinno = passwordField.getText();
//				String Balance = textField.getText();	
//				int depositBalance = Integer.parseInt(Balance);
//				
//			 try {
//				 Conn c = new Conn();
//	
//					
////				 Class.forName("com.mysql.cj.jdbc.Driver");
////					Connection c  = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root",""); 	
////					Statement s = c.createStatement();
//					String getBalanceQuery = "SELECT Balance FROM login WHERE pinno = '"+pinno+"'";
////					PreparedStatement getBalanceStatement = c.s.prepareStatement(getBalanceQuery);
//					
//					ResultSet rs = c.s.executeQuery(getBalanceQuery);
//					
//					if(rs.next()== false) {
//						JOptionPane.showMessageDialog(null,"Cash Deposited Failed. Invalid AccountNO or Pin.");
//						textField.setText(null);
//						passwordField.setText(null);
//					}
//					else {
//					String sqlDeposit = "update login set Balance = Balance+ "+Balance+" where  pinno="+pinno+"";
//					c.s.execute(sqlDeposit);				
//					JOptionPane.showMessageDialog(null," your :  "+Balance+" Cash Deposited Successfully.");
//					Transaction.main(null);	
//					frame.dispose();					
//
//		               	               
//					}
//					
//					
//				} catch (Exception error) {
//					error.printStackTrace();
//				}
//				}
//			
//		}
//		});
//		            
//		
//		b1.setFont(new Font("Times New Roman", Font.BOLD, 18));
//		b1.setBounds(88, 232, 89, 23);
//		frame.getContentPane().add(b1);
//		
//		JButton b2 = new JButton("Exit");
//		b2.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//				System.exit(0);
//			}
//		});
//		b2.setFont(new Font("Times New Roman", Font.BOLD, 18));
//		b2.setBounds(269, 232, 89, 23);
//		frame.getContentPane().add(b2);
//		
//		
//		frame.setVisible(true);
//		
//	}
//
//
// 
//	
//
//	public void actionPerformed(ActionEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
//	
//
//   
//
//	
//}
//
//

package swing;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;

import javax.swing.JButton;
import java.awt.event.ActionListener;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.awt.event.ActionEvent;

public class Deposit {
	Deposit(String atmNumber, JDBCConnection jdbc) {
		JFrame frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 20, 450, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Please Select a Amount:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel.setBounds(125, 23, 328, 41);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Amount:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setBounds(72, 117, 120, 36);
		frame.getContentPane().add(lblNewLabel_1);

		JTextField textField = new JTextField();
		textField.setBounds(210, 128, 150, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		frame.setVisible(true);

		JButton DepositBtn = new JButton("Enter");
		DepositBtn.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent ae) {
				if (ae.getSource() == DepositBtn) {

					String Balance = textField.getText().toString().trim();
					int depositBalance = Integer.parseInt(Balance);
					boolean status = performTransaction(atmNumber, depositBalance, jdbc);
					if (status == true) {
						int remainingBalance = getBalanceFromDB(atmNumber, jdbc);
						JOptionPane.showMessageDialog(null, "Deposited " + depositBalance
								+ " successfully\nAvailable Balance: " + remainingBalance + "", "Success",
								JOptionPane.INFORMATION_MESSAGE);
						textField.setText(null);
						new Transaction(atmNumber, jdbc);
						frame.dispose();
					} else {
						JOptionPane.showMessageDialog(null, "Error withdrawing balance", "Error",
								JOptionPane.WARNING_MESSAGE);
					}
				}

			}
		});

		DepositBtn.setFont(new Font("Times New Roman", Font.BOLD, 18));
		DepositBtn.setBounds(88, 232, 89, 23);
		DepositBtn.setBackground(Color.GRAY);
		DepositBtn.setForeground(Color.BLACK);
		frame.getContentPane().add(DepositBtn);

		JButton exitBtn = new JButton("Exit");
		exitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		exitBtn.setFont(new Font("Times New Roman", Font.BOLD, 18));
		exitBtn.setBounds(269, 232, 89, 23);
		exitBtn.setBackground(Color.GRAY);
		exitBtn.setForeground(Color.BLACK);
		frame.getContentPane().add(exitBtn);

		
		JButton backBtn = new JButton("Back");
		backBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Transaction(atmNumber, jdbc);
				frame.dispose();
			}
		});
	
		backBtn.setFont(new Font("Times New Roman", Font.BOLD, 18));
		backBtn.setBounds(180, 300, 89, 25);
		backBtn.setBackground(Color.GRAY);
		backBtn.setForeground(Color.BLACK);
		frame.getContentPane().add(backBtn);
		
		frame.setVisible(true);
		

	}

	static int getBalanceFromDB(String atmNumber, JDBCConnection jdbc) {
		int balance = jdbc.getDataInt("SELECT Balance FROM login WHERE cardno = " + atmNumber + "");
		return balance;

	}

	static boolean performTransaction(String atmNumber, int amount, JDBCConnection jdbc) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		String date = dtf.format(now).toString();
		boolean status = false;
		try {
			jdbc.executeQuery(
					"UPDATE login SET Balance = Balance + '" + amount + "' WHERE cardno = '" + atmNumber + "'");
			jdbc.executeQuery("INSERT INTO atm_transactions(cardno, date, amount, remarks) VALUES('" + atmNumber
					+ "', '" + date + "', '+" + amount + "', 'Deposited Money')");
			status = true;
		} catch (Exception e) {
			status = false;
		}
		return status;
	}

}
