//package swing;
//
////import java.awt.EventQueue;
////
////import javax.swing.JFrame;
////import javax.swing.JLabel;
////import javax.swing.JOptionPane;
////import javax.swing.JPasswordField;
////
////import java.awt.Font;
////import java.awt.Color;
////import javax.swing.JTextField;
////
////import swing.Transaction;
////
////import javax.swing.JButton;
////import java.awt.event.ActionListener;
////import java.sql.Connection;
////import java.sql.DriverManager;
////import java.sql.PreparedStatement;
////import java.sql.ResultSet;
////import java.sql.Statement;
////import java.util.EventObject;
////import java.awt.event.ActionEvent;
////
////public class Withdraw {
////
////	private JFrame frame;
////	private JTextField textField;
////	private JPasswordField passwordField;
////	private JButton b1,b2;
////	
////	
////	public static void main(String[] args) {
////				
////					new Withdraw();
////					
////				
////			}
////		
////	
////
////	
////Withdraw() {
////		frame = new JFrame();
////		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
////		frame.setBounds(100, 100, 500, 405);
////		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
////		frame.getContentPane().setLayout(null);
////		
////		
////		JLabel lblNewLabel = new JLabel("Please Select a Amount:");
////		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
////		lblNewLabel.setBounds(125, 23, 328, 41);
////		frame.getContentPane().add(lblNewLabel);
////		
////		JLabel lblNewLabel_1 = new JLabel("Amount:");
////		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
////		lblNewLabel_1.setBounds(72, 117, 120, 36);
////		frame.getContentPane().add(lblNewLabel_1);
////		
////		
////		JTextField textField = new JTextField();
////		textField.setBounds(210, 128, 150, 20);
////		frame.getContentPane().add(textField);
////		textField.setColumns(10);
////
////		
////
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
////		
////		frame.setVisible(true);
////		
////		JButton b1 = new JButton("Enter");
////		b1.addActionListener(new ActionListener() {
////		public void actionPerformed(ActionEvent ae) {
////		
////		if(ae.getSource() == b1) {
////		String Balance;
////		String pinno;
////		
////		Balance = textField.getText();
////		pinno = passwordField.getText();
////			
////		
////		int BalanceI=Integer.parseInt(Balance);
////		try {
////			Connection connection = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/atm", "root","");
////			
////		
////			String sql = "update login set Balance = Balance-"+Balance+" where pinno="+pinno+"";
////            
////
////            connection.prepareStatement(sql).execute();
////			Statement s = connection.createStatement();
////			String getBalanceQuery = "SELECT Balance FROM login WHERE pinno = '"+pinno+"'";
////			PreparedStatement getBalanceStatement = connection.prepareStatement(getBalanceQuery);		
////			ResultSet rs = getBalanceStatement.executeQuery();
////
////            if(rs.next()){
////			JOptionPane.showMessageDialog(null,"Your :" +BalanceI+ "Cash Withdraw Successfully.");
////			textField.setText(null);
////			passwordField.setText(null);
////               Transaction.main(null);
////               frame.dispose();
////               }
////               else {
////            	   JOptionPane.showMessageDialog(null, "You do not have enough Balance");
////                   textField.setText(null);
////               }
////		}catch (Exception e1) {
////            System.out.println(e1.getMessage());
////		}
////		}
////		}
////            
////		});
////	
////	
////	
////
////		b1.setFont(new Font("Times New Roman", Font.BOLD, 18));
////		b1.setBounds(88, 232, 89, 23);
////		frame.getContentPane().add(b1);
////		
////		JButton b2 = new JButton("Exit");
////		b2.addActionListener(new ActionListener() {
////			public void actionPerformed(ActionEvent arg0) {
////				System.exit(0);
////			}
////		});
////		b2.setFont(new Font("Times New Roman", Font.BOLD, 18));
////		b2.setBounds(269, 232, 89, 23);
////		frame.getContentPane().add(b2);
////		}
////		
////
////}
////
//
//
//import java.awt.EventQueue;
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
//import swing.Transaction;
//
//import javax.swing.JButton;
//import java.awt.event.ActionListener;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.Statement;
//import java.util.EventObject;
//import java.awt.event.ActionEvent;
//
//public class Withdraw {
//
//	private JFrame frame;
//	private JTextField textField;
//	private JPasswordField passwordField;
//	private JButton b1,b2;
//	
//	
//	public static void main(String[] args) {
//				
//		new Withdraw();
//					
//				
//	}
//		
//	
//
//	
//	Withdraw() {
//		frame = new JFrame();
//		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
//		frame.setBounds(100, 100, 500, 405);
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
//		frame.setVisible(true);
//		
//		JButton b1 = new JButton("Withdraw");
//		b1.addActionListener(new ActionListener() {
//		public void actionPerformed(ActionEvent ae) {
//		
//		if(ae.getSource() == b1) {
//			String Balance;
//			String pinno;
//			
//			Balance = textField.getText();
//			pinno = passwordField.getText();
//				
//			
//			int BalanceI=Integer.parseInt(Balance);
//			try {
//				Conn c = new Conn();
////				Connection connection = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/atm", "root","");
////				Statement s = connection.createStatement();
//
//				String getBalanceQuery = "SELECT * FROM login WHERE pinno = '"+pinno+"'";
//				ResultSet rs = c.s.executeQuery(getBalanceQuery);
//				String databaseBalance = "0";
//				if(rs.next()) {
//					databaseBalance = rs.getString("Balance");
//								rs.next();
//				
//				int availableBalance = Integer.parseInt(databaseBalance);
//				if(availableBalance >= BalanceI && BalanceI > 0) {
//					String sql = "update login set Balance = Balance-"+Balance+" where pinno="+pinno+"";
//					c.s.execute(sql);
//					JOptionPane.showMessageDialog(null,"Your :" +BalanceI+ "Cash Withdraw Successfully.");
//					textField.setText(null);
//					passwordField.setText(null);
//					Transaction.main(null);
//		              frame.dispose();
//					
//				} else {
//					JOptionPane.showMessageDialog(null, "You do not have enough Balance");
//	                   textField.setText(null);
//	                   passwordField.setText(null);
//				}
//				}
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//	               
//		}
//		}  
//		});
//	
//	
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
//		}
//		
//
//}

//try{        
//    
//	String Balance;
//	String pinno;
//	
//	Balance = textField.getText();
//	pinno = passwordField.getText();
//    
//    if(ae.getSource()==b1){
//        if(textField.getText().equals("")){
//            
//            JOptionPane.showMessageDialog(null, "Please enter the Amount to you want to Withdraw");
//        
//        }else{
//            
//            Conn c1 = new Conn();
//            
//            
//            
//            ResultSet rs = c1.s.executeQuery(" select * from login where pinno = '"+pinno+"' ");
//            
//            double BalanceI = 0;
//            if(rs.next()){
//                String pinnoI = rs.getString("pinno");
//                
//              BalanceI = rs.getDouble("Balance");
//                
//                JFrame f = new JFrame();
//                
//                double d = Double.parseDouble(Balance);
//                if(d > BalanceI){      
//                    JOptionPane.showMessageDialog(f,"You don't have enough cash.","Alert",JOptionPane.WARNING_MESSAGE);
//                }
//                else{
//                BalanceI-=d;
//                String q1= "update login set Balance = '"+BalanceI+"'";
//            
//                c1.s.executeUpdate(q1);
//                }
//            }
//            
//            
//            
//            JOptionPane.showMessageDialog(null, "Rs. "+Balance+" Withdrawn Successfully");
//            
//            new Transaction().setVisible(true);
//            
//            
//            
//            
//        }
//        
//    
//    }else if(ae.getSource()==b2){
//        
//        System.exit(0);
//        
//    }
//}catch(Exception e){
//        e.printStackTrace();
//        System.out.println("error: "+e);
//}
//}
//    
//});

//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//public class Withdraw  {
//	private JFrame frame;
//	
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Withdraw w = new Withdraw();
//					w.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
//	
//	Container container = getContentPane ();
//	
//	JLabel title = new JLabel("withdraw Form");
//	
//	JLabel title1 = new JLabel("Check you balance before withdraw");
//	JLabel cardnoLabel = new JLabel("Enter Card Number");
//	JTextField cardTextField = new JTextField();
//	
//	JLabel cash = new JLabel("Enter Amount");
//	JTextField cashTextField = new JTextField();
//	
//	JLabel pinNumberLabel = new JLabel("Enter pinNumber");
//	JPasswordField pinNumberTextField = new JPasswordField();
//	
//	
//	JButton withdrawButton = new JButton("Withdraw");
//	void withdrawFrame(){
//		setLayoutManager();
//		setLocationAndSize();
//		addComponentsToContainer();
//		addActionEvent();
//		
//	}
//	private Container getContentPane() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	public void setLayoutManager() {
//		container.setLayout(null);
//	}
//	public void setLocationAndSize() {
//		
//		title.setBounds(100,50, 200,50);
//		title1.setBounds(100,100,200,50);
//		
//		cardnoLabel.setBounds(10,150,120,30);
//		cardTextField.setBounds(150,150,150,30);
//		
//		cash.setBounds(10,220,120,30);
//		cashTextField.setBounds(150,220,150,30);
//		
//		pinNumberLabel.setBounds(10,290,120,30);		
//		pinNumberTextField.setBounds(150,290,150,30);
//		
//		withdrawButton.setBounds(150,360,150,30);
//		
//
//		
//	}
//	public void addComponentsToContainer() {
//		
//		container.add(title);
//		container.add(title1);
//		container.add(cash);
//		container.add(cashTextField);
//		
//		container.add(pinNumberLabel);
//		container.add(pinNumberTextField);
//		
//		container.add(cardnoLabel);
//		container.add(cardTextField);
//		
//		container.add(withdrawButton);
//		
//	}
//	
//	public void addActionEvent() {
//		withdrawButton.addActionListener((ActionListener) this);
//		
//	}
//	public void actionPerformed(ActionEvent e) {
//		
//		if(e.getSource() == withdrawButton) {
//			String Balance;
//			String pinno;
//			String cardno;
//			Balance = cashTextField.getText();
//			pinno = pinNumberTextField.getText();
//			cardno = cardTextField.getText();	
//			
//			int BalanceI=Integer.parseInt(Balance);
//			try {
//				Connection connection = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3308/atm", "root","");	 
//			
//				String sql = "update login set Balance = Balance-"+Balance+" where cardno ="+cardno+"&& pinno="+pinno+"";
//	            connection.prepareStatement(sql).execute();
//				JOptionPane.showMessageDialog(null,"Cash Withdraw Successfully.");
//	               dispose();	               
//			}catch (Exception e1) {
//                System.out.println(e1.getMessage());}
//		}
//		
//		
//		
//	}
//	private void dispose() {
//		// TODO Auto-generated method stub
//		
//	}
//}

//package swing;
//import java.awt.EventQueue;
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
//import swing.Transaction;
//
//import javax.swing.JButton;
//import java.awt.event.ActionListener;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.Statement;
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//import java.util.EventObject;
//import java.awt.event.ActionEvent;
//
//public class Withdraw {
//
//	
//	
//	Withdraw(String atmNumber, JDBCConnection jdbc) {
//		JFrame frame;
//	JButton b2;
//		frame = new JFrame();
//		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
//		frame.setBounds(100, 100, 500, 405);
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
//		frame.setVisible(true);
//		
//		JButton b1 = new JButton("Withdraw");
//		b1.addActionListener(new ActionListener() {
//		public void actionPerformed(ActionEvent ae) {
//		
//					int eneteredBalance = Integer.parseInt(textField.getText().toString().trim());
//	                int getBalance = getBalanceFromDB(atmNumber, jdbc);
//					if(getBalance >= eneteredBalance) {
//						boolean status = performTransaction(atmNumber, eneteredBalance, jdbc);
//						if(status == true) {
//	                        int remainingBalance = getBalanceFromDB(atmNumber, jdbc);
//	                        JOptionPane.showMessageDialog(null,
//							    "Withdrawed "+eneteredBalance+" successfully\nAvailable Balance: "+remainingBalance+"",
//							    "Success",
//							    JOptionPane.INFORMATION_MESSAGE);
//	                        textField.setText(null);
//	                        new Transaction(atmNumber, jdbc);
//							frame.dispose();
//	                        
//	                        
//	                    }else {
//	                        JOptionPane.showMessageDialog(null,
//							    "Error withdrawing balance",
//							    "Error",
//							    JOptionPane.WARNING_MESSAGE);
//	                    }
//					} else {
//						JOptionPane.showMessageDialog(null,
//							    "Insufficient Balance",
//							    "Error",
//							    JOptionPane.WARNING_MESSAGE);
//                        		textField.setText(null);
//
//					}                       
//	            }
//	        });
//	
//
//		b1.setFont(new Font("Times New Roman", Font.BOLD, 18));
//		b1.setBounds(88, 232, 89, 23);
//		frame.getContentPane().add(b1);
//		
//		b2 = new JButton("Exit");
//		b2.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//				System.exit(0);
//			}
//		});
//		b2.setFont(new Font("Times New Roman", Font.BOLD, 18));
//		b2.setBounds(269, 232, 89, 23);
//		frame.getContentPane().add(b2);
//		}
//		
//
//		static int getBalanceFromDB(String atmNumber, JDBCConnection jdbc) {
//			int balance = jdbc.getDataInt("SELECT Balance FROM login WHERE cardno = "+atmNumber+"");
//			return balance;
//			
//		}
//	    static boolean performTransaction(String atmNumber, int amount, JDBCConnection jdbc) {
//	    	
//	    	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
//			LocalDateTime now = LocalDateTime.now();
//			String date = dtf.format(now).toString();
//	        boolean status = false;
//	        try {
//	            jdbc.executeQuery("UPDATE login SET Balance = Balance - '"+amount+"' WHERE cardno = '"+atmNumber+"'");
//				jdbc.executeQuery("INSERT INTO atm_transactions(cardno, date, amount, remarks) VALUES('"+atmNumber+"', '"+date+"', '-"+amount+"', 'atm_withdraw')");
//	            status = true;
//	        } catch(Exception e) {
//	            status = false;
//	        }
//	        return status;
//	        boolean status = false;
//	        try {
//	            jdbc.executeQuery("UPDATE login SET Balance = Balance - '"+amount+"' WHERE cardno = '"+atmNumber+"'");
//	            status = true;
//	        } catch(Exception e) {
//	            status = false;
//	        }
//	        return status;
//	        
//	        
//	    }
//}

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

public class Withdraw {

	Withdraw(String atmNumber, JDBCConnection jdbc) {
		JFrame frame;
		JButton exitBtn, backBtn;
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 500, 405);
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

		JButton withdrawBtn = new JButton("Withdraw");
		withdrawBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {

				int eneteredBalance = Integer.parseInt(textField.getText().toString().trim());
				int getBalance = getBalanceFromDB(atmNumber, jdbc);
				if (getBalance >= eneteredBalance) {
					boolean status = performTransaction(atmNumber, eneteredBalance, jdbc);
					if (status == true) {
						int remainingBalance = getBalanceFromDB(atmNumber, jdbc);
						JOptionPane.showMessageDialog(null, "Withdrawed " + eneteredBalance
								+ " successfully\nAvailable Balance: " + remainingBalance + "", "Success",
								JOptionPane.INFORMATION_MESSAGE);
						textField.setText(null);
						new Transaction(atmNumber, jdbc);
						frame.dispose();

					} else {
						JOptionPane.showMessageDialog(null, "Error withdrawing balance", "Error",
								JOptionPane.WARNING_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(null, "Insufficient Balance", "Error", JOptionPane.WARNING_MESSAGE);
					textField.setText(null);

				}
			}
		});

		withdrawBtn.setFont(new Font("Times New Roman", Font.BOLD, 18));
		withdrawBtn.setBounds(88, 232, 130, 23);
		withdrawBtn.setBackground(Color.GRAY);
		withdrawBtn.setForeground(Color.BLACK);
		frame.getContentPane().add(withdrawBtn);

		exitBtn = new JButton("Exit");
		exitBtn.setFont(new Font("Times New Roman", Font.BOLD, 18));
		exitBtn.setBounds(300, 232, 89, 23);
		exitBtn.setBackground(Color.GRAY);
		exitBtn.setForeground(Color.BLACK);
		frame.getContentPane().add(exitBtn);
		exitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
	
		backBtn = new JButton("Back");
		backBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Transaction(atmNumber, jdbc);
				frame.dispose();
			}
		});
	
		backBtn.setFont(new Font("Times New Roman", Font.BOLD, 18));
		backBtn.setBounds(220, 300, 89, 23);
		backBtn.setBackground(Color.GRAY);
		backBtn.setForeground(Color.BLACK);
		frame.getContentPane().add(backBtn);
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
					"UPDATE login SET Balance = Balance - '" + amount + "' WHERE cardno = '" + atmNumber + "'");
			jdbc.executeQuery("INSERT INTO atm_transactions(cardno, date, amount, remarks) VALUES('" + atmNumber
					+ "', '" + date + "', '-" + amount + "', 'Withdrawn Money')");
			status = true;
		} catch (Exception e) {
			status = false;
		}
		return status;
	}
}