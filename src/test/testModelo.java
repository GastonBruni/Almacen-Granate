package test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import modelo.*;

public class testModelo {

	public static void main(String[] args) throws Exception {

		Comercio comercio = new Comercio();
		Cliente cliente = new Cliente();
		Carrito carrito = new Carrito();
		Envio envio = new Envio();
		

		// Caso de uso 1:
		System.out.println("Digito Verificador: " + comercio.validarIdentificadorUnico(2041354026l));
		System.out.println("Verificador de Dni: " + cliente.validarDni(41354026));
		System.out.println(" ");

		// Caso de uso 2:
		comercio.traerHoraRetiro(LocalDate.now());
		
		// Caso de uso 3:
		comercio.generarTurnosLibres(LocalDate.of(2020, 10, 14));
		comercio.generarTurnosLibres(LocalDate.of(2020, 10, 15));
		comercio.generarTurnosLibres(LocalDate.of(2020, 10, 16));
		comercio.generarTurnosLibres(LocalDate.of(2020, 10, 17));
		comercio.generarTurnosLibres(LocalDate.of(2020, 10, 18));

		// Caso de uso 4:
		comercio.traerTurnosOcupados(LocalDate.of(2020, 10, 19));
		comercio.traerTurnosOcupados(LocalDate.of(2020, 10, 20));
		comercio.traerTurnosOcupados(LocalDate.of(2020, 10, 21));
		comercio.traerTurnosOcupados(LocalDate.of(2020, 10, 22));
		comercio.traerTurnosOcupados(LocalDate.of(2020, 10, 23));
		
		comercio.traerTurnosOcupados();

		// Caso de uso 5:
		comercio.generarAgenda(LocalDate.now());
		
		// Caso de uso 6:
		comercio.agregarDiaRetiro(4, LocalTime.now(), LocalTime.now(), 5);
		comercio.agregarDiaRetiro(3, LocalTime.now(), LocalTime.now(), 2);
		comercio.agregarDiaRetiro(1, LocalTime.now(), LocalTime.now(), 9);

		System.out.println(comercio.traerDiaRetiro());
		System.out.println(" ");
		
		// Caso de uso 8:
		//Agrego articulos para agregar al caso de uso 8.
		comercio.agregarArticulo("Salsa de tomate","7281938294331",75d);
		comercio.agregarArticulo("Leche Serenisima","7287623294334",45d);
		comercio.agregarArticulo("Rollo de cocina","7928018294333",30d);
		comercio.agregarArticulo("Azucar","7281821343332",40d);
		comercio.agregarArticulo("Mermelada","7281544562334",60d);
		
		System.out.println("Los articulos son: "+comercio.traerArticulos());
		System.out.println(" ");

		// Caso de uso 7:
		
		//Devuelve exception
		//articulo5.validarCodBarras("7281544562334543");
		Articulo articulo1 = new Articulo(5, "Coca Cola", "7928018294387", 55d);
		System.out.println("Validacion codigo de barras: " + articulo1.validarCodBarras("7281938294331"));
		System.out.println("Validacion codigo de barras: " + articulo1.validarCodBarras("7287623294334"));
		System.out.println("Validacion codigo de barras: " + articulo1.validarCodBarras("7928018294333"));
		System.out.println("Validacion codigo de barras: " + articulo1.validarCodBarras("7281821343332"));
		System.out.println("Validacion codigo de barras: " + articulo1.validarCodBarras("7281544562334"));
		
		// Caso de uso 9: 
		System.out.println(" ");
		ItemCarrito itemCarrito = new ItemCarrito(articulo1,5);
		System.out.println("El SubTotal del carrito es: "+itemCarrito.calcularSubTotalItem());
		
		// Caso de uso 10:		
		System.out.println("El total es: "+carrito.calcularTotalCarrito());
		
		// Caso de uso 11: ESTA DEVOLVIENDO 0 OJO!!!!!!!!!!
		carrito.setFecha(LocalDate.of(2020, 4, 12));
		
		System.out.println("El total de calcularDescuentoDia es: "+carrito.calcularDescuentoDia(12, 29.20d));
		
		// Caso de uso 12: 
		System.out.println("El total es: "+carrito.calcularDescuentoEfectivo(15.40));
		
		// Caso de uso 13: 
		carrito.calcularDescuentoCarrito(4, 12d, 5d);
		System.out.println("Descuento carrito: "+carrito.getDescuento());

		// Caso de uso 15:
		System.out.println("El total es: "+carrito.totalAPagarCarrito());
		
		System.out.println(" ");
		
		
		// Caso de uso 17:
		Ubicacion miCasita = new Ubicacion(2.5, 1.7);
		System.out.println(miCasita.traerUbicacion());
		
		System.out.println(" ");
		
		// Caso de uso 16:
		System.out.println(envio.distanciaCoord(14, 4, 21, 7));		
		
		envio.setCosto(miCasita, 154d, 200);
		
		//Devuelvo el costo de setCosto
		System.out.println(envio.getCosto());
							
	}

}
