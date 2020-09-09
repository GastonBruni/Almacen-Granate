package modelo;

import java.time.LocalTime;

public class Envio {
	private LocalTime horaHasta;
	private LocalTime horaDesde;
	private double costo;
	private Ubicacion ubicacion;

	public Envio(LocalTime horaHasta, LocalTime horaDesde, double costo, Ubicacion ubicacion) {
		super();
		this.horaHasta = horaHasta;
		this.horaDesde = horaDesde;
		this.costo = costo;
		this.ubicacion = ubicacion;
	}

	public LocalTime getHoraHasta() {
		return horaHasta;
	}

	public LocalTime getHoraDesde() {
		return horaDesde;
	}

	public double getCosto() {
		return costo;
	}

	public Ubicacion getUbicacion() {
		return ubicacion;
	}

	public void setHoraHasta(LocalTime horaHasta) {
		this.horaHasta = horaHasta;
	}

	public void setHoraDesde(LocalTime horaDesde) {
		this.horaDesde = horaDesde;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public void setUbicacion(Ubicacion ubicacion) {
		this.ubicacion = ubicacion;
	}

}
