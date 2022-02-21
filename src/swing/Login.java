//package swing;
//
//import java.sql.*;
//import java.awt.Color;
//import java.awt.EventQueue;
//import java.awt.Font;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JOptionPane;
//import javax.swing.JPasswordField;
//import javax.swing.JTextField;
//
//
//public class Login implements ActionListener{
//
//	JFrame frame;
//
//	JLabel l1;
//    JButton b1,b2;
//    private JPasswordField passwordField;
//
//	
//	public static void main(String[] args) {
//	 new Login();
//	}
//
//
//    Login() {
//		frame = new JFrame();
//		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
//		frame.setBounds(100, 20, 450, 530);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.getContentPane().setLayout(null);
//		
//		
//		JLabel lblNewLabel = new JLabel("Login");
//		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 35));
//		lblNewLabel.setBounds(180, 30, 450, 41);
//		frame.getContentPane().add(lblNewLabel);
//		
//		
//		JLabel usernameLabel = new JLabel("Cardno:");
//		usernameLabel.setBounds(80, 130, 100, 30);// x,y,width,height
//		usernameLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
//		frame.add(usernameLabel);
//		
//		JTextField textField = new JTextField();
//		textField.setBounds(180, 130, 150, 30);
//		frame.add(textField);
//		
//		JLabel passwordLabel = new JLabel("Pinno:");
//		passwordLabel.setBounds(80, 220, 100, 30);
//		passwordLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
//		frame.add(passwordLabel);
//		
//		JPasswordField passwordField = new JPasswordField();
//		passwordField.setBounds(180,220,150,30);
//		frame.add(passwordField);
//		
//		frame.setVisible(true);
//		
//		 b1 = new JButton("Enter");
//	     b1.setFont(new Font("Times New Roman", Font.BOLD, 20));
//	     
//	     b1.setBackground(Color.GRAY);
//	     b1.setForeground(Color.BLACK);
//	     b1.setBounds(100,300,100,30);
//	     frame.getContentPane().add(b1); 
//	     
//		 b1.addActionListener(new ActionListener() {
//				
//			 public void actionPerformed(ActionEvent e) {
//				 
//			        try{
//			        	Conn c = new Conn();
////			        	Class.forName("com.mysql.cj.jdbc.Driver");
////			        	 Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","");		        	
////			        	
////					            
////			            Statement st = c.createStatement();
//			            String sql ="Select * from login where cardno = '"+textField.getText()+"' and pinno = '"+passwordField.getText()+"'";
//			            ResultSet rs = c.s.executeQuery(sql);
//			        
//			                if(rs.next()){
//			                	
//			                	Language.main(null);
//			                	frame.dispose();
//			                	
//			                	
//			                	
//			                }else{
//			                    JOptionPane.showMessageDialog(null, "Incorrect Card Number or Pinno");
//			                    textField.setText(null);
//			                	passwordField.setText(null);    
//			                }
//			                
//			               
//			            
//			           
//			        }catch(Exception e1){
//			                    e1.printStackTrace();
//			                    System.out.println("error: "+e1);
//			        }
//			        
//			            
//			    }
//			 });
//
//		
//		
//		JButton b2 = new JButton("Exit");
//		b2.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//				System.exit(0);
//				}
//			
//			});
//			
//		b2.setFont(new Font("Times New Roman", Font.BOLD, 20));
//		b2.setBounds(280, 300, 100, 30);
//		b2.setBackground(Color.GRAY);
//	    b2.setForeground(Color.BLACK);
//		frame.getContentPane().add(b2);
//			
//		
//	}
//
//
//	@Override
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







//package swing;
//
//import java.sql.*;
//import java.awt.Color;
//import java.awt.EventQueue;
//import java.awt.Font;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JOptionPane;
//import javax.swing.JPasswordField;
//import javax.swing.JTextField;
//
//
//public class Login implements ActionListener{
//
//	
//	public static void main(String[] args) {
//	 startActivity();
//	}
//
//
//    static void startActivity() {
//    	JDBCConnection jdbc = new JDBCConnection();
//		JFrame frame;
//		frame = new JFrame();
//		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
//		frame.setBounds(100, 20, 450, 530);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.getContentPane().setLayout(null);
//		
//		
//		JLabel lblNewLabel = new JLabel("Login");
//		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 35));
//		lblNewLabel.setBounds(180, 30, 450, 41);
//		frame.getContentPane().add(lblNewLabel);
//		
//		
//		JLabel usernameLabel = new JLabel("Cardno:");
//		usernameLabel.setBounds(80, 130, 100, 30);// x,y,width,height
//		usernameLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
//		frame.add(usernameLabel);
//		
//		JTextField textField = new JTextField();
//		textField.setBounds(180, 130, 150, 30);
//		frame.add(textField);
//		
//		JLabel passwordLabel = new JLabel("Pinno:");
//		passwordLabel.setBounds(80, 220, 100, 30);
//		passwordLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
//		frame.add(passwordLabel);
//		
//		JPasswordField passwordField = new JPasswordField();
//		passwordField.setBounds(180,220,150,30);
//		frame.add(passwordField);
//		
//		frame.setVisible(true);
//		
//		 JButton b1 = new JButton("Enter");
//	     b1.setFont(new Font("Times New Roman", Font.BOLD, 20));
//	     
//	     b1.setBackground(Color.GRAY);
//	     b1.setForeground(Color.BLACK);
//	     b1.setBounds(100,300,100,30);
//	     frame.getContentPane().add(b1); 
//	     
//		 b1.addActionListener(new ActionListener() {
//				
//			 public void actionPerformed(ActionEvent e) {
//				 
//			        try{
//			        	Conn c = new Conn();
////			        	Class.forName("com.mysql.cj.jdbc.Driver");
////			        	 Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","");		        	
////			        	
////					            
////			            Statement st = c.createStatement();
//			            String sql ="Select * from login where cardno = '"+textField.getText()+"' and pinno = '"+passwordField.getText()+"'";
//			            ResultSet rs = c.s.executeQuery(sql);
//			        
//			                if(rs.next()){
//			                	
//			                	Transaction.main(null);
//			                	frame.dispose();
//			                	
//			                	
//			                	
//			                }else{
//			                    JOptionPane.showMessageDialog(null, "Incorrect Card Number or Pinno");
//			                    textField.setText(null);
//			                	passwordField.setText(null);    
//			                }
//			                
//			               
//			            
//			           
//			        }catch(Exception e1){
//			                    e1.printStackTrace();
//			                    System.out.println("error: "+e1);
//			        }
//			        
//			            
//			    }
//			 });
//
//		
//		
//		JButton b2 = new JButton("Exit");
//		b2.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//				System.exit(0);
//				}
//			
//			});
//			
//		b2.setFont(new Font("Times New Roman", Font.BOLD, 20));
//		b2.setBounds(280, 300, 100, 30);
//		b2.setBackground(Color.GRAY);
//	    b2.setForeground(Color.BLACK);
//		frame.getContentPane().add(b2);
//			
//		
//	}
//
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
//}




//package swing;
//
//import java.sql.*;
//import java.awt.Color;
//import java.awt.EventQueue;
//import java.awt.Font;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JOptionPane;
//import javax.swing.JPasswordField;
//import javax.swing.JTextField;
//
//
//public class Login implements ActionListener{
//
//	
//	public static void main(String[] args) {
//	 startActivity();
//	}
//
//
//    static void startActivity() {
//    	JDBCConnection jdbc = new JDBCConnection();
//		JFrame frame;
//		frame = new JFrame();
//		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
//		frame.setBounds(100, 20, 450, 530);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.getContentPane().setLayout(null);
//		
//		
//		JLabel lblNewLabel = new JLabel("Login");
//		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 35));
//		lblNewLabel.setBounds(180, 30, 450, 41);
//		frame.getContentPane().add(lblNewLabel);
//		
//		
//		JLabel usernameLabel = new JLabel("Cardno:");
//		usernameLabel.setBounds(80, 130, 100, 30);// x,y,width,height
//		usernameLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
//		frame.add(usernameLabel);
//		
//		JTextField textField = new JTextField();
//		textField.setBounds(180, 130, 150, 30);
//		frame.add(textField);
//		
//		JLabel passwordLabel = new JLabel("Pinno:");
//		passwordLabel.setBounds(80, 220, 100, 30);
//		passwordLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
//		frame.add(passwordLabel);
//		
//		JPasswordField passwordField = new JPasswordField();
//		passwordField.setBounds(180,220,150,30);
//		frame.add(passwordField);
//		
//		frame.setVisible(true);
//		
//		 JButton b1 = new JButton("Enter");
//	     b1.setFont(new Font("Times New Roman", Font.BOLD, 20));
//	     
//	     b1.setBackground(Color.GRAY);
//	     b1.setForeground(Color.BLACK);
//	     b1.setBounds(100,300,100,30);
//	     frame.getContentPane().add(b1); 
//	     
//		 b1.addActionListener(new ActionListener() {
//				
//			 public void actionPerformed(ActionEvent e) {
//				 
//				String cardno = textField.getText().toString().trim();
//				String pass = new String(passwordField.getPassword());
//				new Transaction(cardno);
//				frame.dispose();
//			    }
//			 });
//
//		
//		
//		JButton b2 = new JButton("Exit");
//		b2.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//				System.exit(0);
//				}
//			
//			});
//			
//		b2.setFont(new Font("Times New Roman", Font.BOLD, 20));
//		b2.setBounds(280, 300, 100, 30);
//		b2.setBackground(Color.GRAY);
//	    b2.setForeground(Color.BLACK);
//		frame.getContentPane().add(b2);
//			
//		
//	}
//
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
//}


package swing;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Login implements ActionListener{

	
	public static void main(String[] args) {
	 startActivity();
	}


    static void startActivity() {
    	JDBCConnection jdbc = new JDBCConnection();
		JFrame frame;
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 20, 450, 530);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 35));
		lblNewLabel.setBounds(180, 30, 450, 41);
		frame.getContentPane().add(lblNewLabel);
		
		
		JLabel usernameLabel = new JLabel("Cardno:");
		usernameLabel.setBounds(80, 130, 100, 30);// x,y,width,height
		usernameLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		frame.add(usernameLabel);
		
		JTextField textField = new JTextField();
		textField.setBounds(180, 130, 150, 30);
		frame.add(textField);
		
		JLabel passwordLabel = new JLabel("Pinno:");
		passwordLabel.setBounds(80, 220, 100, 30);
		passwordLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		frame.add(passwordLabel);
		
		JPasswordField passwordField = new JPasswordField();
		passwordField.setBounds(180,220,150,30);
		frame.add(passwordField);
		
		frame.setVisible(true);
		
		 JButton loginBtn = new JButton("Enter");
		 loginBtn.setFont(new Font("Times New Roman", Font.BOLD, 20));
	     
		 loginBtn.setBackground(Color.GRAY);
		 loginBtn.setForeground(Color.BLACK);
		 loginBtn.setBounds(100,300,100,30);
	     frame.getContentPane().add(loginBtn); 
	     
	     loginBtn.addActionListener(new ActionListener() {
				
			 public void actionPerformed(ActionEvent e) {
				 
				String cardno = textField.getText().toString().trim();
				String pass = new String(passwordField.getPassword());
				int emailValue = jdbc.getDataInt("SELECT COUNT(*) FROM login WHERE cardno='"+cardno+"'");
				if(emailValue == 1) {
					String passwordStored = jdbc.getData("SELECT pinno FROM login WHERE cardno='"+cardno+"'");
					if(pass.equals(passwordStored)) {
						new Transaction(cardno, jdbc);
						frame.dispose();
					} else {
						showError("Either email or password is wrong");
					}
				} else {
					showError("Either email or password is wrong");
				}
			    }
			 });

		
		
		JButton exitBtn = new JButton("Exit");
		exitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
				}
			
			});
			
		exitBtn.setFont(new Font("Times New Roman", Font.BOLD, 20));
		exitBtn.setBounds(280, 300, 100, 30);
		exitBtn.setBackground(Color.GRAY);
		exitBtn.setForeground(Color.BLACK);
		frame.getContentPane().add(exitBtn);
			
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	static void showError(String message) {
		JOptionPane.showMessageDialog(null,
			    message,
			    "Error",
			    JOptionPane.WARNING_MESSAGE);	
	}
}