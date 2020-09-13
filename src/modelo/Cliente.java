package modelo;

public class Cliente extends Actor {
	private String apellido;
	private String nombre;
	private int dni;

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

	public int getDni() {
		return dni;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

}




