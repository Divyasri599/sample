/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MUTHINA
 */
package bank;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dbconnection {
	private static Connection con;
	private static Connection con1;

	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "root");
		} catch (Exception e) {
                    System.out.println("not connected");
		}
		return con;
	}

}


