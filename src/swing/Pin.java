package swing;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

import java.awt.Font;
import java.awt.Color;

import javax.swing.JButton;
import java.awt.event.ActionListener;

import java.awt.event.ActionEvent; 

public class Pin extends JFrame implements ActionListener {

	Pin(String pinno, JDBCConnection jdbc) {
		JFrame frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 500, 405);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Please Enter a New Pin:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel.setBounds(125, 23, 328, 41);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Current Pin:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setBounds(72, 117, 120, 36);
		frame.getContentPane().add(lblNewLabel_1);

		JPasswordField passwordField = new JPasswordField();
		passwordField.setBounds(210, 128, 150, 20);
		frame.getContentPane().add(passwordField);
		passwordField.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("New Pin:");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_2.setBounds(72, 167, 120, 36);
		frame.getContentPane().add(lblNewLabel_2);

		JPasswordField passwordField1 = new JPasswordField();
		passwordField1.setBounds(210, 178, 150, 20);
		frame.getContentPane().add(passwordField1);
		passwordField1.setColumns(10);

		frame.setVisible(true);

		JButton changebtn = new JButton("Enter");
		changebtn.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (e.getSource() == changebtn) {
					String currentPin;
					String newPin;

					currentPin = passwordField.getText();
					newPin = passwordField1.getText();

					try {

						jdbc.executeQuery("update login set pinno =" + newPin + " where pinno =" + currentPin + "");

						JOptionPane.showMessageDialog(null, "Pin Changed Successfully.");
						passwordField.setText(null);
						passwordField1.setText(null);
						dispose();
						new Transaction(pinno, jdbc);

					} catch (Exception e1) {
						System.out.println(e1.getMessage());
					}
				}

			}
		});
		changebtn.setFont(new Font("Times New Roman", Font.BOLD, 18));
		changebtn.setBounds(88, 232, 89, 23);
		frame.getContentPane().add(changebtn);

		JButton exitBtn = new JButton("Exit");
		exitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		exitBtn.setFont(new Font("Times New Roman", Font.BOLD, 18));
		exitBtn.setBounds(269, 232, 89, 23);
		frame.getContentPane().add(exitBtn);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
