package modelo;

import java.sql.*;

public class Auth {
	public static boolean InsertarCliente(Cliente cliente) {
		Connection cn = Conexion.Conectar();
		PreparedStatement ps = null;

		String sql = "insert into cliente(nombre, apellido, correo, password) values(?,?,?,?,)";
		try {
			ps = cn.prepareStatement(sql);
			ps.setString(1, cliente.getNombre());
			ps.setString(2, cliente.getApellidos());
			ps.setString(3, cliente.getCorreo());
			ps.setString(4, cliente.getPassword());
			ps.execute();
			cn.close();

		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}

	public static boolean Autentticacion(String correo, String password) {
		Connection cn = Conexion.Conectar();
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select correo, password from cliente where correo=? and pass=? ";
		try {
			ps = cn.prepareStatement(sql);
			ps.setString(1, correo);
			ps.setString(1, password);
			rs = ps.executeQuery();

			while (rs.next()) {
				cn.close();
				return true;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;

	}
}
