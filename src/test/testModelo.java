package test;

import java.time.LocalDate;
import java.time.LocalTime;

import modelo.*;

public class testModelo {

	public static void main(String[] args) throws Exception {
		
		Ubicacion walmart = new Ubicacion(2.5, 1.7);
		Contacto contacto = new Contacto("walmart@super.com", "1138883572", walmart);
		Comercio comercio = new Comercio(1,contacto,"Wallmart",2040321237,500,125,2,15,25);
		Cliente cliente = new Cliente();
		Carrito carrito = new Carrito();
		Envio envio = new Envio();
		Entrega entrega = new Entrega();
		
		System.out.println("Digito Verificador: " + comercio.validarIdentificadorUnico(2041354026l));
		System.out.println("Verificador de Dni: " + cliente.validarDni(41354026));

		System.out.println(" ");

		comercio.traerHoraRetiro(LocalDate.now());
		
		comercio.traerTurnosOcupados(LocalDate.of(2020, 10, 19));
		comercio.traerTurnosOcupados(LocalDate.of(2020, 10, 20));
		comercio.traerTurnosOcupados(LocalDate.of(2020, 10, 21));
		comercio.traerTurnosOcupados(LocalDate.of(2020, 10, 22));
		comercio.traerTurnosOcupados(LocalDate.of(2020, 10, 23));
		
		
		comercio.agregarDiaRetiro(4, LocalTime.now(), LocalTime.now(), 5);
		comercio.agregarDiaRetiro(3, LocalTime.now(), LocalTime.now(), 2);
		comercio.agregarDiaRetiro(1, LocalTime.now(), LocalTime.now(), 9);
		
		//Agrego cliente.
		cliente.agregarCliente(contacto, "Guzman", "Lucas", 41364928);
		System.out.println(cliente.traerCliente(41364928));
		//Agrego articulos.
		
		comercio.agregarArticulo("Rexona", "7281938294331" , 75);
		comercio.agregarArticulo("Coca Cola", "5281938294652" , 95);
		comercio.agregarArticulo("Gillete", "8281938334336" , 55);
		comercio.agregarArticulo("Colgate", "2281937629338" , 45);
		comercio.agregarArticulo("Jugo Tang", "2885928494339" , 20);

		System.out.print(comercio.traerArticulo("7281938294331"));
		System.out.print(comercio.traerArticulo("5281938294652"));
		System.out.print(comercio.traerArticulo("8281938334336"));
		System.out.print(comercio.traerArticulo("2281937629338"));
		System.out.println(comercio.traerArticulo("2885928494339"));
		
		System.out.println(" ");

		comercio.agregarCarrito(LocalDate.of(2020, 10, 4), LocalTime.now(), false, 15, cliente, entrega);
		//comercio.traerCarrito(cliente);
		//System.out.println(comercio.traerCarrito(cliente));
		
		//Con este metodo verifico que el cuit ingresado sea valido.
		comercio.setCuit(2040321237);
				
		System.out.println(" ");
		
		//System.out.println("El total es: "+carrito.calcularTotalCarrito());
		
		carrito.setFecha(LocalDate.of(2020, 2, 12));
		
		//System.out.println("El total de calcularDescuentoDia es: "+carrito.calcularDescuentoDia(0, 0));
		
		//System.out.println("El total es: "+carrito.calcularDescuentoEfectivo(0));
		
		carrito.calcularDescuentoCarrito(0, 0, 0);
		//System.out.println("Descuento carrito: "+carrito.getDescuento());

		//System.out.println("El total es: "+carrito.totalAPagarCarrito());
		
		System.out.println(" ");
		
		
		Ubicacion miCasita = new Ubicacion(3.8, 1.3);
		System.out.println(miCasita.traerUbicacion());
		
		System.out.println(" ");
		
		envio.distanciaCoord(14, 4, 21, 7);	
		
		envio.setCosto(miCasita, 154d, 200);
		
		//Devuelvo el costo de setCosto
		System.out.println("Costo del envio: "+envio.getCosto());
		
		
		
	}

}
