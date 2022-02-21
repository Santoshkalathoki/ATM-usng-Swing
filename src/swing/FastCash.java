//
//package swing;
//
//import java.awt.*;
//import java.awt.event.*;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
//
//import javax.swing.*;
//
//
//public class FastCash extends JFrame implements ActionListener{
//
//    JLabel l1;
//    JButton b1,b2,b3,b4,b5,b6,b7;
//    JFrame frame;
//    
//    FastCash(){
//        
//
//        l1 = new JLabel("Please Select Your Amount");
//        l1.setFont(new Font("Times New Roman", Font.BOLD, 20));
//    
//       
//        b1 = new JButton("10000");
//        b1.setFont(new Font("Times New Roman", Font.BOLD, 15));
//        b1.setBackground(Color.GRAY);
//        b1.setForeground(Color.BLACK);
//        b1.addActionListener(new ActionListener() {
//			
//			 public void actionPerformed(ActionEvent ae) {
//				 
//        try{        
//	           
//	           
//            int Balance = 0;
//            
//            if(ae.getSource()==b1){
//                Conn c = new Conn();
//    			ResultSet rs = c.s.executeQuery(" select * from login where Balance = '"+Balance+"' ");
//                    if(rs.next()){
//                    	JOptionPane.showMessageDialog(null, "Rs. "+1000+" Debited Successfully");
//                        
//           }
//                    
//                    
//                    else { 
//                    JOptionPane.showMessageDialog(null,"yo do not have enough balance");
//                    
//                    new Transaction().setVisible(true);
//                    setVisible(false);
//                    }
//            }
//     
//         }catch(Exception e1){
//            e1.printStackTrace();
//            System.out.println("error: "+e1);
//         }
//			 }
//        
//            });
// 
//			 
//    
//        b2 = new JButton("1000");
//        b2.setFont(new Font("Times New Roman", Font.BOLD, 15));
//        b2.setBackground(Color.GRAY);
//        b2.setForeground(Color.BLACK);
//        b2.addActionListener(new ActionListener() {
//			
//			 public void actionPerformed(ActionEvent ae) {
//				 
//       try{        
//	           
//	           
//           int Balance = 0;
//           
//           if(ae.getSource()==b2){
//               Conn c = new Conn();
//   			ResultSet rs = c.s.executeQuery(" select * from login where Balance = '"+Balance+"' ");
//                   if(rs.next()){
//                   	JOptionPane.showMessageDialog(null, "Rs. "+1000+" Debited Successfully");
//                       
//          }
//                   
//                   
//                   else { 
//                   JOptionPane.showMessageDialog(null,"yo do not have enough balance");
//                   
//                   new Transaction().setVisible(true);
//                   setVisible(false);
//                   }
//           }
//    
//        }catch(Exception e1){
//           e1.printStackTrace();
//           System.out.println("error: "+e1);
//        }
//			 }
//       
//           });
//
//        
//        
//        b3 = new JButton("15000");
//        b3.setFont(new Font("Times New Roman", Font.BOLD, 15));
//        b3.setBackground(Color.GRAY);
//        b3.setForeground(Color.BLACK);
//        b3.addActionListener(new ActionListener() {
//			
//			 public void actionPerformed(ActionEvent ae) {
//				 
//       try{        
//	           
//	           
//           int Balance = 0;
//           
//           if(ae.getSource()==b3){
//               Conn c = new Conn();
//   			ResultSet rs = c.s.executeQuery(" select * from login where Balance = '"+Balance+"' ");
//                   if(rs.next()){
//                   	JOptionPane.showMessageDialog(null, "Rs. "+1500+" Debited Successfully");
//                       
//          }
//                   
//                   
//                   else { 
//                   JOptionPane.showMessageDialog(null,"yo do not have enough balance");
//                   
//                   new Transaction().setVisible(true);
//                   setVisible(false);
//                   }
//           }
//    
//        }catch(Exception e1){
//           e1.printStackTrace();
//           System.out.println("error: "+e1);
//        }
//			 }
//       
//           });
//
//        
//        b4 = new JButton("3000");
//        b4.setFont(new Font("TImes new Roman", Font.BOLD, 15));
//        b4.setBackground(Color.GRAY);
//        b4.setForeground(Color.BLACK);
//        b4.addActionListener(new ActionListener() {
//			
//			 public void actionPerformed(ActionEvent ae) {
//				 
//       try{        
//	           
//	           
//           int Balance = 0;
//           
//           if(ae.getSource()==b4){
//               Conn c = new Conn();
//   			ResultSet rs = c.s.executeQuery(" select * from login where Balance = '"+Balance+"' ");
//                   if(rs.next()){
//                   	JOptionPane.showMessageDialog(null, "Rs. "+3000+" Debited Successfully");
//                       
//          }
//                   
//                   
//                   else { 
//                   JOptionPane.showMessageDialog(null,"yo do not have enough balance");
//                   
//                   new Transaction().setVisible(true);
//                   setVisible(false);
//                   }
//           }
//    
//        }catch(Exception e1){
//           e1.printStackTrace();
//           System.out.println("error: "+e1);
//        }
//			 }
//       
//           });
//
//        
//        b5 = new JButton("20000");
//        b5.setFont(new Font("Times New Roman", Font.BOLD, 15));
//        b5.setBackground(Color.GRAY);
//        b5.setForeground(Color.BLACK);
//        b5.addActionListener(new ActionListener() {
//			
//			 public void actionPerformed(ActionEvent ae) {
//				 
//       try{        
//	           
//	           
//           int Balance = 0;
//           
//           if(ae.getSource()==b5){
//               Conn c = new Conn();
//   			ResultSet rs = c.s.executeQuery(" select * from login where Balance = '"+Balance+"' ");
//                   if(rs.next()){
//                   	JOptionPane.showMessageDialog(null, "Rs. "+20000+" Debited Successfully");
//                       
//          }
//                   
//                   
//                   else { 
//                   JOptionPane.showMessageDialog(null,"yo do not have enough balance");
//                   
//                   new Transaction().setVisible(true);
//                   setVisible(false);
//                   }
//           }
//    
//        }catch(Exception e1){
//           e1.printStackTrace();
//           System.out.println("error: "+e1);
//        }
//			 }
//       
//           });
//
//        
//        b6 = new JButton("5000");
//        b6.setFont(new Font("Times New Roman", Font.BOLD, 15));
//        b6.setBackground(Color.GRAY);
//        b6.setForeground(Color.BLACK);
//        b6.addActionListener(new ActionListener() {
//			
//			 public void actionPerformed(ActionEvent ae) {
//				 
//       try{        
//	           
//	           
//           int Balance = 0;
//           
//           if(ae.getSource()==b6){
//               Conn c = new Conn();
//   			ResultSet rs = c.s.executeQuery(" select * from login where Balance = '"+Balance+"' ");
//                   if(rs.next()){
//                   	JOptionPane.showMessageDialog(null, "Rs. "+5000+" Debited Successfully");
//                       
//          }
//                   
//                   
//                   else { 
//                   JOptionPane.showMessageDialog(null,"yo do not have enough balance");
//                   
//                   new Transaction().setVisible(true);
//                   setVisible(false);
//                   }
//           }
//    
//        }catch(Exception e1){
//           e1.printStackTrace();
//           System.out.println("error: "+e1);
//        }
//			 }
//       
//           });
//
//        
//        b7 = new JButton("EXIT");
//        b7.setFont(new Font("Times New Roman", Font.BOLD, 15));
//        b7.setBackground(Color.GRAY);
//        b7.setForeground(Color.BLACK);
//        
//        
//        setLayout(null);
//        
//        l1.setBounds(50,50,700,40);
//        add(l1);
//        
//        b1.setBounds(20,150,150,60);
//        add(b1);
//        
//        b2.setBounds(250,150,150,60);
//        add(b2);
//        
//        b3.setBounds(20,250,150,60);
//        add(b3);
//        
//        b4.setBounds(250,250,150,60);
//        add(b4);
//        
//        b5.setBounds(20,360,150,60);
//        add(b5);
//        
//        b6.setBounds(250,360,150,60);
//        add(b6);
//        
//        b7.setBounds(160,440,100,40);
//        add (b7);
//        b7.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//				System.exit(0);
//			}
//		});
//        
//        
//        b1.addActionListener(this);
//        b2.addActionListener(this);
//        b3.addActionListener(this);
//        b4.addActionListener(this);
//        b5.addActionListener(this);
//        b6.addActionListener(this);
//         
//        
//        getContentPane().setBackground(Color.LIGHT_GRAY);
//        
//        setSize(450,530);
//        setLocation(100,20);
//        setVisible(true);
//        
//       
//        
//    }
//    
//
//    
//    public static void main(String[] args){
//        new FastCash();
//    }
//
//
//
//	@Override
//	public void actionPerformed(ActionEvent ae) {
//		// TODO Auto-generated method stub
//	}
//}
////		 try{        
////	           
////	           
////	            double Balance = 0;
////	            
////	            if(ae.getSource()==b1){
////	                
////	            	Class.forName("com.mysql.cj.jdbc.Driver");		
////
////	    			String URL = "jdbc:mysql://localhost:3306/atm";
////	    			String username = "root";
////	    			String password = ""; 
////	    			Connection c = DriverManager.getConnection(URL, username, password);
////	    			Statement s = c.createStatement();
////	    			ResultSet rs = s.executeQuery(" select * from login where Balance = '"+Balance+"' ");
////	                    if(rs.next()){
////	                        String pinno1 = rs.getString("pinno");
////	                        
////	                        Balance = rs.getDouble("Balance");
////	                     
////	                        Balance-=100;
////	                        String q1= "insert into login values('"+pinno1+"',null,100,'"+Balance+"')";
////	                    	                    }
////	                    
////	                    
////	                    
////	                    JOptionPane.showMessageDialog(null, "Rs. "+100+" Debited Successfully");
////	                    
////	                    new Transactions().setVisible(true);
////	                    setVisible(false);
////	                    
////	                    
////	                    
////	            }
////	                
////	            
////	            else if(ae.getSource()==b2){
////	                
////	                    conn c1 = new conn();
////	                    
////	                    ResultSet rs = c1.s.executeQuery(" select * from login where pinno = '"+pinno+"' ");
////	                    
////	                    
////	                    if(rs.next()){
////	                        String pinno1 = rs.getString("pinno1");
////	                        
////	                        Balance = rs.getDouble("Balance");
////	                     
////	                        Balance-=500;
////	                        String q1= "insert into login values('"+pinno1+"',null,500,'"+Balance+"')";
////	                    
////	                        c1.s.executeUpdate(q1);
////	                    }
////	                    
////	                    
////	                    
////	                    JOptionPane.showMessageDialog(null, "Rs. "+500+" Debited Successfully");
////	                    
////	                    new Transactions().setVisible(true);
////	                    setVisible(false);
////	                    
////	                    
////	                    
////	                }
////	            else if(ae.getSource()==b3){
////	                
////	                    conn c1 = new conn();
////	                    
////	                    ResultSet rs = c1.s.executeQuery(" select * from login where pinno = '"+pinno+"' ");
////	                    
////	                    
////	                    if(rs.next()){
////	                        String pinno1 = rs.getString("pinno");
////	                        
////	                        Balance = rs.getDouble("Balance");
////	                     
////	                        Balance-=1000;
////	                        String q1= "insert into login values('"+pinno1+"',null,1000,'"+Balance+"')";
////	                    
////	                        c1.s.executeUpdate(q1);
////	                    }
////	                    
////	                    
////	                    
////	                    JOptionPane.showMessageDialog(null, "Rs. "+1000+" Debited Successfully");
////	                    
////	                    new Transactions().setVisible(true);
////	                    setVisible(false);
////	                    
////	                    
////	                    
////	                }
////	            else if(ae.getSource()==b4){
////	                
////	                    conn c1 = new conn();
////	                    
////	                    ResultSet rs = c1.s.executeQuery(" select * from login where pinno = '"+pinno+"' ");
////	                    
////	                    
////	                    if(rs.next()){
////	                        String pinno1 = rs.getString("pinno");
////	                        
////	                        Balance = rs.getDouble("Balance");
////	                     
////	                        Balance-=2000;
////	                        String q1= "insert into bank values('"+pinno1+"',null,2000,'"+Balance+"')";
////	                    
////	                        c1.s.executeUpdate(q1);
////	                    }
////	                    
////	                    
////	                    
////	                    JOptionPane.showMessageDialog(null, "Rs. "+2000+" Debited Successfully");
////	                    
////	                    new Transactions().setVisible(true);
////	                    setVisible(false);
////	                    
////	                    
////	                    
////	                }
////	            else if(ae.getSource()==b5){
////	                
////	                    conn c1 = new conn();
////	                    
////	                    ResultSet rs = c1.s.executeQuery(" select * from login where pinno = '"+pinno+"' ");
////	                    
////	                    
////	                    if(rs.next()){
////	                        String pinno1 = rs.getString("pinno");
////	                        
////	                        Balance = rs.getDouble("Balance");
////	                     
////	                        Balance-=5000;
////	                        String q1= "insert into login values('"+pinno1+"',null,5000,'"+Balance+"')";
////	                    
////	                        c1.s.executeUpdate(q1);
////	                    }
////	                    
////	                    
////	                    
////	                    JOptionPane.showMessageDialog(null, "Rs. "+5000+" Debited Successfully");
////	                    
////	                    new Transactions().setVisible(true);
////	                    setVisible(false);
////	                    
////	                    
////	                    
////	                }
////	            else if(ae.getSource()==b6){
////	                
////	                    conn c1 = new conn();
////	                    
////	                    ResultSet rs = c1.s.executeQuery(" select * from login where pinno = '"+pinno+"' ");
////	                    
////	                    
////	                    if(rs.next()){
////	                        String pinno1 = rs.getString("pinno");
////	                        
////	                        Balance = rs.getDouble("Balance");
////	                     
////	                        Balance-=10000;
////	                        String q1= "insert into login values('"+pinno1+"',null,10000,'"+Balance+"')";
////	                    
////	                        c1.s.executeUpdate(q1);
////	                    }
////	                    
////	                    
////	                    
////	                    JOptionPane.showMessageDialog(null, "Rs. "+10000+" Debited Successfully");
////	                    
////	                    new Transactions().setVisible(true);
////	                    setVisible(false);
////	                    
////	                    
////	                    
////	                }
////	                
////	            
////	            else if(ae.getSource()==b7){
////	                
////	                System.exit(0);
////	                
////	            }
////	        }catch(Exception e){
////	                e.printStackTrace();
////	                System.out.println("error: "+e);
////	        }
////	            
////	    }
////
////	    
////		
////	}
////
////}

package swing;

import java.awt.*;
import java.awt.event.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.*;

public class FastCash extends JFrame implements ActionListener {
	FastCash(String atmNumber, JDBCConnection jdbc) {

		JButton TenthousandBtn, ThousandBtn, Fifteenthousandbtn, ThreethousandBtn, TwentythousandBtn, FiveThousandBtn, exitBtn, backBtn;
		JLabel Textlabel;
	

		Textlabel = new JLabel("Please Select Your Amount");
		Textlabel.setFont(new Font("Times New Roman", Font.BOLD, 20));

		TenthousandBtn = new JButton("10000");
		TenthousandBtn.setFont(new Font("Times New Roman", Font.BOLD, 15));
		TenthousandBtn.setBackground(Color.GRAY);
		TenthousandBtn.setForeground(Color.BLACK);

		TenthousandBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int getBalance = getBalanceFromDB(atmNumber, jdbc);
				if (getBalance >= 10000) {
					boolean status = performTransaction(atmNumber, 10000, jdbc);
					if (status == true) {
						int remainingBalance = getBalanceFromDB(atmNumber, jdbc);
						JOptionPane.showMessageDialog(null,
								"Withdrawed 10000 successfully\nAvailable Balance: " + remainingBalance + "", "Success",
								JOptionPane.INFORMATION_MESSAGE);
						new Transaction(atmNumber, jdbc);
						dispose();
					} else {
						JOptionPane.showMessageDialog(null, "Error withdrawing balance", "Error",
								JOptionPane.WARNING_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(null, "Insufficient Balance", "Error", JOptionPane.WARNING_MESSAGE);
				}
			}
		});

		ThousandBtn = new JButton("1000");
		ThousandBtn.setFont(new Font("Times New Roman", Font.BOLD, 15));
		ThousandBtn.setBackground(Color.GRAY);
		ThousandBtn.setForeground(Color.BLACK);
		ThousandBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int getBalance = getBalanceFromDB(atmNumber, jdbc);
				if (getBalance >= 1000) {
					boolean status = performTransaction(atmNumber, 1000, jdbc);
					if (status == true) {
						int remainingBalance = getBalanceFromDB(atmNumber, jdbc);
						JOptionPane.showMessageDialog(null,
								"Withdrawed 1000 successfully\nAvailable Balance: " + remainingBalance + "", "Success",
								JOptionPane.INFORMATION_MESSAGE);
						new Transaction(atmNumber, jdbc);
						dispose();
					} else {
						JOptionPane.showMessageDialog(null, "Error withdrawing balance", "Error",
								JOptionPane.WARNING_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(null, "Insufficient Balance", "Error", JOptionPane.WARNING_MESSAGE);
				}
			}
		});

		Fifteenthousandbtn = new JButton("15000");
		Fifteenthousandbtn.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Fifteenthousandbtn.setBackground(Color.GRAY);
		Fifteenthousandbtn.setForeground(Color.BLACK);
		Fifteenthousandbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int getBalance = getBalanceFromDB(atmNumber, jdbc);
				if (getBalance >= 15000) {
					boolean status = performTransaction(atmNumber, 15000, jdbc);
					if (status == true) {
						int remainingBalance = getBalanceFromDB(atmNumber, jdbc);
						JOptionPane.showMessageDialog(null,
								"Withdrawed 15000 successfully\nAvailable Balance: " + remainingBalance + "", "Success",
								JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(null, "Error withdrawing balance", "Error",
								JOptionPane.WARNING_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(null, "Insufficient Balance", "Error", JOptionPane.WARNING_MESSAGE);
				}
			}
		});

		ThreethousandBtn = new JButton("3000");
		ThreethousandBtn.setFont(new Font("TImes new Roman", Font.BOLD, 15));
		ThreethousandBtn.setBackground(Color.GRAY);
		ThreethousandBtn.setForeground(Color.BLACK);
		ThreethousandBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int getBalance = getBalanceFromDB(atmNumber, jdbc);
				if (getBalance >= 3000) {
					boolean status = performTransaction(atmNumber, 3000, jdbc);
					if (status == true) {
						int remainingBalance = getBalanceFromDB(atmNumber, jdbc);
						JOptionPane.showMessageDialog(null,
								"Withdrawed 3000 successfully\nAvailable Balance: " + remainingBalance + "", "Success",
								JOptionPane.INFORMATION_MESSAGE);
						new Transaction(atmNumber, jdbc);
						dispose();
					} else {
						JOptionPane.showMessageDialog(null, "Error withdrawing balance", "Error",
								JOptionPane.WARNING_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(null, "Insufficient Balance", "Error", JOptionPane.WARNING_MESSAGE);
				}
			}
		});

		TwentythousandBtn = new JButton("20000");
		TwentythousandBtn.setFont(new Font("Times New Roman", Font.BOLD, 15));
		TwentythousandBtn.setBackground(Color.GRAY);
		TwentythousandBtn.setForeground(Color.BLACK);
		TwentythousandBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int getBalance = getBalanceFromDB(atmNumber, jdbc);
				if (getBalance >= 20000) {
					boolean status = performTransaction(atmNumber, 20000, jdbc);
					if (status == true) {
						int remainingBalance = getBalanceFromDB(atmNumber, jdbc);
						JOptionPane.showMessageDialog(null,
								"Withdrawed 20000 successfully\nAvailable Balance: " + remainingBalance + "", "Success",
								JOptionPane.INFORMATION_MESSAGE);
						new Transaction(atmNumber, jdbc);
						dispose();
					} else {
						JOptionPane.showMessageDialog(null, "Error withdrawing balance", "Error",
								JOptionPane.WARNING_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(null, "Insufficient Balance", "Error", JOptionPane.WARNING_MESSAGE);
				}
			}
		});

		FiveThousandBtn = new JButton("5000");
		FiveThousandBtn.setFont(new Font("Times New Roman", Font.BOLD, 15));
		FiveThousandBtn.setBackground(Color.GRAY);
		FiveThousandBtn.setForeground(Color.BLACK);
		FiveThousandBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int getBalance = getBalanceFromDB(atmNumber, jdbc);
				if (getBalance >= 5000) {
					boolean status = performTransaction(atmNumber, 5000, jdbc);
					if (status == true) {
						int remainingBalance = getBalanceFromDB(atmNumber, jdbc);
						JOptionPane.showMessageDialog(null,
								"Withdrawed 5000 successfully\nAvailable Balance: " + remainingBalance + "", "Success",
								JOptionPane.INFORMATION_MESSAGE);
						new Transaction(atmNumber, jdbc);
						dispose();
					} else {
						JOptionPane.showMessageDialog(null, "Error withdrawing balance", "Error",
								JOptionPane.WARNING_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(null, "Insufficient Balance", "Error", JOptionPane.WARNING_MESSAGE);
				}
			}
		});

		exitBtn = new JButton("EXIT");
		exitBtn.setFont(new Font("Times New Roman", Font.BOLD, 15));
		exitBtn.setBackground(Color.GRAY);
		exitBtn.setForeground(Color.BLACK);
		
		backBtn = new JButton("BACK");
		backBtn.setFont(new Font("Times New Roman", Font.BOLD, 15));
		backBtn.setBackground(Color.GRAY);
		backBtn.setForeground(Color.BLACK);

		setLayout(null);

		Textlabel.setBounds(50, 50, 700, 40);
		add(Textlabel);

		TenthousandBtn.setBounds(20, 150, 150, 60);
		add(TenthousandBtn);

		ThousandBtn.setBounds(250, 150, 150, 60);
		add(ThousandBtn);

		Fifteenthousandbtn.setBounds(20, 250, 150, 60);
		add(Fifteenthousandbtn);

		ThreethousandBtn.setBounds(250, 250, 150, 60);
		add(ThreethousandBtn);

		TwentythousandBtn.setBounds(20, 360, 150, 60);
		add(TwentythousandBtn);

		FiveThousandBtn.setBounds(250, 360, 150, 60);
		add(FiveThousandBtn);

		exitBtn.setBounds(80, 440, 100, 40);
		add(exitBtn);
		exitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		
		backBtn.setBounds(250, 440, 100, 40);
		add(backBtn);
		backBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Transaction(atmNumber, jdbc);
				dispose();
			}
		});


		TenthousandBtn.addActionListener(this);
		ThousandBtn.addActionListener(this);
		Fifteenthousandbtn.addActionListener(this);
		ThreethousandBtn.addActionListener(this);
		TwentythousandBtn.addActionListener(this);
		FiveThousandBtn.addActionListener(this);
		exitBtn.addActionListener(this);
		backBtn.addActionListener(this);

		getContentPane().setBackground(Color.LIGHT_GRAY);

		setSize(450, 530);
		setLocation(100, 20);
		setVisible(true);
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

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}