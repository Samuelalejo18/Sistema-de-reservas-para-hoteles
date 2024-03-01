package modelo;

import java.sql.*;

;

public class Conexion {
	public Connection con = null;

	public static Connection Conectar() {
		Connection cn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bsreserva", "root", "123456789");
		} catch (Exception e) {

			System.out.println(String.valueOf(e));
		}
		return cn;
	}
}
