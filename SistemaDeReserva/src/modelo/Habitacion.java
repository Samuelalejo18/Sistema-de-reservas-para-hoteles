package modelo;

public class Habitacion {
	private String tipo;
	private int capacidad;
	private boolean disponible;
	private double precioPorNoche;

	
	
	public Habitacion() {
		
	}

	public Habitacion(String tipo, int capacidad, boolean disponible, double precioPorNoche) {
		
		this.tipo = tipo;
		this.capacidad = capacidad;
		this.disponible = disponible;
		this.precioPorNoche = precioPorNoche;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public double getPrecioPorNoche() {
		return precioPorNoche;
	}

	public void setPrecioPorNoche(double precioPorNoche) {
		this.precioPorNoche = precioPorNoche;
	}

	@Override
	public String toString() {
		return "Habitacion [tipo=" + tipo + ", capacidad=" + capacidad + ", disponible=" + disponible
				+ ", precioPorNoche=" + precioPorNoche + "]";
	}
}
