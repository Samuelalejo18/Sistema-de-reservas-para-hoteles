package modelo;

public class Hotel {
	private String nombre;
	private String ubicacion;
	private int numeroHabitaciones;
	private double tarifas;

	public Hotel() {

	}

	public Hotel(String nombre, String ubicacion, int numeroHabitaciones, double tarifas) {

		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.numeroHabitaciones = numeroHabitaciones;
		this.tarifas = tarifas;
	}

	public int getNumeroHabitaciones() {
		return numeroHabitaciones;
	}

	public void setNumeroHabitaciones(int numeroHabitaciones) {
		this.numeroHabitaciones = numeroHabitaciones;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public double getTarifas() {
		return tarifas;
	}

	public void setTarifas(double tarifas) {
		this.tarifas = tarifas;
	}

	@Override
	public String toString() {
		return "Hotel [nombre=" + nombre + ", ubicacion=" + ubicacion + ", numeroHabitaciones=" + numeroHabitaciones
				+ ", tarifas=" + tarifas + "]";
	}



}
