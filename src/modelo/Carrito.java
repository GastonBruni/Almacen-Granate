package modelo;

import java.time.LocalDate;
import java.time.LocalTime;

public class Carrito {
	private int id;
	private LocalDate fecha;
	private LocalTime hora;
	private boolean cerrado;
	private double descuento;
	private Cliente cliente;
	private ItemCarrito lstItemCarrito;
	private Entrega entrega;

	public Carrito(int id, LocalDate fecha, LocalTime hora, boolean cerrado, double descuento, Cliente cliente,
			ItemCarrito lstItemCarrito, Entrega entrega) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.hora = hora;
		this.cerrado = cerrado;
		this.descuento = descuento;
		this.cliente = cliente;
		this.lstItemCarrito = lstItemCarrito;
		this.entrega = entrega;
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

	public Cliente getCliente() {
		return cliente;
	}

	public ItemCarrito getLstItemCarrito() {
		return lstItemCarrito;
	}

	public Entrega getEntrega() {
		return entrega;
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

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setLstItemCarrito(ItemCarrito lstItemCarrito) {
		this.lstItemCarrito = lstItemCarrito;
	}

	public void setEntrega(Entrega entrega) {
		this.entrega = entrega;
	}
}
