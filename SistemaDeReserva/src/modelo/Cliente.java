package modelo;


public class Cliente {
	private String nombre;
	private String apellidos;
	private String correo;
	private String password;

	public Cliente() {

	}

	public Cliente(String nombre, String apellidos, String correo, String password) {

		this.nombre = nombre;
		this.apellidos = apellidos;
		this.correo = correo;
		this.password = password;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}



	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", apellidos=" + apellidos + ", correo=" + correo + ", password="
				+ password + "]";
	}

}
