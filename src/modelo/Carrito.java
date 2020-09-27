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
		this.Cliente = new ArrayList<Cliente>();
		this.lstItemCarrito = new ArrayList<ItemCarrito>();
		this.Entrega = new ArrayList<Entrega>();

	}

	public Carrito() {
		super();
		this.Cliente = new ArrayList<Cliente>();
		this.lstItemCarrito = new ArrayList<ItemCarrito>();
		this.Entrega = new ArrayList<Entrega>();

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

	// 8) + agregar(Articulo articulo, int cantidad):boolean
	public ItemCarrito traerItemCarrito(Articulo articulo) {
		ItemCarrito item = null;
		int contador = 0;
		while (contador < this.lstItemCarrito.size() && item == null) {
			if (this.lstItemCarrito.get(contador).getArticulo().equals(articulo) == true) {
				item = this.lstItemCarrito.get(contador);
			} else {
				contador++;
			}

		}
		return item;
	}

	public boolean agregar(Articulo articulo, int cantidad) {
		boolean bandera = false;

		if (this.traerItemCarrito(articulo) == null) {
			lstItemCarrito.add(new ItemCarrito(articulo, cantidad));
		} else {
			ItemCarrito item = this.traerItemCarrito(articulo);
			item.setCantidad(item.getCantidad() + cantidad);
			bandera = true;
		}
		return bandera;
	}

	public boolean sacarDelCarrito(Articulo articulo, int cantidad) {

		boolean bandera = false;
		if (traerItemCarrito(articulo) != null) {
			ItemCarrito item = traerItemCarrito(articulo);
			if (item.getCantidad() - cantidad <= 0) {
				this.lstItemCarrito.remove(item);
			} else {
				item.setCantidad(item.getCantidad() - cantidad);
				bandera = true;
			}
		}
		return bandera;
	}
	
	public double calcularDescuentoEfectivo(double porcentajeDescuentoEfectivo) {
		return (this.calcularTotalCarrito() * porcentajeDescuentoEfectivo / 100);
	}
	
	public double calcularDescuentoDia(int diaDescuento, double porcentajeDescuento) {
		return (this.calcularTotalCarrito() * porcentajeDescuento / 100);
	}

	public void calcularDescuentoCarrito(int diaDescuento, double porcentajeDescuento,
			double porcentajeDescuentoEfectivo) {
		double descuento = 0;

		if (calcularDescuentoEfectivo(porcentajeDescuentoEfectivo) < calcularDescuentoDia(diaDescuento, porcentajeDescuento)) {
			descuento = calcularDescuentoDia(diaDescuento, porcentajeDescuento);

		} else {
			descuento = calcularDescuentoEfectivo(porcentajeDescuentoEfectivo);
		}
		setDescuento(descuento);
	}

	// 10) + calcularTotalCarrito() : double
	public double calcularTotalCarrito() {
		double total = 0;
		for (ItemCarrito p : this.lstItemCarrito) {
			total = total + p.calcularSubTotalItem();
		}
		return total;
	}

	public double totalAPagarCarrito() {
		double total = 0;
		total = calcularTotalCarrito() - this.descuento;
		return total;
	}

	public String toString() {
		return "Carrito id: " + id + ", fecha: " + fecha + ", hora: " + hora + ", cerrado: " + cerrado + ", descuento: "
				+ descuento + ", Cliente: " + Cliente + ", lstItemCarrito: " + lstItemCarrito + ", Entrega: " + Entrega;
	}

}
