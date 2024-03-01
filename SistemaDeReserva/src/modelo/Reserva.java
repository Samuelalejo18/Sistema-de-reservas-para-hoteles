package modelo;

import java.sql.Date;

public class Reserva {
	private Cliente cliente;
	private Date fechaEntrada;
	private Date fechaSalida;
	private Habitacion habitacionReservada;
	private double precioTotal;

	public Reserva(Cliente cliente, Date fechaEntrada, Date fechaSalida, Habitacion habitacionReservada,
			double precioTotal) {

		this.cliente = cliente;
		this.fechaEntrada = fechaEntrada;
		this.fechaSalida = fechaSalida;
		this.habitacionReservada = habitacionReservada;
		this.precioTotal = precioTotal;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Date getFechaEntrada() {
		return fechaEntrada;
	}

	public void setFechaEntrada(Date fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	public Date getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public Habitacion getHabitacionReservada() {
		return habitacionReservada;
	}

	public void setHabitacionReservada(Habitacion habitacionReservada) {
		this.habitacionReservada = habitacionReservada;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}

	@Override
	public String toString() {
		return "Reserva [cliente=" + cliente + ", fechaEntrada=" + fechaEntrada + ", fechaSalida=" + fechaSalida
				+ ", habitacionReservada=" + habitacionReservada + ", precioTotal=" + precioTotal + "]";
	}

}
