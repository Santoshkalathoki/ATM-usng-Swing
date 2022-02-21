package swing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class JDBCConnection {
	Connection conn;

	JDBCConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
 
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm", "root", "");
			System.out.println("Connected..");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
//		public static void main(String[] args) {
//			JDBCConnection conn = new JDBCConnection();
//	    }

	String getData(String query) {
		String toReturnData = null;
		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			rs.next();
			toReturnData = rs.getString(1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return toReturnData;
	}

	int ifExists(String query) {
		int count = 0;
		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			rs.next();
			count = rs.getInt(1);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}

	public int getDataInt(String query) {
		int toReturnData = 0;
		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			rs.next();
			toReturnData = rs.getInt(1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return toReturnData;
	}

	void executeQuery(String query) {
		try {
			Statement st = conn.createStatement();
			st.execute(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public String[][] dataSet(int count, String atmNumber) {
		String data[][] = new String[count][3];
		try {
			Statement stm = conn.createStatement();
			ResultSet res = stm
					.executeQuery("SELECT * FROM atm_transactions WHERE cardno = '" + atmNumber + "' order by date desc");
			int i = 0;
			while (res.next()) {
				String amount = res.getString("amount");
				String date = res.getString("date");
				String remarks = res.getString("remarks");
				data[i][0] = date;
				data[i][1] = amount;
				data[i][2] = remarks;
				i++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}
}