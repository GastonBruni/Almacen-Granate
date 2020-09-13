package test;

import modelo.*;

public class testModelo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Comercio comercio = new Comercio();
		
		// Valido un cuit para testeo
		comercio.setCuit(2041354026);
		System.out.println(comercio.getCuit());
		//Agregar XY -> Hombre 20 || Mujer 27 || Ambos 23 || Empresas 30 
		System.out.println("Digito Verificador: "+comercio.validarIdentificadorUnico("2041354026"));
	}

}
