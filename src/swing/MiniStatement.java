package swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

public class MiniStatement {
	
	MiniStatement(String atmNumber, JDBCConnection jdbc) {
		JFrame frame = new JFrame();
		JButton backBtn;
		try {
			int count = jdbc.getDataInt("SELECT COUNT(*) FROM atm_transactions WHERE cardno = '"+atmNumber+"'");
			JPanel pane = new JPanel();
			pane.setLayout(null);
					 
			JLabel empty;
			if (count == 0) {
				empty = new JLabel("No Transaction History Available", SwingConstants.CENTER);
				empty.setForeground(Color.LIGHT_GRAY);
				empty.setBackground(Color.GRAY);
				empty.setBounds(150,200,300,40);
				pane.add(empty);
				
				
				
				
			} else {
				
				JButton downloadPdf = new JButton("Download PDF");
				JButton exportExcel = new JButton("Export Excel");
				JButton exit = new JButton("Exit");
				
				exportExcel.setBackground(Color.LIGHT_GRAY);
				exportExcel.setForeground(Color.BLACK);
				exportExcel.setBounds(40, 10, 200, 30);
				downloadPdf.setForeground(Color.BLACK);
				downloadPdf.setBackground(Color.LIGHT_GRAY);
				downloadPdf.setBounds(250, 10, 200, 30);
				
				exit.setFont(new Font("Times New Roman", Font.BOLD, 18));
				exit.setForeground(Color.BLACK);
				exit.setBackground(Color.LIGHT_GRAY);
				exit.setBounds(350, 400, 100, 30);
				exit.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						System.exit(0);
					}
				});
								
				String data[][] = jdbc.dataSet(count, atmNumber);
				String columns[] = { "Date", "Amount", "Remarks"};
				
				DefaultTableModel model = new DefaultTableModel(data, columns);
				JTable table = new JTable(model);
				table.setShowGrid(true);
				table.setBackground(Color.LIGHT_GRAY);
				table.setShowVerticalLines(true);

				JScrollPane scrollPane = new JScrollPane(table);
				scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
				scrollPane.setBounds(10,50,450,300);
				
					downloadPdf.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						boolean status = PDFMaker.PDFGenerate(data, count);
						if(status) {
							JOptionPane.showMessageDialog(frame,
								    "Successfully exported document to\nC:\\ATM",
								    "Export Successful",
								    JOptionPane.INFORMATION_MESSAGE);
						} else {
							JOptionPane.showMessageDialog(frame,
								    "Error Occured while exporting to pdf",
								    "Error",
								    JOptionPane.WARNING_MESSAGE);
						}
					}
				});
				

				
				pane.add(downloadPdf);
				pane.add(exportExcel);
				pane.add(exit);
				pane.add(scrollPane);
				
				
				exportExcel.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						boolean status = ExcelFileMaker.ExcelMaker(data, count);
						if(status) {
							JOptionPane.showMessageDialog(frame,
								    "Successfully exported document to\nC:\\ATM",
								    "Export Successful",
								    JOptionPane.INFORMATION_MESSAGE);
						} else {
							JOptionPane.showMessageDialog(frame,
								    "Error Occured while exporting to excel",
								    "Error",
								    JOptionPane.WARNING_MESSAGE);
						}
					}});
				
				
				
			}
			backBtn = new JButton("Back");
			backBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					new Transaction(atmNumber, jdbc);
					frame.dispose();
				}
			});
		
			backBtn.setFont(new Font("Times New Roman", Font.BOLD, 18));
			backBtn.setBounds(100, 400, 100, 30);
			backBtn.setBackground(Color.LIGHT_GRAY);
			backBtn.setForeground(Color.BLACK);
			frame.getContentPane().add(backBtn);
			
			
			
			
			frame.add(pane);
			frame.setResizable(false);
			frame.setBounds(100, 20, 500, 500);
			frame.getContentPane().setBackground(Color.LIGHT_GRAY);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
			
		} catch (Exception ee) {
			
		}
		
	}
}