package modelo;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Actor {
	private String apellido;
	private String nombre;
	private long dni;
	private List<Cliente> lstCliente;

	
	public Cliente(int id, Contacto contacto, String apellido, String nombre, long dni)throws Exception {
		super(id, contacto);
		this.apellido = apellido;
		this.nombre = nombre;
		this.setDni(dni);
	}
	
	public Cliente() throws Exception{
		this.lstCliente = new ArrayList<Cliente>();
	}
	
	public void setDni(long dni)throws Exception {
		validarDni(dni);
		this.dni = dni;
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

	// 1) validarDni
	public boolean validarDni(long dni)throws Exception {
		boolean cond = false;
		if(dni >= 00000000 && dni <= 99999999) {
			
			cond = true;
			
		}else {
			
			throw new Exception("Error: DNI ingresado no valido ");

		}
		return cond;
	}
	
	public boolean agregarCliente(Contacto contacto, String apellido, String nombre, long dni) throws Exception {
		// Declaro For-Each

		if (traerCliente(dni) == null) {
			int id = 1;
			if (!lstCliente.isEmpty()) {
				id = lstCliente.get(lstCliente.size() - 1).getId() + 1;
			}
			return lstCliente.add(new Cliente(id, contacto, apellido, nombre, dni));
		} else {
			throw new Exception("el producto ya existe en la lista");
		}
	}

	public Cliente traerCliente(long dni) {
		Cliente cliente = null;
		int contador = 0;
		while (contador < this.lstCliente.size() && cliente == null) {
			if (this.lstCliente.get(contador).getDni() == (dni)) {
				cliente = this.lstCliente.get(contador);
			} else {
				contador++;
			}
		}
		return cliente;
	}

	public String toString() {
		return "Cliente: apellido: " + apellido + ", nombre: " + nombre + ", dni: " + dni;
	}

}



