package modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Carrito {
	private int id;
	private LocalDate fecha;
	private LocalTime hora;
	private boolean cerrado;
	private double descuento;
	private List<Cliente> Cliente;
	private List<ItemCarrito> lstItemCarrito;
	private List<Entrega> Entrega;

	public Carrito(int id, LocalDate fecha, LocalTime hora, boolean cerrado, double descuento,
			List<modelo.Cliente> cliente, List<ItemCarrito> lstItemCarrito, List<modelo.Entrega> entrega) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.hora = hora;
		this.cerrado = cerrado;
		this.descuento = descuento;
		Cliente = new ArrayList<Cliente>();
		this.lstItemCarrito = new ArrayList<ItemCarrito>();
		Entrega = new ArrayList<Entrega>();

	}

	public Carrito(int idCarrito, Articulo aux, int cantidad) {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public LocalTime getHora() {
		return hora;
	}

	public boolean isCerrado() {
		return cerrado;
	}

	public double getDescuento() {
		return descuento;
	}

	public List<Cliente> getCliente() {
		return Cliente;
	}

	public List<ItemCarrito> getLstItemCarrito() {
		return lstItemCarrito;
	}

	public List<Entrega> getEntrega() {
		return Entrega;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public void setCerrado(boolean cerrado) {
		this.cerrado = cerrado;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	public void setCliente(List<Cliente> cliente) {
		Cliente = cliente;
	}

	public void setLstItemCarrito(List<ItemCarrito> lstItemCarrito) {
		this.lstItemCarrito = lstItemCarrito;
	}

	public void setEntrega(List<Entrega> entrega) {
		Entrega = entrega;
	}

	public String toString() {
		return "Carrito [id=" + id + ", fecha=" + fecha + ", hora=" + hora + ", cerrado=" + cerrado + ", descuento="
				+ descuento + ", Cliente=" + Cliente + ", lstItemCarrito=" + lstItemCarrito + ", Entrega=" + Entrega
				+ "]";
	}

}

