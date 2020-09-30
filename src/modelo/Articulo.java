package modelo;

public class Articulo {
	private int id;
	private String nombre;
	private String codBarras;
	private double precio;

	public Articulo(int id, String nombre, String codBarras, double precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.codBarras = codBarras;
		this.precio = precio;
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getCodBarras() {
		return codBarras;
	}

	public double getPrecio() {
		return precio;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setCodBarras(String codBarras) {
		this.codBarras = codBarras;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public boolean validarCodBarras(String codBarras) throws Exception {
		boolean cond = false;
		int cod = codBarras.length();
		if (cod == 13) {
			cond = true;
			
			
		} else {
			throw new Exception("El codigo de barras ingresado no es valido");
		}
		return cond;
	}

	public String toString() {
		return "\nArticulo id: " + id + ", nombre: " + nombre + ", codBarras: " + codBarras + ", precio: " + precio;
	}
}
