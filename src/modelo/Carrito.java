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
	private Cliente cliente;
	private Entrega entrega;
	private List<ItemCarrito> lstItemCarrito;

	public Carrito(int id, LocalDate fecha, LocalTime hora, boolean cerrado, double descuento, Cliente cliente,
			Entrega entrega, List<ItemCarrito> lstItemCarrito) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.hora = hora;
		this.cerrado = cerrado;
		this.descuento = descuento;
		this.cliente = cliente;
		this.entrega = entrega;
		this.lstItemCarrito = lstItemCarrito;
	}

	public Carrito() {
		super();
		this.lstItemCarrito = new ArrayList<ItemCarrito>();
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public boolean isCerrado() {
		return cerrado;
	}

	public void setCerrado(boolean cerrado) {
		this.cerrado = cerrado;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Entrega getEntrega() {
		return entrega;
	}

	public void setEntrega(Entrega entrega) {
		this.entrega = entrega;
	}

	public List<ItemCarrito> getLstItemCarrito() {
		return lstItemCarrito;
	}

	public void setLstItemCarrito(List<ItemCarrito> lstItemCarrito) {
		this.lstItemCarrito = lstItemCarrito;
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
		int dia = 2;
		double descuento = 0;
		if(diaDescuento == dia) {
			for(ItemCarrito i : lstItemCarrito) {
				descuento = (i.getCantidad()/2) * (i.getArticulo().getPrecio()) * (porcentajeDescuento / 100);
			}
		}
		return descuento;
	}

	public double calcularDescuentoCarrito(int diaDescuento, double porcentajeDescuento,double porcentajeDescuentoEfectivo) {
		double descuento = 0;

		if (calcularDescuentoEfectivo(porcentajeDescuentoEfectivo) < calcularDescuentoDia(diaDescuento, porcentajeDescuento)) {
			descuento = calcularDescuentoDia(diaDescuento, porcentajeDescuento);

		} else {
			descuento = calcularDescuentoEfectivo(porcentajeDescuentoEfectivo);
		}
		return descuento;
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
				+ descuento + ", Cliente: " + cliente + ", lstItemCarrito: " + lstItemCarrito + ", Entrega: " + entrega;
	}

}
