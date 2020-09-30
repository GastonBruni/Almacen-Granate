package modelo;

public class ItemCarrito {
	private Articulo articulo;
	private int cantidad;

	public ItemCarrito(Articulo articulo, int cantidad) {
		super();
		this.articulo = articulo;
		this.cantidad = cantidad;
	}
	
	public ItemCarrito() {
		super();
	}

	public Articulo getArticulo() {
		return articulo;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	// 9) + calcularSubTotalItem():double
	public double calcularSubTotalItem() {
		double total = this.articulo.getPrecio() * this.cantidad;
		return total;
	}

	public String toString() {
		return "ItemCarrito: articulo: " + articulo + ", cantidad: " + cantidad;
	}

}
