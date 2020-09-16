package test;

import modelo.*;

public class testModelo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Comercio comercio = new Comercio();
		
		//Genero Exception
		System.out.println("Digito Verificador: "+comercio.validarIdentificadorUnico("2041354026"));

		Cliente cliente = new Cliente();
		
		System.out.println("Verificador de Dni: "+cliente.validarDni("41354026"));

		Ubicacion miCasita = new Ubicacion(2.5, 1.7);
		
		System.out.println(miCasita.traerUbicacion());
	}

}
