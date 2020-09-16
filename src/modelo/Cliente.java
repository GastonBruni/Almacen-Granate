package modelo;

public class Cliente extends Actor {
	private String apellido;
	private String nombre;
	private long dni;

	public Cliente(int id, Contacto contacto, String apellido, String nombre, int dni) {
		super(id, contacto);
		this.apellido = apellido;
		this.nombre = nombre;
		this.dni = dni;
	}
	
	public Cliente() {
	super();
	}

	public String getApellido() {
		return apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public long getDni() {
		return dni;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}
	
	public boolean validarDni(long dni)throws Exception {
		boolean cond = false;
		if(dni >= 00000000 && dni <= 99999999) {
			
			cond = true;
			
		}else {
			
			throw new Exception("Error: DNI ingresado no valido ");

		}
		return cond;
	}

	public String toString() {
		return "Cliente: apellido=" + apellido + ", nombre=" + nombre + ", dni=" + dni;
	}

}




