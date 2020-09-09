package modelo;

import java.time.LocalDate;
import java.time.LocalTime;

public class Comercio extends Carrito {
	private String nombreComercio;
	private long cuit;
	private double costoFijo;
	private double costoPorKm;
	private int diaDescuento;
	private int porcentajeDescuentoDia;
	private int porcentajeDescuentoEfectivo;
	private DiaRetiro lstDiaRetiro;
	private Carrito lstCarrito;

	public Comercio(int id, LocalDate fecha, LocalTime hora, boolean cerrado, double descuento, Cliente cliente,
			ItemCarrito lstItemCarrito, Entrega entrega, String nombreComercio, long cuit, double costoFijo,
			double costoPorKm, int diaDescuento, int porcentajeDescuentoDia, int porcentajeDescuentoEfectivo,
			DiaRetiro lstDiaRetiro, Carrito lstCarrito) {
		super(id, fecha, hora, cerrado, descuento, cliente, lstItemCarrito, entrega);
		this.nombreComercio = nombreComercio;
		this.cuit = cuit;
		this.costoFijo = costoFijo;
		this.costoPorKm = costoPorKm;
		this.diaDescuento = diaDescuento;
		this.porcentajeDescuentoDia = porcentajeDescuentoDia;
		this.porcentajeDescuentoEfectivo = porcentajeDescuentoEfectivo;
		this.lstDiaRetiro = lstDiaRetiro;
		this.lstCarrito = lstCarrito;
	}

	public String getNombreComercio() {
		return nombreComercio;
	}

	public long getCuit() {
		return cuit;
	}

	public double getCostoFijo() {
		return costoFijo;
	}

	public double getCostoPorKm() {
		return costoPorKm;
	}

	public int getDiaDescuento() {
		return diaDescuento;
	}

	public int getPorcentajeDescuentoDia() {
		return porcentajeDescuentoDia;
	}

	public int getPorcentajeDescuentoEfectivo() {
		return porcentajeDescuentoEfectivo;
	}

	public DiaRetiro getLstDiaRetiro() {
		return lstDiaRetiro;
	}

	public Carrito getLstCarrito() {
		return lstCarrito;
	}

	public void setNombreComercio(String nombreComercio) {
		this.nombreComercio = nombreComercio;
	}

	public void setCuit(long cuit) {
		this.cuit = cuit;
	}

	public void setCostoFijo(double costoFijo) {
		this.costoFijo = costoFijo;
	}

	public void setCostoPorKm(double costoPorKm) {
		this.costoPorKm = costoPorKm;
	}

	public void setDiaDescuento(int diaDescuento) {
		this.diaDescuento = diaDescuento;
	}

	public void setPorcentajeDescuentoDia(int porcentajeDescuentoDia) {
		this.porcentajeDescuentoDia = porcentajeDescuentoDia;
	}

	public void setPorcentajeDescuentoEfectivo(int porcentajeDescuentoEfectivo) {
		this.porcentajeDescuentoEfectivo = porcentajeDescuentoEfectivo;
	}

	public void setLstDiaRetiro(DiaRetiro lstDiaRetiro) {
		this.lstDiaRetiro = lstDiaRetiro;
	}

	public void setLstCarrito(Carrito lstCarrito) {
		this.lstCarrito = lstCarrito;
	}

}
