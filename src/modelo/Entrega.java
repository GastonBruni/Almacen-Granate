package modelo;

import java.time.LocalDate;

public class Entrega {
	protected int id;
	protected LocalDate fecha;
	protected boolean efectivo;

	public Entrega(int id, LocalDate fecha, boolean efectivo) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.efectivo = efectivo;
	}

	public Entrega() {

	}

	public int getId() {
		return id;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public boolean isEfectivo() {
		return efectivo;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public void setEfectivo(boolean efectivo) {
		this.efectivo = efectivo;
	}

	public String toString() {
		return "Entrega [id=" + id + ", fecha=" + fecha + ", efectivo=" + efectivo + "]";
	}

}
