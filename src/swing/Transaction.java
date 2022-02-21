//
//package swing;
//
//import java.awt.*;
//import java.awt.event.*;
//import javax.swing.*;
//
//
//public class Transaction extends JFrame implements ActionListener{
//
//    JLabel l1;
//    JButton b1,b2,b3,b4,b5,b6,b7;
//    JFrame frame;
//    
//    public static void main(String[] args) {
//    	new Transaction(); 
//    	}
//    
//    
//    Transaction(){       
//    	
//        l1 = new JLabel("Please Select Your Transaction");
//        l1.setFont(new Font("System", Font.BOLD, 20));
//        
//    
//       
//        b1 = new JButton("DEPOSIT");
//        b1.setFont(new Font("Times New Roman", Font.BOLD, 15));
//        b1.setBackground(Color.GRAY);
//        b1.setForeground(Color.BLACK);
//        b1.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				Deposit.main(null);
//				
//				
//					
//				}
//				
//		});
//        
//    
//        b2 = new JButton("CASH WITHDRAWL");
//        b2.setFont(new Font("Times New Roman", Font.BOLD, 15));
//        b2.setBackground(Color.GRAY);
//        b2.setForeground(Color.BLACK);
//        b2.addActionListener(new ActionListener() {
//			
//
//			public void actionPerformed(ActionEvent e) {
//				
//
//					Withdraw.main(null);
//					
//					
//					
//				}
//		});
//        
//        
//        b3 = new JButton("FAST CASH");
//        b3.setFont(new Font("Times New Roman", Font.BOLD, 15));
//        b3.setBackground(Color.GRAY);
//        b3.setForeground(Color.BLACK);
//        
//		b3.addActionListener(new ActionListener() {
//			
//
//			public void actionPerformed(ActionEvent e) {
//				
//
//					BankAccount.main(null);
//					
//					
//				}
//				
//
//		});
//        
//        
//        b4 = new JButton("MINI STATEMENT");
//        b4.setFont(new Font("TImes new Roman", Font.BOLD, 15));
//        b4.setBackground(Color.GRAY);
//        b4.setForeground(Color.BLACK);
//        
//        b5 = new JButton("PIN CHANGE");
//        b5.setFont(new Font("Times New Roman", Font.BOLD, 15));
//        b5.setBackground(Color.GRAY);
//        b5.setForeground(Color.BLACK);
//        b5.addActionListener(new ActionListener() {
//        public void actionPerformed(ActionEvent e) {
//				Pin.main(null);
//				
//
//		}
//    });
//        
//        b6 = new JButton("BALANCE ENQUIRY");
//        b6.setFont(new Font("Times New Roman", Font.BOLD, 15));
//        b6.setBackground(Color.GRAY);
//        b6.setForeground(Color.BLACK);
//        b6.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//    				BalanceEnquiry.main(null);
//    				
//    				
//
//    		}
//        });
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
////        b1.addActionListener(this);
////        b2.addActionListener(this);
////        b3.addActionListener(this);
////        b4.addActionListener(this);
////        b5.addActionListener(this);
////        b6.addActionListener(this);
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
//
//
//}

//package swing;
//
//import java.awt.*;
//import java.awt.event.*;
//import javax.swing.*;
//
//
//public class Transaction extends JFrame implements ActionListener{
//    
//    Transaction(String atmNumber,JDBCConnection jdbc){   
//        JLabel l1;
//        JButton b1,b2,b3,b4,b5,b6,b7;
//    	
//        l1 = new JLabel("Please Select Your Transaction");
//        l1.setFont(new Font("System", Font.BOLD, 20));
//        
//    
//       
//        b1 = new JButton("DEPOSIT");
//        b1.setFont(new Font("Times New Roman", Font.BOLD, 15));
//        b1.setBackground(Color.GRAY);
//        b1.setForeground(Color.BLACK);
//        b1.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				Deposit.main(null);
//				}
//				
//		});
//        
//    
//        b2 = new JButton("CASH WITHDRAWL");
//        b2.setFont(new Font("Times New Roman", Font.BOLD, 15));
//        b2.setBackground(Color.GRAY);
//        b2.setForeground(Color.BLACK);
//        b2.addActionListener(new ActionListener() {
//			
//
//			public void actionPerformed(ActionEvent e) {
//				
//
//					Withdraw.main(null);
//					
//					
//					
//				}
//		});
//        
//        
//        b3 = new JButton("FAST CASH");
//        b3.setFont(new Font("Times New Roman", Font.BOLD, 15));
//        b3.setBackground(Color.GRAY);
//        b3.setForeground(Color.BLACK);
//        
//		b3.addActionListener(new ActionListener() {
//			
//
//			public void actionPerformed(ActionEvent e) {
//				
//
//					BankAccount.main(null);
//					
//					
//				}
//				
//
//		});
//        
//        
//        b4 = new JButton("MINI STATEMENT");
//        b4.setFont(new Font("TImes new Roman", Font.BOLD, 15));
//        b4.setBackground(Color.GRAY);
//        b4.setForeground(Color.BLACK);
//        
//        b5 = new JButton("PIN CHANGE");
//        b5.setFont(new Font("Times New Roman", Font.BOLD, 15));
//        b5.setBackground(Color.GRAY);
//        b5.setForeground(Color.BLACK);
//        b5.addActionListener(new ActionListener() {
//        public void actionPerformed(ActionEvent e) {
//				Pin.main(null);
//				
//
//		}
//    });
//        
//        b6 = new JButton("BALANCE ENQUIRY");
//        b6.setFont(new Font("Times New Roman", Font.BOLD, 15));
//        b6.setBackground(Color.GRAY);
//        b6.setForeground(Color.BLACK);
//        b6.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//    				BalanceEnquiry.main(null);
//    				
//    				
//
//    		}
//        });
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
////        b1.addActionListener(this);
////        b2.addActionListener(this);
////        b3.addActionListener(this);
////        b4.addActionListener(this);
////        b5.addActionListener(this);
////        b6.addActionListener(this);
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
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
//}

package swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Transaction extends JFrame implements ActionListener{
    
    Transaction(String atmNumber, JDBCConnection jdbc){   
        JLabel textlabel;
        JButton depositBtn, withdrawBtn, fastcashBtn, statementBtn, pinBtn, enquiryBtn, exitBtn;
    	
        textlabel = new JLabel("Please Select Your Transaction");
        textlabel.setFont(new Font("System", Font.BOLD, 20));
        
    
       
        depositBtn = new JButton("DEPOSIT");
        depositBtn.setFont(new Font("Times New Roman", Font.BOLD, 13));
        depositBtn.setBackground(Color.GRAY);
        depositBtn.setForeground(Color.BLACK);
        depositBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Deposit(atmNumber, jdbc);
                dispose();
									}
				
		});
        
    
        withdrawBtn = new JButton("CASH WITHDRAWL");
        withdrawBtn.setFont(new Font("Times New Roman", Font.BOLD, 13));
        withdrawBtn.setBackground(Color.GRAY);
        withdrawBtn.setForeground(Color.BLACK);
        withdrawBtn.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
				

				new Withdraw(atmNumber, jdbc);
                dispose();
					
					
				}
		});
        
        
        fastcashBtn = new JButton("FAST CASH");
        fastcashBtn.setFont(new Font("Times New Roman", Font.BOLD, 13));
        fastcashBtn.setBackground(Color.GRAY);
        fastcashBtn.setForeground(Color.BLACK);        
        fastcashBtn.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
                new FastCash(atmNumber, jdbc);
                dispose();
				}
				

		});
        
        
        statementBtn = new JButton("MINI STATEMENT");
        statementBtn.setFont(new Font("TImes new Roman", Font.BOLD, 13));
        statementBtn.setBackground(Color.GRAY);
        statementBtn.setForeground(Color.BLACK);
        statementBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                 new MiniStatement(atmNumber, jdbc);
                 dispose();
    
            }
        });
        
        
        pinBtn = new JButton("PIN CHANGE");
        pinBtn.setFont(new Font("Times New Roman", Font.BOLD, 13));
        pinBtn.setBackground(Color.GRAY);
        pinBtn.setForeground(Color.BLACK);
        pinBtn.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        	
             new Pin(atmNumber, jdbc);
				dispose();

		}
    });
        
        enquiryBtn = new JButton("BALANCE ENQUIRY");
        enquiryBtn.setFont(new Font("Times New Roman", Font.BOLD, 13));
        enquiryBtn.setBackground(Color.GRAY);
        enquiryBtn.setForeground(Color.BLACK);
        enquiryBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int balance = jdbc.getDataInt("SELECT Balance FROM login WHERE cardno ="+atmNumber+"");    				
                JOptionPane.showMessageDialog(null,
							    "Your balance is "+balance+"",
							    "Balance Enquiry",
							    JOptionPane.INFORMATION_MESSAGE);
    		}
        });
        
        exitBtn = new JButton("EXIT");
        exitBtn.setFont(new Font("Times New Roman", Font.BOLD, 13));
        exitBtn.setBackground(Color.GRAY);
        exitBtn.setForeground(Color.BLACK);
        
        
        setLayout(null);
        
        textlabel.setBounds(50,50,700,40);
        add(textlabel);
        
        depositBtn.setBounds(20,150,180,60);
        add(depositBtn);
        
        withdrawBtn.setBounds(220,150,180,60);
        add(withdrawBtn);
        
        fastcashBtn.setBounds(20,250,180,60);
        add(fastcashBtn);
        
        statementBtn.setBounds(220,250,180,60);
        add(statementBtn);
        
        pinBtn.setBounds(20,360,180,60);
        add(pinBtn);
        
        enquiryBtn.setBounds(220,360,180,60);
        add(enquiryBtn);
        
        exitBtn.setBounds(160,440,100,40);
        add (exitBtn);
        exitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
        
        
        getContentPane().setBackground(Color.LIGHT_GRAY);
        
        setSize(450,530);
        setLocation(100,20);
        setVisible(true);
        
       
        
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}