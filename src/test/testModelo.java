package test;

import java.time.LocalTime;

import modelo.*;

public class testModelo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Comercio comercio = new Comercio();
		
		//Genero Exception
		System.out.println("Digito Verificador: "+comercio.validarIdentificadorUnico("2041354026"));

		Cliente cliente = new Cliente();
		
		System.out.println("Verificador de Dni: "+cliente.validarDni(41354026));

		Ubicacion miCasita = new Ubicacion(2.5, 1.7);
		
		System.out.println(miCasita.traerUbicacion());
		
		//System.out.println(comercio.traerHoraRetiro(LocalDate.now()));
				
		comercio.agregarDiaRetiro(4, LocalTime.now(), LocalTime.now(), 5);
		comercio.agregarDiaRetiro(3, LocalTime.now(), LocalTime.now(), 2);
		comercio.agregarDiaRetiro(1, LocalTime.now(), LocalTime.now(), 9);
		
		System.out.println(comercio.traerDiaRetiro());
	}

}
